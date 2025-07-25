package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dq0 {
    @NotNull

    /* renamed from: a */
    private final String f78215a;
    @NotNull

    /* renamed from: b */
    private final ak1 f78216b;
    @NotNull

    /* renamed from: c */
    private final Context f78217c;

    public /* synthetic */ dq0(Context context, String str) {
        this(context, str, new ak1());
    }

    @Nullable
    /* renamed from: a */
    public final sb0 m34872a() {
        Class<?> cls;
        ak1 ak1Var = this.f78216b;
        String className = this.f78215a;
        ak1Var.getClass();
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            cls = Class.forName(className);
        } catch (Throwable unused) {
            um0.m28726c(className);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        ak1 ak1Var2 = this.f78216b;
        Object[] objArr = {this.f78217c};
        ak1Var2.getClass();
        Object m35842a = ak1.m35842a(cls, "getFusedLocationProviderClient", objArr);
        if (m35842a == null) {
            return null;
        }
        return new sb0(m35842a);
    }

    public dq0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull ak1 reflectHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        this.f78215a = locationServicesClassName;
        this.f78216b = reflectHelper;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f78217c = applicationContext;
    }
}
