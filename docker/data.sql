create table employee(
                         containerId serial not null primary key ,
                         description varchar(255) not null,
                         weight numeric not null,
                         temperature numeric not null,
                         humidity numeric not null,
                         airPressure numeric not null,
                         acceleration numeric not null);