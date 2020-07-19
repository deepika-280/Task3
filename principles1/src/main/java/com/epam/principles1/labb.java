package com.epam.principles1;

public class labb {
	public void lab(){
	    System.out.println("Welcome to lab session");
	    performTasks();
	    }
	    
	    public void theory(){
	     System.out.println("Welcome to theory session");
	      performTasks();
	    }
	    public void performTasks(){
	        System.out.println("Lecturer delivering a lesson");
	        System.out.println("Marking attendance");
	        System.out.println("Students taking down their notes");
	    }
	    }
	    class dryMain{
	          public static void main(String args[]){
	           labb d=new labb();
	           d.lab();
	           d.theory();
	           }

}