class Doctor(
    UserId: String,
    firstName: String,
    lastName: String,
    username: String,
    password: String,
    birthDate: String,
    adreess: String,
    gender: String,
    email: String,
    val speciality: String,
    val latitude: Double,
    val longitude: Double,
    val facebookPage: String
) :
    User(UserId, firstName, lastName, username, password, birthDate, adreess, adreess, email) {
}