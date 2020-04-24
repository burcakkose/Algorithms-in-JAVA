import java.io.IOException;

public class LaunchExternalApp_31 {

	public static void main(String args[]) {

		Runtime run = Runtime.getRuntime();

		try {
			run.exec("notepad");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
