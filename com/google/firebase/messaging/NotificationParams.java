package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class NotificationParams {
    @NonNull

    /* renamed from: a */
    private final Bundle f43226a;

    public NotificationParams(@NonNull Bundle bundle) {
        if (bundle != null) {
            this.f43226a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: a */
    private static int m66580a(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: f */
    private static boolean m66575f(String str) {
        if (!str.startsWith(Constants.AnalyticsKeys.PREFIX) && !str.equals(Constants.MessagePayloadKeys.FROM)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m66574g(String str) {
        if (!str.startsWith(Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX) && !str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) && !str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static String m66573h(String str) {
        if (!str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            return str;
        }
        return str.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }

    /* renamed from: i */
    private String m66572i(String str) {
        if (!this.f43226a.containsKey(str) && str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            String m66573h = m66573h(str);
            if (this.f43226a.containsKey(m66573h)) {
                return m66573h;
            }
        }
        return str;
    }

    /* renamed from: j */
    private static String m66571j(String str) {
        if (str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            return str.substring(6);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public int[] m66579b() {
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.LIGHT_SETTINGS);
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() == 3) {
                iArr[0] = m66580a(jSONArray.optString(0));
                iArr[1] = jSONArray.optInt(1);
                iArr[2] = jSONArray.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public Integer m66578c() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() < 0) {
            Log.w(Constants.TAG, "notificationCount is invalid: " + integer + ". Skipping setting notificationCount.");
            return null;
        }
        return integer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public Integer m66577d() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        Log.w(Constants.TAG, "notificationPriority is invalid " + integer + ". Skipping setting notificationPriority.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Integer m66576e() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.VISIBILITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        Log.w("NotificationParams", "visibility is invalid: " + integer + ". Skipping setting visibility.");
        return null;
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        if (!"1".equals(string) && !Boolean.parseBoolean(string)) {
            return false;
        }
        return true;
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (!TextUtils.isEmpty(string)) {
            try {
                return Integer.valueOf(Integer.parseInt(string));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m66571j(str) + "(" + string + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Nullable
    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (!TextUtils.isEmpty(string)) {
            try {
                return new JSONArray(string);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m66571j(str) + ": " + string + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @Nullable
    public Uri getLink() {
        String string = getString(Constants.MessageNotificationKeys.LINK_ANDROID);
        if (TextUtils.isEmpty(string)) {
            string = getString(Constants.MessageNotificationKeys.LINK);
        }
        if (!TextUtils.isEmpty(string)) {
            return Uri.parse(string);
        }
        return null;
    }

    @Nullable
    public Object[] getLocalizationArgsForKey(String str) {
        JSONArray jSONArray = getJSONArray(str + Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    @Nullable
    public String getLocalizationResourceForKey(String str) {
        return getString(str + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX);
    }

    @Nullable
    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m66571j(str2 + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m66571j(str2) + ": " + Arrays.toString(localizationArgsForKey) + " Default value will be used.", e);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (!TextUtils.isEmpty(string)) {
            try {
                return Long.valueOf(Long.parseLong(string));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m66571j(str) + "(" + string + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String getNotificationChannelId() {
        return getString(Constants.MessageNotificationKeys.CHANNEL);
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return getLocalizedString(resources, str, str2);
    }

    @Nullable
    public String getSoundResourceName() {
        String string = getString(Constants.MessageNotificationKeys.SOUND_2);
        if (TextUtils.isEmpty(string)) {
            return getString(Constants.MessageNotificationKeys.SOUND);
        }
        return string;
    }

    public String getString(String str) {
        return this.f43226a.getString(m66572i(str));
    }

    @Nullable
    public long[] getVibrateTimings() {
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.VIBRATE_TIMINGS);
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() > 1) {
                int length = jSONArray.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = jSONArray.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString(Constants.MessageNotificationKeys.IMAGE_URL));
    }

    public boolean isNotification() {
        return getBoolean(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION);
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = new Bundle(this.f43226a);
        for (String str : this.f43226a.keySet()) {
            if (!m66575f(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = new Bundle(this.f43226a);
        for (String str : this.f43226a.keySet()) {
            if (m66574g(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) || "1".equals(bundle.getString(m66573h(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)));
    }
}
