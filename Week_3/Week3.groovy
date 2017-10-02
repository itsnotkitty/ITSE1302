// make one for each student?

Map<String,List<Integer>> jimGrades =[
    'Jim':[76,92,60,85,49,99]
]

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
        println "$k - $average - $letterGrade"
}

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
        println "$k - $average - $letterGrade"
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
        println "$k - $average - $letterGrade"
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
        println "$k - $average - $letterGrade"
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
    }       
        println "$k - $average - $letterGrade"
}
