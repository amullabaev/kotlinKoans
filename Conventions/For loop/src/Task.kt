class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyDateIterator(this)
    }
}

class MyDateIterator(private val dateRange: DateRange): Iterator<MyDate> {

    var current: MyDate = dateRange.start

    override fun hasNext(): Boolean {
        return current <= dateRange.end
    }

    override fun next(): MyDate {
        val data = current
        current = current.nextDay()
        return data
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
