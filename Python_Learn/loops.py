successful = False
# For loop
for number in range(3, 13, 3):
    print("Attemp", number, (number + 1) * ".")

# for else loop
for number in range(3):
    print("Attemp")
    if successful:
        print("Successful")
        break
else:
    print("Attempted 3 times and failed")

# Multiple for loop

for x in range(6):
    for y in range(5):
        print(f"x: {x}, y: {y}")

# Iterable
for x in "Sanjay":
    print(x)

# while loop

number = 100
while number > 0:
    print("Divided number : ", number)
    number //= 2
