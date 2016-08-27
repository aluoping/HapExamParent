package exam.core.item.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import exam.core.item.dto.Items;
import exam.core.item.service.IItemService;

@Controller
public class ItemController extends BaseController{
	@Autowired
	private IItemService iitemService;
	
	@RequestMapping(value = "/exam/item/query")
	@ResponseBody
	public ResponseData getTasks(Items items, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(iitemService.selectByItem(requestContext, items, page, pagesize));
	}
}
