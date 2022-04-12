package org.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.demo.model.League;

@WebServlet(urlPatterns = "/add_league.do")
public class LeagueController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> erros=new ArrayList<String>();
		String year=req.getParameter("year");
		int iYear=0;
		String season=req.getParameter("season");
		String title=req.getParameter("title");
		PrintWriter out=resp.getWriter();
		try {
			iYear=Integer.parseInt(year);
		} catch (Exception e) {
			erros.add("year field must be numeric");
			
		}
		
		if(iYear!=2022)
		{
			erros.add("provided year is not the current year.");
		}
		if(season.equals("UNKNOWN"))
		{
			erros.add("please select season..");
		}
		
		if(title.length()<10)
		{
			erros.add("invalid title.");
		}
		
		
		if(!erros.isEmpty())
		{
			req.setAttribute("ERROR", erros);
			RequestDispatcher view=req.getRequestDispatcher("error.view");
			view.forward(req, resp);
		}
		else
		{
			req.setAttribute("LEAGUE", new League(iYear, season, title));
			RequestDispatcher view=req.getRequestDispatcher("success.view");
			view.forward(req, resp);
		}
		
		

	}

}
