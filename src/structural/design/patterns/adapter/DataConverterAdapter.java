package structural.design.patterns.adapter;

import java.util.List;
import java.util.stream.Collectors;

public class DataConverterAdapter implements DataConverter {
    @Override
    public List<OldData> convertLatestToOld(List<LatestData> latestData) {
        return latestData.stream().map(lData -> {
            OldData oData = new OldData();
            oData.setIndex(lData.getPosition());
            oData.setAmount(lData.getAmount().toString());
            return oData;
        }).collect(Collectors.toList());
    }
}
