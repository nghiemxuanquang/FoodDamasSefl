package com.food.services.Order;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.food.domain.OrderDetailVO;
import com.food.domain.OrderVO;
import com.food.persistences.Order.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService{

	@Inject
	private OrderDAO dao;
	
	
	@Override
	public List<OrderVO> getListOrderByCustID(String c_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListOrderByCustID(c_id);
	}

	@Override
	public List<OrderVO> getListOrderBySaleID(Integer sno) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListOrderBySaleID(sno);
	}

	@Override
	public OrderVO getOrderByID(Integer ono) throws Exception {
		// TODO Auto-generated method stub
		return dao.getOrderByID(ono);
	}

	@Override
	public void insertOrder(OrderVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.insertOrder(vo);
	}

	@Override
	public Integer getCurrentInsertID() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCurrentInsertID();
	}

	@Override
	public void updateOrder(OrderVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateOrder(vo);
	}

	@Override
	public void updateOrderState(OrderVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateOrderState(vo);
	}

	@Override
	public List<OrderDetailVO> getListOrderDetailByOrderID(Integer ono) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListOrderDetailByOrderID(ono);
	}

	@Override
	public void insertOrderDetail(OrderDetailVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.insertOrderDetail(vo);
	}

	@Override
	public void updateOrderDetail(OrderDetailVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateOrderDetail(vo);
	}

}
