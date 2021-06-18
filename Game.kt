fun main() {
    val name = "Madrigal"
    var healthPoints = 80
    var isBlessed = true
    val isImmortal = false

    if (isBlessed && healthPoints > 50 || isImmortal){
        println("光環")
    } else {
        println("空無一物")
    }
    if (healthPoints == 100){
        println(name + "健康狀態極佳")
    } else if(healthPoints >= 90){
        println(name + "有一些小擦傷")
    } else if(healthPoints >= 75){
        if (isBlessed){
            println(name + "雖有一些傷口，但恢復很快")
        } else{
            println(name + "有一些傷口")
        }
    } else if(healthPoints >= 15){
        println(name + "嚴重受傷")
    } else{
        println(name + "情況不妙")
    }
}