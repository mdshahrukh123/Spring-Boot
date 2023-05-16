package com.geekster.studentPortel.repository;

import com.geekster.studentPortel.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book,Integer> {
}
