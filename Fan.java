public class Fan {
	
	private int speed = 0;
	private boolean reverse = false;
	
	public Fan () {}
	
	public void pullSpeedCord () {
		this.speed = (this.speed + 1) % 4;
	}
	
	public void pullReverseCord () {
		this.reverse = (!this.reverse);
	}
	
	public String toString () {
		return this.speed + " " + this.reverse;
	}
}
