package subway.domain.selectoption;

public enum StationManageOption {
    REGISTER_STATION("역 등록", "1"),
    DELETE_STATION("역 삭제", "2"),
    READ_STATION("역 조회", "3"),
    BACK("돌아가기", "B");

    private String optionName;
    private String optionID;

    StationManageOption(String optionName, String optionID) {
        this.optionName = optionName;
        this.optionID = optionID;
    }
}
