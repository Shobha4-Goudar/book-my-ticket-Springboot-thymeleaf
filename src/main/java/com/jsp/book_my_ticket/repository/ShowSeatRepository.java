package com.jsp.book_my_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Seat;
import com.jsp.book_my_ticket.entity.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>{
	
	List<ShowSeat> findBySeatIn(List<Seat> seats);

}
