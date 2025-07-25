package net.pubnative.lite.sdk.vpaid.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class Utils {
    private static final String TAG = "Utils";
    private static boolean debugMode = true;

    /* renamed from: net.pubnative.lite.sdk.vpaid.utils.Utils$1 */
    /* loaded from: classes10.dex */
    static /* synthetic */ class C388061 {

        /* renamed from: $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption */
        static final /* synthetic */ int[] f102199x5d8ba3c9;

        static {
            int[] iArr = new int[StretchOption.values().length];
            f102199x5d8ba3c9 = iArr;
            try {
                iArr[StretchOption.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102199x5d8ba3c9[StretchOption.STRETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102199x5d8ba3c9[StretchOption.NO_STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public enum StretchOption {
        NONE,
        STRETCH,
        NO_STRETCH
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1 = (r4 * 100.0f) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.FrameLayout.LayoutParams calculateNewLayoutParams(android.widget.FrameLayout.LayoutParams r2, int r3, int r4, int r5, int r6, net.pubnative.lite.sdk.vpaid.utils.Utils.StretchOption r7) {
        /*
            r0 = 17
            r2.gravity = r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r1 = 0
            if (r3 != r4) goto L30
            if (r5 != r6) goto L10
            r2.width = r5
            r2.height = r6
            goto L70
        L10:
            if (r5 <= r6) goto L21
            r2.height = r6
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = (float) r6
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.width = r3
            int r4 = r5 - r3
            if (r3 == 0) goto L70
            goto L6b
        L21:
            r2.width = r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = (float) r5
            float r4 = r4 * r3
            int r3 = (int) r4
            r2.height = r3
            int r4 = r6 - r3
            if (r3 == 0) goto L70
            goto L6b
        L30:
            if (r3 <= r4) goto L4f
            r2.width = r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = (float) r5
            float r4 = r4 * r3
            int r3 = (int) r4
            r2.height = r3
            if (r3 <= r6) goto L48
            float r4 = (float) r6
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.height = r6
            float r3 = (float) r5
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.width = r3
        L48:
            int r3 = r2.height
            int r4 = r6 - r3
            if (r3 == 0) goto L70
            goto L6b
        L4f:
            r2.height = r6
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = (float) r6
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.width = r3
            if (r3 <= r5) goto L65
            float r4 = (float) r5
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.width = r5
            float r3 = (float) r6
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.height = r3
        L65:
            int r3 = r2.width
            int r4 = r5 - r3
            if (r3 == 0) goto L70
        L6b:
            float r4 = (float) r4
            float r4 = r4 * r0
            float r3 = (float) r3
            float r1 = r4 / r3
        L70:
            int[] r3 = net.pubnative.lite.sdk.vpaid.utils.Utils.C388061.f102199x5d8ba3c9
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L84
            r4 = 2
            if (r3 == r4) goto L7f
            goto L8e
        L7f:
            r2.width = r5
            r2.height = r6
            goto L8e
        L84:
            r3 = 1093664768(0x41300000, float:11.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r2.width = r5
            r2.height = r6
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.utils.Utils.calculateNewLayoutParams(android.widget.FrameLayout$LayoutParams, int, int, int, int, net.pubnative.lite.sdk.vpaid.utils.Utils$StretchOption):android.widget.FrameLayout$LayoutParams");
    }

    public static String getStringFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString("UTF-8");
            }
        }
    }

    public static float getSystemVolume(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 1.0f;
        }
        return Math.round((audioManager.getStreamVolume(3) * 100.0f) / audioManager.getStreamMaxVolume(3)) / 100.0f;
    }

    public static boolean isDebug() {
        return debugMode;
    }

    public static boolean isEmulator() {
        String str = Build.MODEL;
        if (!str.contains("google_sdk") && !str.contains("Emulator") && !str.contains("Android SDK") && !Build.MANUFACTURER.contains("Genymotion")) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            HyBid.reportException(e);
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isPhoneMuted(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || audioManager.getRingerMode() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.pubnative.lite.sdk.models.ContentInfo parseContentInfo(net.pubnative.lite.sdk.vpaid.models.vast.Icon r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.utils.Utils.parseContentInfo(net.pubnative.lite.sdk.vpaid.models.vast.Icon):net.pubnative.lite.sdk.models.ContentInfo");
    }

    public static Integer parseDuration(String str) {
        try {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            return Integer.valueOf(Double.valueOf(split[2]).intValue() + (Integer.parseInt(split[1]) * 60) + (parseInt * 3600));
        } catch (RuntimeException e) {
            HyBid.reportException((Exception) e);
            Logger.m14227e(TAG, "Error while parsing ad duration");
            return null;
        }
    }

    public static int parsePercent(String str) {
        return Integer.parseInt(str.replace("%", "").trim());
    }

    public static String readAssets(AssetManager assetManager, String str) throws IOException {
        return getStringFromStream(assetManager.open(str));
    }

    public static void setDebugMode(boolean z) {
        debugMode = z;
    }
}
