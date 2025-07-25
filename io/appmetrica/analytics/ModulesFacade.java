package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.AbstractC33948Hh;
import io.appmetrica.analytics.impl.C34063Mc;
import io.appmetrica.analytics.impl.C34111Oc;
import io.appmetrica.analytics.impl.C34135Pc;
import io.appmetrica.analytics.impl.C34159Qc;
import io.appmetrica.analytics.impl.C34182Rc;
import io.appmetrica.analytics.impl.C34206Sc;
import io.appmetrica.analytics.impl.C34818q0;

/* loaded from: classes9.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a */
    private static C34206Sc f92221a = new C34206Sc();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C34206Sc c34206Sc = f92221a;
        C34063Mc c34063Mc = c34206Sc.f93491b;
        c34063Mc.f93231b.mo20778a(context);
        c34063Mc.f93233d.mo20778a(str);
        c34206Sc.f93492c.f93823a.m22523a(context.getApplicationContext().getApplicationContext());
        return AbstractC33948Hh.f92969a.m22539a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z;
        C34206Sc c34206Sc = f92221a;
        c34206Sc.f93491b.getClass();
        c34206Sc.f93492c.getClass();
        c34206Sc.f93490a.getClass();
        synchronized (C34818q0.class) {
            z = C34818q0.f95196f;
        }
        return z;
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C34206Sc c34206Sc = f92221a;
        c34206Sc.f93491b.f93230a.mo20778a(null);
        c34206Sc.f93492c.getClass();
        c34206Sc.f93493d.execute(new C34135Pc(c34206Sc, moduleEvent));
    }

    public static void reportExternalAttribution(int i, @NonNull String str) {
        C34206Sc c34206Sc = f92221a;
        c34206Sc.f93491b.getClass();
        c34206Sc.f93492c.getClass();
        c34206Sc.f93493d.execute(new C34159Qc(c34206Sc, i, str));
    }

    public static void sendEventsBuffer() {
        C34206Sc c34206Sc = f92221a;
        c34206Sc.f93491b.getClass();
        c34206Sc.f93492c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C34206Sc c34206Sc) {
        f92221a = c34206Sc;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C34206Sc c34206Sc = f92221a;
        c34206Sc.f93491b.f93232c.mo20778a(str);
        c34206Sc.f93492c.getClass();
        c34206Sc.f93493d.execute(new C34182Rc(c34206Sc, str, bArr));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C34206Sc c34206Sc = f92221a;
        boolean booleanValue = bool.booleanValue();
        c34206Sc.f93491b.getClass();
        c34206Sc.f93492c.getClass();
        c34206Sc.f93493d.execute(new C34111Oc(c34206Sc, adRevenue, booleanValue));
    }
}
