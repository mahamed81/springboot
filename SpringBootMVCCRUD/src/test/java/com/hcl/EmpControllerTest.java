/*
 * package com.hcl;
 * 
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * 
 * public class EmpControllerTest extends SpringBootTestApplicationTests {
 * public EmpControllerTest() {}
 * 
 * @Autowired private WebApplicationContext webApplicationContext;
 * 
 * private MockMvc mockMvc;
 * 
 * @Before public void setup() { mockMvc =
 * MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); }
 * 
 * @Test public void employeeTest() throws Exception {
 * mockMvc.perform(get("/JUnit")).andExpect(status().isOk())
 * .andExpect(content().contentType("application/json;charset=UTF-8"))
 * .andExpect(jsonPath("$.id").value("111")).andExpect(jsonPath("$.name").value(
 * "John"));
 * 
 * 
 * }
 * 
 * }
 */