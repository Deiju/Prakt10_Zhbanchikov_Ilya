class Formula(private var Volume_Vin:Int):Computer() {
    override fun base():Double{
        return ((0.1*Base)+volume)+0.5*Volume_Vin
    }
    override fun Info() {
        println("Название процессора: $name Тактовая частота:$Base Объём оперативной памяти: $volume")
    }
    fun Get_Volume_Vin():Int{
        return Volume_Vin
    }
    fun Set_Volume_Vin(Volume_Vin: Int){
        this.Volume_Vin=Volume_Vin
    }
}