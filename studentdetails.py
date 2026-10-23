Students={}
def add_student():
    name= input("Enter student Name:")
    marks= float(input("Enter the marks:"))
    if marks>=90:
        grade="A+"
    elif marks >80:
        grade="A"
    elif marks >=70:
        grade="B"
    elif marks >=60:
        grade = "C"
    else:
        grade= "D"
    Students[name]=(marks,grade)
def display_student():
    print("\n student details")
    print("------------------")
    for name, details in Students.items():
          print("Name:",name)
          print("Marks:",details[0])
          print("Grade:",details[1])
          print()
while True:
    print("1. Add Student")
    print("2. Display student")
    print("3. exit")
    choice=input("Enter choice")
    if choice == "1":
        add_student()
    elif choice =="2":
        display_student()   
    elif choice=="3":
        break
    else:
        print("Invalid choice")
