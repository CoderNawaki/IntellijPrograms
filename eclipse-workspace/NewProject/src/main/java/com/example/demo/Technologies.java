package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies 
{
    private int Techid;
    private String techname;
    
    public int getTechid() {
		return Techid;
	}
	public void setTechid(int techid) {
		Techid = techid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public void tech()
	{
	    System.out.println("Successful");
	}
}
