class Stack:
    def __init__(self):
        self.container = []

    def push(self, val):
        self.container.append(val)

    def pop(self):
        return self.container.pop()

    def peek(self):
        return self.container[-1]

    def is_empty(self):
        return len(self.container) == 0

    def size(self):
        return len(self.container)
 
 
 
def alignLibrary(string):
    stack = Stack()
    book = Stack() 
    str = ''
    for ch in string:
        if ch=="\\":
            while stack.peek() !="/":
                str+=stack.pop()
            stack.pop()
            for char in str:
                stack.push(char)
            str=""
        else:
            stack.push(ch)       
 
    return "".join(stack.container) 
 
name = input()
print( alignLibrary(name))
