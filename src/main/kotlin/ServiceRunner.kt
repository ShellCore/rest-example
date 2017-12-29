import controller.ServiceController
import spark.Spark.*

class ServiceRunner {

    fun run() {
        port(9091)

        initControllers()
    }

    private fun initControllers() {
        ServiceController()
    }
}