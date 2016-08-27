package exam.core.customer.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import exam.core.customer.dto.Customers;

public interface CustomersMapper extends Mapper<Customers>{
	
	List<Customers> selectByCustomer(Customers customer);
}
