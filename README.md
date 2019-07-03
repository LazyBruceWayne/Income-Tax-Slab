# Income-Tax-Slab
Latest Income Tax Slabs and Rates proposed for Financial year 2019-20


```java
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
```
