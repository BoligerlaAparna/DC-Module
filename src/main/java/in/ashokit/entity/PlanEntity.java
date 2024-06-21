package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="PLAN_MASTER")

public class PlanEntity {
	
		
		
		
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name ="PLAN_ID")
	    private Integer planId;
		
		@Column(name ="PLAN_NAME")
	    private String planName;
		
		@Column(name ="PLAN_START_DATE")
	    private Integer planStartDate;
		
		@Column(name ="PLAN_END_DATE")
	    private Integer planEndDate;
		
		@Column(name="ACTIVE_SW")
		private String activeSw;
		
		@Column(name ="PLAN_CATEGORY_ID")
	    private Integer planCategoryId;
		
		@Column(name ="CREATED_BY")
		private String createBy;
		
		@Column(name ="UPDATED_By")
		private String updateBy;
		
		@Column(name ="CREATED_DATE", updatable=false)
		@CreationTimestamp
		private LocalDate createDate;
		
		@Column(name ="UPDATED_DATE", insertable=false)
		@UpdateTimestamp
		private LocalDate UpdateDate;

		
		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public Integer getPlanStartDate() {
			return planStartDate;
		}

		public void setPlanStartDate(Integer planStartDate) {
			this.planStartDate = planStartDate;
		}

		public Integer getPlanEndDate() {
			return planEndDate;
		}

		public void setPlanEndDate(Integer planEndDate) {
			this.planEndDate = planEndDate;
		}

		public String getActiveSw() {
			return activeSw;
		}

		public void setActiveSw(String activeSw) {
			this.activeSw = activeSw;
		}

		public Integer getPlanCategoryId() {
			return planCategoryId;
		}

		public void setPlanCategoryId(Integer planCategoryId) {
			this.planCategoryId = planCategoryId;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getUpdateBy() {
			return updateBy;
		}

		public void setUpdateBy(String updateBy) {
			this.updateBy = updateBy;
		}

		public LocalDate getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}

		public LocalDate getUpdateDate() {
			return UpdateDate;
		}

		public void setUpdateDate(LocalDate updateDate) {
			UpdateDate = updateDate;
		}
		
	

	
	

	public Integer getPlanId() {
		// TODO Auto-generated method stub
		return  planId;
	}
	}


		