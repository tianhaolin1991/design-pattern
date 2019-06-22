package com.designPattern.structural.proxy.db;

public abstract class AbstractRoutingDataSource {
    protected abstract Object determineCurrencyLookupKey();


}
