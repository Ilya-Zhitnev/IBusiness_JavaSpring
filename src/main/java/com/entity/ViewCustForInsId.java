package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ViewCustForInsId generated by hbm2java
 */
public class ViewCustForInsId implements java.io.Serializable {

	private Serializable adress;
	private Serializable bic;
	private Serializable countryName;
	private int custId;
	private Timestamp dateRegistration;
	private Serializable name;
	private Serializable number;
	private Serializable ownerMini;
	private Serializable paymentAcc;
	private Serializable phone;
	private Serializable yhh;

	public ViewCustForInsId() {
	}

	public ViewCustForInsId(Serializable adress, Serializable bic, Serializable countryName, int custId,
			Timestamp dateRegistration, Serializable name, Serializable number, Serializable ownerMini,
			Serializable paymentAcc, Serializable phone, Serializable yhh) {
		this.adress = adress;
		this.bic = bic;
		this.countryName = countryName;
		this.custId = custId;
		this.dateRegistration = dateRegistration;
		this.name = name;
		this.number = number;
		this.ownerMini = ownerMini;
		this.paymentAcc = paymentAcc;
		this.phone = phone;
		this.yhh = yhh;
	}

	public Serializable getAdress() {
		return this.adress;
	}

	public void setAdress(Serializable adress) {
		this.adress = adress;
	}

	public Serializable getBic() {
		return this.bic;
	}

	public void setBic(Serializable bic) {
		this.bic = bic;
	}

	public Serializable getCountryName() {
		return this.countryName;
	}

	public void setCountryName(Serializable countryName) {
		this.countryName = countryName;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Timestamp getDateRegistration() {
		return this.dateRegistration;
	}

	public void setDateRegistration(Timestamp dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	public Serializable getNumber() {
		return this.number;
	}

	public void setNumber(Serializable number) {
		this.number = number;
	}

	public Serializable getOwnerMini() {
		return this.ownerMini;
	}

	public void setOwnerMini(Serializable ownerMini) {
		this.ownerMini = ownerMini;
	}

	public Serializable getPaymentAcc() {
		return this.paymentAcc;
	}

	public void setPaymentAcc(Serializable paymentAcc) {
		this.paymentAcc = paymentAcc;
	}

	public Serializable getPhone() {
		return this.phone;
	}

	public void setPhone(Serializable phone) {
		this.phone = phone;
	}

	public Serializable getYhh() {
		return this.yhh;
	}

	public void setYhh(Serializable yhh) {
		this.yhh = yhh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewCustForInsId))
			return false;
		ViewCustForInsId castOther = (ViewCustForInsId) other;

		return ((this.getAdress() == castOther.getAdress()) || (this.getAdress() != null
				&& castOther.getAdress() != null && this.getAdress().equals(castOther.getAdress())))
				&& ((this.getBic() == castOther.getBic()) || (this.getBic() != null && castOther.getBic() != null
						&& this.getBic().equals(castOther.getBic())))
				&& ((this.getCountryName() == castOther.getCountryName())
						|| (this.getCountryName() != null && castOther.getCountryName() != null
								&& this.getCountryName().equals(castOther.getCountryName())))
				&& (this.getCustId() == castOther.getCustId())
				&& ((this.getDateRegistration() == castOther.getDateRegistration())
						|| (this.getDateRegistration() != null && castOther.getDateRegistration() != null
								&& this.getDateRegistration().equals(castOther.getDateRegistration())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getNumber() == castOther.getNumber()) || (this.getNumber() != null
						&& castOther.getNumber() != null && this.getNumber().equals(castOther.getNumber())))
				&& ((this.getOwnerMini() == castOther.getOwnerMini()) || (this.getOwnerMini() != null
						&& castOther.getOwnerMini() != null && this.getOwnerMini().equals(castOther.getOwnerMini())))
				&& ((this.getPaymentAcc() == castOther.getPaymentAcc()) || (this.getPaymentAcc() != null
						&& castOther.getPaymentAcc() != null && this.getPaymentAcc().equals(castOther.getPaymentAcc())))
				&& ((this.getPhone() == castOther.getPhone()) || (this.getPhone() != null
						&& castOther.getPhone() != null && this.getPhone().equals(castOther.getPhone())))
				&& ((this.getYhh() == castOther.getYhh()) || (this.getYhh() != null && castOther.getYhh() != null
						&& this.getYhh().equals(castOther.getYhh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAdress() == null ? 0 : this.getAdress().hashCode());
		result = 37 * result + (getBic() == null ? 0 : this.getBic().hashCode());
		result = 37 * result + (getCountryName() == null ? 0 : this.getCountryName().hashCode());
		result = 37 * result + this.getCustId();
		result = 37 * result + (getDateRegistration() == null ? 0 : this.getDateRegistration().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result + (getOwnerMini() == null ? 0 : this.getOwnerMini().hashCode());
		result = 37 * result + (getPaymentAcc() == null ? 0 : this.getPaymentAcc().hashCode());
		result = 37 * result + (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result + (getYhh() == null ? 0 : this.getYhh().hashCode());
		return result;
	}

}
