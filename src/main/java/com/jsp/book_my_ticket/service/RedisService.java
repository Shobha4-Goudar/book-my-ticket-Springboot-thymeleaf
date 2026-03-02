package com.jsp.book_my_ticket.service;

import com.jsp.book_my_ticket.dto.UserDto;
import com.jsp.book_my_ticket.entity.BookedTicket;

public interface RedisService {

	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getUserDto(String email);

	int getOtp(String email);
	
	void saveTicket(String orderId, BookedTicket ticket);

	BookedTicket getTicket(String orderId);
}
