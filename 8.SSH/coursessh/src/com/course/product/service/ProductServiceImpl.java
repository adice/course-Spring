package com.course.product.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.entity.Product;
import com.course.product.dao.ProductDaoImpl;
import com.framework.Page;

@Service
@Transactional(readOnly=false)
public class ProductServiceImpl {
	
	@Resource
	private ProductDaoImpl productDaoImpl;
	
	public void addProduct(Product p){
		this.productDaoImpl.saveProduct(p);
	}

	@Transactional(readOnly=true)
	public Page<Product> listProduct(int pageNum,int pageSize,Object[] params){
		return this.productDaoImpl.findProduct(pageNum, pageSize, params);
	}
	
	@Transactional(readOnly=true)
	public Product getProduct(int productId){
		return this.productDaoImpl.getProduct(productId);
	}
	
	public void editProduct(Product p){
		Product pdb=this.productDaoImpl.getProduct(p.getProductId());
		pdb.setName(p.getName());
		pdb.setPrice(p.getPrice());
		this.productDaoImpl.updateProduct(pdb);
	}
	
	public void dropProduct(int productId){
		this.productDaoImpl.deleteProduct(productId);
	}
}
