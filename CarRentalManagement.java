package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CarRentalManagement implements CarRentalMgmtInf{

	List<City> cityList = new ArrayList<City>() ;
	
	@Override
	public int addCar(Car c) throws CarAlreadyExistException {
		// TODO Auto-generated method stub
		
		if(c instanceof Car)
		{
			for(City ct : cityList)
			{
				if(ct.getCityName().equalsIgnoreCase(c.getMappedCity()))
				{
					for(int i=0;i<ct.getCarListInCity().size();i++)
					{
						if(ct.getCarListInCity().get(i).getCarId()==c.getCarId())
							throw new CarAlreadyExistException();
						
					}
					ct.getCarListInCity().add(c);
					return ct.getCarListInCity().size();
				}
			}
			return -1;
		}
		 	return -1;
		
	}

	@Override
	public int addCity(City c) throws CityAlreadyExistException {
		// TODO Auto-generated method stub
		if(c instanceof City)
		{	
		for(City ct : cityList)
		{
			if(ct.getCityPinCode()==c.getCityPinCode())
				throw new CityAlreadyExistException();
		}
		
		cityList.add(c);
		
		return cityList.size();
		
	}
		return -1;
	}

	
	
	@Override
	public HashSet<Car> searchCarDetailsByCityName(String cityName) {
		// TODO Auto-generated method stub
		HashSet<Car> cars = new HashSet<Car>();
		
		for(City ct : cityList)
		{
			if(ct.getCityName().equalsIgnoreCase(cityName))
			{
				for(int i=0;i<ct.getCarListInCity().size();i++)
				{
					cars.add(ct.getCarListInCity().get(i));
				}
				
				return cars;
			}
		}
		
		return null;
	}

	@Override
	public HashMap<String, Double> getTotalIncomeFromCity(String cityName) {
		// TODO Auto-generated method stub
		HashMap<String, Double> hm = new HashMap<String, Double>();		
		double inc=0;
		for(City ct : cityList)
		{
			if(ct.getCityName().equalsIgnoreCase(cityName))
			{
				for(int i=0;i<ct.getCarListInCity().size();i++)
				{
					inc=inc+ct.getCityCharge()*ct.getCarListInCity().get(i).getCharge();
				}
				
				hm.put(cityName, inc);
			}
		}
		
		return hm;
	}

}
