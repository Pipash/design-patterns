package structural.design.patterns.adapter;

import java.util.List;

public interface DataConverter {
    List<OldData> convertLatestToOld(List<LatestData> latestData);
}
