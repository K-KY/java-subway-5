package subway.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.domain.defaultSetting.DefaultStation;

class StationRepositoryTest {

    @Test
    @DisplayName("역 목록 가져오기")
    void readStationsTest() {
        List<Station> stations = StationRepository.readStations();
        List<DefaultStation> defaultStations = DefaultStation.stations();
        defaultStations.forEach(defaultStation -> assertThat(StationRepository.isStationExist(new Station((defaultStation.getStationNames())))).isTrue());
        stations.forEach(station -> System.out.println(station.getName()));
    }

    @Test
    @DisplayName("역 추가")
    void addStationTest() {
        StationRepository.addStation(new Station("동암역"));
        assertThat(StationRepository.isStationExist(new Station("동암역"))).isTrue();
    }

    @Test
    void deleteStationTest() {
        StationRepository.addStation(new Station("동암역"));
        assertThat(StationRepository.isStationExist(new Station("동암역"))).isTrue();

        StationRepository.deleteStation("동암역");
        assertThat(StationRepository.isStationExist(new Station("동암역"))).isFalse();
    }

}