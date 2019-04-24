package chapter14;

public class Music5 {
	static void tune(Instrument i) {
		// ...
		i.play();
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e)
			tune(instrument);
	}

	static void prepareAll(Instrument[] e) {
		for (Instrument instrument : e)
			instrument.prepareInstrument();
	}
}
