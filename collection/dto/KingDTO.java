package com.xworkz.collection.dto;

public class KingDTO {

	String name;
	String region;
	String dynasty;
	int totalYearsRuled;
	String currentQueenName;
	int totalQueens;
	public KingDTO() {
		
	}
	
	public KingDTO(String name, String region, String dynasty, int totalYearsRuled, String currentQueenName,
			int totalQueens) {
		super();
		this.name = name;
		this.region = region;
		this.dynasty = dynasty;
		this.totalYearsRuled = totalYearsRuled;
		this.currentQueenName = currentQueenName;
		this.totalQueens = totalQueens;
	}
	
	@Override
	public String toString() {
		return "KingDTO [name=" + name + ", region=" + region + ", dynasty=" + dynasty + ", totalYearsRuled="
				+ totalYearsRuled + ", currentQueenName=" + currentQueenName + ", totalQueens=" + totalQueens + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDynasty() {
		return dynasty;
	}

	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}

	public int getTotalYearsRuled() {
		return totalYearsRuled;
	}

	public void setTotalYearsRuled(int totalYearsRuled) {
		this.totalYearsRuled = totalYearsRuled;
	}

	public String getCurrentQueenName() {
		return currentQueenName;
	}

	public void setCurrentQueenName(String currentQueenName) {
		this.currentQueenName = currentQueenName;
	}

	public int getTotalQueens() {
		return totalQueens;
	}

	public void setTotalQueens(int totalQueens) {
		this.totalQueens = totalQueens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentQueenName == null) ? 0 : currentQueenName.hashCode());
		result = prime * result + ((dynasty == null) ? 0 : dynasty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + totalQueens;
		result = prime * result + totalYearsRuled;
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
		KingDTO other = (KingDTO) obj;
		if (currentQueenName == null) {
			if (other.currentQueenName != null)
				return false;
		} else if (!currentQueenName.equals(other.currentQueenName))
			return false;
		if (dynasty == null) {
			if (other.dynasty != null)
				return false;
		} else if (!dynasty.equals(other.dynasty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (totalQueens != other.totalQueens)
			return false;
		if (totalYearsRuled != other.totalYearsRuled)
			return false;
		return true;
	}
	
	
}
