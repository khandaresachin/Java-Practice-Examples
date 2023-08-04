package com.kite;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableExample {

    private final String name;
    private final int rollNumber;
    private final Map<String, String> metaData;

    private MutableExample mutableExample;

    public ImmutableExample(String name,
                            int rollNumber,
                            Map<String, String> metaData,
                            MutableExample mutableExample){
        this.name = name;
        this.rollNumber =rollNumber;

        Map<String, String> tempMap =new HashMap<>();

        for(Map.Entry<String ,String> entry : metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;

        MutableExample tempMutable = new MutableExample();
        tempMutable.setNumber(mutableExample.getNumber());
        tempMutable.setPercentage(mutableExample.getPercentage());

        this.mutableExample = tempMutable;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap =new HashMap<>();

        for(Map.Entry<String ,String> entry : this.metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
