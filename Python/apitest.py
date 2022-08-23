import requests

urlList = ["http://api.open-notify.org/this-api-doesnt-exist", "http://espn.com" , "http://warptechno.com"]

for x in urlList:
     response = requests.get(x)
     print("Url "+ x + " returned a status code of " + str(response.status_code))
