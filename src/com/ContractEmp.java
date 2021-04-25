package com;

public class ContractEmp extends Employee{
	int pay_per_hr;
	float contract_duration;
	public int getPay_per_hr() {
		return pay_per_hr;
	}
	public void setPay_per_hr(int pay_per_hr) {
		this.pay_per_hr = pay_per_hr;
	}
	public float getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(float contract_duration) {
		this.contract_duration = contract_duration;
	}
	@Override
	public String toString() {
		return "ContractEmp [pay_per_hr=" + pay_per_hr + ", contract_duration=" + contract_duration + "]";
	}
	
}
