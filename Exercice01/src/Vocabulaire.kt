import java.util.Random

class Vocabulaire(var list_Mots: MutableList<String>, var score: Int) {

    //cette fonction retourne un mot aléatoir de longueur l a partir de la liste des mots
    fun mot_aleat(l: Int): String {

        val Nouvelle_list = list_Mots.filter { it.length == l }
        val mot: String = Nouvelle_list.random()
        return mot
    }

    //cette fonction retourne une  longueur aléatoire a partir des longueurs des mots dans la liste
    fun longueur_aleat(): Int {
        var list_lenght = mutableListOf<Int>()
        for (it in list_Mots) {
            list_lenght.add(it.length)
        }
        val longueur: Int = list_lenght.random()
        return longueur
    }
}


fun main() {

    var score = 0
    var list = mutableListOf<String>(
        "hello", "one", "two", "three", "four", "banana", "Apple", "Watermelon", "Orange",
        "Strawberry", "Mango", "Apricot", "Avocado", "Peach", "carrot", "cucumber", "onions"
    )

    var voc = Vocabulaire(list, score)

    while (true) {

        val long_mot = voc.longueur_aleat()
        print("introduisez un mot de longueur = $long_mot \n")
        val word = readLine()!!
        println("vous avez introudit le mot : $word")

        if (word.length == long_mot) {
            var mot_alea = voc.mot_aleat(long_mot)
            println("le mot choisi aleatoirement est : $mot_alea")
            if (mot_alea.equals(word)) {
                score = score + 5
                println("Bravo !!!! Vous avez obtenu 5 points, le score total est : $score points")
            } else (println("Echec !!!! le score total est : $score points "))
        }

    }
}
