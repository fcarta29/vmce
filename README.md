# PSOLABS

## VMCE
### Building via cmd line (from /vmce)
mvn clean install
### Running VMCE Webapp via cmd line (from /vmce/vmce-webapp)
mvn spring-boot:run

## Deploy PSOLABS Projects
### Build Deploy Container (from /deploy dir)
```
$ docker build -t psolabs-deploy --rm -f deploy.dockerfile .
```
### Run and Connect to Deploy Container
```
$ docker run --name psolabs-deploy -td fcarta29/psolabs-deploy:latest
$ docker exec -it psolabs-deploy bash
```
### Push Deploy Container
```
docker login
docker tag psolabs-deploy:latest fcarta29/psolabs-deploy:latest
docker push fcarta29/psolabs-deploy:latest
```
