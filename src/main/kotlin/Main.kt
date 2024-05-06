
class WebpageCounter {
    private val webpageVisits: MutableMap<String, Int> = mutableMapOf()

    fun visitWebpage(webpage: String) {
        val currentCount = webpageVisits[webpage]
        if (currentCount == null) {
            webpageVisits[webpage] = 1
        } else {
            webpageVisits[webpage] = currentCount + 1
        }
    }

    fun getVisitCount(webpage: String): Int {
        return webpageVisits[webpage] ?: 0
    }
}

fun main() {
    val webpageCounter = WebpageCounter()


    webpageCounter.visitWebpage("home")
    webpageCounter.visitWebpage("about")
    webpageCounter.visitWebpage("home")
    webpageCounter.visitWebpage("home")


    println("Visit count for 'home': ${webpageCounter.getVisitCount("home")}")
    println("Visit count for 'about': ${webpageCounter.getVisitCount("about")}")

}


