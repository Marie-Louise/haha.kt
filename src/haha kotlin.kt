import java.util.*

fun main() {

    var nameArray= arrayOf("marie","jeannine","belyse","celine")
    println(Arrays.toString(nameArray))

    name()
    sum()



}

fun name(){
    var theirArray= arrayOf("marie","jeannine","belyse","celine")
    println(Arrays.toString(theirArray))


    var nameArray=arrayOf("harare","mumbai","dodoma","jakarta")
    println(Arrays.toString(nameArray))
}
fun sum() {
    var numbersArray = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var num2 = 17
    var num5 = 78
    var sum = num2 + num5
    println(sum)
    println(numbersArray.indexOf(158))
    val sortedNums=numbersArray.sortedArray()
    println(Arrays.toString(sortedNums))

}
fun name(a:String):Int{
    var nameArray=arrayOf("harare","mumbai","dodoma")
    return a.length
}



