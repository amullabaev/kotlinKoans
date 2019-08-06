fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val personalInfo: PersonalInfo? = client?.personalInfo
    val email: String? = personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

data class Client(val personalInfo: PersonalInfo?)

data class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
