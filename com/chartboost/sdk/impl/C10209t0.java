package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.t0 */
/* loaded from: classes3.dex */
public final class C10209t0 extends AbstractC10179s0 {

    /* renamed from: b */
    public final ContentResolver f23153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10209t0(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f23153b = contentResolver;
    }

    /* renamed from: b */
    public C10158r0 m80561b() {
        boolean z;
        String string;
        EnumC10170ra enumC10170ra = EnumC10170ra.f23054c;
        String str = null;
        try {
            if (Settings.Secure.getInt(this.f23153b, CommonUrlParts.LIMIT_AD_TRACKING) != 0) {
                z = true;
            } else {
                z = false;
            }
            string = Settings.Secure.getString(this.f23153b, "advertising_id");
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (!z && !Intrinsics.m17075f(string, MobileFuseDefaults.ADVERTISING_ID_ZEROS) && !m80639a()) {
            enumC10170ra = EnumC10170ra.f23055d;
            str = string;
            return new C10158r0(enumC10170ra, str);
        }
        enumC10170ra = EnumC10170ra.f23056e;
        return new C10158r0(enumC10170ra, str);
    }
}
