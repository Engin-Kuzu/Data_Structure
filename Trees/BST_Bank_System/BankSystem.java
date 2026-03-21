package BankaSistemi;


import java.util.Scanner;

public class BankSystem {
	
	private static BinarySearchTree bst = new BinarySearchTree();
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		
		
		while(choice!=6) {
		System.out.println("1-) Addaccount");
		System.out.println("2-) Searchaccount");
		System.out.println("3-) Depositmoney");
		System.out.println("4-) Withdraw money");
		System.out.println("5-) Print accounts (In-Order)");
		System.out.println("6-) Exit");
		System.out.print("Select an operation: ");
		choice=scanner.nextInt();

		scanner.nextLine();    // buffer cleaner
		
		switch(choice) {
		case 1:
            addaccount(scanner);
            break;
        case 2:
            searchaccount(scanner);
            break;
        case 3:
            depositmoney(scanner);
            break;
        case 4:
            withdrawmoney(scanner);
            break;
        case 5:
            bst.inOrderTraversal();
            break;
        case 6:
            System.out.println("Exiting the system...");
            scanner.close(); 
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
		}
		}
		

}
	
	
	private static void addaccount(Scanner scanner) {
		
		System.out.print("enter namee: ");
		String name=scanner.nextLine();
		
		System.out.print("enter branchname: ");
		String branchName=scanner.nextLine();

		System.out.print("enter balance: ");
		int balance=scanner.nextInt();
		System.out.print("enter AccountId: ");
		int accountId=scanner.nextInt();
		
		bst.insert(name, branchName, balance,accountId);
        System.out.println("Account added successfully!");		
	}
	
	private static void searchaccount(Scanner scanner) {
		
		System.out.print("enter accountId to search: ");
		int accountId=scanner.nextInt();
		
		Node node=bst.search(accountId);
		if(node!=null) {
			System.out.println("Account Found:");
            System.out.println("AccountId: " + node.getaccountId() + ", Name: " + node.getname() + ", Branch: " + node.getbranchName() + ", Balance: " + node.getbalance());
        } 
		else {
            System.out.println("Account not found in the binary search tree.");
        }
		
	}
	
	private static void depositmoney(Scanner scanner) {
		System.out.print("enter accountId to deposit: ");
        int accountId = scanner.nextInt();
        System.out.print("enter amount to deposit: ");
        int amount = scanner.nextInt();

        if (bst.deposit(accountId, amount)) {
            System.out.println("Deposit successful!");
        }
        else {
            System.out.println("Account not found.");
        }
		
	}
	
	private static void withdrawmoney(Scanner scanner) {
		
		System.out.print("enter accountId to withdraw: ");
		int accountId=scanner.nextInt();
		System.out.print("enter amount to withdraw: ");
		int amount=scanner.nextInt();
		
		if (bst.withdraw(accountId, amount)) {
            System.out.println("Withdrawal successful!");
        } 
		else {
            System.out.println("Account not found or insufficient balance.");
        }
	}	
}