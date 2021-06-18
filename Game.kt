fun main() {
    val name = "Madrigal"
    var healthPoint = 80
    var isBlessed = false

    if (healthPoint == 100){
        println(name + "健康狀態極佳")
    } else if(healthPoint >= 90){
        println(name + "有一些小擦傷")
    } else if(healthPoint >= 75){
        if (isBlessed){
            println(name + "雖有一些傷口，但恢復很快")
        } else{
            println(name + "有一些傷口")
        }
    } else if(healthPoint >= 15){
        println(name + "嚴重受傷")
    } else{
        println(name + "情況不妙")
    }
}