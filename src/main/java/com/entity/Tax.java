package com.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tax", schema = "dbo", catalog = "AVBusiness")
public class Tax {

	@Id
	@Column(name = "IdTax", unique = true, nullable = false)
	private Integer idTax;
	@Column(name = "[Percent]")
	private Float percent;
	private String miniDescription;
	private String fullDescription;
	/*
	@OneToMany(mappedBy = "tax", cascade = CascadeType.ALL) private
	List<IncomeDetails> incomeDetails;*/
	
	/*
	 * private Set wayBillDetailses = new HashSet(0); private Set incomeDetailses =
	 * new HashSet(0); private Set invoiceDetailses = new HashSet(0);
	 */
	@OneToMany(mappedBy = "tax", cascade = CascadeType.ALL)
    private List<IncomeDetails> incomeDetails;


	public Integer getIdTax() {
		return this.idTax;
	}

	public void setIdTax(Integer idTax) {
		this.idTax = idTax;
	}


	public Float getPercent() {
		return this.percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	@Column(name = "[MiniDescription]")
	public String getMiniDescription() {
		return this.miniDescription;
	}

	public void setMiniDescription(String miniDescription) {
		this.miniDescription = miniDescription;
	}

	@Column(name = "[FullDescription]")
	public String getFullDescription() {
		return this.fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}
	
	/*
	 * public Set getWayBillDetailses() { return this.wayBillDetailses; }
	 * 
	 * public void setWayBillDetailses(Set wayBillDetailses) { this.wayBillDetailses
	 * = wayBillDetailses; }
	 * 
	 * public Set getIncomeDetailses() { return this.incomeDetailses; }
	 * 
	 * public void setIncomeDetailses(Set incomeDetailses) { this.incomeDetailses =
	 * incomeDetailses; }
	 * 
	 * public Set getInvoiceDetailses() { return this.invoiceDetailses; }
	 * 
	 * public void setInvoiceDetailses(Set invoiceDetailses) { this.invoiceDetailses
	 * = invoiceDetailses; }
	 */
	 
}
