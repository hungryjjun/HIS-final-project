package kr.or.ddit.mybatis.mappers.empRecord;

import java.util.List;


//@Mapper
public interface RecordCardMapper {
	
	public List<EmpCardVO> selectRecordList(); 
	
	public EmpCardVO selectRecord(String cardId);
	
	public int insertRecord(String record);

	public int updateRecord(String record);
}
