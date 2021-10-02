package state;

public class OnState implements State {
	Computer computer;
	public OnState(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		
		System.out.println("Computer is powering up");
	}

	@Override
	public void powerOff() {
		System.out.println("Computer has powered off");
		computer.setState(computer.getOffState());

	}

	@Override
	public void playDVD() {
		System.out.println("Playing Dvd");
		computer.setState(computer.getDvdState());
	}

	@Override
	public void crashOS() {
		System.out.println("Computer crashed");
		computer.setState(computer.getCrashState());

	}

	@Override
	public void printJob() {
		System.out.println("Printing job");
		computer.setState(computer.getPrintState());

	}
	public String toString() {
		return " on";
	}
}
