package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d20 implements InterfaceC31375sk<Drawable> {
    @NotNull

    /* renamed from: a */
    private final bp1 f77842a;
    @NotNull

    /* renamed from: b */
    private final C31662vk f77843b;

    public d20(@NotNull bp1 scaledDrawableBitmapProvider, @NotNull C31662vk bitmapProvider) {
        Intrinsics.checkNotNullParameter(scaledDrawableBitmapProvider, "scaledDrawableBitmapProvider");
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f77842a = scaledDrawableBitmapProvider;
        this.f77843b = bitmapProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31375sk
    /* renamed from: a */
    public final boolean mo28741a(@NotNull Drawable drawable, @NotNull Bitmap src) {
        Bitmap src2;
        C30140a c30140a;
        C30140a c30140a2;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(src, "bitmap");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                src2 = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(src2, "getBitmap(...)");
                this.f77843b.getClass();
                Intrinsics.checkNotNullParameter(src2, "src");
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(src2, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                this.f77843b.getClass();
                Intrinsics.checkNotNullParameter(src, "src");
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(src, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap2, "createScaledBitmap(...)");
                c30140a = new C30140a(createScaledBitmap.getPixel(0, 0));
                c30140a2 = new C30140a(createScaledBitmap2.getPixel(0, 0));
                if (Math.abs(c30140a.m35121a() - c30140a2.m35121a()) <= 20 && Math.abs(c30140a.m35118d() - c30140a2.m35118d()) <= 20 && Math.abs(c30140a.m35119c() - c30140a2.m35119c()) <= 20 && Math.abs(c30140a.m35120b() - c30140a2.m35120b()) <= 20) {
                    return true;
                }
                return false;
            }
        }
        src2 = this.f77842a.m35453a(drawable);
        this.f77843b.getClass();
        Intrinsics.checkNotNullParameter(src2, "src");
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(src2, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap3, "createScaledBitmap(...)");
        this.f77843b.getClass();
        Intrinsics.checkNotNullParameter(src, "src");
        Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(src, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap22, "createScaledBitmap(...)");
        c30140a = new C30140a(createScaledBitmap3.getPixel(0, 0));
        c30140a2 = new C30140a(createScaledBitmap22.getPixel(0, 0));
        if (Math.abs(c30140a.m35121a() - c30140a2.m35121a()) <= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: com.yandex.mobile.ads.impl.d20$a */
    /* loaded from: classes8.dex */
    private static final class C30140a {

        /* renamed from: a */
        private final int f77844a;

        /* renamed from: b */
        private final int f77845b;

        /* renamed from: c */
        private final int f77846c;

        /* renamed from: d */
        private final int f77847d;

        /* renamed from: e */
        private final int f77848e;

        public /* synthetic */ C30140a(int i) {
            this(i, Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
        }

        /* renamed from: a */
        public final int m35121a() {
            return this.f77845b;
        }

        /* renamed from: b */
        public final int m35120b() {
            return this.f77848e;
        }

        /* renamed from: c */
        public final int m35119c() {
            return this.f77847d;
        }

        /* renamed from: d */
        public final int m35118d() {
            return this.f77846c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30140a)) {
                return false;
            }
            C30140a c30140a = (C30140a) obj;
            if (this.f77844a == c30140a.f77844a && this.f77845b == c30140a.f77845b && this.f77846c == c30140a.f77846c && this.f77847d == c30140a.f77847d && this.f77848e == c30140a.f77848e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f77848e) + nt1.m31295a(this.f77847d, nt1.m31295a(this.f77846c, nt1.m31295a(this.f77845b, Integer.hashCode(this.f77844a) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            int i = this.f77844a;
            int i2 = this.f77845b;
            int i3 = this.f77846c;
            int i4 = this.f77847d;
            int i5 = this.f77848e;
            return "BitmapPixel(color=" + i + ", alpha=" + i2 + ", red=" + i3 + ", green=" + i4 + ", blue=" + i5 + ")";
        }

        public C30140a(int i, int i2, int i3, int i4, int i5) {
            this.f77844a = i;
            this.f77845b = i2;
            this.f77846c = i3;
            this.f77847d = i4;
            this.f77848e = i5;
        }
    }
}
