package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.h */
/* loaded from: classes9.dex */
public final class C33720h extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92396a;

    /* renamed from: b */
    public final /* synthetic */ String f92397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33720h(Context context, String str) {
        super(0);
        this.f92396a = context;
        this.f92397b = str;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        PackageManager packageManager = this.f92396a.getPackageManager();
        if (AndroidUtils.isApiAchieved(33)) {
            return PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f92397b);
        }
        return packageManager.resolveContentProvider(this.f92397b, 128);
    }
}
