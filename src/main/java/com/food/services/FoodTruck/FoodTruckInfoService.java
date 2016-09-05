package com.food.services.FoodTruck;

import java.util.List;

import com.food.domain.FoodTruckInfoVO;

public interface FoodTruckInfoService {
	public List<FoodTruckInfoVO> getList() throws Exception;
}
