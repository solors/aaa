package com.applovin.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.applovin.impl.mh */
/* loaded from: classes2.dex */
abstract class AbstractC4957mh {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m97099a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m97100a(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map m97101a() {
        return C5739w3.m93743a();
    }
}
