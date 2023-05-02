package singleton.billpugh

class Singleton private constructor() {
    // An instance attribute
    var data = 0

    companion object {
        // A private nullable instance variable
        @Volatile
        private var instance: Singleton? = null

        // Returns the singleton instance or creates a new one if it doesn't exist
        fun getInstance(): Singleton {
            return instance ?: synchronized(this) {
                instance ?: Singleton().also { instance = it }
            }
        }
    }
}
