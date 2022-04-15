from  LinkedList import LinkedList
from reverselinkedlist import reverse_linked_list
def ispallindrom(head):
    # l_temp=LinkedList()

    # if head is None:
    #     return True
    # else:
    #     temp=head
    #     l1=None
    #     l2=None

    #     while temp.next:
    #         l_temp.insert(temp.data)
    #         if temp.data==temp.next.data:
    #             l1=l_temp.head
    #             l2=temp.next
    #             break
    #         else:
    #             temp=temp.next
    #     if l1 is None or l2 is None:
    #         return False
    #     else:
    #         l2=reverse_linked_list(l2)
    #         LinkedList.get_all_from_data(l1)
    #         LinkedList.get_all_from_data(l2)

    #         status=False
    #         while l1 or l2:
    #             if l1 and l2 :
    #                 if l1.data==l2.data:
    #                     status=True
    #                 else:
    #                     status=False
    #                     break
    #                 l1=l1.next
    #                 l2=l2.next
    #             else:
    #                 status=False
    #                 break    

    #         return status        
    pass

l1=LinkedList()
l1.insert(12)
l1.insert(12)
l1.insert(12)
l1.insert(12)

print(ispallindrom(l1.head))