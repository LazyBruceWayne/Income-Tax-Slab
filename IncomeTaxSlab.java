import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.HPos.RIGHT;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Login extends Application {

	@Override
	public void start(Stage primaryStage) {

		int[][] uu = new int[4][3];
		int income = 5000001;
		int remainingAmount = income;
		int amount;
		int taxamount = 0;
		int sum;

		uu[0][0] = 0;
		uu[0][1] = 250000;
		uu[0][2] = 0;

		uu[1][0] = 250001;
		uu[1][1] = 500000;
		uu[1][2] = 5;

		uu[2][0] = 500001;
		uu[2][1] = 750000;
		uu[2][2] = 20;

		uu[3][0] = 750001;
		uu[3][1] = 75000000;
		uu[3][2] = 25;

		HashMap<Integer, Integer> map = new HashMap<>();
		if(income>250000) {
			for (int row = 0; row < uu.length; row++) {
				if (income > uu[row][1]) {
					sum = uu[row][1] - uu[row][0];
					map.put(uu[row][2], sum);
					remainingAmount = remainingAmount - sum;
				} else if(remainingAmount>0) {
					map.put(uu[row][2], remainingAmount);
					remainingAmount = remainingAmount - uu[row][1];
				}

			}
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				amount = ((entry.getValue() * entry.getKey()) / 100);
				taxamount = taxamount + amount;
			}
		}
		System.out.println(map);
		System.out.println(taxamount);


	}

	public static void main(String[] args) {
		launch(args);
	}

}
