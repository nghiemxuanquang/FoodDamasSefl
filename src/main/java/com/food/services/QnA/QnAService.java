package com.food.services.QnA;

import java.util.HashMap;
import java.util.List;

import com.food.domain.AnswerVO;
import com.food.domain.QnAVO;

public interface QnAService {
	public List<HashMap<String,Object>> getListQnAWithCheck(Integer qno) throws Exception;
	/*Question*/
	public List<QnAVO> getListQnAByFTID(String u_id) throws Exception;
	public List<QnAVO> getListQnAByCustomerID(String c_id) throws Exception;
	public void createQuestion(QnAVO vo) throws Exception;
	public void updateQuestion(QnAVO vo) throws Exception;
	public void deleteQuestion(Integer qno) throws Exception;
	/*Answer*/
	public List<AnswerVO> getListAnswerByQuestionID(Integer qno) throws Exception;
	public void createAnswer(AnswerVO vo) throws Exception;
	public void updateAnswer(AnswerVO vo) throws Exception;
	public void deleteAnswer(Integer ano) throws Exception;
}
