package Utilities;

public class OutputRevenue {
public void writeOutput(Car car[]){;
		int i,totalRevenue=0;;
		for(i=0;i<car.length;i++) {
			totalRevenue+=car[i].getRevenue();
		}
		System.out.println("\nTotal Revenue Generated Rs:-"+totalRevenue);

	}

}
