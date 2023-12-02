package subway.domain.defaultSetting;

public enum DefaultLines {
    LINE_TWO("2호선"),
    LINE_THREE("3호선"),
    LINE_NEW_BUNDANG("신분당선");

    private String lineName;

    DefaultLines(String lineName) {
        this.lineName = lineName;
    }
}
