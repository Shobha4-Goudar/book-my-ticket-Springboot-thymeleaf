package com.jsp.book_my_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.BookedTicket;

public interface TicketRepository extends JpaRepository<BookedTicket, Long>{
	
}
