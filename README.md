## Description
This is a basic Jpa prooject put together while taking John Thompson's JPA course on Udemy.

I have also included usage of TestContainers so that tests can be made agains a dockerized Posgtres container

## Features
The project uses 

* Spring Boot JPA _(*)_
* Liquibase
* TestContainers

_(*) - configured for Postgres_




## Appendix

I work on windows. So to be able to run the Test Containers I installed the following.

* WSL 2 
* Docker Desktop

### WSL 2 installation on windows 11

Open up a command prompt as administrator in windows and install WSL 2 as 

```console  
 wsl --install
```
By default you will get an Ubuntu installation. You will have to restart Windows after the install. 

### Docker desktop installation

Full documentation on how to install Docker Desktop in Windows is available at [https://docs.docker.com/desktop/install/windows-install](https://docs.docker.com/desktop/install/windows-install/)
