# ide-agnostic-websphere-jaxrs-project

POC for websphere project where the repo contains no IDE specific configuration
files.

The following IDE's are able to generate configuration files for this project
from the `pom.xml` when imported as a maven project:
 - Intellij IDEA Ultimate 2016.2
 - Intellij IDEA Community 2016.2
 - Eclipse Java EE IDE for Web Developers Version: Neon.1a Release (4.6.1)

## Additional Configuration
Eclipse requires a few small project and workspace configuration changes.  
*Details coming soon.*

## Local Deployment
### Manual
 - `mvn clean package`
 - place generated `app.war` file into websphere's `/config/dropins` directory.
   
*More Coming soon.*

## Usage
Assumes default websphere port.
### curl/browser/postman
`http://localhost:9080/resource` -> `'hello I am resource'`

