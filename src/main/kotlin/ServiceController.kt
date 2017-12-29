import spark.Request
import spark.Response
import spark.Spark.*

class ServiceController {

    init {
        get("/hello", {
            req: Request?, res: Response? -> "Hello Spark!!!"
        })
    }
}