// Created map for each student following structure used in class, assigned each student a grade

Map<String,List<Integer>> jimGrades =[
    'Jim':[76,92,60,85,49,99]
]
/** loop designed to average strudents grades, had trouble with else if statment when testing. Realized that the average was a value I had left off
of course there would be an issue when the resulting average had no value in which to be assigned
honeslty not sure if there is a loop here, I have a control structure, but what makes it a loop if this is one? will be submitted as is so it's not late
 **/
jimGrades.each { k,v ->
    BigDecimal average = v.sum() / v.size()
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else if (average < 60){
        letterGrade = 'F'
    } else if (average >= 80 && average <= 89.99) {
        letterGrade = 'B'
    } else if (average >= 70 && average <= 79.99) {
        letterGrade = 'C'
    } else if (averager >= 60 && average <= 69.99){
        letterGrade = 'D'
    }       
    // wait I need to print the individual grades well it follows suit the - $v - should do that, i assume v is for value, what is k?
        println "$k - $v - $average - $letterGrade"
}

// there has to be a better way to do this than copy pasting and assigning new values if so I missed it 
Map<String,List<Integer>> bobGrades =[
    'Bob':[89,92,0,90,100,73]
]

bobGrades.each { k,v ->
    BigDecimal average = v.sum() / v.size()
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else if (average < 60){
        letterGrade = 'F'
    } else if (average >= 80 && average <= 89.99) {
        letterGrade = 'B'
    } else if (average >= 70 && average <= 79.99) {
        letterGrade = 'C'
    } else if (averager >= 60 && average <= 69.99){
        letterGrade = 'D'
    }       
        println "$k - $v - $average - $letterGrade"
}

Map<String,List<Integer>> robouteGrades =[
    'Roboute':[78,62,70,55,79,80]
]

robouteGrades.each { k,v ->
    BigDecimal average = v.sum() / v.size()
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else if (average < 60){
        letterGrade = 'F'
    } else if (average >= 80 && average <= 89.99) {
        letterGrade = 'B'
    } else if (average >= 70 && average <= 79.99) {
        letterGrade = 'C'
    } else if (averager >= 60 && average <= 69.99){
        letterGrade = 'D'
    }       
        println "$k - $v - $average - $letterGrade"
}

Map<String,List<Integer>> mortyGrades =[
    'Morty':[89,90,87,76,41,100]
]

mortyGrades.each { k,v ->
    BigDecimal average = v.sum() / v.size()
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else if (average < 60){
        letterGrade = 'F'
    } else if (average >= 80 && average <= 89.99) {
        letterGrade = 'B'
    } else if (average >= 70 && average <= 79.99) {
        letterGrade = 'C'
    } else if (averager >= 60 && average <= 69.99){
        letterGrade = 'D'
    }       
        println "$k - $v - $average - $letterGrade"
}

Map<String,List<Integer>> destroGrades =[
    'Destro the scourge of life':[16,22,4,15,39,32]
]

destroGrades.each { k,v ->
    BigDecimal average = v.sum() / v.size()
    if (average >= 90 && average <= 100) {
        letterGrade = 'A'
    } else if (average < 60){
        letterGrade = 'F'
    } else if (average >= 80 && average <= 89.99) {
        letterGrade = 'B'
    } else if (average >= 70 && average <= 79.99) {
        letterGrade = 'C'
    } else if (averager >= 60 && average <= 69.99){
        letterGrade = 'D'
    }       // he is the scourge of life
        println "$k - $v - $average - $letterGrade - Student comment -Destro has no need for good Grades!"
}