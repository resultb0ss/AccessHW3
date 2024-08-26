fun main() {
    val rows = 4
    val cols = 4
    var num: Int = 0

    val array = Array(rows) { IntArray(cols)}
    for (row in array){
        for(j in row.indices){
            num++
            row[j] = num
        }

    }
    println(array.contentDeepToString())
}