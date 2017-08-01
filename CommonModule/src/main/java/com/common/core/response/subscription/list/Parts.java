package com.common.core.response.subscription.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parts {
	@JsonProperty("customer-accounts")
	private CustomerAccounts customerAccounts;

	public CustomerAccounts getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(CustomerAccounts customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	@Override
	public String toString() {
		return "ClassPojo [customerAccounts = " + customerAccounts + "]";
	}
}