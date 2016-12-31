package one.codehz.soft

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class StudentInformationManagementSystemApplication

fun main(args: Array<String>) {
    SpringApplication.run(StudentInformationManagementSystemApplication::class.java, *args)
}
