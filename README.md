# Azure Function and Spring Cloud Function

Clone this repository.


## Build a function

```
mvn clean package -DskipTests=true
```

## Run Locally

```
mvn azure-functions:run
```

```
Http Functions:

     

        userGet: [GET] http://localhost:7071/api/{id}

        userSave: [POST] http://localhost:7071/api/userSave
        
```

You can try the function by accessing the printed endpoint from browser, like



The log is also printed out in your IDEA, now, stop the function by clicking the stop button. or ctrl+c on terminal



## Debug
- Now let's try to debug your Function App locally, click the Debug button in the toolbar 
(if you don't see it, click View -> Appearance -> Toolbar to enable Toolbar).


Click on line 22 of the file UserHandler.java to add a breakpoint, 


access the endpoint http://localhost:7071/api/userSave 
again , you will find the breakpoint is hit, Stop the debug session by click the stop button.



- Repeat the procedure for get endpoint as well
Click on 30 line  of the file UserHandler.java to add a breakpoint, access the endpoint http://localhost:7071/api/5 
you will find the breakpoint is hit, Stop the debug session by click the stop button.




## Deploy

```
az login
mvn azure-functions:deploy
```
