package structural.design.patterns.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurrentDataGenerator {
    public List<LatestData> generateCurrentData() {
        return Stream.of(new LatestData[]{(new LatestData(1, 10)),
                (new LatestData(2, 13)), (new LatestData(3, 14))})
                .collect(Collectors.toList());
    }
}
