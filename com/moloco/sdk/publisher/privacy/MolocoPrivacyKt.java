package com.moloco.sdk.publisher.privacy;

import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.moloco.sdk.internal.android_context.C23936b;
import kotlin.Metadata;
import kotlin.text.StringsJVM;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoPrivacyKt {
    public static final Boolean gdprApplies() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C23936b.m47315b(null, 1, null));
        if (!defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            return null;
        }
        try {
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (ClassCastException unused) {
            return Boolean.valueOf(defaultSharedPreferences.getBoolean("IABTCF_gdprApplies", false));
        }
    }

    public static final String getTCFConsent() {
        boolean m16635B;
        String string = PreferenceManager.getDefaultSharedPreferences(C23936b.m47315b(null, 1, null)).getString("IABTCF_TCString", null);
        if (string != null) {
            m16635B = StringsJVM.m16635B(string);
            if (m16635B) {
                return null;
            }
            return string;
        }
        return null;
    }

    public static final String getUSPrivacyConsentString(String str) {
        boolean m16635B;
        String string = PreferenceManager.getDefaultSharedPreferences(C23936b.m47315b(null, 1, null)).getString("IABUSPrivacy_String", null);
        if (string != null) {
            m16635B = StringsJVM.m16635B(string);
            if (!m16635B) {
                return string;
            }
            return str;
        }
        return str;
    }
}
