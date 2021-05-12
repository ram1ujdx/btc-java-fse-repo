package com.btc.traineeapp;

import java.sql.SQLException;

import com.btc.traineeapp.dto.TraineeDto;
import com.btc.traineeapp.model.Trainee;
import com.btc.traineeapp.service.ITraineeService;
import com.btc.traineeapp.service.TraineeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	ITraineeService service=new TraineeServiceImpl();
    	
//    	TraineeDto trainee=new TraineeDto(1008,"Rohit","rohit@yahoo.com");
//    	try {
//			service.saveTrainee(trainee);
//		} catch (SQLException e) {
//			System.err.println(e);
//		}
    	
    		try {
				TraineeDto trainee=service.getTraineeById(1005);
				trainee.setTraineeEmail("abc@gamil.com");
				trainee=service.updateTrainee(trainee);
				System.out.println(trainee);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    	
    	
    	
    }
}
