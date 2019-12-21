class Driving:

    def Drive(self):
        print("Driving a car")


class Audi(Driving):
    pass


class Bmw(Driving):
    pass


audi = Audi()
audi.Drive() 
bmw = Bmw()
bmw.Drive() 