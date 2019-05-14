# ThreadDumpAnalyzer
====================
To analyze thread dump created by the command jstack, jcmd or other tools like ( visual VM )

## How to use it
----------------
in pom.xml search for mainClass. Modify argument in arguments section. Put the dump file name along with path here.
Then run 
```
mvn exec:java
```
## Reference
------------
https://github.com/kakao/java_thread_dump_analyzer
