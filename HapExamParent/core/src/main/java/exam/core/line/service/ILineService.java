package exam.core.line.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.core.line.dto.Lines;


public interface ILineService extends IBaseService<Lines>, ProxySelf<ILineService>{
	List<Lines> selectByLine(IRequest requestContext, Lines line, int page, int pagesize);
/*	List<Lines> selectByAddition(IRequest requestContext, Lines line, int page, int pagesize);*/
}
