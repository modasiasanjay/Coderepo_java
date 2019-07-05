# This example demonstrate about class and object
class Student:

    def studentRegistration(self):
        print('register the student')

    def studentMarks(self):
        print('student marks')


student = Student()
student.studentRegistration()

# anthor example


class Point:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def move(self):
        print("Move")
    
    def draw(self):
        print("Draw")


point = Point(10, 20)
point.draw()
point.move()
print(point.x)