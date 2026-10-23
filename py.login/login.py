USER_ID = "student101"
PASSWORD = "python123"

def validate_userid(userid):
    if userid == USER_ID:
        return True
    else:
        return False

def validate_password(password):
    if password == PASSWORD:
        return True
    else:
        return False

def check_login(userid, password):
    if validate_userid(userid) and validate_password(password):
        return "Login Successful"

    elif not validate_userid(userid) and not validate_password(password):
        return "Invalid User ID and Password"

    elif not validate_userid(userid):
        return "Invalid User ID"

    else:
        return "Invalid Password"
