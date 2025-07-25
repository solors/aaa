package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.wp */
/* loaded from: classes8.dex */
public final class C31760wp {
    @NotNull

    /* renamed from: a */
    private final C30578is f87318a;

    /* renamed from: b */
    private final int f87319b;
    @NotNull

    /* renamed from: c */
    private final a11 f87320c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.wp$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31761a {

        /* renamed from: b */
        public static final EnumC31761a f87321b;

        /* renamed from: c */
        public static final EnumC31761a f87322c;

        /* renamed from: d */
        public static final EnumC31761a f87323d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC31761a[] f87324e;

        static {
            EnumC31761a enumC31761a = new EnumC31761a(0, "FAVICON");
            f87321b = enumC31761a;
            EnumC31761a enumC31761a2 = new EnumC31761a(1, "ICON");
            f87322c = enumC31761a2;
            EnumC31761a enumC31761a3 = new EnumC31761a(2, "THUMB");
            f87323d = enumC31761a3;
            EnumC31761a[] enumC31761aArr = {enumC31761a, enumC31761a2, enumC31761a3};
            f87324e = enumC31761aArr;
            C44401b.m3113a(enumC31761aArr);
        }

        private EnumC31761a(int i, String str) {
        }

        public static EnumC31761a valueOf(String str) {
            return (EnumC31761a) Enum.valueOf(EnumC31761a.class, str);
        }

        public static EnumC31761a[] values() {
            return (EnumC31761a[]) f87324e.clone();
        }
    }

    public C31760wp(@NotNull C30578is nativeAdAssets, int i, @NotNull a11 nativeAdAdditionalViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        this.f87318a = nativeAdAssets;
        this.f87319b = i;
        this.f87320c = nativeAdAdditionalViewProvider;
    }

    @Nullable
    /* renamed from: a */
    public final ImageView m27861a(@NotNull View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return m27860a(parentView, EnumC31761a.f87321b, this.f87318a.m33142e());
    }

    @Nullable
    /* renamed from: b */
    public final ImageView m27859b(@NotNull View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return m27860a(parentView, EnumC31761a.f87322c, this.f87318a.m33140g());
    }

    /* renamed from: a */
    private final ImageView m27860a(View container, EnumC31761a enumC31761a, C30745ks c30745ks) {
        EnumC31761a enumC31761a2;
        C30745ks m33140g = this.f87318a.m33140g();
        C30745ks m33142e = this.f87318a.m33142e();
        if (m33140g != null) {
            enumC31761a2 = EnumC31761a.f87322c;
        } else if (m33142e != null) {
            enumC31761a2 = EnumC31761a.f87321b;
        } else {
            enumC31761a2 = EnumC31761a.f87323d;
        }
        if (c30745ks == null || enumC31761a2 != enumC31761a) {
            return null;
        }
        int m32447d = c30745ks.m32447d();
        int m32449b = c30745ks.m32449b();
        int i = this.f87319b;
        if (i <= m32447d && i <= m32449b) {
            this.f87320c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            return (ImageView) container.findViewById(C29880R.C29884id.icon_large);
        }
        this.f87320c.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(C29880R.C29884id.icon_small);
    }
}
