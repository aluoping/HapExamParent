package exam.core.company.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import exam.core.company.dto.Companys;


public interface CompanysMapper extends Mapper<Companys>{
	List<Companys> selectByCompany(Companys company);
}
