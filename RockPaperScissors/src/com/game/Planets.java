package com.game;

public enum Planets {

	MER(23.3),VENUS(2.7),EARTH(8.9);
	
	
	 private Double diameter ;
	private Planets (Double diameter){
      this.diameter =diameter;


}
	public Double getDiameter () {
		return diameter;
	}

}
