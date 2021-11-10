plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    id("org.jetbrains.kotlin.plugin.noarg") version Vers.kotlin
}

repositories {
    mavenCentral()
    maven(url = "https://repo.spring.io/milestone/")
    maven {
        url = uri("http://oss.jfrog.org/artifactory/oss-snapshot-local/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    implementation(Libs.kotlinStdlib)
    implementation(Libs.kotlinReflect)
    implementation(Libs.kotlinJdk8)
    runtimeOnly(Libs.jaxb)

    implementation(Libs.swagger)
    implementation(Libs.swaggerUi)
    implementation(Libs.jacksonKotlin)

    implementation(Libs.springWeb)

    testImplementation(Libs.springTest) {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
}
