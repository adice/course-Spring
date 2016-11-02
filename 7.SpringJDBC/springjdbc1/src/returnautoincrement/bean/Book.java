package returnautoincrement.bean;

public class Book implements java.io.Serializable{
	private Integer bookid;
	private String bookname;
	private Integer bookprice;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Integer getBookprice() {
		return bookprice;
	}
	public void setBookprice(Integer bookprice) {
		this.bookprice = bookprice;
	}
	
}
