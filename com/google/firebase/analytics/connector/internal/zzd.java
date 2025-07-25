package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zzis;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zzd {

    /* renamed from: a */
    private static final ImmutableSet<String> f42058a = ImmutableSet.m69325of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    private static final ImmutableList<String> f42059b = ImmutableList.m69417of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final ImmutableList<String> f42060c = ImmutableList.m69421of("auto", "app", "am");

    /* renamed from: d */
    private static final ImmutableList<String> f42061d = ImmutableList.m69422of("_r", "_dbg");

    /* renamed from: e */
    private static final ImmutableList<String> f42062e = new ImmutableList.Builder().add((Object[]) zzis.zza).add((Object[]) zzis.zzb).build();

    /* renamed from: f */
    private static final ImmutableList<String> f42063f = ImmutableList.m69422of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.origin;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.name;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            zzik.zza(bundle, obj);
        }
        String str3 = conditionalUserProperty.triggerEventName;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str4);
        }
        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str5 = conditionalUserProperty.triggeredEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str5);
        }
        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
        String str6 = conditionalUserProperty.expiredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str6);
        }
        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static String zzb(String str) {
        String zzb = zziq.zzb(str);
        return zzb != null ? zzb : str;
    }

    public static boolean zzc(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zzd(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zze(String str) {
        if (!f42058a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean zzf(String str) {
        if (!f42060c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            if (zzf(str) && bundle != null) {
                ImmutableList<String> immutableList = f42061d;
                int size = immutableList.size();
                int i = 0;
                while (i < size) {
                    String str3 = immutableList.get(i);
                    i++;
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 101200:
                        if (str.equals("fcm")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 101230:
                        if (str.equals("fdl")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3142703:
                        if (str.equals("fiam")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    case 1:
                        bundle.putString("_cis", "fdl_integration");
                        return true;
                    case 2:
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    default:
                        return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean zzb(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.value;
        if ((obj == null || zzkq.zza(obj) != null) && zzf(str) && zza(str, conditionalUserProperty.name)) {
            String str2 = conditionalUserProperty.expiredEventName;
            if (str2 == null || (zza(str2, conditionalUserProperty.expiredEventParams) && zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                String str3 = conditionalUserProperty.triggeredEventName;
                if (str3 == null || (zza(str3, conditionalUserProperty.triggeredEventParams) && zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    String str4 = conditionalUserProperty.timedOutEventName;
                    if (str4 != null) {
                        return zza(str4, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static AnalyticsConnector.ConditionalUserProperty zza(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) zzik.zza(bundle, "origin", String.class, null));
        conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) zzik.zza(bundle, "name", String.class, null));
        conditionalUserProperty.value = zzik.zza(bundle, "value", Object.class, null);
        conditionalUserProperty.triggerEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggerTimeout = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        conditionalUserProperty.timedOutEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        conditionalUserProperty.timedOutEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.triggeredEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggeredEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.timeToLive = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        conditionalUserProperty.expiredEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        conditionalUserProperty.expiredEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.active = ((Boolean) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.creationTimestamp = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        conditionalUserProperty.triggeredTimestamp = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String zza(String str) {
        String zza = zziq.zza(str);
        return zza != null ? zza : str;
    }

    public static void zza(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean zza(String str, Bundle bundle) {
        if (f42059b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            ImmutableList<String> immutableList = f42061d;
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                String str2 = immutableList.get(i);
                i++;
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean zza(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        } else if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f42062e.contains(str2)) {
            return false;
        } else {
            ImmutableList<String> immutableList = f42063f;
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                String str3 = immutableList.get(i);
                i++;
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
