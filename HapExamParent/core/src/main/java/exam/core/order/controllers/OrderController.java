package exam.core.order.controllers;

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
import exam.core.order.dto.Order;
import exam.core.order.service.IOrderService;

@Controller
public class OrderController extends BaseController{
	@Autowired
	private IOrderService iOderservice;
	
	@RequestMapping(value = "/exam/order/query")
	@ResponseBody
	public ResponseData getTasks(Order order, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(iOderservice.selectByOrder(requestContext, order, page, pagesize));
	}
}
