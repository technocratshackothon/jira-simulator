package com.jira.api.simulator.values;

public enum Points {
 ONE(1), TWO(2), THREE(3), FIVE(5), EIGHT(8), THIRTEEN(13);
	
	private int points;
	
	Points(int points){
		this.points = points;
	}
	
	public int getPoints(){
		return points;
	}
}
