FROM postgres:latest
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=kristi2000
ENV POSTGRES_DB=parcel
COPY data.sql /docker-entrypoint-initdb.d
EXPOSE 5432