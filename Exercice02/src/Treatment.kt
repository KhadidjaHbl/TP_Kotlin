data class Treatment(
    val treatmentId: Long,
    val disease: String,
    val treatmentDescription: String,
    val treatmentDate: String,
    val booking: Booking
) {
}