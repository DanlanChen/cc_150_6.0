class DFS{
void search(Node root){
    if (root == null) return;
    visit(root);
    root.visited = true;
    for each (Node n in root.adjacent){
         if (n.visited is false){
         search(n);
          }
   }
}
