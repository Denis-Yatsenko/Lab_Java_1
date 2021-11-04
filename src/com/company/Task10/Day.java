//Day

package com.company.Task10;

public class Day {
        public String dayName;
        public Weather weather;

        public Day(String dayName,Weather weather) {
            this.dayName = dayName;
            this.weather = weather;
        }

    @Override
    public String toString() {
        return "Day{" +
                "dayName='" + dayName + '\'' +
                ", weather=" + weather +
                '}';
    }
}
