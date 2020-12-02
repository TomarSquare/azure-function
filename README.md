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

![Screenshot_from_2020-09-15_10-02-27](/uploads/9a653c6a16cd61813d97b0f926ebade0/Screenshot_from_2020-09-15_10-02-27.png)

The log is also printed out in your IDEA, now, stop the function by clicking the stop button. or ctrl+c on terminal

![Screenshot_from_2020-09-15_10-07-14](/uploads/28b0429956276765bfca409c54347b28/Screenshot_from_2020-09-15_10-07-14.png)

## Debug
- Now let's try to debug your Function App locally, click the Debug button in the toolbar 
(if you don't see it, click View -> Appearance -> Toolbar to enable Toolbar).

![Screenshot_from_2020-09-15_10-09-23](/uploads/e5280ca04de02e3e9e77cddae921fc36/Screenshot_from_2020-09-15_10-09-23.png)

Click on line 22 of the file UserHandler.java to add a breakpoint, 

![Screenshot_from_2020-09-15_10-14-23](/uploads/0d07f5f7bed3fdb0b9e74b573c70daaa/Screenshot_from_2020-09-15_10-14-23.png)

access the endpoint http://localhost:7071/api/userSave 
again , you will find the breakpoint is hit, Stop the debug session by click the stop button.

![Screenshot_from_2020-09-15_10-15-07](/uploads/bb1647ec4e924ed84ec7c9a536fb0a81/Screenshot_from_2020-09-15_10-15-07.png)

- Repeat the procedure for get endpoint as well
Click on 30 line  of the file UserHandler.java to add a breakpoint, access the endpoint http://localhost:7071/api/5 
you will find the breakpoint is hit, Stop the debug session by click the stop button.

![Screenshot_from_2020-09-15_10-17-17](/uploads/c4239583c39503c8c800288bac637491/Screenshot_from_2020-09-15_10-17-17.png)


## Deploy

```
az login
mvn azure-functions:deploy
```
