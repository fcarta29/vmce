FROM fcarta29/mytiles-build:latest
MAINTAINER "Frank Carta <fcarta@vmware.com>"

# Copy Over the deployment folder
WORKDIR /home
COPY . .
