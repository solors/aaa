package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import td.C44401b;

/* loaded from: classes8.dex */
public final class r90 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.r90$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31268a {

        /* renamed from: f */
        private static final /* synthetic */ EnumC31268a[] f84681f;

        /* renamed from: g */
        public static final /* synthetic */ int f84682g = 0;

        /* renamed from: b */
        private final int f84683b;

        /* renamed from: c */
        private final int f84684c;

        /* renamed from: d */
        private final int f84685d;

        /* renamed from: e */
        private final int f84686e;

        static {
            EnumC31268a[] enumC31268aArr = {new EnumC31268a(C29880R.C29883font.monetization_ads_internal_font_light, C29880R.C29883font.monetization_ads_internal_font_regular, C29880R.C29883font.monetization_ads_internal_font_medium, C29880R.C29883font.monetization_ads_internal_font_bold)};
            f84681f = enumC31268aArr;
            C44401b.m3113a(enumC31268aArr);
        }

        private EnumC31268a(int i, int i2, int i3, int i4) {
            this.f84683b = i;
            this.f84684c = i2;
            this.f84685d = i3;
            this.f84686e = i4;
        }

        public static EnumC31268a valueOf(String str) {
            return (EnumC31268a) Enum.valueOf(EnumC31268a.class, str);
        }

        public static EnumC31268a[] values() {
            return (EnumC31268a[]) f84681f.clone();
        }

        /* renamed from: a */
        public final int m30113a() {
            return this.f84686e;
        }

        /* renamed from: b */
        public final int m30112b() {
            return this.f84683b;
        }

        /* renamed from: c */
        public final int m30111c() {
            return this.f84685d;
        }

        /* renamed from: d */
        public final int m30110d() {
            return this.f84684c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.r90$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C31269b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84687a;

        static {
            int[] iArr = new int[EnumC31268a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84687a = iArr;
        }
    }

    @Nullable
    /* renamed from: a */
    public static q90 m30114a(@NotNull Context context) {
        String str;
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null) {
            str = m35796a.m26732t();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            EnumC31268a valueOf = EnumC31268a.valueOf(str);
            if (C31269b.f84687a[valueOf.ordinal()] == 1) {
                try {
                    typeface = ResourcesCompat.getFont(context, valueOf.m30112b());
                } catch (Throwable unused) {
                    typeface = null;
                }
                try {
                    typeface2 = ResourcesCompat.getFont(context, valueOf.m30110d());
                } catch (Throwable unused2) {
                    typeface2 = null;
                }
                try {
                    typeface3 = ResourcesCompat.getFont(context, valueOf.m30111c());
                } catch (Throwable unused3) {
                    typeface3 = null;
                }
                try {
                    typeface4 = ResourcesCompat.getFont(context, valueOf.m30113a());
                } catch (Throwable unused4) {
                    typeface4 = null;
                }
                return new q90(typeface, typeface2, typeface3, typeface4);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable unused5) {
            return null;
        }
    }
}
