package exam.core.company.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.core.company.dto.Companys;

public interface ICompanyService extends IBaseService<Companys>, ProxySelf<ICompanyService>{
	List<Companys> selectByCompany(IRequest requestContext, Companys company, int page, int pagesize);
}
