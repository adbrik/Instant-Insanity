public class Cube{

	private Color[] faces;
	private final Color[] IDENTITY;
	private int nbreOfRotations;

	public Cube(Color[] faces){
		this.faces = faces;
		this.IDENTITY = new Color[]{faces[0],faces[1],faces[2],faces[3],faces[4],faces[5]};
		this.nbreOfRotations = 0;
	}

	public Cube(Cube other){
		this(other.copy().faces);
	}

	public Color getColor(int pos){
		return faces[pos];
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

	public Cube copy(){
		Color[] nfaces = new Color[faces.length];
		for (int i =0; i < faces.length; i++){
			nfaces[i] = faces[i];
		}
		Cube copy = new Cube(nfaces);
		return copy;
	}

	public boolean hasNext(){
		return nbreOfRotations < 24 && nbreOfRotations > -1;
	}

	private Color[] identity(){
		return IDENTITY;
	}

	private void rotate(){
		Color temp;

		temp = faces[4];

		faces [4] = faces [3];
		faces [3] = faces [2];
		faces [2] = faces [1];
		faces [1] = temp;

	}

	private void rightRoll(){
		Color temp;

		temp = faces[5];

		faces [5] = faces [2];
		faces [2] = faces [0];
		faces [0] = faces [4];
		faces [4] = temp;

	}

	private void leftRoll(){
		Color temp;

		temp = faces[5];

		faces [5] = faces [4];
		faces [4] = faces [0];
		faces [0] = faces [2];
		faces [2] = temp;

	}

	public void next(){
		switch (nbreOfRotations){
			case 0: identity(); break;
			case 1: rotate(); break;
			case 2: rotate(); break;
			case 3: rotate(); break;
			case 4: rightRoll(); break;
			case 5: rotate(); break;
			case 6: rotate(); break;
			case 7: rotate(); break;
			case 8: rightRoll(); break;
			case 9: rotate(); break;
			case 10: rotate(); break; 
			case 11: rotate(); break;
			case 12: leftRoll(); break;
			case 13: rotate(); break;
			case 14: rotate(); break;
			case 15: rotate(); break;
			case 16: leftRoll(); break;
			case 17: rotate(); break;
			case 18: rotate(); break;
			case 19: rotate(); break;
			case 20: rightRoll(); break;
			case 21: rotate(); break;
			case 22: rotate(); break;
			case 23: rotate(); break;
			default:
				System.out.println("Whoops Broken");
				break;
		}
		nbreOfRotations++;
	}

	public void reset(){
		for (int i = 0; i < IDENTITY.length; i++){
			faces[i] = IDENTITY[i];
		}
		nbreOfRotations = 0;
	}
}