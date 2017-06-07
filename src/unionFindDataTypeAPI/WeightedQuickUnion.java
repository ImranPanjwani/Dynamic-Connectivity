package unionFindDataTypeAPI;

public class WeightedQuickUnion {
	private int[] parent;// parent[i] = parent of i
	private int[] size;// size[i] = size of component whose root is i
	private int count;// the number of trees/components
	
	public WeightedQuickUnion(int n){
		this.count = n;
		this.parent = new int[n];
		this.size = new int[n];
		for (int i = 0; i < n; i++) {
			this.parent[i]=i;
			this.size[i]=1;
		}
	}
	
	public int getRoot(int p){
		int root;
		root = this.parent[p];
		while(root!=p){
			p = root;
			root = this.parent[p];
		}
		return root;
	}
	
	public void union(int p,int q){
		int pRoot = this.getRoot(p);
		int qRoot = this.getRoot(q);
		if(this.size[pRoot]<this.size[qRoot]){
			this.parent[pRoot]=qRoot;
			this.size[qRoot]+=this.size[pRoot];
		}
		else{
			this.parent[qRoot]=pRoot;
			this.size[pRoot]+=this.size[qRoot];
		}
		this.count--;
	}
	
	public boolean find(int p,int q){
		return this.parent[p]==this.parent[q];
	}
	
	public int getCount(){
		return this.count;
	}
}
