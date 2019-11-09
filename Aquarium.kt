package Aquarium

// create an Aquarium class
class Aquarium(width: Int = 20, height: Int = 40, length: Int = 100, number_of_fish: Int? = null) {

    // set dimensions as properties
    var width: Int = width
    var height: Int = height
    var length: Int = length

    // create get_volume function
    fun get_volume(width: Int, height: Int, length: Int): Int {
        return((width * height * length) / 1000)
    }

    // set volume property
    var volume = get_volume(width = width, height = height, length = length)

    // set water_volume property
    var water_volume: Double = volume * .9

    // set number_of_fish property
    var number_of_fish: Int? = number_of_fish
    // video uses a constructor, which seems to allow for handling optional arguments
    // but the constructor syntax looks weird to me
    //constructor(number_of_fish: Int): this() {}


    // set volume property
    // this is the way the instructors recommend in the video, but i like the more explicit way above
//    var volume: Int
//        get() = width * height * length / 1000
//        set(value) {height = (value * 1000) / (width * length)}
}


/////////////////////////////////////////////////////////////////////////////////////////////


// for an exercise, create a simple_spice class
class simple_spice {

    // set initial properties
    var name = "curry"
    var spiciness = "mild"

    // create get_heat function
    fun get_heat(spiciness: String): Double {
        var heat = when{
            spiciness == "mild" -> 5.0
            else -> 0.0
        }
        return(heat)
    }

    // set heat property by using get_heat()
    var heat = get_heat(spiciness = spiciness)
}

// create spice class
class spice(name: String, spiciness: String = "mild") {

    // create get_heat function
    fun get_heat(spiciness: String): Double {
        var heat = when{
            spiciness == "mild" -> 5.0
            spiciness == "hot" -> 10.0
            else -> 0.0
        }
        return(heat)
    }

    // set heat property by using get_heat()
    var heat = get_heat(spiciness = spiciness)
}


///////////////////////////////////////////////////////////////////////////////


// for exercise, create book class
open class book(title: String, author: String) {

    // set title and author properties
    open var title = title
    open var author = author

    // initialize current_page at 1
    private var current_page = 1

    // create read_page() method
    open fun read_page() {
        current_page = current_page + 1
    }
}

// create ebook as a sub-class inheriting from book
open class ebook(title: String, author: String): book(title, author) {

    // create word_count property
    open var current_word_count = 0

    // over-ride read_page() method so that it
    override fun read_page() {
        current_word_count = current_word_count + 250
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////


// for exercise on abstract classes and interfaces, create abstract class aquarium_fish
// abstract classes can't be instantiated directly, but must be called via sub-classes
// abstract values, variables, or functions are not defined/implemented in class, but must be overrided in sub-class
abstract class aquarium_fish {
    open abstract var color: String
}
 // create sub-class shark, inheriting from aquarium_fish() class and fish_action interface
class shark: aquarium_fish(), fish_action {
     override var color = "gray"
     override fun eat() {
         print("shark ate a fish\n")
     }
}

// create sub-class shark, inheriting from aquarium_fish() class and fish_action interface
class minnow: aquarium_fish(), fish_action {
    override var color = "blue"
    override fun eat() {
        print("minnow ate some seaweed\n")
    }
}

// create fish_action interface, with generic eat function that will be overrode when implemented in classes
// interface is basically a collection of methods that you can expose to different
// you could also just implement methods for classes by writing functions for each class, but it could get repetitive
open interface fish_action {
    open fun eat()
}


