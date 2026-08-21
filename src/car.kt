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
