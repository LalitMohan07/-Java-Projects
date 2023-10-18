package com.training.assesment;

public class AppMain implements PercussionInstrument,BrassInstrument,StringInstrument {

	@Override
	public void bow(String b1) {
		System.out.println("This is a bow instrument "  +b1);

	}

	@Override
	public void pluck(String p) {
		System.out.println("This is a pluck instrument "  +p);
		
	}

	@Override
	public void buzz(String b) {
		System.out.println("This is a brass instrument "  +b);
		
	}

	@Override
	public void hiit(String str) {
		System.out.println("we have to hiit this instrument "  +str);

	}

	@Override
	public void shake(String str1) {
		System.out.println("we have to shake this instrument "  +str1);
		
	}

	@Override
	public boolean isBroke() {
		return false;
		
	}

	@Override
	public void repair() {
		System.out.println("This is the repair method");
		
	}

	@Override
	public void instrumentName() {
		System.out.println("Its an Instrument");
		
	}

	@Override
	public void play(String s) {
		System.out.println("Play the song"+s);
		
	}

	@Override
	public void playMsg() {
		System.out.println("Lets play the song");
		
	}

	@Override
	public void demo() {
		System.out.println("It is a demo method");
	}
	public static void main(String[] args) {
		AppMain musci = new AppMain();
		musci.demo();
		musci =new AppMain();
		musci.isBroke();
		musci.repair();
		musci.demo();
		musci.instrumentName();
		musci.play("ONE direction");
		musci.playMsg();
		musci.demo();
		musci.hiit("Drum");
		musci.shake("Drum");
		musci.bow("stringinstrument");
		musci.pluck("stringinstrument");
		musci.buzz(PLAY_MSG);
		

	}

}
