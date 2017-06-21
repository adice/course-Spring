package com.other;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {
	@RequestMapping(value="/addbook",method=RequestMethod.GET,params="bookId")
	public void addBook(@RequestParam("bookId") String bookId,HttpServletResponse response){
		try {
			response.getWriter().write("bookId:"+bookId);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value="/findbook",headers="user-agent")
	public void findBook(HttpServletRequest request,HttpServletResponse response){
		try {
			response.getWriter().write(request.getHeader("user-agent"));
//			Enumeration e=request.getHeaderNames();
//			while(e.hasMoreElements()){
//				String headerName=e.nextElement().toString();
//				String headerValue=request.getHeader(headerName);
//				response.getWriter().write(headerName+":"+headerValue+"<br>");
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
