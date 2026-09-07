class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for chars in s:
            if self.openBrackets(chars): stack.append(chars)
            elif self.closeBrackets(chars):
                if not stack or stack[-1] != self.match(chars): return False
                else: stack.pop()
        return len(stack) == 0
    
    def openBrackets(self, s: str) -> bool:
        return s == "(" or s == "[" or s == "{"

    def closeBrackets(self, s: str) -> bool:
        return s == ")" or s =="]" or s =="}"

    def match(self, s: str) -> str:
        if s == "]": return "["
        elif s == ")": return "("
        elif s == "}": return "{"