package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.su */
/* loaded from: classes8.dex */
public final class EnumC31398su {

    /* renamed from: c */
    public static final EnumC31398su f85385c;

    /* renamed from: d */
    public static final EnumC31398su f85386d;

    /* renamed from: e */
    public static final EnumC31398su f85387e;

    /* renamed from: f */
    public static final EnumC31398su f85388f;

    /* renamed from: g */
    private static final /* synthetic */ EnumC31398su[] f85389g;
    @NotNull

    /* renamed from: b */
    private final String f85390b;

    static {
        EnumC31398su enumC31398su = new EnumC31398su(0, "CROSS_CLICKED", "cross_clicked");
        f85385c = enumC31398su;
        EnumC31398su enumC31398su2 = new EnumC31398su(1, "CROSS_TIMER_START", "cross_timer_start");
        f85386d = enumC31398su2;
        EnumC31398su enumC31398su3 = new EnumC31398su(2, "CROSS_TIMER_END", "cross_timer_end");
        f85387e = enumC31398su3;
        EnumC31398su enumC31398su4 = new EnumC31398su(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f85388f = enumC31398su4;
        EnumC31398su[] enumC31398suArr = {enumC31398su, enumC31398su2, enumC31398su3, enumC31398su4, new EnumC31398su(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        f85389g = enumC31398suArr;
        C44401b.m3113a(enumC31398suArr);
    }

    private EnumC31398su(int i, String str, String str2) {
        this.f85390b = str2;
    }

    public static EnumC31398su valueOf(String str) {
        return (EnumC31398su) Enum.valueOf(EnumC31398su.class, str);
    }

    public static EnumC31398su[] values() {
        return (EnumC31398su[]) f85389g.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m29531a() {
        return this.f85390b;
    }
}
