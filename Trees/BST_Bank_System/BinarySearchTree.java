package BankaSistemi;

public class BinarySearchTree {

	private Node root;
	
	public void insert(String name,String branchName,int balance,int accountId) {
		root=insertRec(root,name,branchName,balance,accountId);
	}
	private Node insertRec(Node root,String name,String branchName,int balance,int accountId) {
		if(root==null) {
			return new Node(name,branchName,balance,accountId);
		}
		if(accountId<root.getaccountId()) {
			root.left=insertRec(root.left,name,branchName,balance,accountId);
		}
		else if(accountId>root.getaccountId()) {
			root.right=insertRec(root.right,name,branchName,balance,accountId);
		}
		
		return root;
	}
	
	public Node search(int accountId) {
		return searchRec(root,accountId);
	}
	private Node searchRec(Node root,int accountId) {
		if(root==null || root.getaccountId()==accountId) {
			return root;
		}
		if(accountId<root.getaccountId()) {
			return searchRec(root.left,accountId);
		}
		
		return searchRec(root.right,accountId);
	}
	
	public boolean deposit(int accountId,int amount) {
		Node node=search(accountId);
		if(node!=null) {
			node.setbalance(node.getbalance()+amount);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(int accountId,int amount) {
		Node node=search(accountId);
		if(node!=null && node.getbalance()>=amount) {
			node.setbalance(node.getbalance()-amount);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void inOrderTraversal() {
		inOrderRec(root);
	}
	private void inOrderRec(Node node) {
		if(node!=null) {
			inOrderRec(node.left);
            System.out.println("AccountId: " + node.getaccountId() + ", Name: " + node.getname() + ", Branch: " + node.getbranchName() + ", Balance: " + node.getbalance());
            inOrderRec(node.right);
		}
	}
}
