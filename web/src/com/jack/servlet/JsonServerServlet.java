package com.jack.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class JsonServerServlet
 */
@WebServlet("/JsonServerServlet")
public class JsonServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonServerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		   Result result = new Result();
	        result.setResult(1);
	        List<Person> list = new ArrayList<Person>();
	        result.setPersonsData(list);


	        Person person1 = new Person();
	        person1.setName("Jack");
	        person1.setAge(25);
	        person1.setUrl("http://imgsrc.baidu.com/forum/pic/item/0e2442a7d933c895d10947f9d11373f082020038.jpg");
	        List<SchoolInfo> schools = new ArrayList<SchoolInfo>();
	        SchoolInfo schoolInfo1 = new SchoolInfo();
	        schoolInfo1.setSchool_name("清华");
	        SchoolInfo schoolInfo2 = new SchoolInfo();
	        schoolInfo2.setSchool_name("北大");
	        schools.add(schoolInfo1);
	        schools.add(schoolInfo2);
	        person1.setSchoolInfo(schools);
	        list.add(person1);


	        Person person2 = new Person();
	        person2.setName("Rose");
	        person2.setAge(22);
	        person2.setUrl("http://imgsrc.baidu.com/forum/pic/item/e61190ef76c6a7efba84856ffdfaaf51f2de66dc.jpg");
	        List<SchoolInfo> schools1 = new ArrayList<SchoolInfo>();
	        SchoolInfo schoolInfo3 = new SchoolInfo();
	        schoolInfo3.setSchool_name("复旦");
	        SchoolInfo schoolInfo4 = new SchoolInfo();
	        schoolInfo4.setSchool_name("交大");
	        schools1.add(schoolInfo3);
	        schools1.add(schoolInfo4);
	        person2.setSchoolInfo(schools1);
	        list.add(person2);
	        
	        Gson gson = new Gson();
	        System.out.println(gson.toJson(result));
	        out.println(gson.toJson(result));
	}

}
