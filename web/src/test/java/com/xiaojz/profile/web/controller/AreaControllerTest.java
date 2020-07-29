package com.xiaojz.profile.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AreaControllerTest {

    @Autowired MockMvc mvc;

    @Test
    public void testList() throws Exception {
        String requestBody = "{}";
        String responseString = mvc.perform(MockMvcRequestBuilders
                .get("/area/list")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())//打印出请求和响应的内容
                //.andExpect(MockMvcResultMatchers.content().string(IsEqual.equalTo("预期结果")));
                .andReturn().getResponse().getContentAsString();// 将相应的数据转换为字符串
        log.info(responseString);
    }

}
