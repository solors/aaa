package sg.bigo.ads.common.p931s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.s.a */
/* loaded from: classes10.dex */
public final class C43779a {
    @NonNull
    @SuppressLint({"MissingPermission"})
    @WorkerThread
    /* renamed from: a */
    public static C43780b m5019a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Criteria criteria = new Criteria();
            criteria.setAccuracy(2);
            criteria.setAltitudeRequired(false);
            criteria.setBearingRequired(false);
            criteria.setCostAllowed(true);
            criteria.setPowerRequirement(1);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (TextUtils.isEmpty(bestProvider)) {
                C43782a.m5009a(0, "Location", "provider 获取失败");
                return new C43780b(applicationContext, System.currentTimeMillis());
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            if (lastKnownLocation != null) {
                return new C43780b(applicationContext, lastKnownLocation);
            }
            C43780b c43780b = new C43780b(applicationContext, System.currentTimeMillis());
            C43782a.m5009a(0, "Location", "定位失败");
            return c43780b;
        } catch (Exception e) {
            C43780b c43780b2 = new C43780b(applicationContext, System.currentTimeMillis());
            if (e instanceof SecurityException) {
                c43780b2.f114561b = true;
                return c43780b2;
            }
            return c43780b2;
        }
    }
}
