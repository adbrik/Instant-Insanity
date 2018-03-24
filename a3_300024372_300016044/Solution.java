public class Solution{

	Cube[] cubes;
	
	public Solution(Cube[] cubes){
		this.cubes = new Cube[cubes.length];
		for (int i = 0 ; i < cubes.length; i ++){
			this.cubes[i] = new Cube(cubes[i]);
		}

	}

	public Solution(Solution other, Cube c){
		Cube[] newCubes = new Cube[other.cubes.length + 1];
		int i;
		for (i = 0; i<other.cubes.length;i++){
			newCubes[i] = new Cube(other.cubes[i]);
		}
		newCubes[i+1] = new Cube(c);
		cubes = newCubes;
	}

	public int size(){
		return this.cubes.length;
	}

	public Cube getCube(int pos){
		return this.cubes[pos];
	}

	public boolean isValid(){
		return;
	}

	public boolean isValid(Cube next){
		return false;
	}

	public String toString(){
		String rep = "";
		for ( int i = 0; i < this.cubes.length;i++){
			rep += cubes[i] + "\n";
		}
		return rep;
	}
}