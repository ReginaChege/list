import javax.management.MBeanRegistration

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun main(){
measurements()
Car("KVS 659V",90987.89)
    Car("KVS 659V",23456.89)
    Car("KVS 659V",123455.89)
    Car("KVS 659V",876547.89)

}
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
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
//fun personObject(name:String,age:Int,height:Double,weight:Double){
//var person= listOf("Regina",20,175.0,65.0)
//    var sortperson=person.
//}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun Car(registration:String,milage:Double,):Double{
 var carmilage= listOf(27900.9,290000.89,76890.76,500789.90,67890.534,12345.90,765489.90)
    return carmilage.average()
    println()
}