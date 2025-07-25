package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.c */
/* loaded from: classes9.dex */
public final class C33715c extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92383a;

    /* renamed from: b */
    public final /* synthetic */ String f92384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33715c(Context context, String str) {
        super(0);
        this.f92383a = context;
        this.f92384b = str;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        PackageManager packageManager = this.f92383a.getPackageManager();
        if (AndroidUtils.isApiAchieved(30)) {
            return SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f92384b);
        }
        return packageManager.getInstallerPackageName(this.f92384b);
    }
}
