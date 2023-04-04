import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Spammer {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int x = 1;

		Robot robot = new Robot();

		// Creating a scanner to input text to spam
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your text:");
		String Text = scanner.nextLine();

		// Creating a scanner to input the number of times to spam
		Scanner sc = new Scanner(System.in);
		System.out.print("How many times do you want to spam? :");
		int timesToSpam = sc.nextInt();

		// Storing the text in the clipboard to paste later
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		System.out.println("The spamming will start in 5 seconds");
		Thread.sleep(5000); // Giving 5 sec delay to switch tabs

		while (x <= timesToSpam) { // Loop to check how many times it has spammed

			Thread.sleep(100);

			// Using Ctrl + V to paste from clipboard
			robot.keyPress(KeyEvent.VK_CONTROL); // Pressing control
			Thread.sleep(5);
			robot.keyPress(KeyEvent.VK_V); // Pressing V
			Thread.sleep(5);
			robot.keyRelease(KeyEvent.VK_CONTROL); // Releasing control
			Thread.sleep(5);
			robot.keyRelease(KeyEvent.VK_V); // Releasing V
			Thread.sleep(5);

			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500); // giving 0.5 seconds delay to not skip text

			x++;

		}

	}

}
