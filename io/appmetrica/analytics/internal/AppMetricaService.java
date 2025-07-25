package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.BinderC34819q1;
import io.appmetrica.analytics.impl.C33832D1;
import io.appmetrica.analytics.impl.C33899Fi;
import io.appmetrica.analytics.impl.C33907G1;
import io.appmetrica.analytics.impl.C33924Gi;
import io.appmetrica.analytics.impl.C33980J1;
import io.appmetrica.analytics.impl.C34693la;
import io.appmetrica.analytics.impl.C34742n5;
import io.appmetrica.analytics.impl.C34792p1;
import io.appmetrica.analytics.impl.C34889sj;
import io.appmetrica.analytics.impl.C34897t1;
import io.appmetrica.analytics.impl.C34949v1;
import io.appmetrica.analytics.impl.C34975w1;
import io.appmetrica.analytics.impl.C35001x1;
import io.appmetrica.analytics.impl.C35027y1;
import io.appmetrica.analytics.impl.C35053z1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public class AppMetricaService extends Service {

    /* renamed from: c */
    private static C33832D1 f95705c;

    /* renamed from: a */
    private final C34792p1 f95706a = new C34792p1(this);

    /* renamed from: b */
    private final BinderC35077a f95707b = new BinderC35077a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        String action = intent.getAction();
        if (action != null && action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) {
            iBinder = new BinderC34819q1();
        } else {
            iBinder = this.f95707b;
        }
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C35001x1(c33832d1, intent));
        return iBinder;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C34897t1(c33832d1, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C34693la.m21451a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        C33832D1 c33832d1 = f95705c;
        if (c33832d1 == null) {
            Context applicationContext = getApplicationContext();
            C33907G1 c33907g1 = new C33907G1(applicationContext, this.f95706a, new C34742n5(applicationContext));
            C34889sj c34889sj = C34693la.f94825C.f94849v;
            C33980J1 c33980j1 = new C33980J1(c33907g1);
            LinkedHashMap linkedHashMap = c34889sj.f95335a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(c33980j1);
            f95705c = new C33832D1(C34693la.f94825C.f94831d.m20772b(), c33907g1);
        } else {
            c33832d1.f92686b.mo20988a(this.f95706a);
        }
        C34693la c34693la = C34693la.f94825C;
        C33924Gi c33924Gi = new C33924Gi(f95705c);
        synchronized (c34693la) {
            c34693la.f94833f = new C33899Fi(c34693la.f94828a, c33924Gi);
        }
        f95705c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f95705c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C35027y1(c33832d1, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C34949v1(c33832d1, intent, i));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C34975w1(c33832d1, intent, i, i2));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C33832D1 c33832d1 = f95705c;
        c33832d1.f92685a.execute(new C35053z1(c33832d1, intent));
        String action = intent.getAction();
        if ((action != null && action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) || intent.getData() == null) {
            return false;
        }
        return true;
    }
}
