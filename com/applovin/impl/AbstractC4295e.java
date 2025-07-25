package com.applovin.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4295e extends AbstractC4355f implements InterfaceC4317ec {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4295e(Map map) {
        super(map);
    }

    @Override // com.applovin.impl.AbstractC4496h, com.applovin.impl.InterfaceC5561tf
    /* renamed from: a */
    public Map mo94449a() {
        return super.mo94449a();
    }

    @Override // com.applovin.impl.AbstractC4355f
    /* renamed from: c */
    Collection mo99432c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.applovin.impl.AbstractC4496h
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.AbstractC4355f, com.applovin.impl.InterfaceC5561tf
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.applovin.impl.AbstractC4355f
    /* renamed from: a */
    Collection mo99441a(Object obj, Collection collection) {
        return m99440a(obj, (List) collection, null);
    }
}
