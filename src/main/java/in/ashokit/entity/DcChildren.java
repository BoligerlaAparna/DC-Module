package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DC_CHILDREN")
public class DcChildren {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer childId;
	
	private LocalDate childDob;
	
	private Long childSsn;
	
	private Long caseNum;
	
	private String childName;

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public LocalDate getChildDob() {
		return childDob;
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

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
	

	

	
	

	
	
	
}
