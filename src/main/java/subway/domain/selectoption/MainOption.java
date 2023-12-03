package subway.domain.selectoption;

public enum MainOption {
    MANAGE_STATION("역 관리", "1"),
    MANAGE_LINE("노선 관리", "2"),
    MANAGE_SECTION("구간 관리", "3"),
    READ_LINES("지히철 노선도 출력", "4"),
    QUIT("종료", "Q");

    private String optionName;
    private String optionID;

    MainOption(String optionName, String optionID) {
        this.optionName = optionName;
        this.optionID = optionID;
    }
}
