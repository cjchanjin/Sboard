package co.cjpark.Sboard.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

public class SboardRowMapper implements RowMapper<SboardVo> {

	public SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public SboardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		SboardVo vo = new SboardVo();
		vo.setBoardId(rs.getInt("boardId"));
		vo.setWriter(rs.getString("writer"));
		vo.setwDate(sf.format(rs.getDate("wDate")));
		vo.setTitle(rs.getString("title"));
		vo.setContents(rs.getString("contents"));
		vo.setHit(rs.getInt("hit"));
		vo.setFileName(rs.getString("fileName"));
		
		return vo;
	}

}
