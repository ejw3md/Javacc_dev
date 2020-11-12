pyParser.class : pyparser.jj ./com/test/variable.class
	javacc pyparser.jj
	javac *.java

./com/test/variable.class : ./com/test/variable.java
	javac ./com/test/Variable.java

clean:
	rm *.java
	rm *.class
	rm ./com/test/*.class
