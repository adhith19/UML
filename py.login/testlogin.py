import login

print("================================")
print(" USER LOGIN SYSTEM")
print("================================")

userid = input("Enter User ID: ")
password = input("Enter Password: ")

print("\nChecking User ID...")

if login.validate_userid(userid):
    print("User ID is valid")
else:
    print("User ID is invalid")

print("\nChecking Password...")

if login.validate_password(password):
    print("Password is valid")
else:
    print("Password is invalid")

print("\n================================")
print("Final Result:")
print(login.check_login(userid, password))
print("================================")
