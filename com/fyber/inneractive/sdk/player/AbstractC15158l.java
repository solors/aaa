package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.enums.EnumC14794a;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;

/* renamed from: com.fyber.inneractive.sdk.player.l */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15158l {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29953a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f29954b;

    static {
        int[] iArr = new int[EnumC14794a.values().length];
        f29954b = iArr;
        try {
            iArr[EnumC14794a.Uninitialized.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29954b[EnumC14794a.Started.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29954b[EnumC14794a.FirstQuarter.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29954b[EnumC14794a.MidPoint.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f29954b[EnumC14794a.ThirdPQuarter.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f29954b[EnumC14794a.Completed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EnumC14795b.values().length];
        f29953a = iArr2;
        try {
            iArr2[EnumC14795b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f29953a[EnumC14795b.Playing.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f29953a[EnumC14795b.Completed.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
