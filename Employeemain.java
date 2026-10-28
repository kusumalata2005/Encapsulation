package com.tka;

public class Employeemain {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmployeeId(101);
		e.setname("priya");
		e.setdepartment("cse");
		e.setdesignation("java developer");
		e.setsalary(250000.00);
		e.setage(22);
		e.setgender("female");
		e.setemail("priya@gmail.com");
		e.setphoneNumber("5354625472");
		e.setcity("pune");
		e.setstate("maharastra");
        e.setcountry("india");
        e.setaddress("pune");
		e.setjoiningDate("01-06-2025"); 
		e.setcompanyName("kiranacademy");
		

        System.out.println(e.getEmployeeId());
        System.out.println(e.getname());
        System.out.println(e.getdepartment());
        System.out.println(e.getdesignation());
        System.out.println(e.getsalary());
        System.out.println(e.getage());
        System.out.println(e.getgender());
        System.out.println(e.getemail());
        System.out.println(e.getphoneNumber());
        System.out.println(e.getcity());
        System.out.println(e.getstate());
        System.out.println(e.getcountry());
        System.out.println(e.getaddress());
        System.out.println(e.getjoiningDate());
        System.out.println(e.getcompanyName());
	
		
	} 
	
	

}
