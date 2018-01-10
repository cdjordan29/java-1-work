/***********************
 *
 *   CarWorthSrv - contains a method to calculate the worth of a car
 *
 *   Author:   
 *   Date:     2016-
 *
 ***********************/

 public class CarWorthSrv {

 public int carWorth (int year, int initVal, int mileage)
 {
 	 final int CURRENT_YEAR = 2016;
 	 final int DEPRECIATION_AFTER_PURCHASE = 1000;
 	 double mileagePerYear = 0;
 	
 	  if(year == CURRENT_YEAR)
 	 {
 	 	initVal = initVal - DEPRECIATION_AFTER_PURCHASE;	 
 	 }
 	 
 	 else if(year < CURRENT_YEAR)
 	 {
 	 	 initVal = initVal - DEPRECIATION_AFTER_PURCHASE;
 	 	 mileagePerYear = (mileage * 1.0) / (CURRENT_YEAR - year);
 	 
 	 	 if(mileagePerYear >= 10000 && mileagePerYear <= 12000)
 	 	 {
 	 	 	 initVal = initVal - (1400 * (CURRENT_YEAR - year));	 
 	 	 }
 	 
 	 	 if(mileagePerYear > 12000)
 	 	 {
 	 	 	 initVal = initVal - (1550 * (CURRENT_YEAR - year));	 
 	 	 }
 	 
 	 	 if(mileagePerYear < 10000)
 	 	 {
 	 	 	 initVal = initVal - (1320 * (CURRENT_YEAR - year));	 
 	 	 }
 	 
 	 }
 	 
 	 if(initVal < 0)
 	 {
 	 	initVal = 0;	 
 	 }

    return initVal;
 }




 }

