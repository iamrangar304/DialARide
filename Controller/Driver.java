package Controller;


import java.io.File;
import java.io.IOException;

import Utilities.Dijkstra;
import Utilities.OutputRevenue;
import Utilities.ReadInput;
import Utilities.Scheduling;
import Utilities.SortRequest;
public class Driver {
	public static void main(String args[])throws IOException {
		ReadInput r1=new ReadInput();
		r1.readBasic();

		OutputRevenue o=new OutputRevenue();
		SortRequest sr=new SortRequest();
		sr.SortReq(r1.getReq() );


		Dijkstra di=new Dijkstra();
		for(int i=0;i<r1.getN();i++)
		{
			di.dij(r1.getLocation(),r1.getN(),i);
		}

		Scheduling sd=new Scheduling();
		sd.schedule(r1.getCar(),r1.getReq(),r1.getLocation());

		o.writeOutput(r1.getCar());
	}

}
