public class Solve{
		Cube c1 = new Cube(new Color[]{Color.BLUE,Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
		Cube c2 = new Cube(new Color[]{Color.WHITE,Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
		Cube c3 = new Cube(new Color[]{Color.GREEN,Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
		Cube c4 = new Cube(new Color[]{Color.BLUE,Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});

	public Queue generateAndTest(){
    	Queue<Solution>queue=new LinkedQueue<Solution>();
    	Solution sol = new Solution(new Cube[]{c1,c2,c3,c4});
    	sol.resetNumberOfCalls();
    	for (int i = 0; i < 24; i ++){
    		if(!sol.getCube(0).hasNext()){
          		sol.getCube(0).reset();
        	}
        	sol.getCube(0).next();
    		for (int j = 0; j < 24; j ++){
    			if(!sol.getCube(1).hasNext()){
          			sol.getCube(1).reset();
        		}
        		sol.getCube(1).next();
	    		for (int k = 0; k < 24; k ++){
	    			if(!sol.getCube(2).hasNext()){
          				sol.getCube(2).reset();
        			} 
        			sol.getCube(2).next(); 			
        			for (int l = 0; l < 24; l ++){
	    				if(!sol.getCube(3).hasNext()){
          					sol.getCube(3).reset();
        				}
        				sol.getCube(3).next(); 
	    				if (sol.isValid()){
	    					queue.enqueue(sol);
	    					System.out.println("-------");
	    					System.out.println(sol);
	    				}
	    			}
	    		}
    		}
    	}
    	System.out.println(sol.getNumberOfCalls());
    	return queue;
    }

   // public Queue<Solution> breadthFirstSearch (){

    //}

	public static void main(String[] args) {
		Solve a=new Solve();
    	a.generateAndTest();

	}	

}