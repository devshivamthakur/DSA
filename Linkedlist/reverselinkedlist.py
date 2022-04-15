from LinkedList import LinkedList


def reverse_linked_list(head):
    prev = None
    curr = head
    while curr:
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    return prev

# l1=LinkedList()
# l1.insert(1)
# l1.insert(2)
# l1.insert(3)
# l1.insert(4)

# temp=reverse_linked_list(l1.head)

# LinkedList.get_all_from_data(temp)
# print(temp)










