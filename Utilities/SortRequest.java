package Utilities;

public class SortRequest {
	public void SortReq(Request arr[]){
		Request temp=new Request();
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++) {
				if(arr[i].getEndTime()>arr[j].getEndTime()){		
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		


	}
}
