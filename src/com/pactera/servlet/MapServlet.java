package com.pactera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pactera.util.MapUtil;

/**
 * Servlet implementation class MapServlet
 */

public class MapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MapServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MapUtil map=new MapUtil();
		String json=map.getGeoJson();
		returnWriter(response,json);
	}
	
    private void returnWriter(HttpServletResponse response, String json) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(json);
    }
}
