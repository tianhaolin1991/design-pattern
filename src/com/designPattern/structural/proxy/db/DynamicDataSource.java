package com.designPattern.structural.proxy.db;

/**
 * 拓展:模拟spring分库的实现
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrencyLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
