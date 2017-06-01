package QuickFindAlgorithm;

public class QuickFindAlgorithm {

	private int[] idArray;
	
	public int[] getIndexPositions(){
		return this.idArray;
	}
	
	public QuickFindAlgorithm(int n){
		this.idArray = new int[n];
		for (int i = 0; i < this.idArray.length; i++) {
			this.idArray[i]=i;
		}
	}
	public void union(int p,int q){
		int indexOfFirstElement = this.idArray[p];
		for (int i = 0; i < idArray.length; i++) {
			if(this.idArray[i]==indexOfFirstElement){
				this.idArray[i]=this.idArray[q];
			}
		}
	}
	public boolean connected(int p,int q){
		boolean result = false;
		if(this.idArray[p]==this.idArray[q]){
			result = true;
		}
		return result;
		/* short form would be
		 * 
		 *  return this.n[p]==this.n[q]
		 *  */
	}
	
}
