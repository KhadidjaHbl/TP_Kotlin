class BookingManager {

    fun addBooking(booking: Booking) {
        DataSingleton.listRdv.add(booking)
    }

    fun getBookingByPatient(pat: Patient): List<Booking> {
        var list= DataSingleton.listRdv.filter { it.patient.equals(pat) }
        return list
    }

    fun getBookingByDoctor(doct: Doctor): List<Booking> {
        var list= DataSingleton.listRdv.filter { it.doctor.equals(doct) }
        return list
    }
}