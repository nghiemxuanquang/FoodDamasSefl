package com.project.foodDamas;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.food.domain.AnswerVO;
import com.food.domain.FoodTruckInfoVO;
import com.food.domain.FoodTypeVO;
import com.food.domain.MenuVO;
import com.food.domain.OrderDetailVO;
import com.food.domain.OrderVO;
import com.food.domain.QnAVO;
import com.food.domain.SaleVO;
import com.food.services.FoodTruck.FoodTruckInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class FoodTruckInfoTest {
	
	@Inject
	private FoodTruckInfoService service;
	
	@Test
	public void testGetList() throws Exception{
		List<FoodTruckInfoVO> list = new ArrayList<FoodTruckInfoVO>();
		list = service.getList();
		System.out.println(list);
		FoodTypeVO ftvo = list.get(0).getF_type();
		List<SaleVO> slvo = list.get(0).getListSale();
		List<QnAVO> listQnA = list.get(0).getListQnA();
		List<MenuVO> listMenu = list.get(0).getMenus();
		
		System.out.println(ftvo);
	
		System.out.println(listMenu);
		System.out.println(slvo);
		System.out.println(slvo.get(0).getListOrder());
		List<OrderVO> listOrder = slvo.get(0).getListOrder();
		System.out.println(listOrder.get(0).getState());
		List<OrderDetailVO> listOrderDetail = listOrder.get(0).getListOrderDetail();
		System.out.println(listOrderDetail);
		MenuVO MenuByOrderDetail = listOrderDetail.get(0).getMenu();
		System.out.println(MenuByOrderDetail);
		
		System.out.println(listQnA);
		List<AnswerVO> listAnswer = listQnA.get(25).getListAns();
		System.out.println(listAnswer);
	
		
	}
}
