def count_substring(string, sub_string):
    count = 0
    for i in range(len(string)):
        if i < len(string) - 2:
            if sub_string == string[i:len(sub_string) + i]:
                count += 1
    return count
