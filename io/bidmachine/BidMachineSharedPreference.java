package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.utils.SharedPreferenceUtils;
import io.bidmachine.utils.ThrowableRunnable;
import java.util.UUID;

/* renamed from: io.bidmachine.j2 */
/* loaded from: classes9.dex */
public class BidMachineSharedPreference {
    @NonNull
    private static final String KEY_BM_IFV = "bid_machine_ifv";
    @NonNull
    private static final String KEY_FIRST_LAUNCH_TIME = "first_app_launch_ms";
    @NonNull
    private static final String KEY_HW_INFO = "hw_info_";
    @NonNull
    private static final String KEY_INIT_DATA = "initData";
    @NonNull
    private static final String KEY_INIT_DATA_SESSION_ID = "init_data_session_id";
    @NonNull
    private static final String KEY_INIT_EXTRAS = "init_extras";
    @NonNull
    private static final String KEY_SESSION_COUNT = "session_count";
    @NonNull
    private static final String KEY_USER_AGENT = "ua";
    @NonNull
    private static final String KEY_USER_AGENT_DEVICE_OS = "ua_device_os";
    @NonNull
    private static final String KEY_USER_AGENT_EXPIRATION = "ua_exp";
    @NonNull
    private static final String NAME = "BidMachinePref";
    @Nullable
    private static SharedPreferences sharedPreferences;

    BidMachineSharedPreference() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m20061a(Context context, int i) {
        lambda$storeSessionCount$0(context, i);
    }

    @VisibleForTesting
    static void clear(@NonNull Context context) {
        SharedPreferenceUtils.clear(getSharedPreferences(context));
    }

    public static void clearInitExtras(@NonNull Context context) {
        SharedPreferenceUtils.remove(getSharedPreferences(context), KEY_INIT_EXTRAS);
    }

    @Nullable
    public static String getHwInfo(@NonNull Context context, @NonNull String str) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        return SharedPreferenceUtils.optString(sharedPreferences2, KEY_HW_INFO + str, null);
    }

    @Nullable
    public static Extras getInitExtras(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            return Extras.parseFrom(Base64.decode(SharedPreferenceUtils.optString(sharedPreferences2, KEY_INIT_EXTRAS, null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtils.remove(sharedPreferences2, KEY_INIT_EXTRAS);
            return null;
        }
    }

    @Nullable
    public static InitResponse getInitResponse(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            return InitResponse.parseFrom(Base64.decode(sharedPreferences2.getString(KEY_INIT_DATA, null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtils.remove(sharedPreferences2, KEY_INIT_DATA);
            return null;
        }
    }

    @NonNull
    public static String getInitResponseSessionId(@NonNull Context context) {
        String optString = SharedPreferenceUtils.optString(getSharedPreferences(context), KEY_INIT_DATA_SESSION_ID, null);
        if (optString != null) {
            return optString;
        }
        return "";
    }

    public static int getSessionCount(@NonNull Context context) {
        return SharedPreferenceUtils.optInt(getSharedPreferences(context), KEY_SESSION_COUNT, 0);
    }

    @NonNull
    @VisibleForTesting
    static SharedPreferences getSharedPreferences(@NonNull Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    @Nullable
    public static String getUserAgent(@NonNull Context context) {
        return SharedPreferenceUtils.optString(getSharedPreferences(context), "ua", null);
    }

    @Nullable
    public static String getUserAgentDeviceOs(@NonNull Context context) {
        return SharedPreferenceUtils.optString(getSharedPreferences(context), KEY_USER_AGENT_DEVICE_OS, null);
    }

    public static long getUserAgentExpirationMs(@NonNull Context context) {
        return SharedPreferenceUtils.optLong(getSharedPreferences(context), KEY_USER_AGENT_EXPIRATION, -1L);
    }

    public static void incrementSessionCount(@NonNull Context context) {
        storeSessionCount(context, getSessionCount(context) + 1);
    }

    public static /* synthetic */ void lambda$storeSessionCount$0(Context context, int i) throws Throwable {
        getSharedPreferences(context).edit().putInt(KEY_SESSION_COUNT, i).apply();
    }

    @NonNull
    public static String obtainBMIFV(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        String str = null;
        try {
            str = sharedPreferences2.getString(KEY_BM_IFV, null);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences2.edit().putString(KEY_BM_IFV, uuid).apply();
        return uuid;
    }

    public static long obtainFirstLaunchTimeMs(@NonNull Context context) {
        long j;
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            j = sharedPreferences2.getLong(KEY_FIRST_LAUNCH_TIME, 0L);
        } catch (Exception unused) {
            j = 0;
        }
        if (j != 0) {
            return j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        sharedPreferences2.edit().putLong(KEY_FIRST_LAUNCH_TIME, currentTimeMillis).apply();
        return currentTimeMillis;
    }

    public static void setHwInfo(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        SharedPreferenceUtils.putString(sharedPreferences2, KEY_HW_INFO + str, str2);
    }

    public static void setUserAgent(@NonNull Context context, @Nullable String str) {
        SharedPreferenceUtils.putString(getSharedPreferences(context), "ua", str);
    }

    public static void setUserAgentDeviceOs(@NonNull Context context, @Nullable String str) {
        SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_USER_AGENT_DEVICE_OS, str);
    }

    public static void setUserAgentExpirationMs(@NonNull Context context, long j) {
        SharedPreferenceUtils.putLong(getSharedPreferences(context), KEY_USER_AGENT_EXPIRATION, Long.valueOf(j));
    }

    public static void storeInitExtras(@NonNull Context context, @NonNull Extras extras) {
        try {
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_EXTRAS, Base64.encodeToString(extras.toByteArray(), 0));
        } catch (Exception unused) {
        }
    }

    public static void storeInitResponse(@NonNull Context context, @NonNull InitResponse initResponse, @NonNull String str) {
        try {
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_DATA, Base64.encodeToString(initResponse.toByteArray(), 0));
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_DATA_SESSION_ID, str);
        } catch (Exception unused) {
        }
    }

    static void storeSessionCount(@NonNull final Context context, final int i) {
        Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.i2
            @Override // io.bidmachine.utils.ThrowableRunnable
            public final void run() {
                BidMachineSharedPreference.m20061a(context, i);
            }
        });
    }
}
