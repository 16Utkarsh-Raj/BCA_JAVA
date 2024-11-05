public class TrieCode {
    static int size=26;
    static class TrieNode{
        TrieNode[] children=new TrieNode[size];
        boolean isEndofWord;
        TrieNode(){
            isEndofWord=false;
            for(int i=0; i<size; i++){
                children[i]=null;
            }
        }
    }
    static TrieNode root;
    static void insert(TrieNode root, String key){
        TrieNode currNode=root;
        for(int i=0; i<key.length(); i++){
            char curr=key.charAt(i);
            if(currNode.children[curr-'a']==null){
                TrieNode newNode=new TrieNode();
                currNode.children[curr-'a']=newNode;
            }
            currNode=currNode.children[curr-'a'];
        }
        currNode.isEndofWord=true;
    }
    static boolean search(TrieNode root, String key){
        TrieNode currNode=new TrieNode();
        for(int i=0; i<key.length(); i++){
            char curr=key.charAt(i);
            if(currNode.children[curr-'a']==null){
                return false;
            }
            currNode=currNode.children[curr-'a'];
        }
        return currNode.isEndofWord;
    }
    public static void main(String[] args) {
        String keys[]={"the","a","there","their","by","bye","any","answer"};
        root=new TrieNode();

        for(int i=0; i<keys.length; i++){
            insert(root,keys[i]);
        }
        if(search(root, "any")==true)
            System.out.println("any is Present");
        else
            System.out.println("any is not Present");
    }
}