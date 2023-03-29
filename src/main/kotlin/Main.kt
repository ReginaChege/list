import javax.management.MBeanRegistration


fun main(){
    //Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
    var person=("")
measurements()
Car()
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
//fun dinner(items:){
//    var item= listOf("coster","soup spoon","desert spoon","fork","napkin","plates","glass","wine","beer","desert")
//  var itemindex=

//}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun measurements(){
    var height= listOf(170,190,160,166,200)
    println(height.average())
    println( height.sum())
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun Car(){
 var carmilage= listOf(90987.89,23456.89,123455.89,876547.89)
     println( carmilage.average())
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
fun persons(name:String)