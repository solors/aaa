package com.applovin.impl;

/* renamed from: com.applovin.impl.fg */
/* loaded from: classes2.dex */
public abstract class AbstractC4393fg {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m99176a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m99173b(Object[] objArr, int i) {
        return AbstractC4957mh.m97100a(objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m99175a(Object... objArr) {
        return m99174a(objArr, objArr.length);
    }

    /* renamed from: a */
    static Object[] m99174a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m99176a(objArr[i2], i2);
        }
        return objArr;
    }
}
