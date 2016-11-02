package com.course.product.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.entity.Product;
import com.course.product.service.ProductServiceImpl;
import com.framework.Page;

@Controller
@RequestMapping("product")
public class ProductController {

	@Resource
	private ProductServiceImpl productServiceImpl;
	
	@RequestMapping("add")
	public String add(Product product){
		this.productServiceImpl.addProduct(product);
		return "redirect:product/list";
	}
	
	@RequestMapping(value="edit",method=RequestMethod.GET)
	public String toEdit(@RequestParam("productId") int productId,
			HttpServletRequest request){
		Product p=this.productServiceImpl.getProduct(productId);
		request.setAttribute("pro", p);
		request.setAttribute("action", "edit");
		return "product/form";
	}
	
	@RequestMapping(value="edit",method=RequestMethod.POST)
	public String edit(Product p,HttpServletRequest request){
		this.productServiceImpl.editProduct(p);
		return "redirect:list";
	}
	
	@RequestMapping(value="delete")
	public String delete(@RequestParam("productId") int productId,
			HttpServletRequest request){
		this.productServiceImpl.dropProduct(productId);
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String list(@RequestParam(name="pageNum", defaultValue="1") int pageNum,
			@RequestParam(name="searchParam",defaultValue="") String searchParam,HttpServletRequest request,
			Model model){
		Page<Product> page;
		if(searchParam==null || "".equals(searchParam)){
			page=this.productServiceImpl.listProduct(pageNum, 5, null);	
		}else{
			page=this.productServiceImpl.listProduct(pageNum, 5, new Object[]{searchParam});
		}
		request.setAttribute("page", page);
		request.setAttribute("searchParam", searchParam);
		return "product/list";
		
	}
	
}
