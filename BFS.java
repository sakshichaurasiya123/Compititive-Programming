public int bfs(int source,int destination){
    boolean visited[]=new boolean[adj.length];
    int parent[]=new int[adj.length];
    Queue<Integer>q=new LinkedList<>();
    q.add(source);
    parent[source]=-1;
    visited[source]=true;
   // int curr=destination;
    while(!q.isEmpty()){
        int curr = q.poll();
        if(curr==destination)break;
        for(int neighbour:adj[curr]){
            if(!visited[neighbour]){
                visited[neighbour]=true;
                q.add(neighbour);
                parent[neighbour]=curr;
                }
            }
        }
        int cur=destination;
        int dis=0;
        while(parent[cur]!=-1){
            System.out.println(cur+" -> ");
            cur=parent[cur];
            dis++;
        }
        return dis;
    }
    
