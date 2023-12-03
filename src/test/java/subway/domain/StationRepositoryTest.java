package subway.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.domain.defaultSetting.DefaultStation;

class StationRepositoryTest {

    @Test
    @DisplayName("")
    void readStationsTest() {
        List<Station> stations = StationRepository.readStations();
        stations.forEach(station -> assertThat(StationRepository.isStationExist(station)).isTrue());
        stations.forEach(station -> System.out.println(station.getName()));
    }

}