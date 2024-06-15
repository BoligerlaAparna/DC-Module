package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.DcEducation;

public interface DcEducationRepository  extends JpaRepository<DcEducation,Serializable>{
	
	public DcEducation findByCaseNum(Long caseNum);

}
