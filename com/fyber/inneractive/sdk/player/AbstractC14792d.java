package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.enums.EnumC14795b;

/* renamed from: com.fyber.inneractive.sdk.player.d */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14792d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f28083a;

    static {
        int[] iArr = new int[EnumC14795b.values().length];
        f28083a = iArr;
        try {
            iArr[EnumC14795b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28083a[EnumC14795b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f28083a[EnumC14795b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f28083a[EnumC14795b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f28083a[EnumC14795b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
