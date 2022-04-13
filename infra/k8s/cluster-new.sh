#!/bin/bash

k3d cluster create ultrasandbox --agents 1

# Adicionando repos helm
helm repo add bitnami https://charts.bitnami.com/bitnami

# Instalando keycloack
helm install auth-server bitnami/keycloak

# Instalando KubeApps
kubectl create namespace kubeapps
helm install kubeapps --namespace kubeapps bitnami/kubeapps

kubectl create --namespace default serviceaccount kubeapps-operator
kubectl create clusterrolebinding kubeapps-operator --clusterrole=cluster-admin --serviceaccount=default:kubeapps-operator

kubectl get --namespace default secret $(kubectl get --namespace default serviceaccount kubeapps-operator -o jsonpath='{range .secrets[*]}{.name}{"\n"}{end}' | grep kubeapps-operator-token) -o jsonpath='{.data.token}' -o go-template='{{.data.token | base64decode}}' && echo

sleep 5m

kubectl port-forward --namespace kubeapps service/kubeapps 8080:80 &