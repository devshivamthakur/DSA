from LinkedList import LinkedList

class MergedLinkedlist:

 def merge_linkedlist(self,list1,list2):
    temp=None
    if list1 is None:
        return list2
    if list2 is None:
        return list1
    if list1.data <= list2.data:
        temp=list1
        temp.next=self.merge_linkedlist(list1.next,list2)
    else:
        temp=list2
        temp.next=self.merge_linkedlist(list1,list2.next)

    return temp    
 def remove_duplicate(self,list):
     l1=LinkedList()
     while list:
        temp2=list.next
        found=False
        while temp2:
            if temp2.data==list.data:
                found=True
                break
            temp2=temp2.next
        if not found:
                l1.insert(list.data)
        list=list.next      
     return l1   

 def find_intersected(self,list1,list2):
     while list1:
         temp=list2
         while temp:  
             if temp.data==list1.data:
                 return temp.data
             temp=temp.next
         list1=list1.next     
     return None                  


# l1=LinkedList()
# l1.insert(12)       
# l1.insert(13)       
# l1.insert(14)      

# l2=LinkedList()

# l2.insert(10)
# l2.insert(11)
# l2.insert(15)

# merge_instance=MergedLinkedlist()

# print(merge_instance.find_intersected(l1.head,l2.head))
# temp=merge_instance.merge_linkedlist(l1.head,l2.head)
# print(LinkedList.get_all_from_data(temp))

# temp1=merge_instance.remove_duplicate(temp)

# print(LinkedList.get_all_from_data(temp1.head))







