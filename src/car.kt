class car(var balance: Double =0.00,var deposit: Int = 0,var withdrawal: Int = 0) {


fun depositMoney(amount: Double){
    balance+=deposit
    if (balance > 0){
        println("successfully deposited")


    }else {
        println("deposit was unsuccessful")
    }

}
    fun widrawMoney (amount : Double) {
        balance-=withdrawal
        if (balance >= withdrawal){
            println("withrawal successful")

        }else{
            println("insufficient funds")
        }


    }

    fun checkBalnce(amount: Double) {

        println(balance)
    }

}
