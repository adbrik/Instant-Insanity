public class Solve{
	


	public static void main(String[] args) {
		Cube c1 = new Cube(new Color[]{Color.BLUE,Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
		Cube c2 = new Cube(new Color[]{Color.WHITE,Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
		Solution s1 = new Solution(new Cube[]{c1,c2});

		System.out.print (s1.isValid());

	}
}