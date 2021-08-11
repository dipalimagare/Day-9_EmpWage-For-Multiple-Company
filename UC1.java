package com.bl;

public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_present = 1;
        int emp_check = (int)(Math.floor(Math.random() * 10)) % 2;
        if( emp_check == is_present)
        {
            System.out.println("Wage is present");
        }
        else
            System.out.println("Wage is absent");
	}

}
