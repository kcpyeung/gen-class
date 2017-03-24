# Shows how to call clojure from java.

Steps:

* `lein uberjar`
This compiles the clojure functions and packages a jar.

* `javac -cp target/uberjar/com.smellycat.Durian-0.1.0-SNAPSHOT-standalone.jar:$CLJ_HOME/clojure-1.7.0.jar Kevin.java`

This compiles the calling java class, Kevin

* `java -cp target/uberjar/com.smellycat.Durian-0.1.0-SNAPSHOT-standalone.jar:$CLJ_HOME/clojure-1.7.0.jar:. Kevin`

This invokes the calling java class, which in turn invokes the clojure function, to get the answer.

Does anyone remember what the question is?

