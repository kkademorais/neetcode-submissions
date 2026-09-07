class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        brackets = {
            "}": "{",
            "]": "[",
            ")": "("
        }
        for chars in s:
            if stack and chars in brackets:
                if stack[-1] != brackets[chars]: return False
                else: stack.pop()
            else:
                stack.append(chars)
        if stack: return False
        if not stack: return True