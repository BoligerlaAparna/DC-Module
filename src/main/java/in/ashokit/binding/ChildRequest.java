package in.ashokit.binding;

import java.util.List;

public class ChildRequest {
	
	private Long caseNum;
	
	private List<Child> childs;

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
	
	

}
