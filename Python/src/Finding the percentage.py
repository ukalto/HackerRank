if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    sum1 = sum(student_marks[query_name])
    len1 = len(student_marks[query_name])
    print("%.2f" % round(sum1 / len1, 2))
