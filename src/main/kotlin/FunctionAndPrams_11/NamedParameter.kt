package FunctionAndPrams_11

fun main() {

    //2nd param is optional
    //it will take default value if search engine name not provided

    //method 1
    searchQuery("home furniture")

    //method 2
    searchQuery("home furniture", "bing")

    //named param
    //order doesn't mater
    searchQuery(searchEngine = "Yahoo", search = "Common home docor techniques")
}

fun searchQuery(search: String, searchEngine: String = "google") {
    println("Searching for $search on $searchEngine")
}