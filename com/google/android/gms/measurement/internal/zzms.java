package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzin;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzms {
    private static final String[] zza = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> zzb;

    private zzms(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        hashMap.putAll(map);
    }

    private static int zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    private static String zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int zzd() {
        try {
            String str = this.zzb.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int zze() {
        try {
            String str = this.zzb.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzms)) {
            return false;
        }
        return zzc().equalsIgnoreCase(((zzms) obj).zzc());
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        String[] strArr;
        StringBuilder sb2 = new StringBuilder();
        for (String str : zza) {
            if (this.zzb.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(this.zzb.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle zza() {
        if (!("1".equals(this.zzb.get("GoogleConsent")) && "1".equals(this.zzb.get("gdprApplies")) && "1".equals(this.zzb.get("EnableAdvertiserConsentMode")))) {
            return Bundle.EMPTY;
        }
        int zze = zze();
        if (zze < 0) {
            return Bundle.EMPTY;
        }
        String str = this.zzb.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "granted";
        if (str.length() > 0) {
            bundle.putString(zzin.zza.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(zzin.zza.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && zze >= 4) {
            bundle.putString(zzin.zza.AD_USER_DATA.zze, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "denied" : "denied");
        }
        return bundle;
    }

    public final String zzb() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int zzd = zzd();
        if (zzd >= 0 && zzd <= 4095) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((zzd >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zzd & 63));
        } else {
            sb2.append("00");
        }
        int zze = zze();
        if (zze >= 0 && zze <= 63) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zze));
        } else {
            sb2.append("0");
        }
        Preconditions.checkArgument(true);
        int i = ("1".equals(this.zzb.get("gdprApplies")) ? 2 : 0) | 4;
        if ("1".equals(this.zzb.get("EnableAdvertiserConsentMode"))) {
            i |= 8;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i));
        return sb2.toString();
    }

    public static zzms zza(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String zzb = zzb(sharedPreferences, CmpApiConstants.IABTCF_VENDOR_CONSENT);
        if (!"\u0000".equals(zzb) && zzb.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(zzb.charAt(754)));
        }
        int zza2 = zza(sharedPreferences, "IABTCF_gdprApplies");
        if (zza2 != -1) {
            hashMap.put("gdprApplies", String.valueOf(zza2));
        }
        int zza3 = zza(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (zza3 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(zza3));
        }
        int zza4 = zza(sharedPreferences, CmpApiConstants.IABTCF_POLICY_VERSION);
        if (zza4 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(zza4));
        }
        String zzb2 = zzb(sharedPreferences, CmpApiConstants.IABTCF_PURPOSE_CONSENTS);
        if (!"\u0000".equals(zzb2)) {
            hashMap.put("PurposeConsents", zzb2);
        }
        int zza5 = zza(sharedPreferences, CmpApiConstants.IABTCF_CMP_SDK_ID);
        if (zza5 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(zza5));
        }
        return new zzms(hashMap);
    }

    public static String zza(String str, boolean z) {
        if (!z || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 1;
        while (true) {
            if (i >= 64) {
                i = 0;
                break;
            } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i)) {
                break;
            } else {
                i++;
            }
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
        return String.valueOf(charArray);
    }
}
