package unionFindDataTypeAPI;

public class QuickFind {

	private int[] id;
	
	public int[] getIndexPositions(){
		return this.id;
	}
	
	public QuickFind(int n){
		this.id = new int[n];
		for (int i = 0; i < this.id.length; i++) {
			this.id[i]=i;
		}
	}
	public void union(int p,int q){
		int indexOfFirstElement = this.id[p];
		for (int i = 0; i < id.length; i++) {
			if(this.id[i]==indexOfFirstElement){
				this.id[i]=this.id[q];
			}
		}
	}
	public boolean connected(int p,int q){
		boolean result = false;
		if(this.id[p]==this.id[q]){
			result = true;
		}
		return result;
		/* short form would be
		 * 
		 *  return this.id[p]==this.id[q]
		 *  */
	}
	
}
