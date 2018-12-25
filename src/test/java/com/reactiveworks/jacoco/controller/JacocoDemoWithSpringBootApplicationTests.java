package com.reactiveworks.jacoco.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.reactiveworks.jacoco.JacocoDemoWithSpringBootApplication;
import com.reactiveworks.jacoco.service.EmployeeService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=JacocoDemoWithSpringBootApplication.class)
@WebMvcTest(EmployeeController.class)
public class JacocoDemoWithSpringBootApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	EmployeeService employeeService;

	@Test
	public void applicationTest() throws Exception {
		System.out.println("inside applicationTest method.....");
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employees/test")
				                        .contentType(MediaType.TEXT_PLAIN);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String outputResponse = response.getContentAsString();
		assertThat(outputResponse).isEqualTo("Application is running");
		
	}
	

}
