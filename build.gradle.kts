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
