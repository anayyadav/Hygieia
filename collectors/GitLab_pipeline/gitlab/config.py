import os
Gitlab_collector = {
        'GITLAB_SERVER': os.getenv("GITLAB_SERVER", "world"),
        'private_token': os.getenv("GITLAB_PRIVATE__TOKEN", "world"),
        'db_host': os.getenv("DB_HOST", "db"),
        'db_port': 27017
        }