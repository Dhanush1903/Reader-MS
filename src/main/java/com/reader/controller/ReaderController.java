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
	public  List<Books> searchBooks(@RequestParam("category") String category,
			@RequestParam ("authorName") String authorName, @RequestParam ("price")Long price) {
		
		List<Books> books= this.restTemplate.getForObject(
		"http://localhost:8083/searchbooks?category={category}&authorName={authorName}&price={price}"+category+authorName+price, List.class);
		return books;
		
	}
	
	@GetMapping("/getspecificbook/{id}")
	public ResponseEntity<Books> getbook(@PathVariable("id")Integer id)
	{
		ResponseEntity<Books> book= this.restTemplate.getForEntity("http://localhost:8083/getbook/"+id, Books.class);
				
				return book;
	}
	
	
	

}
