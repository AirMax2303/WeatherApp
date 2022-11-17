package adapters

data class WeatherModel(
    val city: String,
    val time: String,
    val conditiond: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val umageUrl: String,
    val hours: String,
)
