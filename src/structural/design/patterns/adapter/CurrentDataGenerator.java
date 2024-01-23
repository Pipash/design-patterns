package structural.design.patterns.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurrentDataGenerator {
    public List<CurrentData> generateCurrentData() {
        return Stream.of(new CurrentData[]{(new CurrentData(1, 10)),
                (new CurrentData(2, 13)), (new CurrentData(3, 14))})
                .collect(Collectors.toList());
    }
}
