package exam.core.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.core.company.dto.Companys;
import exam.core.company.mapper.CompanysMapper;
import exam.core.company.service.ICompanyService;

@Service
@Transactional
public class CompanyServiceImpl extends BaseServiceImpl<Companys> implements ICompanyService{
	@Autowired
	private CompanysMapper companyMapper;
	
	public List<Companys> selectByCompany(IRequest requestContext, Companys company, int page, int pagesize) {
		
		PageHelper.startPage(page, pagesize);
		return companyMapper.selectByCompany(company);
	}

}
