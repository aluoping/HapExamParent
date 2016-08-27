package exam.core.customer.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import exam.core.customer.dto.Customers;
import exam.core.customer.service.ICustomerService;

@Controller
public class CustomersController extends BaseController{
	@Autowired
	private ICustomerService icustomerService;
	
	@RequestMapping(value = "/exam/customer/query")
	@ResponseBody
	public ResponseData getTasks(Customers customer, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(icustomerService.selectByCustomer(requestContext, customer, page, pagesize));
	}
}
