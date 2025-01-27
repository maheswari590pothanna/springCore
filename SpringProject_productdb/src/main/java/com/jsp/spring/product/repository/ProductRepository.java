package com.jsp.spring.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring.product.entity.Product;

@Repository
public class ProductRepository {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
	
	public void addProduct(Product product)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(product);
		et.commit();
		em.close();
		emf.close();
	}
	
	public Product findById(int productId)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Product product=em.find(Product.class, productId);
		et.commit();
		em.close();
		
		return product;
		
		
	}
	public void updateProduct(Product Product)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.merge(Product);
		
		et.commit();
		em.close();
		
	}
	public List<Product> findAll()
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query=em.createQuery("FROM Product");
		List<Product> list=query.getResultList();
		
		et.commit();
		em.close();
		return list;
	}

}
