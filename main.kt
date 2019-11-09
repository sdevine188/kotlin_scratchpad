package Aquarium

fun main(args: Array<String>) {
//    build_aquarium()
//    create_simple_spice()

//    // for exercise with class book with inheritance ebook
//    print("my new ebook is ${new_ebook.title} by ${new_ebook.author}; word_count: ${new_ebook.current_word_count}\n")
//    new_ebook.read_page()
//    print("after reading a page, word_count is ${new_ebook.current_word_count}\n")

    // for exercise with abstract class and interface
//    make_fish()

    // for exercise, create and use data class
    make_decorations()
}

fun build_aquarium() {
    val my_aquarium = Aquarium(number_of_fish = 4)

    print("length: ${my_aquarium.length}\n" +
    "width: ${my_aquarium.width}\n" +
    "height: ${my_aquarium.height}\n")

    my_aquarium.height = 80
    print("height: ${my_aquarium.height} cm\n")

    print("volume: ${my_aquarium.volume} cm\n")
    print("number_of_fish: ${my_aquarium.number_of_fish}\n")


    var small_aquarium = Aquarium(width = 15, height = 30, length = 20)
    print("small aquarium has width: ${small_aquarium.width}, height: ${small_aquarium.height}, length: " +
            "${small_aquarium.length}, and water volume: ${small_aquarium.water_volume}, " +
            "number_of_fish: ${small_aquarium.number_of_fish}")
}


///////////////////////////////////////////////////////


// for exercise, create instance of simple_spice class
fun create_simple_spice() {

    var my_simple_spice = simple_spice()

    print("name: ${my_simple_spice.name}\n")
    print("spiciness: ${my_simple_spice.spiciness}\n")
    print("heat: ${my_simple_spice.heat}\n")

}

// for exercise, create spice_list and create get_spicy_spices function
var spice_list = mutableListOf(spice(name = "salt"), spice(name = "chili", spiciness = "hot"))

//fun get_spicy_spices(spice_list: List) {
//    var spicy_spices = spice_list.filter {it.heat > 5.0}
//    print("the spicy ones are: ${spicy_spices}")
//}


///////////////////////////////////////////////////////////////////////////////


// for exercise, create an instance of the ebook class
var new_ebook = ebook(title = "the moon is a harsh mistress", author = "heinlein")


//////////////////////////////////////////////////////////////////////////////////


// for exercise, create make_fish function that creates instance of shark and minnow classes
fun make_fish() {
    var new_shark = shark()
    var new_minnow = minnow()
    print("the new_shark is ${new_shark.color} color, and the new_minnow is ${new_minnow.color} color\n")

    new_shark.eat()
    new_minnow.eat()
}


//////////////////////////////////////////////////////////////////////////


fun make_decorations() {
    var d1 = decorations(rocks = "granite")
    println(d1)

    var d2 = decorations(rocks = "slate")
    println(d2)

    var d3 = decorations(rocks = "slate")
    println(d3)

    // data class objects have a .equals() method to check for equality
    println(d2.equals(d1))
    println(d2.equals(d3))

    var d4 = d3.copy()
    println(d3)
    println(d4)

    var d5 = decorations2(rocks = "crystal", wood = "wood", diver = "diver")
    println(d5)
    println(d5.rocks)
    println(d5.wood)
    println(d5.diver)

}
// create a data class
// note data class can only take val or var arguments, so you're forced to use the shorthand or assigning var as arg
// instead of the more traditional option of just having a named argument, and then assigning var in body from arg
// note that printing a data class object like in make_decorations() above, will print "decorations(rocks=granite)"
// whereas if you print a non-data class, you just get the memory address for the object, not the text of properties
data class decorations(var rocks: String) {}

data class decorations2(var rocks: String, var wood: String, var diver: String) {}
