abstract class Computer:Info{
    var name:String=""
    var Base:Double=0.0
    var volume:Int=0
    open fun base():Double{
        return (0.1*Base)+volume
    }
    open fun info(){
        print("Название процессора: $name Тактовая частота:$Base Объём оперативной памяти: $volume")
    }
}