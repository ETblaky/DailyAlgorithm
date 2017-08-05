number = input("Write a decimal number to be converted to binary \n")

binary = []
rest = int(number)

while rest != 0:
    if rest % 2 == 0:
        binary.append(str(0))
        rest = rest/2
    else:
        binary.append(str(1))
        rest = (rest - 1) / 2

print(''.join(binary[::-1]))