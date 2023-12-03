package subway.domain.defaultSetting;

public enum DefaultStation {
    EDU_UNIV("교대역"),
    RIVER_SOUTH("강남역"),
    STATION_THREE("역삼역"),
    SOUTH_TERMINAL("남부터미널역"),
    YANG_JAE("양재역"),
    YANG_JAE_CITIZEN_FOREST("양재시민의숲역"),
    MAE_BONG("매봉역");

    private String stationName;

    DefaultStation(String stationName) {
        this.stationName = stationName;
    }
}
