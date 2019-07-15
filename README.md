# spring-boot-rest-api-oauth-2.0
Spring boot Rest API application with OAUTH 2.0 

To get the access token call URL using post man.
Here username:user and password :user 
Method Type:POST
http://localhost:5555/oauth/token?grant_type=password&username=user&password=user

Select authorization from the postman 
Type : Basic Auth
Username : my-trusted-client
Password : secret

Response Sample :

{
    "access_token": "f41adb6d-8aec-4cbc-b263-bafdec59395e",
    "token_type": "bearer",
    "expires_in": 4521,
    "scope": "read write trust"
}

Read the Resource using the below url from the post man
Method Type :GET
http://localhost:5555/products/getAll?access_token=f41adb6d-8aec-4cbc-b263-bafdec59395e

Response :[
    {
        "id": 1,
        "unitPrice": 5000,
        "quantity": 100,
        "description": "Iphone XR",
        "name": "Iphone XR"
    },
    {
        "id": 2,
        "unitPrice": 5632,
        "quantity": 100,
        "description": "Samasung A7",
        "name": "Samasung A7"
    }
]