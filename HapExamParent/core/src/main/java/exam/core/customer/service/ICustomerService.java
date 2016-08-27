package exam.core.customer.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import exam.core.customer.dto.Customers;

public interface ICustomerService extends IBaseService<Customers>, ProxySelf<ICustomerService>{
	List<Customers> selectByCustomer(IRequest requestContext, Customers customer, int page, int pagesize);
}
