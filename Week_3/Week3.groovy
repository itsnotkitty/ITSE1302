Map<String,List<Integer>> studentGrades =[
    'Jim':[76,92,60,85,49,99]
    'JMI':[70,82,40,75,99,10]
    'MJI':[58,85,87,76,57,96]
    'IJM':[10,11,12,13,14,100]
    'Mij':[99,99,99,99,99,0]
]

studentGrades.each { k,v ->
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
