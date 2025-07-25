package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.tn */
/* loaded from: classes8.dex */
public final class EnumC31467tn {
    @NotNull

    /* renamed from: c */
    public static final C31468a f85763c;

    /* renamed from: d */
    public static final EnumC31467tn f85764d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC31467tn[] f85765e;
    @NotNull

    /* renamed from: b */
    private final String f85766b;

    /* renamed from: com.yandex.mobile.ads.impl.tn$a */
    /* loaded from: classes8.dex */
    public static final class C31468a {
        private C31468a() {
        }

        public /* synthetic */ C31468a(int i) {
            this();
        }
    }

    static {
        EnumC31467tn enumC31467tn = new EnumC31467tn(0, "BROWSER", "browser");
        EnumC31467tn enumC31467tn2 = new EnumC31467tn(1, "WEBVIEW", C21114v8.C21122h.f54036K);
        f85764d = enumC31467tn2;
        EnumC31467tn[] enumC31467tnArr = {enumC31467tn, enumC31467tn2};
        f85765e = enumC31467tnArr;
        C44401b.m3113a(enumC31467tnArr);
        f85763c = new C31468a(0);
    }

    private EnumC31467tn(int i, String str, String str2) {
        this.f85766b = str2;
    }

    public static EnumC31467tn valueOf(String str) {
        return (EnumC31467tn) Enum.valueOf(EnumC31467tn.class, str);
    }

    public static EnumC31467tn[] values() {
        return (EnumC31467tn[]) f85765e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m29104a() {
        return this.f85766b;
    }
}
