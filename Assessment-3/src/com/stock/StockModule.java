package com.stock;
import java.util.*;

public class StockModule {
	static List<Products> lList;
	int id;
	String name;
	int rate;
	
	
	StockModule(){
		lList=new LinkedList<>();
		
		lList.add(new Products(101,"Apple",40));
		lList.add(new Products(102,"Banana",20));
		lList.add(new Products(103,"Orange",25));
		lList.add(new Products(104,"Guava",35));
		lList.add(new Products(105,"Grapes",30));
	}
	
//	public search(int pId) {
//		int flag=1;
//		for(int i=0;i<lList.size();i++) {
//			if(lList.indexOf(pId)!=-1) {
//				continue;
//			}
//			else flag=-1;
//		}
//		return flag;
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockModule det=new StockModule();
		int quant = 0,temp = 0,option,pId = 0;
		int net1=0,net2=0, net3=0, net4=0, net5=0, net=0;

	do {
		System.out.println("MAIN MENU:");
		System.out.println("1. Enter new Product ");
		System.out.println("2. Select for Net Amount ");
		System.out.println("3. Generate Invoice ");
		System.out.println("4. Exit ");
		
		ArrayList<ProductEntry> entry= new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your choice: ");
		option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter product id: ");
			pId=sc.nextInt();
			if(pId==101 || pId==102|| pId==103 || pId==104 || pId==105) {
				System.out.println("Enter quantity: ");
				quant=sc.nextInt();
				if(pId==101){
					net1=quant*40;
				}
				if(pId==102){
					net2=quant*20;
				}
				if(pId==103){
					net3=quant*25;
				}
				if(pId==104){
					net4=quant*35;
				}
				if(pId==105){
					net5=quant*30;
				}
				net=net1+net2+net3+net4+net5;
			}
			else {
				System.err.println("Invalid Id: No items found!!!");
			}

			break;
		case 2:
			System.out.println("Your net amount: "+net);
			break;
		case 3:
			System.out.println("Your Invoice:");
			System.out.println("-------------------------------------------------------");
			System.out.println("ID"+"     "+"Product Name"+"     "+"Rate"+"     "+"Total");
			System.out.println("-------------------------------------------------------");
			for(ProductEntry pentry:entry){
				System.out.println(""+pentry.getProductId()+""+pentry.getProductName()+""+pentry.getQuantity()+""+pentry.getTotalPrice());
			}
			System.out.println("-------------------------------------------------------");
			System.out.println("Your total amount is: "+net);
			System.out.println("-------------------------------------------------------");
			
			break;
		case 4:
			System.exit(0);
			System.out.println("Thankyou!!");
			break;
		
		}
		
	}
	while(option<5);
	}
}



