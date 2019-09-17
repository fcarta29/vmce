build:
	TAG=`git rev-parse --short=8 HEAD`; \
	docker build -f demos.dockerfile -t fcarta29/production-ready-applications-deploy:$$TAG .; \
	docker tag fcarta29/production-ready-applications-deploy:$$TAG fcarta29/production-ready-applications-deploy:latest

clean:
	docker stop pra-deploy
	docker rm pra-deploy

rebuild: clean build

push:
	TAG=`git rev-parse --short=8 HEAD`; \
	docker push fcarta29/production-ready-applications-deploy:$$TAG; \
	docker push fcarta29/production-ready-applications-deploy:latest

run:
	docker run --name pra-deploy --mount type=bind,source=$(shell pwd)/data,target=/home/data -td fcarta29/production-ready-applications-deploy:latest
	docker exec -it pra-deploy bash -l
stop:
	docker stop pra-deploy
join:
	docker exec -it pra-deploy bash -l

default: build
