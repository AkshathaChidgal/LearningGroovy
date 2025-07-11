//..
//1..10 - range 1 to 10 --Inclusive range
//1..<10 - Exclusive range
//'a'..'x' -Character range
//10..1 - Reverse order

//contains()

def numRange =1..10
println numRange.contains(5)  // o/op: true

//get()
println numRange.get(6) //Retirives the position's number

//getFrom() - print the lower value of the range
println numRange.getFrom()

//size()
println numRange.size() //sixe of the range


