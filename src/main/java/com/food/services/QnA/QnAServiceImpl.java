package com.food.services.QnA;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.food.domain.AnswerVO;
import com.food.domain.QnAVO;
import com.food.persistences.QnA.QnADAO;

@Service
public class QnAServiceImpl implements QnAService{

	@Inject
	private QnADAO dao;
	
	@Override
	public List<HashMap<String, Object>> getListQnAWithCheck(Integer qno) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListQnAWithCheck(qno);
	}

	@Override
	public List<QnAVO> getListQnAByFTID(String u_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListQnAByFTID(u_id);
	}

	@Override
	public List<QnAVO> getListQnAByCustomerID(String c_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListQnAByCustomerID(c_id);
	}

	@Override
	public void createQuestion(QnAVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.createQuestion(vo);
	}

	@Override
	public void updateQuestion(QnAVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateQuestion(vo);
	}

	@Override
	public void deleteQuestion(Integer qno) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteQuestion(qno);
	}

	@Override
	public List<AnswerVO> getListAnswerByQuestionID(Integer qno) throws Exception {
		// TODO Auto-generated method stub
		return dao.getListAnswerByQuestionID(qno);
	}

	@Override
	public void createAnswer(AnswerVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.createAnswer(vo);
	}

	@Override
	public void updateAnswer(AnswerVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateAnswer(vo);
	}

	@Override
	public void deleteAnswer(Integer ano) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteAnswer(ano);
	}

}
