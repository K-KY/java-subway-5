package subway.domain.selectoption;

public enum SectionManageOption {
    REGISTER_SECTION("노선 등록", "1"),
    DELETE_SECTION("노선 삭제", "2"),
    BACK("돌아가기", "B");

    private String optionName;
    private String optionID;

    SectionManageOption(String optionName, String optionID) {
        this.optionName = optionName;
        this.optionID = optionID;
    }
}
