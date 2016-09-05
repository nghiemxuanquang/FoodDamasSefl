package com.food.persistences.FoodTruck;

import java.util.List;

import com.food.domain.FoodTruckInfoVO;

public interface FoodTruckInfoDAO {
	public List<FoodTruckInfoVO> getList() throws Exception;
}
