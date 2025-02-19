class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node=None

        while head:
            next=head.next
            head.next=node
            node=head
            head=next

        return node   

            


