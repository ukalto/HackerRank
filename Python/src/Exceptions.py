# Enter your code here. Read input from STDIN. Print output to STDOUT
inputs = int(input())
for i in range(inputs):
    try:
        a, b = map(int, input().split())
        print(a // b)
    except Exception as e:
        print("Error Code:", e)
