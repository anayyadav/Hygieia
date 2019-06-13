cat > $PROP_FILE <<EOF
#Database Name
dbname=${HYGIEIA_API_ENV_SPRING_DATA_MONGODB_DATABASE:-dashboarddb}
#Database HostName - default is localhost
dbhost=${MONGO_HOST:-10.0.1.1}
#Database Port - default is 27017
dbport=${MONGO_PORT:-27017}
#Database Username - default is blank
dbusername=
#${HYGIEIA_API_ENV_SPRING_DATA_MONGODB_USERNAME:-dashboarduser}
#Database Password - default is blank
dbpassword=
#${HYGIEIA_API_ENV_SPRING_DATA_MONGODB_PASSWORD:-dbpassword}
#Collector schedule (required)
aws.cron=0 0/1 * * * *
# AWS ValidTag Key - To look for tags that you expect on your resource
#aws.validTagKey[0]=RESOURCE#
aws.validTagKey[0]=
# AWS Proxy Host
aws.proxyHost=
# AWS Proxy Port
aws.proxyPort=
# AWS Non Proxy
aws.nonProxy=
#aws_secret_access_key={YOUR_SECRET_ACCESS_KEY
# AWS Profile to be used, if any
#aws.profile=rajkumar
aws.profile=default
#aws.region=US East (N. Virginia)
aws.region=
[default]
aws_access_key_id=
aws_secret_access_key=
EOF
echo "
===========================================
Properties file created `date`:  $PROP_FILE
Note: passwords hidden
===========================================
`cat $PROP_FILE |egrep -vi password`
 "

exit 0
