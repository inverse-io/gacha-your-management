import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

// contains the main method
public class UserApp {
	private static Scanner myScan = new Scanner(System.in);


	public static void main(String[] args) {
		// creating timer and task to run every X milliseconds
		Timer timer = new Timer();
		TimerTask task = new GachaTimer();

		timer.schedule(task, 0, 2000);
	}
}