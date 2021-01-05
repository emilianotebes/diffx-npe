NullPointerException is thrown when you compare 2 instances of a case class and one of the instances has a null value and the other one has a valid string.

Steps to reproduce:
 1. create a case class with a string field
 2. create an instance of that class with that field null
 3. create another instance of that class with a valid value
 4. compare

Affected Version: 0.4.0

Run [ExampleSpec.scala](/src/test/scala/ExampleSpec.scala)