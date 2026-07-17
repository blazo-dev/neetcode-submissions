class Solution:
    def isPalindrome(self, s: str) -> bool:
        text = ""

        for ch in s:
            if ch.isalnum():
                text += ch

        text = text.lower()

        print({"text": text, "reversed": text[::-1]})

        return text == text[::-1]
