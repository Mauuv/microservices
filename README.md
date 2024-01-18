User microservice:
make a post call to localhost:8081/users
body JSON with name and email 
sample:
{
  "name" : "Mauricio",
  "email" : "mauricio@email.com"
}
after the post call the email microservice is going to cosume the message on the queue sending an email to the user

you can see all users by making a get call to localhost:8081/users 

Email service 
you can see all email by making a get call to localhost:8082/emails

For the microservices to work you'll need to configure the application.properties with your data: password for the postgres database (both) as well as email and app password for the gmail smtp (email microservice)
