package structural.design.patterns.adapter;

import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        CurrentDataGenerator generator = new CurrentDataGenerator();
        DataConverterAdapter adapter = new DataConverterAdapter();

        List<LegacyData> legacyData = adapter.convertCurrentToLegacy(generator.generateCurrentData());
        legacyData.forEach(LegacyData::display);
    }
}
