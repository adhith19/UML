from selenium import webdriver
from selenium.webdriver.common.by import By
driver=webdriver.Chrome()
try:
    driver.get("https://www.google.com/")
    print("Page Title: ",driver.title)
    search=driver.find_element(By.NAME,"q")
    search.send_keys("Software Engineering")
    search.submit()
    print("Search test completed. ")
finally:
    driver.quit()


