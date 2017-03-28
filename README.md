# OCA

Exercises for Oracle Certified Associate Java SE Programmer I

## Compile examples

```
gradle -Pchapter=chapter1 -PclassName=MyJavaClass runApp
```

## Debugging examples

```shell
export SOURCEPATH="src/main/java"
export BUILDPATH="build/src/main/java"
jdb -sourcepath $SOURCEPATH -classpath $BUILDPATH MyJavaClass
```

## TODO

- http://docs.oracle.com/javase/tutorial/java/IandI/QandE/inherit-questions.html
