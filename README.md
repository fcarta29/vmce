# PSOLABS

## VMCE
### Building via cmd line (from /vmce)
mvn clean install
### Running VMCE Webapp via cmd line (from /vmce/vmce-webapp)
mvn spring-boot:run

## Deploy PSOLABS Projects
### Build & Tag Deploy Container (from /deploy dir)
```
$ make build
```
### Run and Connect to Deploy Container (from /deploy dir)
```
$ make run
```
### Push Deploy Container (from /deploy dir)
```
$ docker login (optional if not logged in)
$ make push
```


### Build VMCE Webapp Docker Image
```
$ docker build -f web.dockerfile -t fcarta29/psolabs-vmce-webapp:latest .
```
### Push VMCE Webapp Docker Image 
```
$ docker push fcarta29/psolabs-vmce-webapp:latest
```
