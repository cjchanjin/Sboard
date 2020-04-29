package co.cjpark.Sboard.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.cjpark.Sboard.service.SboardRowMapper;
import co.cjpark.Sboard.service.SboardService;
import co.cjpark.Sboard.service.SboardVo;

@Repository
public class SboardDao implements SboardService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String SELECT = "select * from board";
	private String GET_SELECT = "select * from board where boardid=?";
	
	@Override
	public ArrayList<SboardVo> select() {

		return (ArrayList<SboardVo>) jdbcTemplate.query(SELECT, new SboardRowMapper());
	}

	@Override
	public SboardVo getSelect(int boardId) {

		return (SboardVo) jdbcTemplate.queryForList(GET_SELECT, boardId, new SboardRowMapper());
	}

	@Override
	public int insert(SboardVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SboardVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int boardId) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
