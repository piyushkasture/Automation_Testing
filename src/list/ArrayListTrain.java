package list;

import java.util.ArrayList;

public class ArrayListTrain {
	public static void main(String[] args) {
		ArrayList<Train> trainList = new ArrayList<Train>();
		
		Train t1 = new Train(1019, "Pune-Solapur Demo", "Pune", "Solapur");
		Train t2 = new Train(1111, "Garib-rath", "Pune", "Nagpur");
		Train t3 = new Train(2056, "Duronto Express", "Mumbai", "Nagpur");
		Train t4 = new Train(1000, "Maharashtra Express", "Kolhapur", "Gondia");
		Train t5 = new Train(9205, "Express", "Delhi", "CSMT");
		
		
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t4);
		trainList.add(4, t5);
		
		trainList.remove(0);
		trainList.remove(t4);
		
		for(Train t: trainList) {
			System.out.println(t);
		}
		
		System.out.println("Cancel Trains: ");
		
		ArrayList<Train> cancelTrainList = new ArrayList<Train>();
		cancelTrainList.add(t1);
		cancelTrainList.add(t3);
		cancelTrainList.add(t5);
		trainList.removeAll(cancelTrainList);
		
		for(Train t: trainList) {
			System.out.println(t);
		}
		
	}


}
