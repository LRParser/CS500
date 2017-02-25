#!/bin/bash

jar -cvf cs500.war *
sudo cp cs500.war /var/resin/webapps/
