package com.seventeenthclass2;

public class IncrementalNumberGenerator extends NumberGenerator{

	private int initNumber;
	private int endNumber;
	private int step;
	
	public IncrementalNumberGenerator(int initNumber, int endNumber, int step) {
		this.initNumber = initNumber;
		this.endNumber = endNumber;
		this.step = step;
	}

	@Override
	public int getNumber() {
		return initNumber;
	}

	@Override
	public void execute() {
		while (initNumber < endNumber) {
            notifyObservers();
            initNumber += step;
        }
	}

}
