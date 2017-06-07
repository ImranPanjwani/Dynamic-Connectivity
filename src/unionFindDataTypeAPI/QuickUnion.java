package unionFindDataTypeAPI;

public class QuickUnion {

	private int[] id;
	
	public QuickUnion(int n) {
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
		}
	}
	
	public int[] getParentDetailsArray(){
		return this.id;
	}
	
	public int getRoot(int i){
		int root;
		root = this.id[i];
		while(root != i){
			i = root;
			root = this.id[i];
		}
		return root;
	}
	
	public void union(int p,int q){
		int pRoot,qRoot;
		pRoot = this.getRoot(p);
		qRoot = this.getRoot(q);
		this.id[pRoot] = qRoot;
	}
	public boolean connected(int p,int q){
		boolean result = false;
		int pRoot,qRoot;
		pRoot = this.getRoot(p);
		qRoot = this.getRoot(q);
		if(pRoot == qRoot){
			result = true;
		}
		return result;
	}
	
}
