class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        s1, s2='',''
        while l1:
            s1=str(l1.val)+s1
            l1=l1.next
        while l2:
            s2=str(l2.val)+s2
            l2=l2.next
        s=str(int(s1)+int(s2))
        
        curr=ListNode(int(s[0]))
        for i in s[1::]:
            n=ListNode(int(i))
            n.next=curr
            curr=n
        return curr