package com.common.core.response.subscription.details;

import com.common.core.response.subscription.list.Extension;
import com.common.core.response.subscription.list.Parts;

public class SubscriptionDetailsResponse {

	private String id;

	private String msisdn;

	private String type;

	private Parts parts;

	private Extension extension;

	public Extension getExtension() {
		return extension;
	}

	public void setExtension(Extension extension) {
		this.extension = extension;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Parts getParts() {
		return parts;
	}

	public void setParts(Parts parts) {
		this.parts = parts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [extension = " + extension + ", id = " + id + ", msisdn = " + msisdn + ", parts = " + parts
				+ ", type = " + type + "]";
	}
}
