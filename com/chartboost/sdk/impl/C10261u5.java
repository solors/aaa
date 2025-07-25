package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.u5 */
/* loaded from: classes3.dex */
public final class C10261u5 {

    /* renamed from: a */
    public final Context f23270a;

    public C10261u5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23270a = context;
    }

    /* renamed from: a */
    public final void m80407a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            this.f23270a.startActivity(intent);
        } catch (Exception e) {
            C9763c7.m81920b("Cannot start the activity", e);
        }
    }

    /* renamed from: a */
    public final Intent m80408a() {
        Intent addFlags = new Intent(this.f23270a, CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        return addFlags;
    }
}
