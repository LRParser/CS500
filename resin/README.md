
Local dev instructions:

To deploy, create a .war and copy it to the "webapps" folder of the resin install:

	jar -cvf cs500.war *
	sudo cp cs500.war /var/resin/webapps/

Browse to:
http://localhost:8080/cs500/index.html

For local dev (e.g., not on tux):
You need to ensure to copy Postgres driver to classpath. To do this from the parent directory, do:
	../lib/postgresql-42.0.0.jar ~/resin-4.0.50/webapp-jars/
so Postgres JDBC driver is available

