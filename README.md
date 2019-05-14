# ThreadDumpAnalyzer
-------------------
To analyze thread dump created by the command jstack, jcmd or other tools like ( visual VM )

## How to use it
----------------
in pom.xml search for mainClass. Modify argument in arguments section. Put the dump file name along with path here.
Then run 
```
mvn exec:java
```
If everything is fine, it will create csv files in current directory. First one is named like ThreadList<yyyy-MM-dd hh-mm-ss>.csv and LockedThreadList<yyyy-MM-dd hh-mm-ss>.csv ( if there is any locked thread ).
  
## Reference
------------
https://github.com/kakao/java_thread_dump_analyzer
