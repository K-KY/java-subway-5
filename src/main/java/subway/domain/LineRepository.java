package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import subway.domain.defaultSetting.DefaultLines;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        if (lines.isEmpty()) {
            addDefaultLine();
        }
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    private static void addDefaultLine() {
        List<DefaultLines> defaultLines = DefaultLines.lines();
        defaultLines.forEach(defaultLine -> lines.add(new Line(defaultLine.getLineName())));
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static boolean isLineExist(Line line) {
        return lines.contains(line);
    }
}
