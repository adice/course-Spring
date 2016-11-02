package returnautoincrement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import returnautoincrement.bean.Book;
import returnautoincrement.biz.BookServiceImpl;

public class Test {

	/**
	 * @desc
	 * @author wangwei
	 * @createDate 2012-12-7
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		BookServiceImpl bookService=(BookServiceImpl)ctx.getBean("bookServiceImpl");
		//插入并返回主键
//		Book book=new Book();
//		book.setBookname("ww");
//		book.setBookprice(20);
//		Integer bookid=bookService.addBook(book);
//		book.setBookid(bookid);
//		System.out.println(bookid);
		//批量插入
//		List<Book> list=new ArrayList<Book>();
//		for(int i=0;i<5;i++){
//			Book book = new Book();
//			book.setBookname("book"+i);
//			book.setBookprice(20+i);
//			list.add(book);
//		}
//		bookService.addBooks(list);
		//根据主键查询
//		Book book=bookService.findBookById(3);
//		System.out.println(book.getBookname());
		//查询全部
//		List<Book> list=bookService.findAllByRowMapper();
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i).getBookname());
//		}
		//单值查询，统计数量
//		System.out.println(bookService.findCount());
		//单值查询，统计平均值（查询1行多列，再计算得单值）
		System.out.println(bookService.findMyAverage());
	}

}
