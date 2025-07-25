package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.appmetrica.analytics.impl.Rf */
/* loaded from: classes9.dex */
public final class C34185Rf implements InterfaceC33830D {

    /* renamed from: a */
    public final String f93449a;

    /* renamed from: b */
    public final C34162Qf f93450b;

    public C34185Rf(@NonNull String str) {
        this(str, new C34162Qf());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33830D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo22314a(@NonNull Context context) {
        return mo22313a(context, new C34909td());
    }

    /* renamed from: b */
    public final AdTrackingInfoResult m22312b(Context context) {
        int i = AdvIdentifiersProvider.f92540a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f93449a);
        C34162Qf c34162Qf = this.f93450b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Boolean bool = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c34162Qf.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = AbstractC33811C5.f92671a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj != null) {
                AdTrackingInfo.Provider provider = (AdTrackingInfo.Provider) obj;
                String string = bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID");
                if (bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED")) {
                    bool = Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED"));
                }
                adTrackingInfo = new AdTrackingInfo(provider, string, bool);
            } else {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.Companion.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public C34185Rf(String str, C34162Qf c34162Qf) {
        this.f93449a = str;
        this.f93450b = c34162Qf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33830D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo22313a(@NonNull Context context, @NonNull InterfaceC34355Yh interfaceC34355Yh) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            C33977Im c33977Im = (C33977Im) interfaceC34355Yh;
            c33977Im.f93041c = 0;
            adTrackingInfoResult = null;
            while (c33977Im.m22534b()) {
                try {
                    return m22312b(context);
                } catch (InvocationTargetException e) {
                    String message = e.getTargetException() != null ? e.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f93449a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((C33977Im) interfaceC34355Yh).f93040b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f93449a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((C33977Im) interfaceC34355Yh).f93040b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
