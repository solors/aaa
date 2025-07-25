package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import com.inmobi.media.AbstractC19512w9;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.w9 */
/* loaded from: classes6.dex */
public abstract class AbstractC19512w9 {

    /* renamed from: a */
    public static int f48828a = Integer.MIN_VALUE;

    /* renamed from: b */
    public static Boolean f48829b = null;

    /* renamed from: c */
    public static String f48830c = null;

    /* renamed from: d */
    public static String f48831d = null;

    /* renamed from: e */
    public static String f48832e = null;

    /* renamed from: f */
    public static String f48833f = null;

    /* renamed from: g */
    public static String f48834g = null;

    /* renamed from: h */
    public static String f48835h = null;

    /* renamed from: i */
    public static int f48836i = Integer.MIN_VALUE;

    /* renamed from: j */
    public static String f48837j;

    /* renamed from: k */
    public static String f48838k;

    /* renamed from: l */
    public static String f48839l;

    /* renamed from: m */
    public static String f48840m;

    /* renamed from: n */
    public static Location f48841n;

    /* renamed from: a */
    public static void m59607a(final boolean z) {
        f48829b = Boolean.valueOf(z);
        final Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            C18954Ha.m61079a(new Runnable() { // from class: o3.z6
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19512w9.m59608a(m61068d, z);
                }
            });
        }
    }

    /* renamed from: b */
    public static Location m59606b() {
        Location location = f48841n;
        if (location != null) {
            return location;
        }
        Context m61068d = C18954Ha.m61068d();
        Location location2 = null;
        if (m61068d == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "user_info_store");
        Intrinsics.checkNotNullParameter(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, "key");
        String string = m59823a.f48820a.getString(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(",").m16763h(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f48841n = location2;
        return location2;
    }

    /* renamed from: c */
    public static boolean m59605c() {
        Boolean bool = f48829b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "user_info_store");
            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
            f48829b = Boolean.valueOf(m59823a.f48820a.getBoolean("user_age_restricted", false));
        }
        Boolean bool2 = f48829b;
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    /* renamed from: a */
    public static final void m59608a(Context it, boolean z) {
        Intrinsics.checkNotNullParameter(it, "$it");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        AbstractC19494v5.m59823a(it, "user_info_store").m59617a("user_age_restricted", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap m59609a() {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC19512w9.m59609a():java.util.HashMap");
    }
}
