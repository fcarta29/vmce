#!/bin/bash

kubectl create namespace psolabs-vmce
kubectl label namespace psolabs-vmce istio-injection=enabled --overwrite=true

kubectl apply -n psolabs-vmce -f vmce/platform/kube/psolabs-vmce.yaml
kubectl apply -n psolabs-vmce -f vmce/networking/psolabs-vmce-networking-istio.yaml
kubectl apply -n psolabs-vmce -f vmce/networking/psolabs-vmce-networking-destination-rules.yaml
