plugins {
    `java-library`
    kotlin("jvm") version "1.9.21"
    `maven-publish`
}

group = "com.github.hydrohd.examplektlib"
version = "master-SNAPSHOT"

publishing {
    publications{
        create<MavenPublication>("examplektlib"){
            groupId = "com.github.hydrohd.examplektlib"
            artifactId = project.name
            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}