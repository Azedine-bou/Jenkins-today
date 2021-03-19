package BeginnProgramming;



public class Ubung_kap1 {
	public static void main(String[] args)  {
	
		int [] tag  =  new  int [14];
		int [] temp =  {12,14,9,25,15,16,15,15,11,8,13,13,15,12};
	
		//Ausgabe von Arrays tagen
		System.out.print("Tagen \t \t:");
		for(int i = 1;i <tag.length;i++) {
			tag[i]=i;
			System.out.print(" \t"+tag[i]);
		}
		System.out.println();
		
		int sum =0;
		
		//Ausgabe von Arrays temperatur
		System.out.print("Wettervorhesage :");
		for(int i = 0;i <temp.length;i++) {
			System.out.print("\t"+temp[i]);
			 sum += temp[i];		
		}
		
		System.out.println();
	
		double   mittel = sum/temp.length;
		System.out.println("mittel von array gleich =" +mittel);
		int min = temp[0];
        int max = temp[0];
		for(int i = 0;i <temp.length;i++) {
			
			
			if (min>temp[i]) {
				min =temp[i];
					
			}
			}
		System.out.println("min temp \t :" + min);
	for(int i = 0;i <temp.length;i++) {
			
			
			if (max<temp[i]) {
				max =temp[i];
					
			}
			}
	int maxTempDiff = 0;
	int foundDay = 0;
	int newMaxDiff = 0;
	for (int i = 0; i < temp.length; i++) {
		
		if ((i + 1) < temp.length) {
			if (temp[i] < temp[i + 1]) {
				newMaxDiff = temp[i + 1] - temp[i];
			}
			if (temp[i] >= temp[i + 1]) {
				newMaxDiff = temp[i] - temp[i + 1];
			}
			if (maxTempDiff < newMaxDiff) {
				maxTempDiff = newMaxDiff;
				foundDay = i;
			}
		}
	}
	if (maxTempDiff != 0) {
		System.out.println("Maximale Temperatur unterschied: " + maxTempDiff + " von Tag " + (foundDay + 1) + " zu Tag " + (foundDay + 2));
	} else {
		System.out.println("Alle Temperaturen sind gleich");
	}		
	}
}
		

