package ch2;

import javax.swing.JOptionPane;

public class Test1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("How many satellites would you like to see?");
		int numSatellites = Integer.parseInt(input);
		System.out.println("Satellites\t\tSatellite Altitude\t\tOrbit Location");
		int[] satellites = new int[numSatellites];
		for (int i =0; i < numSatellites;i++ ) {
			satellites[i] = i +1;
		}
		
		 
		int[] satelliteAltitude = new int[numSatellites];
		for(int i =0; i < numSatellites; i++) {
			satelliteAltitude[i] = (int) (Math.random()*195000+5000);
	
		String[]altitude = new String[numSatellites];
		for(int y =0; y < numSatellites; y++) {	
		if (satelliteAltitude[i] < 10000) {
			altitude[i] ="Not good";
		} 
		else if(satelliteAltitude[i]<50000) {
			altitude[i] ="Low earth orbit";
		}
		else if(satelliteAltitude[i] >= 50000) {
			altitude[i] ="High earth orbit";
		
		}
		else if(satelliteAltitude[i] >= 150000) {
			altitude[i] ="You're out of orbit";
		}
		 
		}
		System.out.println(satellites[i]);
		 
		System.out.println(satellites[i] +"\t\t\t"+ satelliteAltitude[i]+"\t\t\t\t"+altitude[i] );
		}
	
	}
	

}
