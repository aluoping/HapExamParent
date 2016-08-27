package exam.core.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.core.item.dto.Items;
import exam.core.item.mapper.ItemMapper;
import exam.core.item.service.IItemService;

@Service
@Transactional
public class ItemServiceImpl extends BaseServiceImpl<Items> implements IItemService{
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Items> selectByItem(IRequest requestContext, Items item, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return itemMapper.selectByItem(item);
	}

}
