import java.util.TimerTask;
public class GachaTimer extends TimerTask{
	public static int i = 0;
	public void run(){
		System.out.println("User obtained a wish and now has a total of " + (++i) + " wishes.");
	}
}
