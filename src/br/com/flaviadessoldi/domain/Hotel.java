package br.com.flaviadessoldi.domain;

public class Hotel {
	
	private String name;
	private int classification;
	private double businessDayRegular;
	private double businessDayReward;
	private double weekendRegular;
	private double weekendReward;
	
	public Hotel() {
		
	}
	
	public Hotel(String name, int classification, double businessDayRegular, double businessDayReward,
			double weekendRegular, double weekendReward) {
		super();
		this.name = name;
		this.classification = classification;
		this.businessDayRegular = businessDayRegular;
		this.businessDayReward = businessDayReward;
		this.weekendRegular = weekendRegular;
		this.weekendReward = weekendReward;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	public double getBusinessDayRegular() {
		return businessDayRegular;
	}
	public void setBusinessDayRegular(double businessDayRegular) {
		this.businessDayRegular = businessDayRegular;
	}
	public double getBusinessDayReward() {
		return businessDayReward;
	}
	public void setBusinessDayReward(double businessDayReward) {
		this.businessDayReward = businessDayReward;
	}
	public double getWeekendRegular() {
		return weekendRegular;
	}
	public void setWeekendRegular(double weekendRegular) {
		this.weekendRegular = weekendRegular;
	}
	public double getWeekendReward() {
		return weekendReward;
	}
	public void setWeekendReward(double weekendReward) {
		this.weekendReward = weekendReward;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classification;
		long temp;
		temp = Double.doubleToLongBits(businessDayRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(businessDayReward);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weekendRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weekendReward);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (classification != other.classification)
			return false;
		if (Double.doubleToLongBits(businessDayRegular) != Double.doubleToLongBits(other.businessDayRegular))
			return false;
		if (Double.doubleToLongBits(businessDayReward) != Double.doubleToLongBits(other.businessDayReward))
			return false;
		if (Double.doubleToLongBits(weekendRegular) != Double.doubleToLongBits(other.weekendRegular))
			return false;
		if (Double.doubleToLongBits(weekendReward) != Double.doubleToLongBits(other.weekendReward))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
