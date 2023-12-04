package subway.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import subway.domain.defaultSetting.DefaultLines;

public class LineRepositoryTest {

    @Test
    void readLineTest() {
        List<Line> lines = LineRepository.lines();
        List<DefaultLines> defaultLines = DefaultLines.lines();
        defaultLines.forEach(defaultLine -> assertThat(LineRepository.isLineExist(new Line(defaultLine.getLineName()))).isTrue());
        lines.forEach(line -> System.out.println(line.getName()));
    }

    @Test
    void addLineTest() {
        LineRepository.addLine(new Line("1호선"));
        assertThat(LineRepository.isLineExist(new Line("1호선"))).isTrue();
    }

    @Test
    void deleteLineTest() {
        LineRepository.lines();
        LineRepository.addLine(new Line("1호선"));
        assertThat(LineRepository.isLineExist(new Line("1호선"))).isTrue();

        LineRepository.deleteLineByName("1호선");
        assertThat(LineRepository.isLineExist(new Line("1호선"))).isFalse();

    }
}
