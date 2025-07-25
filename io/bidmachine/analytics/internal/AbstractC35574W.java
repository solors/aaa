package io.bidmachine.analytics.internal;

import kotlin.text.C37689o;

/* renamed from: io.bidmachine.analytics.internal.W */
/* loaded from: classes9.dex */
public abstract class AbstractC35574W {
    /* renamed from: a */
    public static final Float m20304a(Object obj) {
        Float m16642k;
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            m16642k = C37689o.m16642k((String) obj);
            return m16642k;
        }
        return null;
    }
}
