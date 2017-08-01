package com.common.core.response.subscription.list;


public class SubscriptionsResponse {
	private String count;

//	@JsonProperty("totalItems")
	private String totalCount;

	private String offset;
	
	private Items[] items;

	

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Items[] getItems() {
		return items;
	}

	public void setItems(Items[] items) {
		this.items = items;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "ClassPojo [count = " + count + ", items = " + items + ", totalCount = " + totalCount + ", offset = "
				+ offset + "]";
	}
}
