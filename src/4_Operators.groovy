def num1=5
def num2=3
//string interpolation

//Arithmetic operators

println "${num1}+${num2}= ${num1+num2}"
println num1+num2

println "${num1}+${num2}= ${num1+num2}"
println "${num1}-${num2}= ${num1-num2}"
println "${num1}*${num2}= ${num1*num2}"
println "${num1}/${num2}= ${num1/num2}"
println num1.intdiv(num2)  //divison
println "${num1}%${num2}= ${num1%num2}" //reminder

println "${num1}**${num2}= ${num1**num2}" //power

//Unary operator

def a=+3
println a

def b=-3
println b


def c=6
c=+c
println c
c++ //postfix
println c
++c //prefix
println c

//assert
assert 3+2==5  // return value only if the assertion is wrong
//assert 4+2==10

//assignment operator
//+=
def d=10
d=d+10
println d

def v=10
v+=10 // v+10  // short hand
println  v

//Relational operator

def x=10
def y=10

assert x==y
//assert x<y

//logical operator , && , || , !
println" true && true ->${true && true}"
println" true || false ->${true || false}"
println "!true ->${!true}"


//grouping operator
//controls precedence of evaulation in expression

def s=1
def e=2
def f=3
println s+e*f // * takes precedence