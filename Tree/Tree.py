from turtle import right


class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


class Tree:
    root=None
    total_sum=[]
    def insert(self, data):
        if self.root is None:
            self.root = Node(data)
        else:
            self._insert(data, self.root)
    def _insert(self,data,root):    
        if data>root.data:
            if root.right is None:
                root.right=Node(data)
            else:
                self._insert(data,root.right)  
        else:
            if root.left is None:
                root.left=Node(data)
            else:
                self._insert(data,root.left)                 
    def printTree(self):
        if self.root is None:
            print("Tree is Empty")
        else:
            self.inordertraversal(self.root)
    def inordertraversal(self,root):
        if root: 
            self.inordertraversal(root.left) 
            print(root.data,end="=>")
            self.inordertraversal(root.right)     
    #function to delete a node from the tree
    def delete(self,data):
        if self.root is None:
            return
        self.root=self._delete(data,self.root)
    def _delete(self,data,root):
        if root is None:
            return root
        if data<root.data:
            root.left=self._delete(data,root.left)
        elif data>root.data:
            root.right=self._delete(data,root.right)
        else:
            if root.left is None:
                temp=root.right
                root=None
                return temp
            elif root.right is None:
                temp=root.left
                root=None
                return temp
            temp=self.minValue(root.right)
            root.data=temp.data
            root.right=self._delete(temp.data,root.right)
        return root
    def minValue(self,root):
        current=root
        while current.left is not None:
            current=current.left
        return current
    def search(self,data):
        if self.root is None:
            return False
        else:
            return self._search(data,self.root)
    def _search(self,data,root):
        if root is None:
            return False
        elif data==root.data:
            return True
        elif data<root.data:
            return self._search(data,root.left)
        else:
            return self._search(data,root.right)        
    def preordertraversal(self,root):
        if root:
            self.total_sum.append(root.data)
            self.preordertraversal(root.left)
            self.preordertraversal(root.right)
        else:
            sum=sum(self.total_sum)
    def haspathsum(self,node,data):
        all=0
        totalsum=data-node.data

        if(node.left is None and node.right is None):
            if totalsum==0:
                return True
            else:
                return False


        if node.left is not None:
            all=all or self.haspathsum(node.left,totalsum)
        if node.right is not None:
            all=all or self.haspathsum(node.right,totalsum)        
  
        return all
    def height(self,node):
        if node is None:
            return 0
        else:
            lheight=self.height(node.left)
            rheight=self.height(node.right)
            return max(lheight,rheight)+1
     
    def isbst(self,node):
        print(self.isbst_(node))


    def isbst_(self,node):
        if node:
            if node.left and node.left.data>node.data:
                return False
            if  node.right and node.right.data<node.data:
                return False
            return self.isbst_(node.left) and  self.isbst_(node.right)   
        else:
            return True
t1=Tree()

t1.insert(5)
t1.insert(4)
t1.insert(11)
t1.insert(3)
t1.insert(3.3)
t1.insert(2)
t1.insert(5.5)
t1.insert(7)
# t1.inordertraversal(t1.root)

# t1.preordertraversal(t1.root)
t1.isbst(t1.root)

# t1.delete(5).
# print(t1.search(58))

# t1.inordertraversal(t1.root)

# t1.printTree()