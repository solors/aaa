package io.bidmachine.utils;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.ConnectionStatus;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes9.dex */
public class DeviceUtils {
    @Nullable
    public static Double getBatteryLevel(@NonNull Context context) {
        try {
            Intent registerInternalReceiver = registerInternalReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerInternalReceiver != null) {
                int intExtra = registerInternalReceiver.getIntExtra("level", -1);
                int intExtra2 = registerInternalReceiver.getIntExtra("scale", -1);
                if (intExtra >= 0 && intExtra2 > 0) {
                    return Double.valueOf(Math.round((intExtra / intExtra2) * 100.0d) / 100.0d);
                }
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static String getBuildId() {
        return Build.ID;
    }

    @NonNull
    public static ConnectionType getConnectionType(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = Utils.getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return ConnectionType.CONNECTION_TYPE_INVALID;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 9) {
                    return ConnectionType.CONNECTION_TYPE_INVALID;
                }
                return ConnectionType.CONNECTION_TYPE_ETHERNET;
            }
            return ConnectionType.CONNECTION_TYPE_WIFI;
        }
        return getMobileNetworkType(activeNetworkInfo);
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static String getDeviceName(@NonNull Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Global.getString(contentResolver, "device_name");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = Settings.Secure.getString(contentResolver, "bluetooth_name");
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (Utils.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT") && defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static DisplayMetrics getDisplayMetrics(@NonNull Context context) {
        return context.getResources().getDisplayMetrics();
    }

    @NonNull
    public static Set<String> getInputLanguageSet(@NonNull Context context) {
        InputMethodManager inputMethodManager;
        HashSet hashSet = new HashSet();
        try {
            inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        } catch (Exception unused) {
        }
        if (inputMethodManager == null) {
            return hashSet;
        }
        for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
            for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                if (inputMethodSubtype.getMode().equals("keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    if (TextUtils.isEmpty(languageTag)) {
                        languageTag = inputMethodSubtype.getLocale();
                    }
                    if (!TextUtils.isEmpty(languageTag)) {
                        int indexOf = languageTag.indexOf("_");
                        if (indexOf > 0) {
                            languageTag = languageTag.substring(0, indexOf);
                        }
                        hashSet.add(languageTag);
                    }
                }
            }
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language)) {
            hashSet.add(language);
        }
        return hashSet;
    }

    @NonNull
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    @NonNull
    private static ConnectionType getMobileNetworkType(@NonNull NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 0:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_3G;
            case 13:
            case 18:
            case 19:
            default:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_4G;
            case 20:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_5G;
        }
    }

    @NonNull
    public static String getModel() {
        return Build.MODEL;
    }

    public static int getOrientation(@Nullable Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().orientation;
        }
        return 0;
    }

    @NonNull
    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    @Nullable
    public static String getPhoneMCCMNC(@NonNull Context context) {
        String networkOperator;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (networkOperator = telephonyManager.getNetworkOperator()) != null && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3) + "-" + networkOperator.substring(3);
            }
            return null;
        } catch (Exception e) {
            Logger.m20086w(e);
            return null;
        }
    }

    @Nullable
    public static String getPhoneOperator(@NonNull Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return null;
        } catch (Exception e) {
            Logger.m20086w(e);
            return null;
        }
    }

    @NonNull
    public static ConnectionStatus getProxyStatus(@NonNull Context context) {
        ConnectivityManager connectivityManager = Utils.getConnectivityManager(context);
        if (connectivityManager == null) {
            return ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
        }
        if (connectivityManager.getDefaultProxy() != null) {
            return ConnectionStatus.CONNECTION_STATUS_ENABLED;
        }
        return ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    @Nullable
    public static Integer getScreenBrightness(@NonNull Context context) {
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Double getScreenBrightnessRatio(@NonNull Context context) {
        Integer screenBrightness = getScreenBrightness(context);
        if (screenBrightness == null) {
            return null;
        }
        return Double.valueOf(Math.round((screenBrightness.intValue() / 255.0d) * 100.0d) / 100.0d);
    }

    public static int getScreenDpi(@NonNull Context context) {
        return getDisplayMetrics(context).densityDpi;
    }

    @Nullable
    public static String getSha1Signature(@NonNull Context context) {
        return getShaSignature(context, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    @Nullable
    public static String getSha256Signature(@NonNull Context context) {
        return getShaSignature(context, "SHA-256");
    }

    @Nullable
    private static String getShaSignature(@NonNull Context context, @NonNull String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return null;
            }
            return Utils.toSignatureHexString(MessageDigest.getInstance(str).digest(signatureArr[0].toByteArray()));
        } catch (Throwable th) {
            Logger.m20086w(th);
            return null;
        }
    }

    @NonNull
    public static ConnectionStatus getVpnStatus(@NonNull Context context) {
        NetworkCapabilities activeNetworkCapabilities = Utils.getActiveNetworkCapabilities(context);
        if (activeNetworkCapabilities == null) {
            return ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
        }
        if (activeNetworkCapabilities.hasTransport(4)) {
            return ConnectionStatus.CONNECTION_STATUS_ENABLED;
        }
        return ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    @Nullable
    public static Boolean isAirplaneModeOn(@NonNull Context context) {
        boolean z;
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Boolean isBatterySaverEnabled(@NonNull Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    @Nullable
    public static Boolean isCharging(@NonNull Context context) {
        try {
            Intent registerInternalReceiver = registerInternalReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerInternalReceiver != null) {
                int intExtra = registerInternalReceiver.getIntExtra("plugged", -1);
                boolean z = true;
                if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isDarkModeEnabled(@NonNull Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    @Nullable
    public static Boolean isDoNotDisturbOn(@NonNull Context context) {
        boolean z;
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isTablet(@NonNull Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        double d = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        if (Math.sqrt((d * d) + (d2 * d2)) >= 6.6d) {
            return true;
        }
        return false;
    }

    @Nullable
    private static Intent registerInternalReceiver(@NonNull Context context, @NonNull IntentFilter intentFilter) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT >= 34) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(null, intentFilter);
    }
}
