package example9;

class example9_4 {
	public static void main(String args) {
		example9_3 tv1 = new example9_3();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolumeLevel(3);
		
		example9_3 tv2 = new example9_3();
		tv2.turnOn();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
			
	}

}
