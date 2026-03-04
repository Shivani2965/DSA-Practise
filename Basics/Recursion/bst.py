class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        
class BST:
    def insertnode(self,r,data):
        if r is None:
            return Node(data)
        if data < r.data:
            r.left=self.insertnode(r.left,data)
        else:
            r.right=self.insertnode(r.right,data)
        return r
    
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
                
    def findmin(self,r):
        curr=r
        while curr.left:
            curr=curr.left
        return curr

    def delete(self,r,key):
        if r is None:
            return r
        if key < r.data:
            r.left=self.delete(r.left,key)
        elif key > r.data:
            r.right=self.delete(r.right,key)
        else:
            # nochild
            if r.left is None and r.right is None:
                return None
            # 1 child
            if r.left is None:
                return r.right
            elif r.right is None:
                return r.left

            # 2 child
            temp=self.findmin(r.right) 
            r.data=temp.data 
            r.right=self.delete(r.right,temp.data) 
        return r
    
    #min node
    def findmin(self,r):
        curr=r
        while curr.left:
            curr=curr.left
        return curr.data
    
    #max node
    def findmax(self,r):    
        curr=r
        while curr.right:
            curr=curr.right
        return curr.data
    
    #count nodes
    def countnodes(self,r):
        if r is None:
            return 0
        return 1+self.countnodes(r.left)+self.countnodes(r.right)
    
    #findnode: tru False
    def findnode(self,r,key):   
        if r is None:
            return False
        if key < r.data:
            return self.findnode(r.left,key)
        elif key > r.data:
            return self.findnode(r.right,key)
        else:
            return True
        
    #height of tree
    def height(self,r):
        if r is None:
            return -1
        return 1+max(self.height(r.left),self.height(r.right))
    
    #diameter of tree
    def diameter(self,r):
        if r is None:
            return 0
        lheight=self.height(r.left)
        rheight=self.height(r.right)
        ldiameter=self.diameter(r.left)
        rdiameter=self.diameter(r.right)
        
        return max(lheight+rheight+2,max(ldiameter,rdiameter))
    
    #balanced tree
    def isbalanced(self,r):
        if r is None:
            return True
        lheight=self.height(r.left)
        rheight=self.height(r.right)
        
        if abs(lheight-rheight) > 1:
            return False
        
        return self.isbalanced(r.left) and self.isbalanced(r.right)
    
    #mirror tree
    def mirror(self,r):
        if r is None:
            return None
        r.left,r.right=r.right,r.left
        self.mirror(r.left)
        self.mirror(r.right)

    #level order traversal
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
    
    
        
root=None
b=BST()
root=b.insertnode(root,56)
root=b.insertnode(root,34)
root=b.insertnode(root,78)
root=b.insertnode(root,23)
root=b.insertnode(root,45)
root=b.insertnode(root,89)
root=b.insertnode(root,12)
root=b.insertnode(root,52)
root=b.insertnode(root,60)
b.LOT(root)
print("\nafter delete")
b.delete(root,56)
b.LOT(root)



#min node 
#max node
