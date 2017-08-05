class DeleteDups{
    void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous n = null;
        while (n!= null){
            if (set.contains(n.data){
                 previous.next = n.next;
            }else{
                 set.add(n.data);
                 previous = n;
            }
            n = n.next
        }
    }
    void deleteDupsWithNoBuffer(LinkedListNode head){
        LinkedListNode current = head;
        while (current != null){
            LinkedListNode runner = current;
            while (runner.next! = null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next; 
                }
            }  
            current = current.next;
        }
    }
}
