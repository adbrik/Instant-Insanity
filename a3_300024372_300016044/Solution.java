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
		Color[] temp = new Color[this.cubes.length];
		boolean status = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < this.cubes.length; j++){
				temp[j] = cubes[j].getColor(i + 1);
			}
			for (int j = 0; j < this.cubes.length; j++){
				for (int k = 1; k < this.cubes.length -j;k++){
					if (temp[j] == temp[k]){
						status = false;
						break;
					}
				}
				if (!(status))
					break;
			}
			if (!(status))
				break;
		}
		return status;
	}

	public boolean isValid(Cube next){
		Color[] temp = new Color[this.cubes.length+1];
		boolean status = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < this.cubes.length; j++){
				temp[j] = cubes[j].getColor(i + 1);
			}
			temp[this.cubes.length] = next.getColor(i+1);
			for (int j = 0; j < this.cubes.length + 1; j++){
				for (int k = 1; k < this.cubes.length + 1 -j;k++){
					if (temp[j] == temp[k]){
						status = false;
						break;
					}
				}
				if (!(status))
					break;
			}
			if (!(status))
				break;
		}
		return status;
	}

	public String toString(){
		String rep = "";
		for ( int i = 0; i < this.cubes.length;i++){
			rep += cubes[i] + "\n";
		}
		return rep;
	}
}