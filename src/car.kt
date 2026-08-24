class car(var balance: Double =0.00,var deposit: Double = 0.0,var withdrawal: Double = 0.0) {

    fun checkBalance() {

        if (balance == balance) {
            println("You balance is R$balance")
        }

    }


    fun depositMoney() {

        if (deposit > 0) {
            deposit += balance
            println("Your deposit was successful & your new balance is R$balance")

        } else {
            println("Your deposit was unsuccessful please try again !! ")
        }

    }


fun withdrawMoney() {

    if (withdrawal>0){
        withdrawal-=balance
        println("Withdrawal was successful & your new balance is R$balance")

    }else{
        println("Insufficient funds !!")
    }

    }

}
class week(private val days: Int=7) {

    fun daysOFtheWeek (){

        when(days){
            1 -> println("Day $days is Monday")

            2 -> println("Day $days is Tuesday")

            3 -> println("Day $days is Wednesday")

            4 -> println("Day $days is Thursday")

            5 -> println("Day $days is Friday")

            6 -> println("Day $days is Saturday")

            7 -> println("Day $days is Sunday")

        }

    }

    fun fourLoop () {

        /*print no from 1 to 3000*/

        for (i in 1.. 1000){
            println(i)
        }



    }

}

fun numbers () {

    var number = 1
    while ( number <= 100){
        println(number)
        number++
    }

}

class bankAccount (amount: Double,balance: Double,deposit: Double,withdrawal: Double,) {

    var balance =0.00

    fun deposit(amount: Double) {

        if(amount > 0) {
            balance += amount
            println("Deposited :$amount")

        }else{
            println("Invalid deposit")
        }
    }

    fun withdraw (amount : Double) {

        if (amount >= 0 && amount <= balance){
            balance =- amount
            println("Withdrawal was successful & your new balance is R$balance")

        }else {
            println("Insufficient funds ")
        }

    }
    fun checkBalance (){

        println("Your current balance is E$balance")

    }
}

class studentMarks {

    val marks = mapOf("gary" to 75, "wendy" to 27, "zakes" to 55, "sam" to 21)


fun displayMarks() {

    for ((name, mark) in marks) {
        println("$name:$mark")
    }
}
}

fun main (){

   val students = studentMarks()
    students.displayMarks()

}

class NumberOfMarks {

fun checkmarks() {


    while (true) {
        print("enter mark :")
        val marks = readlnOrNull()?.toIntOrNull()!!

        if (marks >= 75) {
            println("Excellent")

        } else if (marks >= 50) {
            println("Good")

        } else if (marks >= 30) {
            println("Average")

        } else {
            println("Fail")
        }
    }
}
}
