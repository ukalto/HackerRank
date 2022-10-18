def swap_case(s):
    str = ""
    for char in s:
        if char.isupper():
            str += char.lower()
        else:
            str += char.upper()
    return str
