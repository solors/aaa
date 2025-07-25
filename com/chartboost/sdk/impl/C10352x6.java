package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.chartboost.sdk.impl.x6 */
/* loaded from: classes3.dex */
public final class C10352x6 {

    /* renamed from: a */
    public final PackageManager f23531a;

    /* renamed from: b */
    public final Functions f23532b;

    /* renamed from: com.chartboost.sdk.impl.x6$a */
    /* loaded from: classes3.dex */
    public static final class C10353a extends Lambda implements Functions {

        /* renamed from: b */
        public static final C10353a f23533b = new C10353a();

        public C10353a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final Intent invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public C10352x6(PackageManager packageManager, Functions intentFactory) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        this.f23531a = packageManager;
        this.f23532b = intentFactory;
    }

    /* renamed from: a */
    public final Intent m80090a(String str) {
        Intent intent = (Intent) this.f23532b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* renamed from: b */
    public final boolean m80089b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return !m80092a(m80090a(str)).isEmpty();
        } catch (Exception e) {
            C9763c7.m81920b("Cannot open URL", e);
            return false;
        }
    }

    /* renamed from: a */
    public final List m80091a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List queryIntentActivities = this.f23531a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        return queryIntentActivities;
    }

    public /* synthetic */ C10352x6(PackageManager packageManager, Functions functions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i & 2) != 0 ? C10353a.f23533b : functions);
    }

    /* renamed from: a */
    public final List m80092a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags of = PackageManager.ResolveInfoFlags.of(65536L);
            Intrinsics.checkNotNullExpressionValue(of, "of(...)");
            return m80091a(intent, of);
        }
        List<ResolveInfo> queryIntentActivities = this.f23531a.queryIntentActivities(intent, 65536);
        Intrinsics.m17074g(queryIntentActivities);
        return queryIntentActivities;
    }
}
