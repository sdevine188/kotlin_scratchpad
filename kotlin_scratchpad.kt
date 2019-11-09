// note that main() is always run in a .kt script, and so does not need to be called
fun main(args: Array<String>) {
    print("Hello World")
}


/////////////////////////////////////////////////////////////////////////////////////


// code examples to run in REPL

// create function
fun can_fit_more_fish(tank_size: Double, current_fish_size_list: MutableList<Int>, new_fish_size: Int = 2,
                      has_decorations: Boolean = true, print_any_type: Any = "print_any_placeholder"): Boolean {
    print("\n" + print_any_type + "\nend_message\n")
    var max_fish_size_for_tank = tank_size * .8
    var total_current_fish_size = current_fish_size_list.sum()
    if(new_fish_size + total_current_fish_size > max_fish_size_for_tank) {
        return(false)
    } else {
        return(true)
    }
}

// call function
can_fit_more_fish(tank_size = 100.0, current_fish_size_list = mutableListOf(10, 20, 30), new_fish_size = 10)
can_fit_more_fish(tank_size = 100.0, current_fish_size_list = mutableListOf(10, 20, 30), new_fish_size = 30,
    print_any_type = "this is a new message to print")


/////////////////////////////////////////////////////////////////////////////////////


// create list as var (note var can be changed, value can only be defined once)
var presidents = listOf("obama", "clinton", "roosevelt", "lincoln")
presidents
presidents[1]
presidents[1] = "test"

// note that regular lists are immutable and can't be changed - so mutableList is better
var presidents = mutableListOf("obama", "clinton", "roosevelt", "lincoln")
print(presidents)
presidents[1] = "test"
presidents


/////////////////////////////////////////////////////////////////////////////////////


// sort list like arrange
presidents.sorted()
presidents.sortedDescending()


////////////////////////////////////////////////////////////////////////////////////

// filter list
presidents.filter{it in listOf("obama", "lincoln")}
presidents.filter{(it in listOf("obama", "lincoln")) && (it != "lincoln")}
presidents.filter{it.contains("i")}


///////////////////////////////////////////////////////////////////////////////////////


// concatenate from a list using joinToString
presidents.joinToString("-"){it}
presidents.filter{it.contains("i")}.joinToString("-"){it}


//////////////////////////////////////////////////////////////////////////////////////////

// sum all items in list
var value_list = mutableListOf(1, 2, 3)
value_list.sum()

// summarize list by getting total character length
presidents.sumBy { it.length }


/////////////////////////////////////////////////////////////////////////////////////


// when() is like case_when
// note it can be called with an argument that is then passed to the conditional statements
// or it can be called without an argument, in which case the conditional must be fully specified
var x = 2
var y = 3

when(x) {
    1 -> "value equals 1"
    2 -> "value equals 2"
    in listOf(3, 4, 5) -> "value is between 3 and 5"
    else -> "otherwise"
}
when(y) {
    1 -> "value equals 1"
    2 -> "value equals 2"
    in listOf(3, 4, 5) -> "value is between 3 and 5"
    else -> "otherwise"
}

// use when without providing an argument - acts like series of if/else statements
when {
    x == 1 -> "the value is 1"
    x == 2 -> "the value is 2"
    else -> "otherwise"
}


/////////////////////////////////////////////////////////////////////////////////////


// for loop
var x = 10
for(i in 1..10) {
    print(i)
}

var presidents = listOf("obama", "clinton", "roosevelt", "lincoln")
for(current_president in presidents) {
    print("\n" + current_president)
}


/////////////////////////////////////////////////////////////////////////////////////


// use string templates like str_glue
for(current_president in presidents) {
    print("\n" + "the current president is $current_president")
}
for(current_president in presidents) {
    print("\n" + "the current president is ${current_president + "... i wish"}")
}


/////////////////////////////////////////////////////////////////////////////////////


// use let lambda function sort of like magrittr pipe
// .let takes the output of the previous expression and makes it available for manipulation as 'it'
presidents[1].let{it + " and lewinsky"}.let{it.length}.let{it + 20}


/////////////////////////////////////////////////////////////////////////////////////


// create class
class Person {
    var name = "Anne"
    var age = 32
}
val a = Person()
val b = Person()
a.age
b.age
println("${a.age} ${b.age}")
a.age = 42
a.age

class Person_blank(val name: String, var age: Int)
var c = Person_blank("steve", 35)
c.age
c.name
c.age = 37
c.age


/