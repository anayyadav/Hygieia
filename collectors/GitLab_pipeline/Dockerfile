FROM ubuntu:latest

RUN apt-get update && apt-get -y install cron 
RUN apt-get -y install python
RUN apt install -y python-pip
RUN pip install pymongo

# Copy gitlab-cron file to the cron.d directory

COPY gitlab/ /home/gitlab

COPY gitlab-cron /etc/cron.d/gitlab-cron

# Give execution rights on the cron job
RUN chmod 0644 /etc/cron.d/gitlab-cron

# Apply cron job
RUN crontab /etc/cron.d/gitlab-cron

# Create the log file to be able to run tail
RUN touch /var/log/cron.log

# Run the command on container startup
CMD ["cron","-f"]
