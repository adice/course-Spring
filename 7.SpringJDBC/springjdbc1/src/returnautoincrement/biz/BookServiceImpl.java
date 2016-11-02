package returnautoincrement.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import returnautoincrement.bean.Book;
import returnautoincrement.dao.BookDao;
@Service
public class BookServiceImpl {
	@Autowired
	private BookDao bookDao;
	public Integer addBook(Book book){
		return this.bookDao.saveBook(book);
	}
	public void addBooks(List<Book>list){
		this.bookDao.saveBooks(list);
	}
	public Book findBookById(Integer bookid){
		return this.bookDao.findById(bookid);
	}
	public List<Book>findAll(){
		return this.bookDao.findAll();
	}
	public List<Book>findAllByRowMapper(){
		return this.bookDao.findAllByRowMapper();
	}
	public Integer findCount(){
		return this.bookDao.findCount();
	}
	public Double findMyAverage(){
		return this.bookDao.findMyAverage();
	}
}
