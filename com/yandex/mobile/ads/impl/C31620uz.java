package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.uz */
/* loaded from: classes8.dex */
public final class C31620uz {
    @NotNull

    /* renamed from: a */
    private final C31778wz f86500a;
    @NotNull

    /* renamed from: b */
    private final xp0 f86501b;
    @NotNull

    /* renamed from: c */
    private final jo1 f86502c;

    public C31620uz() {
        this(0);
    }

    @NotNull
    /* renamed from: a */
    public final String m28587a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String lowerCase = this.f86500a.m27724a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    /* renamed from: b */
    public final String m28585b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f86501b.m27437a(context);
    }

    /* renamed from: c */
    public final boolean m28584c() {
        this.f86502c.getClass();
        return jo1.m32829a();
    }

    public /* synthetic */ C31620uz(int i) {
        this(new C31778wz(), new xp0());
    }

    @Nullable
    /* renamed from: b */
    public static String m28586b() {
        return Build.VERSION.RELEASE;
    }

    @Nullable
    /* renamed from: a */
    public static String m28588a() {
        return Build.MANUFACTURER;
    }

    public C31620uz(@NotNull C31778wz deviceTypeProvider, @NotNull xp0 localeProvider) {
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        this.f86500a = deviceTypeProvider;
        this.f86501b = localeProvider;
        this.f86502c = jo1.f81024a;
    }
}
