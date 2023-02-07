package com.middleware.bean;

import org.apache.camel.Exchange;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

/**
 * @author Redhat
 */

public class ProcessorBean {

	private static final Logger logger = LoggerFactory.getLogger(ProcessorBean.class);
	private static final String CONTEXT = "context";

	public String enlistaAlertas(Exchange ex) {

		String bodyIn = ex.getIn().getBody(String.class);
		String bodyMessage = "";
		JSONObject arr = new JSONObject((bodyIn));

		try {
			System.out.print(arr.optJSONArray("alerts").get(i).toString())
			}
		} catch (DataAccessException error) {
			logger.error(CONTEXT, error);
		}

		return bodyMessage;

	}