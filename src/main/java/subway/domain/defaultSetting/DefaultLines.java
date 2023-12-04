package subway.domain.defaultSetting;

import java.util.List;

public enum DefaultLines {
    LINE_TWO("2호선"),
    LINE_THREE("3호선"),
    LINE_NEW_BUNDANG("신분당선");

    private String lineName;

    DefaultLines(String lineName) {
        this.lineName = lineName;
    }

    public static List<DefaultLines> lines() {
        return List.of(values());
    }

    public String getLineName() {
        return this.lineName;
    }
}
