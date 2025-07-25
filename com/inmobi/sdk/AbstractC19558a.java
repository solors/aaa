package com.inmobi.sdk;

import com.inmobi.sdk.InMobiSdk;

/* renamed from: com.inmobi.sdk.a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC19558a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f48971a;

    static {
        int[] iArr = new int[InMobiSdk.LogLevel.values().length];
        try {
            iArr[InMobiSdk.LogLevel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiSdk.LogLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiSdk.LogLevel.DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f48971a = iArr;
    }
}
