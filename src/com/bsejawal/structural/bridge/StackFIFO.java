package com.bsejawal.structural.bridge;

public class StackFIFO extends StackArray{
	
	private StackArray temp = new StackArray();
	public int pop(){
		while(!isEmpty()){
			temp.push(super.pop());
			
		}
		return 1;
	}

}
