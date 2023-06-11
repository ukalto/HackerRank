_, list = input(), list(map(int, (input().strip().split(' '))))
print(all(i >= 0 for i in list) and any(str(i) == str(i)[::-1] for i in list))
