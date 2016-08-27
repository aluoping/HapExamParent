package exam.core.line.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import exam.core.line.dto.Lines;
import exam.core.line.service.ILineService;

@Controller
public class LinesController extends BaseController{
	@Autowired
	private ILineService iLienService;
	
	@RequestMapping(value = "/exam/line/query")
	@ResponseBody
	public ResponseData getTasks(Lines line, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(iLienService.selectByLine(requestContext, line, page, pagesize));
	}
	
/*	@RequestMapping(value = "/exam/line/queryAddition")
	@ResponseBody
	public ResponseData getTasks2(Lines line, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(iLienService.selectByAddition(requestContext, line, page, pagesize));
	}*/
}
