import app.IO

fun main(args: Array<String>) {
    executeEncryption()
}

fun executeEncryption() {
    println("Enter string you want to encrypt")
    val input: String = readln()
    val io = IO(input)
    println(io.toString())
}


