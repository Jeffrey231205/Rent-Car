import javax.swing.JOptionPane;
public class RentCar {
     public static void main(String[] args) {
    	String[]carTypes = {"Compact", "Sedan", "SUV"};
    	
    	int car = JOptionPane.showOptionDialog(
    			                               null, "Select type of car",  //dialog question
    			                               "Car Rental System",
    			                               JOptionPane.YES_NO_OPTION,
    			                               JOptionPane.QUESTION_MESSAGE,
    			                               null,
    			                               carTypes,
    			                               carTypes[0]);
    			                               
    	//the duration choice
    	String[] duration = {"Daily", "Weekly", "Monthly"};//selection apply 
    	
    	int time = JOptionPane.showOptionDialog(
    			                                null,
    			                                "Select Rental Duration",//Dialog question
    			                                "Duration of Rental",
    			                                JOptionPane.YES_NO_OPTION,//use the click option
    			                                JOptionPane.QUESTION_MESSAGE,//icon of the question 
    			                                null,
    			                                duration,//the box in the dialog
    			                                duration[0]);//the arrangement of selection
      double compact = 30.50;
      double sedan = 50.00;
      double suv = 80.96;
      double rental;
      int times;
      String timer;
      int week = 7;
      int month = 30;
      
      if ((car == 0)&&(time == 0)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of day rental",
					"Day of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = compact*times;
			}
		
		else if ((car == 0)&&(time == 1)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of week rental",
					"Week of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = compact*times*week*0.85;
				}
		
		else if ((car == 0)&&(time == 2)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of month rental",
					"Month of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = compact*times*month*0.7;
				}
		
		else if ((car == 1)&&(time == 0)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of day rental",
					"Day of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = sedan*times;
				}
		
		else if ((car == 1)&&(time == 1)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of week rental",
					"Week of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = sedan*times*week*0.85;
				}
		
		else if ((car == 1)&&(time == 2)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of month rental",
					"Month of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = sedan*times*month*0.7;
				}
		
		else if ((car == 2)&&(time == 0)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of day rental",
					"Day of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = suv*times;
				}
		
      
		else if ((car == 2)&&(time == 1)) {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of week rental",
					"Week of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = suv*times*week*0.85;
				}
		
		else {
			timer =JOptionPane.showInputDialog(
					null,
					"Enter number of month rental",
					"Month of Rental",
					JOptionPane.QUESTION_MESSAGE);
			times =Integer.parseInt(timer);
			rental = suv*times*month*0.7;
				}
		
		JOptionPane.showMessageDialog(
				null, 
				"The rental fee is $"+rental,
				"Rental Fees",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
