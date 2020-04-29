package co.cjpark.Sboard.service;

import java.util.ArrayList;


public interface SboardService {
	public ArrayList<SboardVo> select();
	public SboardVo getSelect(int boardId);
	public int insert(SboardVo vo);
	public int update(SboardVo vo);
	public int delete(int boardId);
}
