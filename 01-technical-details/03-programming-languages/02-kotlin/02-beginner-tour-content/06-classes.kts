class Contact(
    val Id   : Int,
    var email: String
)

val contact = Contact(1, "mary@gmail.com")

println(contact.email)

contact.email = "jane@gmail.com"

println(contact.email)



