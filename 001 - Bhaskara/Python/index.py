from  math import  *

print("Write the equation: ")
equation = input()

a,s1,b,s2,c = equation.split(" ")

if a[0] != "+" and a[0] != "-":
    an = "+" + a[0]
    ax = a.split(a[0])[1]
else:
    an = a[0] + a[1]
    ax = a.split(an)[1]

bn, bx = list(b)
bn = s1 + bn

c = s2 + c

delta = pow(float(bn), 2) - 4 * float(an) * float(c)
x1 = (-float(bn) + sqrt(delta)) / 2
x2 = (-float(bn) - sqrt(delta)) / 2

print("Δ = " + str(delta))
print("x1 = " + str(x1))
print("x2 = " + str(x2))
