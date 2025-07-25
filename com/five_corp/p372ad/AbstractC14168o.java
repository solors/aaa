package com.five_corp.p372ad;

/* renamed from: com.five_corp.ad.o */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14168o {

    /* renamed from: a */
    public static final /* synthetic */ int[] f26842a;

    static {
        int[] iArr = new int[FiveAdState.values().length];
        f26842a = iArr;
        try {
            iArr[FiveAdState.NOT_LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26842a[FiveAdState.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26842a[FiveAdState.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26842a[FiveAdState.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26842a[FiveAdState.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
