package in.ashokit.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DC_CHILDREN")
public class DcChildren {

	
	@Id
	private Integer childId;
	
	private LocalDate childDob;
	
	private Long childSon;

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

	public Long getChildSon() {
		return childSon;
	}

	public void setChildSon(Long childSon) {
		this.childSon = childSon;
	}

	public void save(DcChildren entity) {
		// TODO Auto-generated method stub
		
	}

	public List<DcChildren> findByCaseNum(Long caseNum) {
		// TODO Auto-generated method stub
		return null;
		
	}

	

	
	
	
}
