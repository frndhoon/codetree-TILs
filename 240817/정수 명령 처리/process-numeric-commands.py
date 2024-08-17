class Stack:
    def __init__(self):
        self.items = []
    
    def push(self, item):
        self.items.append(item)
    
    def empty(self):
        return not self.items

    def size(self):
        return len(self.items)

    def pop(self):
        if self.empty():
            return "stack is empty"
        else:
            return self.items.pop()
    
    def top(self):
        if self.empty():
            return "stack is empty"
        else:
            return self.items[-1]

n = int(input())
s = Stack()
for _ in range(n):
    cmds = list(input().split())
    
    if cmds[0] == 'push':
        s.push(int(cmds[1]))
    elif cmds[0] == 'pop':
        print(s.pop())
    elif cmds[0] == 'size':
        print(s.size())
    elif cmds[0] == 'empty':
        if s.empty():
            print(1)
        else:
            print(0)
    elif cmds[0] == 'top':
        print(s.top())