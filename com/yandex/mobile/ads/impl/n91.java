package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.sg0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n91 {
    @NotNull

    /* renamed from: c */
    public static final C30919a f82636c = new C30919a(0);
    @Nullable

    /* renamed from: d */
    private static volatile n91 f82637d;
    @NotNull

    /* renamed from: a */
    private final tu1 f82638a;
    @NotNull

    /* renamed from: b */
    private final j32 f82639b;

    /* renamed from: com.yandex.mobile.ads.impl.n91$a */
    /* loaded from: classes8.dex */
    public static final class C30919a {
        private C30919a() {
        }

        @NotNull
        /* renamed from: a */
        public final n91 m31632a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            n91 n91Var = n91.f82637d;
            if (n91Var == null) {
                synchronized (this) {
                    n91Var = n91.f82637d;
                    if (n91Var == null) {
                        n91Var = new n91(context);
                        n91.f82637d = n91Var;
                    }
                }
            }
            return n91Var;
        }

        public /* synthetic */ C30919a(int i) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n91$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC30921c {
        /* renamed from: a */
        void mo31631a(@NotNull String str, @NotNull Bitmap bitmap);
    }

    /* synthetic */ n91(Context context) {
        this(context, new lg0());
    }

    /* renamed from: b */
    private static am1 m31634b(Context context) {
        int i;
        Integer m26724x;
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && (m26724x = m35796a.m26724x()) != null) {
            if (m26724x.intValue() == 0) {
                m26724x = null;
            }
            if (m26724x != null) {
                i = m26724x.intValue();
                am1 m35458a = bm1.m35458a(context, i);
                m35458a.m35828a();
                return m35458a;
            }
        }
        i = 4;
        am1 m35458a2 = bm1.m35458a(context, i);
        m35458a2.m35828a();
        return m35458a2;
    }

    @NotNull
    /* renamed from: c */
    public final j32 m31633c() {
        return this.f82639b;
    }

    /* renamed from: com.yandex.mobile.ads.impl.n91$b */
    /* loaded from: classes8.dex */
    public static final class C30920b implements sg0.InterfaceC31357b {
        @NotNull

        /* renamed from: a */
        private final LruCache<String, Bitmap> f82640a;

        public C30920b(@NotNull o91 imageCache) {
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            this.f82640a = imageCache;
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31357b
        @Nullable
        /* renamed from: a */
        public final Bitmap mo29612a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.f82640a.get(key);
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31357b
        /* renamed from: a */
        public final void mo29611a(@NotNull String key, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f82640a.put(key, bitmap);
        }
    }

    /* renamed from: a */
    private static o91 m31637a(Context context) {
        int i;
        int m16917e;
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            i = _Ranges.m16912j(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, ((int) (((displayMetrics.widthPixels * displayMetrics.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            Object[] args = new Object[0];
            int i2 = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            i = 5120;
        }
        m16917e = _Ranges.m16917e(i, 5120);
        return new o91(m16917e);
    }

    private n91(Context context, lg0 lg0Var) {
        o91 m31637a = m31637a(context);
        am1 m31634b = m31634b(context);
        C30920b c30920b = new C30920b(m31637a);
        this.f82639b = new j32(m31637a, lg0Var);
        this.f82638a = new tu1(m31634b, c30920b, lg0Var);
    }

    @NotNull
    /* renamed from: b */
    public final tu1 m31635b() {
        return this.f82638a;
    }
}
