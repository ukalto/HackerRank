happines = 0
n, m = input().split()
ele = input().split()
A, B = set(input().split()), set(input().split())
for i in ele:
    if i in A:
        happines += 1
    elif i in B:
        happines -= 1
print(happines)
