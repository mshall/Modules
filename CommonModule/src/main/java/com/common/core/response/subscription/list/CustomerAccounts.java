package com.common.core.response.subscription.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerAccounts {
	@JsonProperty("customer-account")
	private CustomerAccount[] customerAccount;

	public CustomerAccount[] getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount[] customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Override
	public String toString() {
		return "ClassPojo [customerAccount = " + customerAccount + "]";
	}
}
