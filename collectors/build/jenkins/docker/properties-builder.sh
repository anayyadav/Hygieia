#!/bin/bash

# mongo container provides the HOST/PORT
# api container provided DB Name, ID & P
cat > $PROP_FILE <<EOF
#Database Name
dbname=${DB_NAME:-dashboard}
#Database HostName - default is localhost
dbhost=${DB_HOST:-db}
#Database Port - defaultis 27017
dbport=${DB_PORT:-27017}
#Database Username - default is blank
dbusername=
#${HYGIEIA_API_ENV_SPRING_DATA_MONGODB_USERNAME:-dashboarduser}
#Database Password - default is blank
dbpassword=
#${HYGIEIA_API_ENV_SPRING_DATA_MONGODB_PASSWORD:-dbpassword}
#Collector schedule (required)
jenkins.cron=${JENKINS_CRON:-0 0/1 * * * *}
#The page size
jenkins.pageSize=${JENKINS_PAGE_SIZE:-1000}
# The folder depth - default is 10
jenkins.folderDepth=${JENKINS_FOLDER_DEPTH:-10}
#Jenkins server (required) - Can provide multiple
jenkins.servers[0]=${JENKINS_SERVER}
#jenkins.niceNames[0]=[YourJenkins]
#jenkins.environments[0]=[DEV,QA,INT,PERF,PROD]
#Another option: If using same username/password Jenkins auth - set username/apiKey to use HTTP Basic Auth (blank=no auth)
jenkins.usernames[0]=${JENKINS_USERNAME}
jenkins.apiKeys[0]=${JENKINS_APIKEY}
jenkins.searchFields[0]= options.jobName
jenkins.searchFields[1]= niceName
EOF

echo "
===========================================
Properties file created `date`:  $PROP_FILE
Note: passwords & apiKey hidden
===========================================
`cat $PROP_FILE |egrep -vi 'password|apiKey'`
"

exit 0