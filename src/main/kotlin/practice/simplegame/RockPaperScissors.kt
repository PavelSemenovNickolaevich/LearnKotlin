fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors");
    val gameChoice = getSomeChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice);

}

fun getSomeChoice(optionParam: Array<String>) = optionParam[(Math.random() * optionParam.size).toInt()]
fun getUserChoice(optionParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Please enter one is following:")
        for (item in optionParam) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter is valid choice!")
    }
    return userChoice;
}

fun printResult(userChoice: String, computerChoice: String) {
    val result: String
    if (userChoice == computerChoice) result = "Tie!"
    else if ((userChoice == "Rock" && computerChoice == "Scissors") ||
        (userChoice == "Scissors" && computerChoice == "Paper") ||
        (userChoice == "Paper" && computerChoice == "Rock")
    ) result = "Player Win!"
    else result = "Computer Win!"
    println("You chose: $userChoice. Computer chose: $computerChoice. $result")
}