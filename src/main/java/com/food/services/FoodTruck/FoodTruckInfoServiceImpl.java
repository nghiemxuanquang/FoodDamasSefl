package com.food.services.FoodTruck;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.food.domain.FoodTruckInfoVO;
import com.food.persistences.FoodTruck.FoodTruckInfoDAO;

@Service
public class FoodTruckInfoServiceImpl implements FoodTruckInfoService{

	@Inject
	private FoodTruckInfoDAO dao;
	
	@Override
	public List<FoodTruckInfoVO> getList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getList();
	}

}
