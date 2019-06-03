age = 12
score = 90
Math = 75

# Simple if statement and elif
 
if age > 40:
    print("can make girlfriend")
    print("focus on study")
elif age < 17:
    print("study well")
print("done\n")


message = "Eligible" if age >= 18 else "Not Eligible"
print(message)

# Multiple condition

# 1)

if age > 18 and score > 85:
    print("good boy")
else:
    print("Bad boy")

# 2)

if (age > 18 and score > 85) or Math > 90:
    print("Brilliant")
else:
    print("Average")
