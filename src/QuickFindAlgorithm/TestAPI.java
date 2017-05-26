package QuickFindAlgorithm;

public class TestAPI {

	public static void main(String[] args) {
		QuickFindAlgorithm qf = new QuickFindAlgorithm(10);
		qf.union(2, 5);
		int[] resultArray = qf.getIndexPositions();
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
		System.out.println(qf.connected(2, 7));

	}

}
