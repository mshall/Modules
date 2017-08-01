package com.common.utils;

import java.io.IOException;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.common.core.response.subscription.details.SubscriptionDetailsResponse;
import com.common.core.response.subscription.list.SubscriptionsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HTTPRequestUtil {

	private static PropertiesReader props = PropertiesReader.getInstance("stub.properties");
	private static Logger logger = Logger.getLogger(HTTPRequestUtil.class.getName());
	/*
	 * public static com.vis.poc.stubs.germany.response.BillDetails
	 * parseGermanyBillDetails() { try { HttpClient client =
	 * HttpClientBuilder.create().build(); String loginUrl =
	 * props.getProperty("de.login.url"); HttpGet loginRequest = new
	 * HttpGet(loginUrl); loginRequest.setHeader("X-VFSSDublinVersion", "6");
	 * loginRequest.setHeader("User-Agent", "iphone");
	 * client.execute(loginRequest); return billDetails; } catch (Exception e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } return null; }
	 */

	public static SubscriptionsResponse parseSubscriptions(String holderId) {
		SubscriptionsResponse subscriptionsResponse = new SubscriptionsResponse();
		return subscriptionsResponse;
	}

	public static SubscriptionDetailsResponse parseSubscriptionDetails(String id) {
		SubscriptionDetailsResponse subscriptionDetailsResponse = new SubscriptionDetailsResponse();
		return subscriptionDetailsResponse;
	}

	// ---------------------------------------------------------------------------
	// This method to execute an Http request
	// ---------------------------------------------------------------------------
	private static String executeHttpRequest(HttpUriRequest request) {

		CloseableHttpClient httpclient = null;
		HttpResponse response;
		httpclient = HttpClientBuilder.create().build();
		try {

			response = httpclient.execute(request);
			if (response != null) {
				HttpEntity responseEntity = response.getEntity();
				if (responseEntity != null) {
					return EntityUtils.toString(responseEntity, "UTF-8");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (httpclient != null)
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// ---------------------------------------------------------------------------
	// This method to convert the string to JSON Object
	// ---------------------------------------------------------------------------
	private static <WRAPPER> WRAPPER parseStringToJsonObject(String retrievedJsonCustomer, Class<WRAPPER> distClass) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			WRAPPER clazz = distClass.newInstance();
			clazz = mapper.readValue(retrievedJsonCustomer, distClass);
			return clazz;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
