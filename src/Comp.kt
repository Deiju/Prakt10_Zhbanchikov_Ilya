fun main()=try{
    var comp1=Formula(1000)
    print("Название процессора:")
    comp1.name= readln()
    print("Тактовая частота:")
    comp1.Base=readln()!!.toDouble()
    print("Объём оперативной памяти:")
    comp1.volume= readln()!!.toInt()
    comp1.Info()
    println(comp1.base())
    comp1.Set_Volume_Vin(600)
    comp1.Info()
    println(comp1.base())
}
catch (e:NumberFormatException){println("error")}