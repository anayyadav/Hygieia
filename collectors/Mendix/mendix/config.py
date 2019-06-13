import os
Mendix_collector = {
        'username': os.getenv("MENDIX_USER", "world"),
        'apikey': os.getenv("MENDIX_KEY", "world"),
        'db_host': os.getenv("DB_HOST", "db"),
        'db_port': 27017
        }