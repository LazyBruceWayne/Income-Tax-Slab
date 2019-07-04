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



# Surcharge Slab

```java
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

```

# Tax Rebate

```java
*int[][] rebate = new int[4][3];
int income = 800001;
int tax_amt =0;

rebate[0][0] = 0;
rebate[0][1] = 300000;
rebate[0][2] = 2500;

rebate[1][0] = 300001;
rebate[1][1] = 400000;
rebate[1][2] = 7500;

rebate[2][0] = 400001;
rebate[2][1] = 500000;
rebate[2][2] = 12500;

for (int rebate_no = 0; rebate_no < rebate.length; rebate_no++) {
	if (income >= rebate[rebate_no][0] && income <= rebate[rebate_no][1]) {
		tax_amt = rebate[rebate_no][2];
	}
}

System.out.println("Rebate  ="+tax_amt);
```


# Tax Rebate

```java
int[][] rebate = new int[4][3];
int income = 10000;
int tax_amt =0;

rebate[0][0] = 0;
rebate[0][1] = 7500;
rebate[0][2] = 0;

rebate[1][0] = 7501;
rebate[1][1] = 10000;
rebate[1][2] = 2200;

rebate[2][0] = 10001;
rebate[2][1] = 5000000;
rebate[2][2] = 2500;

for (int rebate_no = 0; rebate_no < rebate.length; rebate_no++) {
	if (income >= rebate[rebate_no][0] && income <= rebate[rebate_no][1]) {
		tax_amt = rebate[rebate_no][2];
	}
}

System.out.println(tax_amt);
```
