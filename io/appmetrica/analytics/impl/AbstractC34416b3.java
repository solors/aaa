package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.b3 */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC34416b3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f94006a;

    static {
        int[] iArr = new int[ProductType.values().length];
        f94006a = iArr;
        try {
            iArr[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f94006a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
