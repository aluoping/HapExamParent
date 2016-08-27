package exam.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.core.order.dto.Order;

public interface IOrderService extends IBaseService<Order>, ProxySelf<IOrderService>{
	List<Order> selectByOrder(IRequest requestContext, Order order, int page, int pagesize);
}
