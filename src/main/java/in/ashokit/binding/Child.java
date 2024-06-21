package in.ashokit.binding;

import java.time.LocalDate;

public class Child {


	private String childName;

	private Integer childAge;

	private Long childSsn;
	
	private LocalDate childDob;

	
	public Integer getChildDob() {
		return childAge;
	}

	public Integer getChildAge() {
		return childAge;
	}

	public void setChildAge(Integer childAge) {
		this.childAge = childAge;
	}

	

	public void setChildDob(LocalDate childDob) {
		this.childDob = childDob;
	}

	public Long getChildSsn() {
		return childSsn;
	}

	public void setChildSsn(Long childSsn) {
		this.childSsn = childSsn;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

}
