n, text = input().split(), str(input())
text = text.replace("x", str(n[0]))
print(eval(text) == int(n[1]))
