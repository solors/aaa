package p1007v3;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: v3.f */
/* loaded from: classes6.dex */
public class CountryUtils {

    /* renamed from: a */
    private static final Set<String> f116844a;

    static {
        HashSet hashSet = new HashSet();
        f116844a = hashSet;
        hashSet.add("AT");
        hashSet.add("BE");
        hashSet.add("BG");
        hashSet.add("HR");
        hashSet.add("CY");
        hashSet.add("CZ");
        hashSet.add("DK");
        hashSet.add("EE");
        hashSet.add("FI");
        hashSet.add("FR");
        hashSet.add("DE");
        hashSet.add("EL");
        hashSet.add("HU");
        hashSet.add("IE");
        hashSet.add("IT");
        hashSet.add("LV");
        hashSet.add("LT");
        hashSet.add("LU");
        hashSet.add("MT");
        hashSet.add("NL");
        hashSet.add("PL");
        hashSet.add("PT");
        hashSet.add("RO");
        hashSet.add("SK");
        hashSet.add("SI");
        hashSet.add("ES");
        hashSet.add("SE");
        hashSet.add("UK");
        hashSet.add("CH");
    }

    /* renamed from: a */
    public static String m2696a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    return simCountryIso;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: b */
    public static boolean m2695b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            return f116844a.contains(str.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
