package com.mobilefuse.sdk.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class ObservableConfig {
    private Set<Observer> observers = new HashSet();
    private Map<ObservableConfigKey, Object> configMap = new HashMap();

    private void notifyChange(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
        for (Observer observer : new HashSet(this.observers)) {
            observer.onChanged(observableConfigKey, obj);
        }
    }

    public void clearValue(ObservableConfigKey observableConfigKey) throws Throwable {
        if (!this.configMap.containsKey(observableConfigKey)) {
            return;
        }
        this.configMap.remove(observableConfigKey);
    }

    public boolean getBooleanValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return getBooleanValue(observableConfigKey, false);
    }

    public float getFloatValue(ObservableConfigKey observableConfigKey, float f) throws Throwable {
        Object value = getValue(observableConfigKey);
        if (!(value instanceof Float)) {
            return f;
        }
        return ((Float) value).floatValue();
    }

    public int getIntValue(ObservableConfigKey observableConfigKey, int i) throws Throwable {
        Object value = getValue(observableConfigKey);
        if (!(value instanceof Integer)) {
            return i;
        }
        return ((Integer) value).intValue();
    }

    public long getLongValue(ObservableConfigKey observableConfigKey, long j) throws Throwable {
        Object value = getValue(observableConfigKey);
        if (!(value instanceof Long)) {
            return j;
        }
        return ((Long) value).longValue();
    }

    public Object getValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return this.configMap.get(observableConfigKey);
    }

    public boolean hasValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return this.configMap.containsKey(observableConfigKey);
    }

    public void registerObserver(Observer observer) throws Throwable {
        this.observers.add(observer);
    }

    public void setValue(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
        this.configMap.put(observableConfigKey, obj);
        notifyChange(observableConfigKey, obj);
    }

    public void unregisterAll() throws Throwable {
        this.observers.clear();
    }

    public void unregisterObserver(Observer observer) throws Throwable {
        this.observers.remove(observer);
    }

    public boolean getBooleanValue(ObservableConfigKey observableConfigKey, boolean z) throws Throwable {
        Object value = getValue(observableConfigKey);
        return !(value instanceof Boolean) ? z : ((Boolean) value).booleanValue();
    }
}
