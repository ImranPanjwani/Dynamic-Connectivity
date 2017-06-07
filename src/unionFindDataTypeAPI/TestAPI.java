package unionFindDataTypeAPI;

public class TestAPI {

	public static void main(String[] args) {
		
		/* Quick Find test data
	 	QuickFind qf = new QuickFind(10);
		qf.union(2, 5);
		int[] resultArray = qf.getIndexPositions();
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
		System.out.println(qf.connected(2, 7));
		System.out.println(qf.connected(2, 5));*/
		
		/* Quick Union test data
		 * The comparison of quick union and weighted quick union 
		QuickUnion qu = new QuickUnion(10);
		qu.union(8, 3);
		qu.union(8, 9);
		qu.union(9, 4);
		System.out.println("The root of first component is : "+qu.getRoot(9));
		qu.union(5, 6);
		qu.union(0, 6);
		qu.union(1, 2);
		qu.union(2, 7);
		qu.union(2, 0);
		System.out.println("The root of second component is : "+qu.getRoot(1));
		qu.union(7, 3);
		System.out.println("The final root is : "+qu.getRoot(7));
		*/
		/* Weighted quick union test data
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);
		wqu.union(8, 3);
		wqu.union(8, 9);
		wqu.union(9, 4);
		System.out.println("The root of first component is : "+wqu.getRoot(9));
		wqu.union(5, 6);
		wqu.union(0, 6);
		wqu.union(1, 2);
		wqu.union(2, 7);
		wqu.union(2, 0);
		System.out.println("The root of second component is : "+wqu.getRoot(1));
		System.out.println("The number of components is : "+wqu.getCount());
		wqu.union(7, 3);
		System.out.println("The final root is : "+wqu.getRoot(7));
		System.out.println(wqu.find(5, 3));
		*/
	}

}
