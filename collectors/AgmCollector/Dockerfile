FROM ubuntu:latest

RUN apt-get update && apt-get -y install cron 
RUN apt-get -y install python
RUN apt install -y python-pip
RUN pip install pymongo

# Copy agm-cron file to the cron.d directory

COPY AGM/ /home/AGM

COPY agm-cron /etc/cron.d/agm-cron

# Give execution rights on the cron job
RUN chmod 0644 /etc/cron.d/agm-cron

# Apply cron job
RUN crontab /etc/cron.d/agm-cron

# Create the log file to be able to run tail
RUN touch /var/log/cron.log

# Run the command on container startup
CMD ["cron","-f"]
