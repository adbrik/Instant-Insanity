public class Cube{

	public enum Color{
		BLUE, GREEN, RED, WHITE
	}

	private Color[] faces;

	public Cube(Color[] faces){
		this.faces = faces;
	}

	public Color getUp(){
		return faces[0];
	}

	public Color getFront(){
		return faces[1];
	}

	public Color getRight(){
		return faces[2];
	}

	public Color getBack(){
		return faces[3];
	}

	public Color getLeft(){
		return faces[4];
	}

	public Color getDown(){
		return faces[5];
	}

	public String toString(){
		return ("["+ faces[0]+", "+ faces[1]+", "+ faces[2]+", "+ faces[3]+", "+ faces[4]+", "+ faces[5] +"]");
	}

	public static void main(String[] args) {
		Cube c;
		c = new Cube(new Color[]{Color.BLUE,Color.GREEN,Color.WHITE,Color.GREEN,Color.BLUE,Color.RED});
		System.out.println(c);
	}


}