package com;

import java.util.HashMap;
import java.util.HashSet;

public interface CarRentalMgmtInf {

	
	public int addCar(Car c) throws CarAlreadyExistException;
	public int addCity(City c) throws CityAlreadyExistException;
	public HashSet<Car> searchCarDetailsByCityName(String carName);
	public HashMap<String,Double> getTotalIncomeFromCity(String cityName);
}
