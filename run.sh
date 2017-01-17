#!/bin/sh
javac -classpath ".:$CLASSPATH:/home/parimal/Downloads/seleniumlib/lib/*:/home/parimal/Downloads/seleniumlib/client-combined-3.0.1-nodeps.jar" HtmlUnitTest.java
java -classpath ".:$CLASSPATH:/home/parimal/Downloads/seleniumlib/lib/*:/home/parimal/Downloads/seleniumlib/client-combined-3.0.1-nodeps.jar" HtmlUnitTest
