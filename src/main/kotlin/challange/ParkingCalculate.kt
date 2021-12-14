package challange

class ParkingCalculate {
    /*
       the fee is calculated based on the following price structure.
       the first 5 hours are billed at $1 per hour.
       after that, each hour is billed at $0.5 per hour.
       for each 24 hours, ther is a flat fee of $15
        this means that, for example, if a car parked for 26 hours, the bill should be 16.0 because
         it was parked for 24 hours plus 2 additional hours.
        */

    private fun parking(hours: Double): Double {
        val totalHours = hours
        var total = 0.0

        if (hours > 24) {
            val totalDays = (hours % 24) * 15
            total += totalDays
        }
        if (totalHours < 5) {
            total = totalHours * 1.0
        } else if (totalHours.toInt() in 5..24) {
            total = 5.0 + ((totalHours - 5.0) * 0.5)
        } else {
            total = 15.0 + (totalHours % 24 * 0.5)
        }
        return total
    }

    fun main() {
        println("Parking Calculate: " + parking(72.0))
    }
}