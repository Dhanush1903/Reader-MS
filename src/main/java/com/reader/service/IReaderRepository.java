package com.reader.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.entity.Reader;



public interface IReaderRepository extends JpaRepository<Reader, String>{

}
