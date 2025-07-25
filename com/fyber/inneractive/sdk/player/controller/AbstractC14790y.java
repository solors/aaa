package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.EnumC14795b;

/* renamed from: com.fyber.inneractive.sdk.player.controller.y */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14790y {

    /* renamed from: a */
    public static final /* synthetic */ int[] f28058a;

    static {
        int[] iArr = new int[EnumC14795b.values().length];
        f28058a = iArr;
        try {
            iArr[EnumC14795b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28058a[EnumC14795b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f28058a[EnumC14795b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f28058a[EnumC14795b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f28058a[EnumC14795b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f28058a[EnumC14795b.Error.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f28058a[EnumC14795b.Preparing.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f28058a[EnumC14795b.Seeking.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
