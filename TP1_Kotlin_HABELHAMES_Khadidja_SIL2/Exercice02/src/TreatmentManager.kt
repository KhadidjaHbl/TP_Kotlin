class TreatmentManager {

    fun addTreatment(treatment: Treatment) {
        DataSingleton.listTreatments.add(treatment)
    }

    fun getTreatmentByPatient(patient: Patient): MutableList<Treatment> {
        var list = DataSingleton.listTreatments.filter { it.booking.patient.equals(patient) }
        return list as MutableList<Treatment>
    }

    fun getLastTreatment(patient: Patient): Treatment {
        var listFiltred = getTreatmentByPatient(patient)
        var listTreatments = listFiltred.sortedByDescending { it.treatmentDate }
        return listTreatments.last()
    }
}