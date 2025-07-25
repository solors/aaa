package com.yandex.mobile.ads.impl;

import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.p */
/* loaded from: classes8.dex */
abstract class AbstractC31078p<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!da1.m34981a(getKey(), entry.getKey()) || !da1.m34981a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
