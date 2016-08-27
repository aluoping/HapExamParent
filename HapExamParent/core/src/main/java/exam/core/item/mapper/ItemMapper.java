package exam.core.item.mapper;

import java.util.List;
import com.hand.hap.mybatis.common.Mapper;
import exam.core.item.dto.Items;

public interface ItemMapper extends Mapper<Items>{
	List<Items> selectByItem(Items item);
}
