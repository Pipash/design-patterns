package structural.design.patterns.adapter;

import java.util.List;
import java.util.stream.Collectors;

public class DataConverterAdapter implements DataConverter {
    @Override
    public List<LegacyData> convertCurrentToLegacy(List<CurrentData> currentData) {
        return currentData.stream().map(cData -> {
            LegacyData lData = new LegacyData();
            lData.setIndex(cData.getPosition());
            lData.setAmount(cData.getAmount().toString());
            return lData;
        }).collect(Collectors.toList());
    }
}
