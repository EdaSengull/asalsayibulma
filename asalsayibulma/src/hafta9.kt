fun main() {
    println(asalsayimi(19))
}
fun asalsayimi(arama : Int):Unit {
    var sonuc: Int = 0
    for (x in 2 until arama) {
        sonuc = arama % x
        if (sonuc == 0){
            println("asal sayi degildir")
            break}
    }
    if(sonuc !=0)
        println("asaldır <3")
}
