import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { o1, o2 ->
        if (o1 > o2) {
            -1
        } else if (o1 < o2) {
            1
        } else {
            0
        }
    })
    return arrayList
}
