package exam.core.line.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_om_order_lines")
public class Lines extends BaseDTO{
    @Id
    @Column
	private Long lineId;
    
    @Column
    @NotEmpty
	private Long headerId;
    
    @Column
    @NotEmpty
	private Long lineNumber;
    
    @Column
    @NotEmpty
	private Long inventoryItemId;
    
    @Column
    @NotEmpty
	private Long orderdQuantity;
    
    @Column
    @NotEmpty
	private String orderUom;
    
    @Column
    @NotEmpty
	private Long unitSePrice;
    
    @Column
    @NotEmpty
	private String description;
    
    @Column
    @NotEmpty
	private Long companyId;
    
    @Column
	private String addition1;
    
    @Column
	private String addition2;
	
    @Column
	private String addition3;
	
    @Column
	private String addition4;
	
    @Column
	private String addition5;

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Long getOrderdQuantity() {
		return orderdQuantity;
	}

	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}

	public String getOrderUom() {
		return orderUom;
	}

	public void setOrderUom(String orderUom) {
		this.orderUom = orderUom;
	}

	public Long getUnitSePrice() {
		return unitSePrice;
	}

	public void setUnitSePrice(Long unitSePrice) {
		this.unitSePrice = unitSePrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getAddition1() {
		return addition1;
	}

	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}

	public String getAddition2() {
		return addition2;
	}

	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}

	public String getAddition3() {
		return addition3;
	}

	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}

	public String getAddition4() {
		return addition4;
	}

	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}

	public String getAddition5() {
		return addition5;
	}

	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}
    
    
}
