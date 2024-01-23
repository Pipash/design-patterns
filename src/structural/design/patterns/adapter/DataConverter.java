package structural.design.patterns.adapter;

import java.util.List;

public interface DataConverter {
    public List<LegacyData> convertCurrentToLegacy(List<CurrentData> currentData);
}
