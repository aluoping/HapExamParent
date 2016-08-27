package exam.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.core.order.dto.Order;
import exam.core.order.mapper.OrderMapper;
import exam.core.order.service.IOrderService;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order> implements IOrderService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> selectByOrder(IRequest requestContext, Order order, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderMapper.selectByOrder(order);
	}

}
