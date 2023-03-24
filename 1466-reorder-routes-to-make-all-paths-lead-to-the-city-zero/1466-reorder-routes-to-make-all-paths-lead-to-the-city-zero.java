class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> element = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            element.add(new ArrayList<Integer>());
        }
        for(int [] c:connections){
            element.get(c[0]).add(c[1]);
            element.get(c[1]).add(-c[0]);        
        }
    return doDFS(element,new boolean[n],0);
}

int doDFS(List<List<Integer>> element,boolean [] visited,int root){
    
    int count = 0;
    visited[root] = true;
    
    for(int to: element.get(root)){
        
        if(!visited[Math.abs(to)]) {
            count += doDFS(element,visited,Math.abs(to)) + ((to>0)?1:0);
        }
    }
    return count;
}
}