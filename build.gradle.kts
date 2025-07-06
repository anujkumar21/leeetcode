plugins {
    id("java")
}

group = "com.leetcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    reports {
        html.required.set(true) // (Default is true, but you can set explicitly)
        // Optionally, customize output folder:
        // html.outputLocation.set(layout.buildDirectory.dir("my-custom-report-folder"))

        junitXml.required.set(true) // (Default is true)
        // Optionally, customize XML folder:
        // junitXml.outputLocation.set(layout.buildDirectory.dir("my-custom-xml-folder"))
    }
}

tasks.register<Test>("runStairClimberTest") {
    description = "Runs only the StairClimberTest"
    group = "verification"

    useJUnitPlatform()

    // Filter to run only this test class
    include("**/StairClimberTest.class")


    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
}
