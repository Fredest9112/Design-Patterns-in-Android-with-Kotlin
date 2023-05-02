package singleton.doublecheckedlocked

class Singleton  //Constructor is private, no client can instantiate a Singleton object
private constructor() {
    //add a set data here
    //an instance attribute
    var data = 0

    companion object {
        //private reference to the one and only instance
        @Volatile
        private var uniqueInstance: Singleton? = null
        val instance: Singleton?
            //by adding the synchronized keyword to getInstance()
            get() {
                if (uniqueInstance == null) {
                    //we only synchronize the first time through
                    synchronized(Singleton::class.java) {
                        if (uniqueInstance == null) {
                            uniqueInstance = Singleton()
                        }
                    }
                }
                return uniqueInstance
            }
    }
}
