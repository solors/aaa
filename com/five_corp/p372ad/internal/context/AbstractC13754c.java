package com.five_corp.p372ad.internal.context;

import com.five_corp.p372ad.CreativeType;

/* renamed from: com.five_corp.ad.internal.context.c */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC13754c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f25569a;

    static {
        int[] iArr = new int[CreativeType.values().length];
        f25569a = iArr;
        try {
            iArr[CreativeType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25569a[CreativeType.MOVIE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25569a[CreativeType.NOT_LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
