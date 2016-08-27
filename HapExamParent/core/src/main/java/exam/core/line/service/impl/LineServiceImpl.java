package exam.core.line.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.core.line.dto.Lines;
import exam.core.line.mapper.LineMapper;
import exam.core.line.service.ILineService;


@Service
@Transactional
public class LineServiceImpl extends BaseServiceImpl<Lines> implements ILineService{
	@Autowired
	private LineMapper lineMapper;

	public List<Lines> selectByLine(IRequest requestContext, Lines line, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return lineMapper.selectByLine(line);
	}
	
/*	public List<Lines> selectByAddition(IRequest requestContext, Lines line, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return lineMapper.selectByLine(line);
	}*/
}
