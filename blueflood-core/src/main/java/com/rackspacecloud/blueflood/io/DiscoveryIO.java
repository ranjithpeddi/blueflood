package com.rackspacecloud.blueflood.io;

import com.rackspacecloud.blueflood.types.IMetric;
import java.util.List;

public interface DiscoveryIO {

    public void insertDiscovery(IMetric metric) throws Exception;
    public void insertDiscovery(List<IMetric> metrics) throws Exception;
    public List<SearchResult> search(String tenant, String query) throws Exception;
    public List<SearchResult> search(String tenant, List<String> queries) throws Exception;
    public List<TokenInfo> getNextTokens(String tenant, String prefix) throws Exception;

}
