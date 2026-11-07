package com.example.ms1project_insem;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;import org.springframework.test.web.servlet.MockMvc;
import com.example.ms1project_insem.controller.MS1Controller;

@WebMvcTest(MS1Controller.class)
public class Ms1projectInsemApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddEndpoint() throws Exception {

        mockMvc.perform(get("/ms1/add")
                .param("a", "5")
                .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 15"));
    }
}