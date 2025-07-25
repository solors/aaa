package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.Ve */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC34280Ve {

    /* renamed from: a */
    public static final /* synthetic */ int[] f93601a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f93602b;

    static {
        int[] iArr = new int[Period.TimeUnit.values().length];
        f93602b = iArr;
        try {
            iArr[Period.TimeUnit.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f93602b[Period.TimeUnit.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f93602b[Period.TimeUnit.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f93602b[Period.TimeUnit.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ProductType.values().length];
        f93601a = iArr2;
        try {
            iArr2[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f93601a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
