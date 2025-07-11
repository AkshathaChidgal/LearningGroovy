//Exception
//abnormal condition or event

//Errors in code
//External factors
//Invalid input


//def a=5,b=0
//def result=a/b
//println result

//try catch
//try {
//    // Protected code
//} catch (ExceptionName e1) {
//    // Catch block
//}

//try {
//    def a=5,b=0
//    def result=a/b
//    println result
//} catch (Exception e) {
//    println "cannot divide by zero"
//}


//def parseNumber(input) {
//    try {
//        int number = input.toInteger()
//        println "Parsed number: $number"
//    } catch (NumberFormatException e) {
//        println "Caught NumberFormatException: '${input}' is not a valid number"
//    }
//}

//// Test cases
//parseNumber("123")     // Valid
//parseNumber("abc")     // Invalid, will go to catch block
