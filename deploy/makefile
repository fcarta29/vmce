build:
	TAG=`git rev-parse --short=8 HEAD`; \
	docker build -f deploy.dockerfile -t fcarta29/psolabs-deploy:$$TAG .; \
	docker tag fcarta29/psolabs-deploy:$$TAG fcarta29/psolabs-deploy:latest

clean:
	docker stop psolabs-deploy
	docker rm psolabs-deploy

rebuild: clean build

push:
	TAG=`git rev-parse --short=8 HEAD`; \
	docker push fcarta29/psolabs-deploy:$$TAG; \
	docker push fcarta29/psolabs-deploy:latest


run:
	docker run --name psolabs-deploy --mount type=bind,source=$(shell pwd)/data,target=/home/data -td fcarta29/psolabs-deploy:latest
	docker exec -it psolabs-deploy bash -l

start:
	docker start psolabs-deploy

stop:
	docker stop psolabs-deploy

join:
	docker exec -it psolabs-deploy bash -l

default: build
