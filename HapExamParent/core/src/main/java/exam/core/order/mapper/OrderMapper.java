package exam.core.order.mapper;

import java.util.List;
import com.hand.hap.mybatis.common.Mapper;
import exam.core.order.dto.Order;

public interface OrderMapper extends Mapper<Order>{
	List<Order> selectByOrder(Order order);
}
