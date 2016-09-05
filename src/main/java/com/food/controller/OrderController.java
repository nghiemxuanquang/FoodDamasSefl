package com.food.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

import com.food.domain.OrderVO;
import com.food.services.Order.OrderService;


@Controller
@RequestMapping("/order")
public class OrderController {
	private static final Logger logger 
	= LoggerFactory.getLogger(OrderController.class);
	
	@Inject
	private OrderService service;
	
	@RequestMapping(value="/listOrderBySaleID",method=RequestMethod.GET)
	public ResponseEntity<List<OrderVO>> getListOrderBySaleID() throws Exception{
		logger.info("Retrieve JSON Of Order By Sal ID...................");
		ResponseEntity<List<OrderVO>> entity =null;
		try{
			List<OrderVO> list = service.getListOrderBySaleID(1);
			entity = new ResponseEntity<>(list,HttpStatus.OK);
		}catch(Exception e)
		{
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
