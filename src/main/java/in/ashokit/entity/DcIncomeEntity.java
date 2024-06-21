package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DC_INCOME")
public class DcIncomeEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer incomeId;
	
	private Long caseNum;
	
	private Double empIncome;
	
	private Double propertyIncome;
	

	
	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public Double getEmpIncome() {
		return empIncome;
	}

	public void setEmpIncome(Double empIncome) {
		this.empIncome = empIncome;
	}

	public Double getPropertyIncome() {
		return propertyIncome;
	}

	public void setPropertyIncome(Double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}

}
