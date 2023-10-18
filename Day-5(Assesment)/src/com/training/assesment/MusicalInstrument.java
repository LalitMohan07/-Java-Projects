package com.training.assesment;

public interface MusicalInstrument  {
	String PLAY_MSG="play";
	boolean isBroke();
	void repair();
	void demo();
	void instrumentName();
	void play(String s);
	void playMsg();
}
