package com.reader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reader.entity.Reader;

@Service
public class ReaderServiceImpl implements IReaderService {
	
	@Autowired
	IReaderRepository readerRepo;

	@Override
	public Reader buyBook(Reader reader, Integer id) {
	 Reader savedReader=   readerRepo.save(reader);
		return savedReader;
	}

}
