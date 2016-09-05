package com.food.persistences.QnA;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.food.domain.AnswerVO;
import com.food.domain.QnAVO;

@Repository
public class QnADAOImpl implements QnADAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace=
			"com.food.mapper.QnAMapper";
	
	@Override
	public List<HashMap<String, Object>> getListQnAWithCheck(Integer qno) throws Exception {
		// TODO Auto-generated method stub
	
		List<HashMap<String,Object>> listQnA =sqlSession.selectList(namespace+".listAnsByQID_CheckWriter",qno);		
		return listQnA;
	}

	@Override
	public List<QnAVO> getListQnAByFTID(String u_id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".getListQnAByFTID",u_id);
	}

	@Override
	public List<QnAVO> getListQnAByCustomerID(String c_id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".getListQnAByCustomerID",c_id);
	}

	@Override
	public void createQuestion(QnAVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".createQuestion",vo);
	}

	@Override
	public void updateQuestion(QnAVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".updateQuestion",vo);
	}

	@Override
	public void deleteQuestion(Integer qno) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".deleteQuestion",qno);
		sqlSession.delete(namespace+".deleteAnswerByQuestionID",qno);
	}

	@Override
	public List<AnswerVO> getListAnswerByQuestionID(Integer qno) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".getListAnswerByQuestionID",qno);
	}

	@Override
	public void createAnswer(AnswerVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".createAnswer",vo);
	}

	@Override
	public void updateAnswer(AnswerVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".updateAnswer",vo);
	}

	@Override
	public void deleteAnswer(Integer ano) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".deleteAnswer0",ano);
		
	}

}
