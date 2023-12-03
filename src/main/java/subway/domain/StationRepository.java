package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import subway.domain.defaultSetting.DefaultStation;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    private static void addDefaultStation() {
        List<DefaultStation> defaultStations = DefaultStation.stations();
        defaultStations.forEach(defaultStation -> stations.add(new Station(defaultStation.name())));
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }
}
