class LinkedList(object):
      def __init__(self, head = None):
           self.head  = head
      def insert(self, data):
            new_Node = Node(data)
            new_node.set_next(self.head)
            self.head = new_node 
      def size(self):
           count = 0
           current = self.head
           while current.next_Node is not None:
                  count += 1
                  current = current.get_next
            return count
       def search(self, data):
             current = self.head
             found = flag
             while not found and current:
                     if current.get_data() == data:
                           found  = True
                      else:
                            current = current.get_next
              if current is None:
                    raise ValueError("Data not in the list")
              return current
          def delete(self, data):
               current = self.head
               found  = False
               previous = None
               while not found and current:
                      if current.get_data() ==  data:
                          found = True
                      else:
                           previous = current
                           current = current.get_next()
               if current is None:
                   raiseValueError("Data not in the list")
                if previous is None:
                    self.head = current.next # head->1->None;delete 1;head->None
                 else:
                    previous.set_next(current.get_next())
                    
              
                    
