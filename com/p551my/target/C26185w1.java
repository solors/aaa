package com.p551my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.p551my.target.common.MyTargetConfig;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.w1 */
/* loaded from: classes7.dex */
public class C26185w1 extends AbstractC26021q1 {

    /* renamed from: a */
    public Map f68128a;

    /* renamed from: a */
    public final void m42623a(Map map, Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, C26484a.f69184A);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put(C26484a.f69184A, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m42622b(Map map, Context context) {
        AbstractC25846ja.m43680a("GoogleAIdDataProvider: Send google AId");
        String str = null;
        try {
            str = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            AbstractC25846ja.m43680a("GoogleAIdDataProvider: Google AId - " + str);
            int isLimitAdTrackingEnabled = AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled() ^ 1;
            AbstractC25846ja.m43680a("GoogleAIdDataProvider: Ad tracking enabled - " + (isLimitAdTrackingEnabled ^ 1));
            map.put("advertising_id", str);
            map.put("advertising_tracking_enabled", isLimitAdTrackingEnabled + "");
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("GoogleAIdDataProvider: Failed to send google AId - " + th.getMessage());
        }
        if (!m42624a(str)) {
            m42623a(map, context);
        }
    }

    /* renamed from: a */
    public synchronized Map m42625a(MyTargetConfig myTargetConfig, Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43680a("GoogleAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f68128a == null) {
            HashMap hashMap = new HashMap();
            this.f68128a = hashMap;
            m42622b(hashMap, context);
        }
        return new HashMap(this.f68128a);
    }

    /* renamed from: a */
    public static boolean m42624a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }
}
