package subway.domain.selectoption;

public enum LineManageOption {
    REGISTER_LINE("노선 등록", "1"),
    DELETE_LINE("노선 삭제", "2"),
    READ_LINE("노선 조회 ", "3"),
    BACK("돌아가기", "B");

    private String optionName;
    private String optionID;

    LineManageOption(String optionName, String optionID) {
        this.optionName = optionName;
        this.optionID = optionID;
    }


}
