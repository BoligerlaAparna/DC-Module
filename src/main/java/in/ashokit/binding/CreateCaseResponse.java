package in.ashokit.binding;

import java.util.Map;

public class CreateCaseResponse {
	
	private Long caseNum;
	
	private Map< Integer, String> planNames;
	
	

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public Map<Integer, String> getPlanNames() {
		return planNames;
	}

	public void setPlanNames(Map<Integer, String> planNames) {
		this.planNames = planNames;
	}

	
	
	
}
