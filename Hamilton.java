class Hamilton
{
    final int V = 8;
    int path[];
 
    boolean isSafe(int v, int graph[][], int path[], int pos)
    {
        if (graph[path[pos - 1]][v] == 0){
        	 return false;
        }
           
        for (int i = 0; i < pos; i++)
            if (path[i] == v){
            	return false;
            }  
        return true;
    }
 
    boolean hamCycleUtil(int graph[][], int path[], int pos)
    {
        if (pos == V)
        {
            if (graph[path[pos - 1]][path[0]] == 1){
            	return true;
            }else{
            	return false;
            }
                
        }
 
        for (int v = 1; v < V; v++)
        {
            if (isSafe(v, graph, path, pos))
            {
                path[pos] = v;
                if (hamCycleUtil(graph, path, pos + 1) == true){
                	return true;
                }
                path[pos] = -1;
            }
        }
 
        return false;
    }
 
    public int hamCycle(int graph[][])
    {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;
        path[0] = 0;
        if (hamCycleUtil(graph, path, 1) == false)
        {
            System.out.println("Not Hamiltonian Circuit");
            return 0;
        }
        printSolution(path);
        return 1;
    }
 
    public void printSolution(int path[])
    {
        System.out.println("Hamiltonian Circuit");
        for (int i = 0; i < V; i++)
            System.out.print(" " + path[i] + " ");
 
        System.out.println(" " + path[0] + " ");
    }
    
    public static void main(String args[])
    {
        Hamilton hm =   new Hamilton();
  
        int graph1[][] = {{0, 0, 0, 1, 1, 1, 1, 1},
        		{0, 0, 0, 1, 1, 1, 1, 1},
        		{0, 0, 0, 1, 1, 1, 1, 1},
        		{1, 1, 1, 0, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0, 0, 0},
        };
 
        hm.hamCycle(graph1);
        
    }
}
