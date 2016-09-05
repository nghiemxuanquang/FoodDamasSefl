package com.project.foodDamas;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.food.persistences.QnA.QnADAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class QnATest {
	
	@Inject
	private QnADAO dao;
	
	@Test
	public void testSelectWithCheck() throws Exception
	{
		List<HashMap<String, Object>> list = dao.getListQnAWithCheck(26);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(0).get("checkwriter"));
		System.out.println(list.get(0).get("qno"));
		/*for(int i=0;i<list.size();i++){
			System.out.println((String)list.get(i).get("qno"));
		}*/
	}
}
