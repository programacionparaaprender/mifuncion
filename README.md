

### herramientas a instalar
https://learn.microsoft.com/es-es/azure/azure-functions/functions-run-local?tabs=v4%2Cwindows%2Cjava%2Cportal%2Cbash#v2

### comandos a ejecutar para la creación del function
https://learn.microsoft.com/es-es/azure/azure-functions/create-first-function-cli-java?tabs=bash%2Cazure-cli%2Cbrowser

### comandos
mvn archetype:generate -DarchetypeGroupId=com.microsoft.azure -DarchetypeArtifactId=azure-functions-archetype -DjavaVersion=11

### si da error con el tema de los test
https://stackoverflow.com/questions/39730203/report-not-being-generated-with-maven-surefire-report-plugin
# agregar al pom
<plugin>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.10</version>
            <configuration>
                <useFile>false</useFile>
            </configuration>
        </plugin>

# ´´´
mvn surefire-report:report-only
´´´
# ´´´
mvn clean install -DskipTests
´´´
# ´´´
mvn azure-functions:run
´´´