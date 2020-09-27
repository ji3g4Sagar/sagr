package com.example.sagar.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.awt.print.Book


@Repository
interface BookRepository: JpaRepository<Book, Integer> {
}