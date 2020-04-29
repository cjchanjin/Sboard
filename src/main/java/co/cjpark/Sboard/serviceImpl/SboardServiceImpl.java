package co.cjpark.Sboard.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.cjpark.Sboard.dao.SboardDao;
import co.cjpark.Sboard.service.SboardService;
import co.cjpark.Sboard.service.SboardVo;

@Service("service")
public class SboardServiceImpl implements SboardService {

	@Autowired
	SboardDao dao;
	
	@Override
	public ArrayList<SboardVo> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

	@Override
	public SboardVo getSelect(int boardId) {
		// TODO Auto-generated method stub
		return dao.getSelect(boardId);
	}

	@Override
	public int insert(SboardVo vo) {
		// TODO Auto-generated method stub
		return dao.insert(vo);
	}

	@Override
	public int update(SboardVo vo) {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}

	@Override
	public int delete(int boardId) {
		// TODO Auto-generated method stub
		return dao.delete(boardId);
	}


}
