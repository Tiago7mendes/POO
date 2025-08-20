package ConversaoDeUnidadesDeTemperatura;

public class ConversaoDeUnidadesDeTemperatura {

    public static double celsiusFahrenheit(double celsius) {
        return (9.0 * celsius / 5.0) + 32.0;
    }

    public static double celsiusKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusReaumur(double celsius) {
        return celsius * 4.0 / 5.0;
    }

    public static double celsiusRankine(double celsius) {
        return celsiusKelvin(celsius) * 1.8;
    }

    public static double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static double fahrenheitKelvin(double fahrenheit) {
        return celsiusKelvin(fahrenheitCelsius(fahrenheit));
    }

    public static double fahrenheitReaumur(double fahrenheit) {
        return celsiusReaumur(fahrenheitCelsius(fahrenheit));
    }

    public static double fahrenheitRankine(double fahrenheit) {
        return fahrenheit + 459.67; // o unico que tive que pesquisar
    }

    public static double kelvinCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinFahrenheit(double kelvin) {
        return celsiusFahrenheit(kelvinCelsius(kelvin));
    }

    public static double kelvinReaumur(double kelvin) {
        return celsiusReaumur(kelvinCelsius(kelvin));
    }

    public static double kelvinRankine(double kelvin) {
        return kelvin * 1.8;
    }

    public static double reaumurCelsius(double reaumur) {
        return reaumur * 5.0 / 4.0;
    }

    public static double reaumurFahrenheit(double reaumur) {
        return celsiusFahrenheit(reaumurCelsius(reaumur));
    }

    public static double reaumurKelvin(double reaumur) {
        return celsiusKelvin(reaumurCelsius(reaumur));
    }

    public static double reaumurRankine(double reaumur) {
        return celsiusRankine(reaumurCelsius(reaumur));
    }

    public static double rankineKelvin(double rankine) {
        return rankine / 1.8;
    }

    public static double rankineCelsius(double rankine) {
        return kelvinCelsius(rankineKelvin(rankine));
    }

    public static double rankineFahrenheit(double rankine) {
        return rankine - 459.67;
    }

    public static double rankineReaumur(double rankine) {
        return celsiusReaumur(rankineCelsius(rankine));
    }
}

