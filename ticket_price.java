import java.util.Scanner;

public class ticket_price {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int km,age,type;
		System.out.println("write distance :");
		km=scan.nextInt();
		System.out.println("write your age: ");
		age=scan.nextInt();
		System.out.println("select the type of trip ( 1=one-way , 2=return )");
		type=scan.nextInt();
		
		double normalPrice,ageDiscount,typeDiscount;
		
		if(km>0 && age>0 && (type==1 || type==2)) {
			normalPrice=km * 0.10;
			if(age<12) {
				ageDiscount=normalPrice*0.5;
			}else if(age>=12 && age<=24) {
				ageDiscount=normalPrice*0.10;
				}else if(age>=65) {
					ageDiscount=normalPrice*0.30;
		}else {
			ageDiscount=0;
			}
			normalPrice-=ageDiscount;
			if(type==2) {
				typeDiscount=normalPrice * 0.20;
				normalPrice=(normalPrice*typeDiscount)*2;
			}
			System.out.println("ticket price: "+ normalPrice + "$");
		}else {
			System.out.println("The values you entered are missing or incorrect.");
		}
		
		

	}

}
