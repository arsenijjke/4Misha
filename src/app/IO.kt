package app

import domain.Encryptor

class IO(private val inputString: String) : Encryptor {

    override fun encryptString(): String {
        var result: Char
        val sb = StringBuilder()
        for(char in inputString) {
            result = char
            result += 3
            sb.append(result)
        }
        return sb.toString()
    }

    override fun toString(): String {
        return "Your string was: $inputString \nAfter encryption your string is: ${encryptString()}"
    }
}