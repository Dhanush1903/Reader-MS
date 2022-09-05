package com.reader.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.dto.Books;

@RestController
public class ReaderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/readersearchBooks")
	public  List<Books> searchBooks(@RequestParam(name = "category",required = false)  String category,
			@RequestParam (name = "authorName",required = false) String authorName,
			@RequestParam  (name = "price",required = false) Long price)
	{
	 //localhost:8083/searchbooks?category=mystery&authorName=simon&price=1000	
//		http://localhost:8083/searchbooks?category=mystery&authorName=simon&price=1000
		List<Books> books= this.restTemplate.getForObject(
		"http://localhost:8083/searchbooks?category={category}&authorName={authorName}&price={price}",
				List.class,category,authorName,price);
	 
		
		return books;
		
	}
	
	@GetMapping("/getspecificbook/{id}")
	public ResponseEntity<Books> getbook(@PathVariable("id")Integer id)
	{
		ResponseEntity<Books> book= this.restTemplate.getForEntity("http://localhost:8083/getbook/"+id, Books.class);
				
				return book;
	}
	
	
	

}
