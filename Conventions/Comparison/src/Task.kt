import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val firstDate = Calendar.getInstance()
        firstDate.set(year, month, dayOfMonth)
        val secondDate = Calendar.getInstance()
        secondDate.set(other.year, other.month, other.dayOfMonth)
        return firstDate.compareTo(secondDate)
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
