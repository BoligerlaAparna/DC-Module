package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="DC_EDUCATION")
public class DcEducation {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer eduId;
	
	private Long caseNum;
	
	public Integer getEduId() {
		return eduId;
	}

	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public Integer getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

	private String highestQualification;
	
	private Integer graduationYear;

}
