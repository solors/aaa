package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.mobilefuse.sdk.MobileFuseDefaults;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.n5 */
/* loaded from: classes3.dex */
public final class C10063n5 extends AbstractC10179s0 {

    /* renamed from: b */
    public final Context f22645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10063n5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22645b = context;
    }

    /* renamed from: b */
    public C10158r0 m81038b() {
        String str = null;
        if (m80639a()) {
            return new C10158r0(EnumC10170ra.f23056e, null);
        }
        EnumC10170ra enumC10170ra = EnumC10170ra.f23054c;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f22645b);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                enumC10170ra = EnumC10170ra.f23056e;
            } else {
                enumC10170ra = EnumC10170ra.f23055d;
                String id2 = advertisingIdInfo.getId();
                try {
                    if (Intrinsics.m17075f(MobileFuseDefaults.ADVERTISING_ID_ZEROS, id2)) {
                        enumC10170ra = EnumC10170ra.f23056e;
                    } else {
                        str = id2;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                    e = e;
                    str = id2;
                    C9763c7.m81920b("Google play service is not available.", e);
                    return new C10158r0(enumC10170ra, str);
                } catch (GooglePlayServicesRepairableException e2) {
                    e = e2;
                    str = id2;
                    C9763c7.m81920b("There was a recoverable error connecting to Google Play Services.", e);
                    return new C10158r0(enumC10170ra, str);
                } catch (IOException e3) {
                    e = e3;
                    str = id2;
                    C9763c7.m81920b("The connection to Google Play Services failed.", e);
                    return new C10158r0(enumC10170ra, str);
                } catch (IllegalStateException e4) {
                    e = e4;
                    str = id2;
                    C9763c7.m81920b("This should have been called off the main thread.", e);
                    return new C10158r0(enumC10170ra, str);
                }
            }
        } catch (GooglePlayServicesNotAvailableException e5) {
            e = e5;
        } catch (GooglePlayServicesRepairableException e6) {
            e = e6;
        } catch (IOException e7) {
            e = e7;
        } catch (IllegalStateException e8) {
            e = e8;
        }
        return new C10158r0(enumC10170ra, str);
    }
}
