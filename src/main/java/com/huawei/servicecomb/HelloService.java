package com.huawei.servicecomb;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.core.MediaType;

@RestSchema(schemaId = "hello")
@RequestMapping(path = "/hello", produces = MediaType.APPLICATION_JSON)
public class HelloService {
	@RequestMapping(path = "/say", method = RequestMethod.GET)
	public String sayHi(@RequestParam(name = "name") String name) {
		return "Hello " + name;
	}
}
