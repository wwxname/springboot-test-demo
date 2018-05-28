package com.example.demo1.controller;

import com.example.demo1.Demo1ApplicationTests;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class demoControllerTest extends Demo1ApplicationTests {


    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(super.webApplicationContext).build();
    }


    public String Obj2Json(Object object) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
    @Test
    public void testController() throws Exception{
        String uri = "/person/getPerson";
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON));
        MvcResult result = resultActions.andReturn();
        int status = result.getResponse().getStatus();
        String str = result.getResponse().getContentAsString();
        System.err.println(str);



    }


}
