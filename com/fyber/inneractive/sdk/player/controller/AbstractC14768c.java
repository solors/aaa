package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.model.vast.EnumC14616i;

/* renamed from: com.fyber.inneractive.sdk.player.controller.c */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14768c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f27992a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f27993b;

    static {
        int[] iArr = new int[EnumC14616i.values().length];
        f27993b = iArr;
        try {
            iArr[EnumC14616i.Static.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27993b[EnumC14616i.Html.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27993b[EnumC14616i.FMP_End_Card.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f27993b[EnumC14616i.Iframe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[UnitDisplayType.values().length];
        f27992a = iArr2;
        try {
            iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f27992a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
