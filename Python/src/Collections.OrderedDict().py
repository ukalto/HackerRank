# Enter your code here. Read input from STDIN. Print output to STDOUT
dic = {}

n = int(input())
for _ in range(n):
    row = input().split()
    product, price = " ".join(row[:-1]), int(row[-1])
    dic[product] = price + dic.get(product, 0)

for p, pr in dic.items():
    print(p, pr)
