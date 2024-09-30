import math
def mango_distribution(mangoes, persons):
    return math.comb(mangoes + persons - 1, persons - 1)
input1 = 2
input2 = 2
print(mango_distribution(input1, input2))  # Case: 2 mangoes and 2 persons

input1 = 1
input2 = 12
print(mango_distribution(input1, input2))  # Case: 1 mango and 12 persons
