package in.ashokit.binding;

public class Child {

	private Integer childId;

	private String childName;

	private Integer childAge;

	private Long childSsn;

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public Integer getChildDob() {
		return childAge;
	}

	public void setChildDob(Integer childDob) {
		this.childAge = childDob;
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
