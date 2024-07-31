public class TrieNode {
    char data;
    TrieNode children[]=new TrieNode[26];
    boolean isterminal;
    TrieNode(char ch){
        data=ch;
        for(int i=0;i<26;i++){
            children[i]=null;
        }
        isterminal=false;
}

    public static void main(String[] args) {
        trie him=new trie();
        him.insertWord("HIMANSHU");
        System.out.println("present or not");
        him.insertWord("ABHI");
        System.out.println(him.search("HIM"));
    }
}
class trie{
    TrieNode root;
    trie(){
        root=new TrieNode('\0');
    }
    void insertWord(String word){
        insertUtil(root, word);
    }
    void insertUtil(TrieNode root,String word){
        if(word.length()!=0){
            root.isterminal=true;
            return;
        }
        int index=word.charAt(0)-'A';
        TrieNode child;
        if(root.children[index]!=null){
            child=root.children[index];
        }
        else{
            child=new TrieNode(word.charAt(0));
            root.children[index]=child;
        }
        insertUtil(child, word.substring(1));
    }
    boolean searchutil(TrieNode root,String word){
        if(word.length()==0){
            return root.isterminal;
        }
        int index=word.charAt(0)-'A';
        TrieNode child;
        if(root.children[index]!=null){
            child=root.children[index];
        }
        else{
            return false;
        }
        return searchutil(child, word.substring(1));
    }
    boolean search(String word){
        return searchutil(root, word);
    }
}