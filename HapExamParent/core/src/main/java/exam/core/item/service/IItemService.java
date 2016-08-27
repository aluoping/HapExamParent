package exam.core.item.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.core.item.dto.Items;

public interface IItemService extends IBaseService<Items>, ProxySelf<IItemService>{
	List<Items> selectByItem(IRequest requestContext, Items item, int page, int pagesize);
}
