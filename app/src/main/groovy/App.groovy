
String timestamp() {
    return new Date().format("yyyy-MM-dd HH:mm:ss")
}

println "${timestamp()} - hello world"
