from numpy import true_divide


class Hashtable:
    def __init__(self):
        self.max=100
        self.arr=[ [] for i in range(self.max)]
    def get_hash(self,key):
        hash=0
        for char in key:
            hash+=ord(char)
        return hash%self.max
    def __getitem__(self,key):
        h=self.get_hash(key)
        for element in self.arr[h]:
            if element[0]==key:
                return element[1]  
    def __setitem__(self,key,val):
        h=self.get_hash(key)
        found=False
        for index ,element in enumerate(self.arr[h]):
            if len(element)==2 and element[0]==key:
                self.arr[h][index]=(key,val)
                found=True
                break
        if not found:
            self.arr[h].append((key,val))

    def __delitem__(self,key):
        h=self.get_hash(key)
        for index,element in enumerate(self.arr[h]):
            if len(element)==2 and element[0]==key:
                self.arr[h].remove((key,element[1]))
                break

            

t=Hashtable()
t['shivam']='amu'
t['shivam1']='3'
t['shivam4']='3'
del t['shivam']
del t['shivam']
print(t['shivam'])


