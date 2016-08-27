package exam.core.line.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import exam.core.line.dto.Lines;


public interface LineMapper extends Mapper<Lines>{
	List<Lines> selectByLine(Lines line);
/*	List<Lines> selectByAddition(Lines line);*/
}
