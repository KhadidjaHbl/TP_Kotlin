fun main() {
    var patient1 = Patient(
        "1", "Khadidja", "Habelhames", "khadij", "123",
        "16-12-1999", "boumerdes", "Feminin", "hk_hab_el_hames@esi.dz", 53f, 166,
        "O+", "fievre"
    )
    var patient2 = Patient(
        "2", "Meriem", "draoui", "Meriemdr", "678",
        "02-03-1993", "blida", "Feminin", "Meriem22@gmail.com", 60f, 160,
        "B+", "Anemia"
    )
    var patient3 = Patient(
        "3", "bilal", "habelhames", "bilal", "999",
        "02-03-1986", "Tipaza", "Masculine", "BilalHbl@gmail.com", 75f, 185,
        "A-", "asthme"
    )

    var doctor1 = Doctor(
        "1", "Mohammed", "abdelah", "mohamedAb", "456",
        "01-08-1980", "alger", "Masculine", "mohamedAb@gmail.com", "", 1.23,
        12.4, "Mohammed Abdelah"
    )
    var doctor2 = Doctor(
        "2", "Omar", "Zidane", "zidaneOmar", "6709",
        "05-11-1982", "Tipaza", "Masculine", "OmarZidane@gmail.com", "", 2.56,
        15.7, "Mohammed Abdelah"
    )

    var rdv1 = Booking(1, "23-03-2021", "13:30", patient1, doctor1)
    var rdv2 = Booking(2, "26-03-2021", "10:00", patient2, doctor1)
    var rdv3 = Booking(3, "01-04-2021", "11:00", patient3, doctor2)
    var rdv4 = Booking(4, "02-04-2021", "14:30", patient1, doctor1)
    var rdv5 = Booking(5, "06-04-2021", "9:30", patient3, doctor2)
    var rdv6 = Booking(6, "09-04-2021", "10:30", patient2, doctor1)

    var treat1 = Treatment(1, "fievre", "this is the first treatment", "23-03-2021", rdv1)
    var treat2 = Treatment(2, "Anemia", "this is the second treatment", "26-03-2021", rdv2)
    var treat3 = Treatment(3, "asthme", "this is the third treatment", "01-04-2021", rdv3)
    var treat4 = Treatment(4, "fievre", "this is the fourth treatment", "02-04-2021", rdv4)
    var treat5 = Treatment(5, "Anemia", "this is the fifth treatment", "09-04-2021", rdv6)


    var data = DataSingleton
    DataSingleton.listPatients.add(patient1)
    DataSingleton.listPatients.add(patient2)
    DataSingleton.listPatients.add(patient3)

    DataSingleton.listDoctors.add(doctor1)
    DataSingleton.listDoctors.add(doctor2)

    BookingManager().addBooking(rdv1)
    BookingManager().addBooking(rdv2)
    BookingManager().addBooking(rdv3)
    BookingManager().addBooking(rdv4)
    BookingManager().addBooking(rdv5)
    BookingManager().addBooking(rdv6)

    println("\n")
    println("***** Tester les fonctions de BookingManager *****")

    println("la liste de tous les Rendez-Vous : ")
    for (it in DataSingleton.listRdv) {
        println("$it")
    }

    var list_book_pat: List<Booking> = BookingManager().getBookingByPatient(patient1)
    println("La liste des rdv de patient : ${patient1.firstName} ${patient1.lastName}")
    for (item in list_book_pat) {
        println("$item")
    }

    var list_book_doct: List<Booking> = BookingManager().getBookingByDoctor(doctor1)
    println("La liste des rdv de médecin : ${doctor1.firstName} ${doctor1.lastName}")
    for (item in list_book_doct) {
        println("$item")
    }

    println("\n")
    println("***** Tester les fonctions de TreatmentManager *****")

    TreatmentManager().addTreatment(treat1)
    TreatmentManager().addTreatment(treat2)
    TreatmentManager().addTreatment(treat3)
    TreatmentManager().addTreatment(treat4)
    TreatmentManager().addTreatment(treat5)

    println("la liste de tous les Traitements : ")
    for (it in DataSingleton.listTreatments) {
        println("$it")
    }

    var list_treat_pat: List<Treatment> = TreatmentManager().getTreatmentByPatient(patient2)
    println("La liste des traitements de patient : ${patient2.firstName} ${patient2.lastName}")
    for (item in list_treat_pat) {
        println("$item")
    }

    var list_treat_pat2: List<Treatment> = TreatmentManager().getTreatmentByPatient(patient3)
    println("La liste des traitements de patient : ${patient3.firstName} ${patient3.lastName}")
    for (item in list_treat_pat2) {
        println("$item")
    }

    var treatment1: Treatment = TreatmentManager().getLastTreatment(patient1)
    println("Le dernier traitement de patient : ${patient1.firstName} ${patient1.lastName} est ")
    println("$treatment1")

    var treatment2: Treatment = TreatmentManager().getLastTreatment(patient2)
    println("Le dernier traitement de patient : ${patient2.firstName} ${patient2.lastName} est ")
    println("$treatment2")

}