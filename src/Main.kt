//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    dataMateBank(2200.0 , deposit = 800 , withdrawal = 4000)

}
fun dataMateBank (balance : Double = 0.00,deposit : Int =0, withdrawal : Int = 0) {

    var balance : Double =balance
    var deposit : Int =deposit
    var withdrawal : Int = withdrawal

    if (balance==balance){
        println("Your available balance is R$balance")
    }

    if (deposit > 0) {
        balance+=deposit
        println("You have successfully deposited in to your account and new balance is R$balance")

    }else{
        println("Your deposit was unsuccessful please try again !!!")
    }
        if (withdrawal <= balance){
            balance-=withdrawal
            println("Withdrawal was successful and your new balance is R$balance")

        }else {
            println("You have insufficient funds, your available balance is R$balance")
        }


    }




