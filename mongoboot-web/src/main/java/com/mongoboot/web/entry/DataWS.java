package com.mongoboot.web.entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.mongoboot.common.response.ResponseData;

/**
 * @author narenderk
 *
 */
@Component
@Path("/")
public class DataWS {

	@GET
	@Produces(value = MediaType.TEXT_PLAIN)
	@Path("/test")
	public String test() {
		return "Data from DataWS";
	}

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/foo")
	public ResponseData sendRes() {
		ResponseData responseData = new ResponseData();
		responseData.setData("Response from DataWS");
		responseData.setStatus(200);
		return responseData;
	}
}
