# SpringSecurity-Auth2.0

First of all, run all the three applications individually....

then try to access resource server through this link....

http://127.0.0.1:8080/api/users
you will automatically be redirected to login page....

then login with correct credentials....

application will ask for submitting the consent...just tick it and you will get the access to the resource...

if you don't have id and password then just register with postman.

enter this URL in postman through post request...
Registration:

http://localhost:8080/register 

in the body enter your data like this...

{
    "firstName": "shivraj",
    "lastName": "Godle",
    "email": "shivraj@se.in",
    "password": "shiv@123"
}

then check use this login id and password to access the resource...


After this step you will get the verification link in the client terminal... just verify it in postman get request...

http://localhost:8080/verifyRegistration?token=8cde4688-7cc9-4482-84ff-b5f03eb4b4f0

if it is in time then you will get the success, if not then bad request...  

suppose if you don’t receive any token then you want new token then use this link through get request and here enter your old token...
resendVerifyToken

http://localhost:8080/resendVerifyToken?token=8cde4688-7cc9-4482-84ff-b5f03eb4b4f0

after this you will get new token link in the terminal...
 Changing the password....

enter this url in postman through post request...

http://localhost:8080/changePassword

enter this kind of data in body....

{
    "email":"shivraj@se.in",
    "oldPassword":"shiv@123",
    "newPassword":"123"
}
you will get new password


Resetting the password...

enter this URL in postman through get request...

http://localhost:8080/resetPassword

in the body enter email like this...

{
    "email":"shivraj@se.in",
}

after hitting this url you will get one link like this

http://localhost:8080/savePassword?token=97cb57ca-0be2-417a-98d7-ac5115f7c9c2

use the above link to reset the password...enter this URL through post request in postman...
and also enter this kind of data

{
    "newPassword":"143"
}
you will successfully reset the password...



