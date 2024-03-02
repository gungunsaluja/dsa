//Binary Tree Level order Traversal
// TO solve this question we will take a queue and arrayList first we will add root to the queue then we traverse it's child by adding the root into the queue
//we will check first left node if it is not null then we will add it in the queue then we will check right side of the tree and add it into the queue  front element will be 
//removed first
class sol{
  public List<Integer> levelOrder(Node root){
  Queue<Node> q = new LinkedList<Node>();
    ArrayList<Integer> ans = new ArrayList<>();
    if(root==null){
return ans;}
    q.add(root);
    while(!q.isEmpty()){
      Node curr = q.remove();
      ans.add(curr.data);
      if(curr.left!=null)
        q.add(curr.left);
      if(curr.right!=null)
        q.add(curr.right);
     
    }
    return ans;
    
  }}
