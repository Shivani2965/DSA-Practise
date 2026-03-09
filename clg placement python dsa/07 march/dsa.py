class Node:
    def __init__(self):
        self.children = {}
        self.eow=False
    
class trie:
    def __init__(self):
        self.root=Node()

# inserting elemenets:
    def insert(self, word):
        n=self.root
        for ch in word:
            if ch not in n.children:
                n.children[ch]=Node()
            n = n.children[ch]
        n.eow=True
        pass

    def Search(self,word):
        n=self.root
        for ch in word:
            if ch not in n.children:
                return False
            n=n.children[ch]
        return n.eow 
    
    def prefixsearch(self,prefix):
        n=self.root
        for ch in prefix:
            if ch not in n.children:
                return False
            n=n.children[ch]
        return True
    
    def delete(self, word):
        def deletefun(n, word,len1):
            if len1 == len(word):
                if not n.eow:
                    return False
                n.eow=False
                return len(n.children)==0
            ch=word[len1]
            if ch not in n.children:
                return False
            childnode=n.children[ch]
            shoulddelete=deletefun(childnode, word, len1+1)

    def delete2(self,word):
        n=self.root
        for ch in word:
            if ch not in n.children:
                return False
            n=n.children[ch]
        n.eow=False
        return n.eow
            





t = trie()
t.insert("do")
t.insert("done")
t.insert("does")
print(t.Search("does"))
# print(t.prefixsearch("doe"))
# print(t.prefixsearch("din"))
# t.delete("do")
t.delete2("doe")
print(t.Search("does"))


