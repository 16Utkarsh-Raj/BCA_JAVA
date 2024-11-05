public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert (Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(Node root, int key){
            if(root == null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            else if(root.data>key){
                return search(root.left,key);
            }
            else{
                return search(root.right,key);
            }
        }
        public static Node indoressuccessor(Node root){
            while(root.right!=null){
                root=root.right;
            }
            return root;
        }
        public static Node delete(Node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            }
            else if(root.data<val){
                root.right=delete(root.right,val);
            }
            else{
                //case -1
                if(root.left==null && root.right==null){
                    return null;
                }
                //case -2
                else if(root.left==null) {
                    return root.right;

                }
                else if(root.right==null){
                    return root.left;
                }
                 //case -3
            Node IS= indoressuccessor(root.right);
            root.data=IS.data;
            root.left=delete(root.left,IS.data);
            }
            return null;  
        }

        public static void main(String[] args){
            int arr[] ={5,1,3,4,2,7};
            Node root=null;
            for(int i=0;i<arr.length;i++){
                root=insert(root,arr[i]);
            }
            inorder(root);
            System.out.println(search(root,8));
            delete(root,7);
            inorder(root);
        }
    }