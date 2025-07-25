package com.applovin.impl;

import java.io.Serializable;

/* renamed from: com.applovin.impl.cb */
/* loaded from: classes2.dex */
class C4175cb extends AbstractC4431g implements Serializable {

    /* renamed from: a */
    final Object f5230a;

    /* renamed from: b */
    final Object f5231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4175cb(Object obj, Object obj2) {
        this.f5230a = obj;
        this.f5231b = obj2;
    }

    @Override // com.applovin.impl.AbstractC4431g, java.util.Map.Entry
    public final Object getKey() {
        return this.f5230a;
    }

    @Override // com.applovin.impl.AbstractC4431g, java.util.Map.Entry
    public final Object getValue() {
        return this.f5231b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
