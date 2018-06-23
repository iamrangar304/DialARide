package Utilities;
import constants.Constants;

public class Scheduling {
public void schedule(Car car[],Request r[],int loc[][]){
		for(int i=0;i<r.length;i++){
			int carNumber=0;
			for(int k=0;k<car.length;k++) {
				if(car[k].getCap()>0) {
					carNumber=k;
				}
			}
			//This if block is used to send car to src of request
			if(car[carNumber].getlocation()!=r[i].getSrc())
			{

				// (thisline)
				int srtDist=loc[car[carNumber].getlocation()][r[i].getSrc()-1];

				car[carNumber].setlocation(r[i].getSrc());
				car[carNumber].setCarTime(2*srtDist);
			}

			    //wait car
				if(car[carNumber].getCarTime()<=r[i].getSrtTime())
				{
					car[carNumber].setCarTime(r[i].getSrtTime());
				}


				//scheduling a request
				if(car[carNumber].getCap()!=0 && car[carNumber].getCarTime()>=r[i].getSrtTime() && car[carNumber].getCarTime()<=r[i].getEndTime()) {
					car[carNumber].setRevenue(car[carNumber].getRevenue()+loc[car[carNumber].getlocation()][r[carNumber].getSrc()]);
					car[carNumber].setCap(car[carNumber].getCap()-1);
					int[] indices=new int[5];
					indices=car[carNumber].getPassengerLocation();
					System.out.print("\n"+Constants.requestServed+Constants.space+r[i].getSrc()+Constants.space+r[i].getDest()+Constants.space+r[i].getSrtTime()+Constants.space+r[i].getEndTime());
					try {
						for(int j=0;j<5;j++) {
						if(indices[j]==0) {
							indices[j]=r[i].getDest();
							break;
						}
						}
					}
					catch(NullPointerException e)
					{
						System.out.print(Constants.notServedRequest+Constants.space+r[i].getSrc()+Constants.space+r[i].getDest()+Constants.space+r[i].getSrtTime()+Constants.space+r[i].getEndTime());
					}



					car[0].setPassengerLocation(indices);
				}
				//this block will drop passanger to their respecive distionaation
				if(car[0].getCap()==5)
				{	int[] dropLocations=car[0].getPassengerLocation();
				//this loop
				for(int j=0;j<5;j++) {
					if(car[0].getlocation()!=dropLocations[i]) {
						int srtDis=loc[car[0].getlocation()][dropLocations[i]];
						car[0].setlocation(dropLocations[i]);
						car[0].setCarTime(car[0].getCarTime()+2*srtDis);

						}

					car[0].setCap(car[0].getCap()-1);
					car[0].passengerLocationReset();
					}
				}
			}
		}

}
