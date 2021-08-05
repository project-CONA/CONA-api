#!/usr/bin/env bash

cd $REPOSITORY

APP_NAME=cona-api

CURRENT_PID=$(pgrep -f $APP_NAME)

if [ -z $CURRENT_PID ]
then
        echo "> nothing to terminate"
else
        echo "> kill -9 $CURRENT_PID"
        kill -15 $CURRENT_PID
        sleep 5
fi

echo "> $REPOSITORY"

nohup docker build -t cona-api:latest .
nohup if [ $(docker ps -aq -f "name=cona-api") ]; then docker stop "$(docker ps -aq -f "name=cona-api")"; fi
nohup if [ $(docker ps -aq -f "name=cona-api") ]; then docker rm "$(docker ps -aq -f "name=cona-api")"; fi
nohup docker run -d -p 8080:8080 -v $(pwd):/web/api --name cona-api cona-api &

