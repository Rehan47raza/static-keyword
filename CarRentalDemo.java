package com;

import java.util.HashMap;
import java.util.HashSet;

public class CarRentalDemo {

	/**
	 * @param args
	 * @throws CarAlreadyExistException 
	 * @throws CityAlreadyExistException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car(1, "addfgds", "addfgds", "addfgds", 5000);
		Car c2 = new Car(2, "asdfgh", "wq", "addfgds", 2345);
		Car c3 = new Car(1, "addfs", "ds", "addfgds", 5000);
		CarRentalManagement cr = new CarRentalManagement();
		City city1 = new City(1, "addfgds", 1324532, 100);
		
		try{
		System.out.println(cr.addCity(city1));
		System.out.println(cr.addCar(c1));
		System.out.println(cr.addCar(c2));
		System.out.println(cr.addCar(c3));
		
		}
		catch (CarAlreadyExistException e) {
			// TODO: handle exception
			System.out.println("Car Already Exist Exception");
		}
		catch (CityAlreadyExistException e) {
			// TODO: handle exception
			System.out.println("City Already Exist Exception");
		}
		/*System.out.println(cr.getTotalIncomeFromCity("addfgds").get("addfgds"));*/
		HashSet<Car> cars = cr.searchCarDetailsByCityName("addfgds");
		for(Car c:cars)
		{
			System.out.println("Company name:-\t"+c.getCarCompanyName()+"\tCar id:-\t"+c.getCarId());
		}
	}

}
