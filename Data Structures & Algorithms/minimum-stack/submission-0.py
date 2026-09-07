class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        if len(self.minStack) != 0:
            val = min(val, self.minStack[-1])
        self.minStack.append(val)

    def pop(self) -> None:
        newStack = self.stack[0:(len(self.stack)-1)]
        self.stack = newStack
        newMinStack = self.minStack[0:(len(self.minStack)-1)]
        self.minStack = newMinStack

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minStack[-1]
