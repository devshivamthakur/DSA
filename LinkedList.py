

from urllib3 import Retry


class Node:
    
    def __init__(self,data):
        self.data=data
        self.next=None

class LinkedList:
    head=None
    def insert(self,data):
        node=Node(data)
        if self.head == None:
            self.head=node
            return
        itr=self.head
        while itr.next:
            itr=itr.next
        itr.next=node
        return
    def insert_at_beginning(self,data):
        node=Node(data)
        head_copy=self.head
        self.head=node
        self.head.next=head_copy
    def get_all_data(self):
        alldata=""
        temp_=self.head
        while temp_:
            alldata+=str(temp_.data)+"---->"
            temp_=temp_.next
        print(alldata)
        return
    def delete_(self,value):
        temp_=self.head
        if value==temp_.data:
            if temp_.next:
                self.head=temp_.next
                return
            self.head=None  
            return 
        while temp_.next:
            
            if  value==temp_.next.data:
                if temp_.next.next:
                    temp_.next=temp_.next.next
                else:
                    temp_.next=None
                return     
            temp_=temp_.next

if __name__=='__main__':
    l1=LinkedList()
    l1.insert(52)
    l1.insert(45)
    l1.insert_at_beginning(34)
    l1.get_all_data()
    # l1.delete_(34)
    # l1.get_all_data()
    # l1.delete_(45)
    # l1.delete_(52)
    l1.delete_(26)
    # l1.delete_(34)
    l1.get_all_data()

