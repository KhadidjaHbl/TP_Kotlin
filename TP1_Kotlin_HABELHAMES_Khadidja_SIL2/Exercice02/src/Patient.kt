class Patient(
    UserId: String,
    firstName: String,
    lastName: String,
    username: String,
    password: String,
    birthDate: String,
    adreess: String,
    gender: String,
    email: String,
    val weight: Float,
    val height: Int,
    val bloodType: String,
    val personalDisease: String
) :
    User(UserId, firstName, lastName, username, password, birthDate, adreess, adreess, email) {
}
