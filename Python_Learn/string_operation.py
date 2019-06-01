# String Operation

myName = "Sanjay modasia   "   # myName = "8888" for isnumeric() function

word = "CatBatSatFat"

print(myName.upper())
print(myName.lower())
print(myName.title())
print(myName.rstrip())  # removing whitespace after
print(myName.strip())  # removing whitespace after and before
print(myName.find("mo"))
print(myName.replace("mo", "Mo"))
print("Mo" not in myName)
print(myName.split())
print(myName.join("Parsottambhai"))
print(myName.isnumeric())
print([word[i:i+3] for i in range(0, len(word), 3)])
