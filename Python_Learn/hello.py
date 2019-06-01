# Print Statement
print("hello world")
print("ha.." * 10)
print("I am so happy to code python")

# Variable understanding
x = 1
student_name = "Sanjay Modasia"
count = 200
share_value = 10.5
print("value of count", count)

# Built in function

print(len(student_name))
print(student_name[0])
print(student_name[-1])
print(student_name[0:4])
print(student_name[0:])
print(student_name[:5])

#  Escape sequences
student_course = "Python \"Programming"
print(student_course)
# 1) \" 2) \' 3) \\ 4) \n

# Formatted String and concatination
first = "Sanjay"
last = "Modasia"

fullName = first + " " + last
# you can write any valid expression   f"{first} {2+2}"
formatted_string = f"{first} {last}"
print(fullName)
print(formatted_string)
