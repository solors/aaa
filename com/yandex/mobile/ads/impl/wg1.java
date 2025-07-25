package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class wg1 implements wg0 {
    @NotNull

    /* renamed from: a */
    private final C30034bm f87260a;
    @NotNull

    /* renamed from: b */
    private final LinkedHashMap f87261b;
    @NotNull

    /* renamed from: c */
    private final LinkedHashMap f87262c;

    /* renamed from: com.yandex.mobile.ads.impl.wg1$a */
    /* loaded from: classes8.dex */
    private static final class C31748a {
        @NotNull

        /* renamed from: a */
        private final String f87263a;
        @NotNull

        /* renamed from: b */
        private final pu1 f87264b;

        public C31748a(@NotNull String base64, @NotNull pu1 size) {
            Intrinsics.checkNotNullParameter(base64, "base64");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f87263a = base64;
            this.f87264b = size;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31748a)) {
                return false;
            }
            C31748a c31748a = (C31748a) obj;
            if (Intrinsics.m17075f(this.f87263a, c31748a.f87263a) && Intrinsics.m17075f(this.f87264b, c31748a.f87264b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87264b.hashCode() + (this.f87263a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f87263a;
            pu1 pu1Var = this.f87264b;
            return "Preview(base64=" + str + ", size=" + pu1Var + ")";
        }
    }

    public /* synthetic */ wg1(Context context) {
        this(context, new C30034bm(context));
    }

    @Override // com.yandex.mobile.ads.impl.wg0
    /* renamed from: a */
    public final void mo27908a(@NotNull String key, @NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87261b.put(key, value);
    }

    @Override // com.yandex.mobile.ads.impl.wg0
    @Nullable
    /* renamed from: b */
    public final Bitmap mo27906b(@NotNull bh0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String m35470f = imageValue.m35470f();
        Bitmap bitmap = (Bitmap) this.f87261b.get(m35470f);
        if (bitmap == null) {
            Bitmap m35459a = this.f87260a.m35459a(imageValue);
            if (m35459a != null) {
                this.f87261b.put(m35470f, m35459a);
                return m35459a;
            }
            return null;
        }
        return bitmap;
    }

    public wg1(@NotNull Context context, @NotNull C30034bm cacheImageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheImageProvider, "cacheImageProvider");
        this.f87260a = cacheImageProvider;
        this.f87261b = new LinkedHashMap();
        this.f87262c = new LinkedHashMap();
    }

    @Override // com.yandex.mobile.ads.impl.wg0
    /* renamed from: a */
    public final void mo27907a(@NotNull Map<String, Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f87261b.putAll(images);
    }

    @Override // com.yandex.mobile.ads.impl.wg0
    /* renamed from: a */
    public final void mo27910a(@NotNull Bitmap value, @NotNull bh0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String m35473c = key.m35473c();
        C31748a c31748a = m35473c != null ? new C31748a(m35473c, new pu1(key.m35469g(), key.m35475a())) : null;
        if (c31748a != null) {
            this.f87262c.put(c31748a, value);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wg0
    @Nullable
    /* renamed from: a */
    public final Bitmap mo27909a(@NotNull bh0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String m35473c = imageValue.m35473c();
        C31748a c31748a = m35473c != null ? new C31748a(m35473c, new pu1(imageValue.m35469g(), imageValue.m35475a())) : null;
        if (c31748a != null) {
            return (Bitmap) this.f87262c.get(c31748a);
        }
        return null;
    }
}
