package binarysearchTree;

public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode lNode,rNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
		lNode=null;
		rNode=null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public BinaryTreeNode getLNode() {
		return this.lNode;
	}
	
	public void setLNode(BinaryTreeNode lNode) {
		this.lNode = lNode;
	}
	
	public BinaryTreeNode getRNode() {
		return this.rNode;
	}
	
	public void setRNode(BinaryTreeNode rNode) {
		this.rNode = rNode;
	}

}
