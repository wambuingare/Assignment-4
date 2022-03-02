fun main(){
    school()
    var w = "Hi,my name is Nancy and i am 24 years old"
    println(w)
    var v =j()
    println(v)
    var f = me("Muthoni")

}
fun school(){
    var name="Akirachix"
    println(name[0].toString()+name[2]+name[3])

}
fun sentence(name: String, age: Int):String{
    var w = name.toString() + age
    return w
}
fun j():Int{
    var txt ="computer"
    var v= txt.length
    return v
}
fun me (name: String){
    if(name=="Wambui")
        println("that is me")
    else
        println("i don't know who that is")
}