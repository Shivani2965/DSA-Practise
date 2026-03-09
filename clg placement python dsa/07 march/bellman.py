def bellman(n, edges, src):
    dist = [float('inf')] * n
    dist[src] = 0

    # for _ in range(n - 1):
    #     for u, v, w in edges:
    #         if dist[u] != float('inf') and dist[u] + w < dist[v]:
    #             dist[v] = dist[u] + w

    # return dist

    for i in range(n):
        for u,v,w in edges:
            if dist[u] + w<dist[v]:
                dist[v]= dist[u]+w
        return dist
    
n=4
edges= [(0,1,4), (0,2,5),(1,2,-3),(2,3,4),(3,1,-6)]
src = 0
print(bellman(n, edges, src))




# brute force
# two pointer approach