package com.felicemarano.bookstats;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<book, Long> {
}
