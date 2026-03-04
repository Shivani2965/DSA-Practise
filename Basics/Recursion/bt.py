class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
    
    
class BT:
    def LOT(self,r):
        if r is None:
            print("no data available")
            return
        Que=[]
        Que.append(r)
        while Que:
            curr=Que.pop(0)
            print(curr.data,end=" ")
            
            if curr.left:
                Que.append(curr.left)
            if curr.right:
                Que.append(curr.right)  
                
    def PreorderI(self,r):
        if r is None:
            print("no data available..")
            return
        st=[]
        st.append(r) 
        while st:
            curr=st.pop()
            print(curr.data,end=" ")
            
            if curr.right:
                st.append(curr.right)
            if curr.left:
                st.append(curr.left) 
                     
    def InorderI(self,r):
        if r is None:
            print("no data available")
            return
        st=[]
        curr=r
        while True:
            if curr:
                st.append(curr)
                curr=curr.left
                
            elif st:
                curr=st.pop()
                print(curr.data,end=" ")
                curr=curr.right
            else:
                break
            
    def PostorderI(self,r):
        if r is None:
            print("no data vaialable..")
            return
        s1=[]
        s2=[]
        s1.append(r)
        
        while s1:
            curr=s1.pop()
            s2.append(curr)
            
            if curr.left:
                s1.append(curr.left)
            if curr.right:
                s1.append(curr.right)
                
        while s2:
            curr=s2.pop()
            print(curr.data,end=" ")  
            
    def PreOrderR(self,r):
        if r is not None:
            print(r.data,end=" ")
            self.PreOrderR(r.left)
            self.PreOrderR(r.right)
            
    def PostOrderR(self,r):
        if r is not None:
            self.PostOrderR(r.left)
            self.PostOrderR(r.right)
            print(r.data,end=" ")
            
    def InOrderR(self,r):
        if r is not None:
            self.InOrderR(r.left)
            print(r.data,end=" ")
            self.InOrderR(r.right)
    
                 
root=Node(56)
root.left=Node(34)
root.right=Node(78)
root.left.left=Node(23)
root.left.right=Node(45)
root.right.right=Node(12)
root.left.left.left=Node(52)
root.right.right.left=Node(89)
b=BT()
print("LEVEL ORDER")
b.LOT(root)
print("\nPREORDER I..")
b.PreorderI(root)
print("\n PREORDER R...")
b.PreOrderR(root)
print("\nInORDER I..")
b.InorderI(root)
print("\n INORDER R...")
b.InOrderR(root)
print("\nPostOrderI..")
b.PostorderI(root)
print("\n POSTORDER R...")
b.PostOrderR(root)