public class Driver {
	public static void main (String[] args) {
		Fan fan = new Fan();
		System.out.println(fan); //starts at 0 and false
		fan.pullSpeedCord();
		fan.pullReverseCord();
		System.out.println(fan); //increases speed to 1 and reverses fan, 1 and true
		fan.pullSpeedCord();
		System.out.println(fan); //increases speed and does not change direction, 2 and true
		fan.pullReverseCord();
		System.out.println(fan); //does not change speed and reverses direction, 2 and false
		fan.pullSpeedCord();
		fan.pullSpeedCord();
		System.out.println(fan); //speed wraps back around to 0, 0 and false
	}
}
