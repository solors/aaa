package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d42 {
    @NotNull

    /* renamed from: a */
    private final x52 f77880a;
    @NotNull

    /* renamed from: b */
    private final c42 f77881b;
    @NotNull

    /* renamed from: c */
    private final Context f77882c;
    @NotNull

    /* renamed from: d */
    private final e42 f77883d;

    public /* synthetic */ d42(Context context) {
        this(context, new x52(), new c42());
    }

    /* renamed from: a */
    public final void m35102a() {
        x52 x52Var = this.f77880a;
        Context context = this.f77882c;
        x52Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30155da.m34982a(context) && this.f77881b.m35360a(this.f77882c)) {
            this.f77883d.getClass();
            e42.m34667b();
        }
    }

    public d42(@NotNull Context context, @NotNull x52 versionValidationNeedChecker, @NotNull c42 validationErrorLogChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorLogChecker, "validationErrorLogChecker");
        this.f77880a = versionValidationNeedChecker;
        this.f77881b = validationErrorLogChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f77882c = applicationContext;
        this.f77883d = new e42();
    }
}
