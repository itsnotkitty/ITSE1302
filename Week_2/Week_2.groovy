// added printline Hello world
println "Hello World!"
  
/* Creating name constants
a Constant is a Value that never changes
these can be numeric constants which is an unamed number whose value is unchanging
or an string constant which is unchanign text */ 
class constant {
       static final String FIRST_NAME = "Eric"
       static final String LAST_NAME = "Gorski"
}

println (constant.FIRST_NAME)
println (constant.LAST_NAME)

/* testing of a leet number value.... who does that typing leet not 1337 
variables are named memory location whose content can vary over time */
int leet = 1337; 
println (leet)
// defining b
BigDecimal b = leet / 42
println (b) 

// to clarify b from non assigned numbers

println "seperation of variables from maths"
/* new Variable defined by Maths 
Data types are defined as 
"a particular kind of data item, as defined by the values it can take, the programming language used, or the operations that can be performed on it." 
examples include String, Int, Double, BigDecimal, etc...*/
double bleet = 31.8333333333

//The difference between variable and constants is simply, Variable can change, Constants can not 

//5 math problems using defined variables
println 4 * leet / 2 
println 8 * bleet / 2  
println bleet / leet
println ((bleet *leet)/ 2 - 42 + 808) 
println 1336 + 7331 / leet -1336

