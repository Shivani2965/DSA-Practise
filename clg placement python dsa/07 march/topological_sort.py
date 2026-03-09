# def topo_sort_bfs(V,adj):
#     indegree=[0]*V
#     for u in range(V):
#         for v in adj[u]:
#             indegree[v]+=1
            
#     que=[]
#     for i in range(V):
#         if indegree[i]==0:
#             que.append(i)
#     topo=[]
#     while que:
#         curr=que.pop(0)
#         topo.append(curr)
#         for i in adj[curr]:
#             indegree[i]-=1
#             if indegree[i]==0:
#                 que.append(i)
#     return topo


# def dfs(node, visited, stack, adj):
#     visited[node] = True

#     for v in adj[node]:
#         if not visited[v]:
#             dfs(v, visited, stack, adj)

#     stack.append(node)   # push after visiting neighbors


# # def topo_sort_dfs(V, adj:
# #     visited = [False] * V
# #     stack = []

# #     for i in range(V):
# #         if not visited[i]:
# #             dfs(i, visited, stack, adj)

# #     return stack[::-1]   # reverse stack


# def topo_sortDFS(V, E):
#     g={}
#     for u,v in E:
#         if u not in g:
#             g[u]=[]
#         g[u].appnd(v)

#     visited =[False]*V
#     st=[]
#     x=[i]
#     y=[]

#     for i in range(V):
#         if not visited[i]:
#             x[i]
#         while x:
#             node=x[-1]
#             if not visited[node]:

        
    


# V=6
# # adj=[[],[],[3],[1],[0],[0,2]]
# # print(topo_sort_bfs(V,adj))


# E=[(5,0),(5,2),(2,3),(3,1),(4,0)]
# print(topo_sort_dfs(V, E))
