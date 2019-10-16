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

### Build VMCE Webapp (from /vmce)
```
$ mvn clean install
```
### Run VMCE Webapp locally (from /vmce/vmce-webapp)
```
$ mvn spring-boot:run
```
In a browser navigate to http://localhost:8080/vmce
### Build VMCE Webapp Docker Image (from /vmce/vmce-webapp dir)
```
$ docker build -f web.dockerfile -t fcarta29/psolabs-vmce-webapp:latest .
```
### Push VMCE Webapp Docker Image
```
$ docker push fcarta29/psolabs-vmce-webapp:latest
```
