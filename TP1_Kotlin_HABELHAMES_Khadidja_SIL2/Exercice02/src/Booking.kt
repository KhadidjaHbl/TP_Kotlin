data class Booking(
    val bookingId: Long,
    val bookingDate: String,
    val bookingTime: String,
    val patient: Patient,
    val doctor: Doctor
) {
}