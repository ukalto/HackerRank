if __name__ == '__main__':
    grades = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        grades.append([name, score])
    secondsmallest = 0.0
    grades.sort()
    grades = sorted(grades, key=lambda x: x[1])
    for g in range(len(grades)):
        if grades[g][1] < grades[g + 1][1]:
            secondsmallest = grades[g + 1][1]
            break
    names = [x[0] for x in grades if x[1] == secondsmallest]
    for i in names:
        print(i)
