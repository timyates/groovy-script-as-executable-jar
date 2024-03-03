import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    // We're using Groovy
    groovy

    // We want an executable application
    application

    // We want to be able to bundle everything into a single JAR
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

// This is what we will run (using ./gradlew run, or in the executable jar)
application {
    mainClass = "App"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.groovy)
    implementation(libs.groovy.datetime)
}

// We'll use Spock for tests
testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useSpock("2.3-groovy-4.0")
        }
    }
}

tasks.withType<ShadowJar> {
    mergeGroovyExtensionModules()
}