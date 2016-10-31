package com.course.product.dao;

import org.springframework.stereotype.Repository;

import com.course.entity.Product;
import com.framework.BaseDao;
import com.framework.Page;

@Repository
public class ProductDaoImpl extends BaseDao<Product, Integer> {

	public void saveProduct(Product p){
		try {
			this.save(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Page<Product> findProduct(int pageNum, int pageSize,Object[] params){
		String hql;
		if(params!=null && params.length>0){
			hql="from Product p where p.name like ?";
			params[0]="%"+params[0]+"%";
			
		}else{
			hql="from Product";
		}
		try {
			Page<Product> page=new Page<Product>();
			page.setCurrentPageNum(pageNum);
			page.setPageSize(pageSize);
			page=this.findByPage(pageNum, pageSize, hql, params);
			return page;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Product getProduct(int productId){
		try {
			Product p=this.get(productId);
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void updateProduct(Product p){
		try {
			this.update(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteProduct(int productId){
		try {
			this.delete(productId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
