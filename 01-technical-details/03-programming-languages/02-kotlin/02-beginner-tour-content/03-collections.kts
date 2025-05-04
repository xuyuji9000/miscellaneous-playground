// 1. List

// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)


// Mutable list with explicat type declaration
val shapes1: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes1)

// casting
// create a read only view of a mutable list
val shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapes2Locked: List<String> = shapes2

// get the first element
println("the first item in the list is ${readOnlyShapes.first()}")

// get the number of items in a list
println("this list has ${readOnlyShapes.count()} items")

// to check that an item is in a list
println("circle" in readOnlyShapes)

// add and remove items from mutable list
shapes1.add("pentagon")
println(shapes1)
shapes1.remove("pentagon")
println(shapes1)

// 2. Set

// Read Only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println(readOnlyFruit)

// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
println(fruit)

// add and remove items from mutable set
fruit.add("dragonfruit")
println(fruit)

fruit.remove("dragonfruit")
println(fruit)
    