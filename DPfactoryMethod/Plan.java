package DPfactoryMethod;

import java.io.*;

abstract public class Plan {
	protected double rate;
	abstract void getRate();
	public void calculateBill(int units){
	System.out.println(units*rate);
}
}
//end of Plan class

class DomesticPlan extends Plan{
	//@override
	public void getRate(){
	rate=3.50;
	}
	}
//end of DomesticPlan class.

class CommercialPlan extends Plan{
	//@override
	public void getRate(){
	rate=7.50;
	}
}
//end of CommercialPlan class.

class InstitutionalPlan extends Plan{
	//@override
	public void getRate(){
	rate=5.50;
	}
}
//end of InstitutionalPlan class.

class GetPlanFactory{
	//use getPlan method to get object of type Plan
	public Plan getPlan(String planType){
	if(planType == null){
	return null;
	}
	if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
	return new DomesticPlan();
	}
	else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
	return new CommercialPlan();
	}
	else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
	return new InstitutionalPlan();
	}
	return null;
	}
	}
//end of GetPlanFactory class.

	