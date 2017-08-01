package com.common.core.response.subscription.list;

public class Extension {
	private String agreementTCs;

	private String agreementStartDate;

	private String agreementEndDate;

	public String getAgreementTCs() {
		return agreementTCs;
	}

	public void setAgreementTCs(String agreementTCs) {
		this.agreementTCs = agreementTCs;
	}

	public String getAgreementStartDate() {
		return agreementStartDate;
	}

	public void setAgreementStartDate(String agreementStartDate) {
		this.agreementStartDate = agreementStartDate;
	}

	public String getAgreementEndDate() {
		return agreementEndDate;
	}

	public void setAgreementEndDate(String agreementEndDate) {
		this.agreementEndDate = agreementEndDate;
	}

	@Override
	public String toString() {
		return "ClassPojo [agreementTCs = " + agreementTCs + ", agreementStartDate = " + agreementStartDate
				+ ", agreementEndDate = " + agreementEndDate + "]";
	}
}
