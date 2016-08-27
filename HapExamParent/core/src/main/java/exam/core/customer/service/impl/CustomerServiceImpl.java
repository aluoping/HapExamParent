package exam.core.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import exam.core.customer.dto.Customers;
import exam.core.customer.mapper.CustomersMapper;
import exam.core.customer.service.ICustomerService;

@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<Customers> implements ICustomerService{
	@Autowired
	private CustomersMapper customersMapper;
	
	@Override
	public List<Customers> selectByCustomer(IRequest requestContext, Customers customer, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return customersMapper.selectByCustomer(customer);
	}

}
