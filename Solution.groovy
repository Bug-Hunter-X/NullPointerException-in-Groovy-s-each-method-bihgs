```groovy
def myMethod(List<String> list) {
  // Solution 1: Null check
  if (list != null) {
    list.each { element ->
      println element.toUpperCase()
    }
  } else {
    println "List is null"
  }

  // Solution 2: Safe navigation operator
  list?.each { element ->
    println element.toUpperCase()
  }
}

myMethod(null)
myMethod(['apple', 'banana', 'cherry'])