
class Graph:
    def __init__(self):
        self.g={}

    def addEdges(self, u ,v):
        if u not in self.g:
            self.g[u]= []

        if v not in self.g:
            self.g[v]= []

        self.g[u].append(v)
        self.g[v].append(u)

    def BFS(self, start):

        visited =set()
        que=[]
        que.append(start)
        visited.add(start)
        while que:
            curr = que.pop(0)
            print (curr, end=" ")
            for i in self.g[curr]:
                if i not in visited:
                    que.append(i)
                    visited.add(i)

    def DFS(self, start):
        visited=set()
        st= []
        st.append(start)
        visited.add(start)
        while st:
            curr= st.pop()
            print(curr, end=" ")
            for i in self.g[curr]:
                if i not in visited:
                    st.append(i)
                    visited.add(i)


g1= Graph()
g1.addEdges(0,1)
g1.addEdges(1,2)
g1.addEdges(0,3)
g1.addEdges(1,3)

# print(g1.g)

# print("0 :", g1.g[0])
# print("1 :", g1.g[1])
# print("2 :", g1.g[2])
# print("3 :", g1.g[3])

# print(g1.BFS(0))


g1.BFS(0)
print()
g1.DFS(0)
print()

