import javafx.application.Application;
import javafx.stage.Stage;

public class SuchargeSlab extends Application {

	@Override
	public void start(Stage primaryStage) {

		
		int[][] uu = new int[4][3];
		int income = 50000000;

		int remainingAmount = income;
		int amount;
		int taxamount = 0;
		int sum;
		int tax_amt =0;

		uu[0][0] = 0;
		uu[0][1] = 5000001;
		uu[0][2] = 0;

		uu[1][0] = 5000001;
		uu[1][1] = 10000000;
		uu[1][2] = 10;

		uu[2][0] = 10000001;
		uu[2][1] = 1000000000;
		uu[2][2] = 15;



		HashMap<Integer, Integer> map = new HashMap<>();
		if(income>50000000) {
			for (int row = 0; row < uu.length; row++) {
				if (income > uu[row][1]) {
					sum = tax_amt - uu[row][0];
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
