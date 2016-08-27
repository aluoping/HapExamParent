package exam.core.company.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import exam.core.company.dto.Companys;
import exam.core.company.service.ICompanyService;

@Controller
public class CompanysController extends BaseController{
	
	@Autowired
	private ICompanyService icompanyService;
	
	@RequestMapping(value = "/exam/company/query")
	@ResponseBody
	public ResponseData getTasks(Companys companys, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(icompanyService.selectByCompany(requestContext, companys, page, pagesize));
	}
}
