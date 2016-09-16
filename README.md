# iguide-services

## How to Run services?

- Open project in Eclipse
- Update maven dependencies: Maven -> Update project .. 
- Run in Eclipse: Run as.. -> Maven Build and set goal as spring-boot:run
- Try it local : type in console "curl localhost:8080/plant" 

## How to acess services in heroku server?

iguide-services are available at https://iguide-services.herokuapp.com/plant?beacon_id=${beacon_id}

## How to deploy new changes in heroku server? 

#### First time deploying? Configure heroku locally:
You need an account in heroku. In a terminal run "heroku login" and enter your credentials:

```terminal
$ heroku login
Enter your Heroku credentials.
Email: java@example.com
Password:
Could not find an existing public key.
Would you like to generate one? [Yn]
Generating new SSH public key.
Uploading ssh public key /Users/java/.ssh/id_rsa.pub
```
Configure heroku remote url for git:
```terminal
git remote add heroku https://git.heroku.com/iguide-services.git
```

#### Everytime you introduce a new change:
- Make your changes and commit into this repo
- Before pushing TRY IT LOCALLY
- Then push your changes once you know the services works properly
- Deploy new changes in heroku with:
```terminal
git push heroku master
```
- Verify deployment result in https://dashboard.heroku.com/apps/iguide-services
- You can verify logs in terminal with "heroku logs --tail"
