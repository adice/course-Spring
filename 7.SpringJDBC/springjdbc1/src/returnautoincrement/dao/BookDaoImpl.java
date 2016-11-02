package returnautoincrement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import returnautoincrement.bean.Book;

import com.dao.BaseDao;
@Repository
public class BookDaoImpl extends BaseDao implements BookDao {

	@Override
	public Integer saveBook(final Book book) {
		final String sql="insert into book(bookname,bookprice) values(?,?)";
		
		KeyHolder keyHolder=new GeneratedKeyHolder();
		this.jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstm=con.prepareStatement(sql);
				pstm.setString(1, book.getBookname());
				pstm.setInt(2, book.getBookprice());
				return pstm;
			}
		}, keyHolder);
		return keyHolder.getKey().intValue();
	}
	//批量插入数据
	public void saveBooks(final List<Book> list){
		final String sql="insert into book(bookname,bookprice) values(?,?)";
		this.jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstm, int index) throws SQLException {
				pstm.setString(1, list.get(index).getBookname());
				pstm.setInt(2, list.get(index).getBookprice());
			}
			
			@Override
			public int getBatchSize() {
				return list.size();
			}
		});
	}
	//查询单个数据
	public Book findById(final Integer bookid){
		String sql="select * from book where bookid=?";
		final Book book=new Book();
		this.jdbcTemplate.query(sql,new Object[]{bookid}, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				book.setBookid(bookid);
				book.setBookname(rs.getString(2));
				book.setBookprice(rs.getInt(3));
			}
		});
		return book;
	}
	//查询全部
	public List<Book> findAll(){
		String sql="select * from book";
		final List<Book>list=new ArrayList<Book>();
		this.jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Book book=new Book();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookprice(rs.getInt(3));
				list.add(book);
			}
		});
		return list;
	}
	
	public List<Book> findAllByRowMapper(){
		String sql="select * from book";
		return this.jdbcTemplate.query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				Book book =new Book();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookprice(rs.getInt(3));
				return book;
			}
			
		});
	}
	//统计数量
	public Integer findCount(){
		String sql="select count(*) from book";
		return this.jdbcTemplate.queryForInt(sql);
	}
	//统计平均值，查询1行，多列的情况下
	public Double findMyAverage(){
		String sql="select sum(bookprice),count(*) from book";
		double avg=this.jdbcTemplate.queryForObject(sql, new RowMapper<Double>() {

			@Override
			public Double mapRow(ResultSet rs, int arg1) throws SQLException {
				int s=rs.getInt(1);
				int c=rs.getInt(2);
				return (double)s/c;
			}
		});
		return avg;
	}
}
