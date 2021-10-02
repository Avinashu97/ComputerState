package state;

public interface State {
	public void powerOn();
	public void powerOff();
	public void playDVD();
	public void crashOS();
	public void printJob();
	public String toString();
}
