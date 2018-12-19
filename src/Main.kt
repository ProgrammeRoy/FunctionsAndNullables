fun main(args: Array<String>){
    //Nullables
    //Challenge
    val myFavoriteSong: String? = "Bohemian Rhapsody"

    fun printFavoriteSong(song :String?){
        println("myFavoriteSong: $song ")
    }
    printFavoriteSong(myFavoriteSong)


    var result : Int? = 10
    println("Result: $result")
    result = 30
    println("Result: $result")
    println(result+1)
    val newResult = result?.plus(5)
    println(newResult)

    var w : Int? = null
    if (w != null){
        w += 1
    }
    println(result!! + 1)

    //Challenge Nullables
    fun printNickname(nickname : String?){
        println("Your nickname is: ")
        //nickname?.let{println(nickname)}? : println("No nickname")
    }
    printNickname("Roy")
}