# Here is an example of exception handling
try:
    age = int(input('Age: '))
    income = 2000
    risk = income / age
    print(age)
except ValueError:
    print('Invalid Value')
except ZeroDivisionError:
    print('Age cannot be zero.') 