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
nohup docker build -t cona-api:latest . > /dev/null 2> /dev/null < /dev/null &
nohup docker run -d -p 8080:8080 -v $(pwd):/web/api --name cona-api cona-api > /dev/null 2> /dev/null < /dev/null &
