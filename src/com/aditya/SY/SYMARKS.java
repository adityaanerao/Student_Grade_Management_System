package com.aditya.SY;

public class SYMARKS {
	int computerTotal;
	int mathsTotal;
	int electronicsTotal;
	
	public SYMARKS() {
		this.computerTotal = 0;
		this.mathsTotal = 0;
		this.electronicsTotal = 0;
	}
	public SYMARKS(int computerTotal, int mathsTotal, int electronicsTotal) {
		super();
		this.computerTotal = computerTotal;
		this.mathsTotal = mathsTotal;
		this.electronicsTotal = electronicsTotal;
	}
	public int getComputerTotal() {
		return computerTotal;
	}
	public void setComputerTotal(int computerTotal) {
		this.computerTotal = computerTotal;
	}
	public int getMathsTotal() {
		return mathsTotal;
	}
	public void setMathsTotal(int mathsTotal) {
		this.mathsTotal = mathsTotal;
	}
	public int getElectronicsTotal() {
		return electronicsTotal;
	}
	public void setElectronicsTotal(int electronicsTotal) {
		this.electronicsTotal = electronicsTotal;
	}
	
	

}
