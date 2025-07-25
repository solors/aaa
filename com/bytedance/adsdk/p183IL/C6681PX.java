package com.bytedance.adsdk.p183IL;

import java.util.Arrays;

/* renamed from: com.bytedance.adsdk.IL.PX */
/* loaded from: classes3.dex */
public final class C6681PX<V> {

    /* renamed from: IL */
    private final Throwable f14174IL;

    /* renamed from: bg */
    private final V f14175bg;

    public C6681PX(V v) {
        this.f14175bg = v;
        this.f14174IL = null;
    }

    /* renamed from: IL */
    public Throwable m91157IL() {
        return this.f14174IL;
    }

    /* renamed from: bg */
    public V m91156bg() {
        return this.f14175bg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6681PX)) {
            return false;
        }
        C6681PX c6681px = (C6681PX) obj;
        if (m91156bg() != null && m91156bg().equals(c6681px.m91156bg())) {
            return true;
        }
        if (m91157IL() == null || c6681px.m91157IL() == null) {
            return false;
        }
        return m91157IL().toString().equals(m91157IL().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m91156bg(), m91157IL()});
    }

    public C6681PX(Throwable th) {
        this.f14174IL = th;
        this.f14175bg = null;
    }
}
