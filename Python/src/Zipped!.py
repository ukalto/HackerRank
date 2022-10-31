import operator

ll, n = input().split()
students = list(map(float, input().split()))
for _ in range(int(n) - 1):
    students = list(map(operator.add, students, list(map(float, input().split()))))
[print(x / int(n)) for x in students]
