package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14280a;

/* renamed from: com.fyber.inneractive.sdk.cache.session.f */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14283f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f26992a;

    static {
        int[] iArr = new int[EnumC14280a.values().length];
        f26992a = iArr;
        try {
            iArr[EnumC14280a.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26992a[EnumC14280a.COMPLETION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26992a[EnumC14280a.IMPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
