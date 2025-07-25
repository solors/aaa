package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import java.util.Map;

/* renamed from: com.applovin.impl.g */
/* loaded from: classes2.dex */
abstract class AbstractC4431g implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equal(getKey(), entry.getKey()) || !Objects.equal(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
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

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
