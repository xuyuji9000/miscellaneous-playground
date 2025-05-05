class Contact(
    val id   : Int,
    var email: String
) {
    fun printId() {
        println(id)
    }
}

// 1. Create instance
println("--- Create instance ---")
val contact = Contact(1, "mary@gmail.com")

// 2. access property
println("--- Access property ---")

println(contact.email)

contact.email = "jane@gmail.com"

println(contact.email)

// 3. member functions
println("--- Member functions ---")
contact.printId()


