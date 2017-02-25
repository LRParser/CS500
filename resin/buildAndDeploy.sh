#!/bin/bash
TARGETDIR=/Users/josephheenan/resin-4.0.50/webapps/
jar -cvf cs500.war *
sudo cp cs500.war $TARGETDIR
