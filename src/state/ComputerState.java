package state;

public class ComputerState {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		System.out.println(computer);
		
		//off state
		computer.playDVD();
		computer.printJob();
		computer.crashOS();
		computer.powerOff();
		computer.powerOn();
		
		System.out.println(computer);
		
		computer.powerOff();
		computer.powerOn();
		//on state
		computer.playDVD();
		computer.printJob();
		computer.crashOS();
		computer.powerOff();
		computer.powerOn();
		System.out.println(computer);
		//crash state
		computer.powerOn();
		computer.crashOS();
		computer.powerOff();
		computer.printJob();
		computer.playDVD();
		computer.crashOS();

	}

}
