package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.to */
/* loaded from: classes2.dex */
public final class C5575to {

    /* renamed from: a */
    public final int f10938a;

    /* renamed from: b */
    private final InterfaceC5522so[] f10939b;

    /* renamed from: c */
    private int f10940c;

    public C5575to(InterfaceC5522so... interfaceC5522soArr) {
        this.f10939b = interfaceC5522soArr;
        this.f10938a = interfaceC5522soArr.length;
    }

    /* renamed from: a */
    public InterfaceC5522so m94378a(int i) {
        return this.f10939b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5575to.class == obj.getClass()) {
            return Arrays.equals(this.f10939b, ((C5575to) obj).f10939b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f10940c == 0) {
            this.f10940c = Arrays.hashCode(this.f10939b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f10940c;
    }
}
