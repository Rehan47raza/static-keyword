package com;

import java.util.HashMap;

public class DemoHashMap {

	/**
	 * @param args
	 * @throws CityAlreadyExistException 
	 * @throws CarAlreadyExistException 
	 */
	public static void main(String[] args) throws CityAlreadyExistException, CarAlreadyExistException {
		// TODO Auto-generated method stub
		Car c1 = new Car(1, "aaa1", "asdaf", "Delhi", 5000);
		Car c2 = new Car(2, "aaa2", "wq", "Delhi", 2345);
		Car c3 = new Car(3, "bbb", "ds", "Delhi", 5000);
		CarRentalManagement cr = new CarRentalManagement();
		City city1 = new City(1, "Delhi", 1324532, 100);
		
		System.out.println(cr.addCity(city1));
		System.out.println(cr.addCar(c1));
		System.out.println(cr.addCar(c2));
		System.out.println(cr.addCar(c3));
		
		HashMap<String, Double> hm = cr.getTotalIncomeFromCity("Delhi");
		
		for(String ks:hm.keySet())
		{
			String n = ks.toString();
			double ps = hm.get(n);
			System.out.println("Name :-\t"+n+"\t Value:-\t"+ps);
			
		}

	}

}
