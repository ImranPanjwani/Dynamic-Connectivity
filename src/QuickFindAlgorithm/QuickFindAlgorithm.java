package QuickFindAlgorithm;

public class QuickFindAlgorithm {

	private int[] n;
	
	public int[] getIndexPositions(){
		return this.n;
	}
	
	public QuickFindAlgorithm(int n){
		this.n = new int[n];
		for (int i = 0; i < this.n.length; i++) {
			this.n[i]=i;
		}
	}
	public void union(int p,int q){
		int indexOfFirstElement = this.n[p];
		for (int i = 0; i < n.length; i++) {
			if(this.n[i]==indexOfFirstElement){
				this.n[i]=this.n[q];
			}
		}
	}
	public boolean connected(int p,int q){
		boolean result = false;
		if(this.n[p]==this.n[q]){
			result = true;
		}
		return result;
		/* short form would be
		 * 
		 *  return this.n[p]==this.n[q]
		 *  */
	}
	
}
