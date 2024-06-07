package com.example.myquizapplication;

public class QuestionAnswer {

    public static String question[]={
        "Who invented Java Programming?",
            "Which component is used to compile, debug and execute the java programs?",
            "Which one of the following is not a Java feature?",
            "Which of these cannot be used for a variable name in Java?",
            "What is the extension of java code files?",
            "Which environment variable is used to set the java path?",
            "Which of the following is not an OOPS concept in Java?",
            "Which of these are selection statements in Java?",
            "Which of the below is not a Java Profiler?",
            "Which of the following is a superclass of every class in Java?"
    };

    public static String choices[][]={
            {"Guido van Rossum"," James Gosling","Dennis Ritchie","Bjarne Stroustrup"},
            {"JRE","JIT","JDK","JVM"},
            {"Object-oriented","Use of pointers","portable","Dynamic and extensible"},
            {"identifier & keyword","identifier","keyword","none of the mention"},
            {".js",".txt",".java",".class"},
            {"MAVEN_path","javaPATH","JAVA","JAVA_HOME"},
            {"Polymorphism","Polymorphism","Compilation","Encapsulation"},
            {"break","continue","for()","if()"},
            {"JProfiler","Eclipse Profiler","JVM","JConsole"},
            {" ArrayList","Abstract class","Object class","String"}
    };

    public static String correctAnswers[]={
            "James Gosling",
            "JDK",
            "Use of pointers",
            "keyword",
            ".java",
            "JAVA_HOME",
            "Compilation",
            "if()",
            "JVM",
            "Object class"
    };
}
