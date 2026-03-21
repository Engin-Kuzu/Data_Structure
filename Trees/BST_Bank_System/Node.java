package BankaSistemi;

public class Node {

	private String name;
	private String branchName;
	private int balance;
	private int accountId;
	Node left,right;
	
	public Node(String name,String branchName,int balance,int accountId) {
		this.name=name;
		this.branchName=branchName;
		this.balance=balance;
		this.accountId=accountId;
		this.left=null;
		this.right=null;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getbranchName() {
		return branchName;
	}
	public void setbranchName(String branchName) {
		this.branchName=branchName;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getaccountId() {
		return accountId;
	}
	public void setaccountId(int accountId) {
		this.accountId=accountId;
	}
}
