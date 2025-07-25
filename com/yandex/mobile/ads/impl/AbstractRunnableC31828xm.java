package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.xm */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableC31828xm implements Runnable {
    @NotNull

    /* renamed from: b */
    private EnumC31829a f87739b = EnumC31829a.f87740b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.xm$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31829a {

        /* renamed from: b */
        public static final EnumC31829a f87740b;

        /* renamed from: c */
        public static final EnumC31829a f87741c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC31829a[] f87742d;

        static {
            EnumC31829a enumC31829a = new EnumC31829a(0, "ACTIVE");
            f87740b = enumC31829a;
            EnumC31829a enumC31829a2 = new EnumC31829a(1, "CANCELED");
            f87741c = enumC31829a2;
            EnumC31829a[] enumC31829aArr = {enumC31829a, enumC31829a2};
            f87742d = enumC31829aArr;
            C44401b.m3113a(enumC31829aArr);
        }

        private EnumC31829a(int i, String str) {
        }

        public static EnumC31829a valueOf(String str) {
            return (EnumC31829a) Enum.valueOf(EnumC31829a.class, str);
        }

        public static EnumC31829a[] values() {
            return (EnumC31829a[]) f87742d.clone();
        }
    }

    /* renamed from: a */
    public final void m27458a() {
        this.f87739b = EnumC31829a.f87741c;
    }

    /* renamed from: b */
    public final boolean m27457b() {
        if (this.f87739b == EnumC31829a.f87740b) {
            return true;
        }
        return false;
    }
}
