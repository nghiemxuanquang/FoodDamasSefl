package com.food.persistences.FoodTruck;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.food.domain.FoodTruckInfoVO;

@Repository
public class FoodTruckInfoDAOImpl implements FoodTruckInfoDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"com.food.mapper.FoodTruckInfoMapper";
	
	@Override
	public List<FoodTruckInfoVO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".test");
	}
	

}
