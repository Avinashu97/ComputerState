package state;

public class CrashState implements State {
	Computer computer;
	public CrashState(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		System.out.println("Booting Computer");
		computer.setState(computer.getOnState());

	}

	@Override
	public void powerOff() {
		System.out.println("Computer crashed and is already off");

	}

	@Override
	public void playDVD() {
		System.out.println("Computer crashed and is powered off");

	}

	@Override
	public void crashOS() {
		System.out.println("Computer Crashed");
	}

	@Override
	public void printJob() {
		System.out.println("Computer is off. Turn on to print");

	}
	public String toString() {
		return " has crashed";
	}

}
