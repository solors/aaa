package io.bidmachine.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.device.ads.DtbConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ThrowableRunnable;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Utils {
    @NonNull
    private static final Handler BACKGROUND_HANDLER;
    @NonNull
    private static final LazyCachedValue<Integer> CURRENT_YEAR;
    private static String appName;
    private static String appVersion;
    @NonNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    @NonNull
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();
    @NonNull
    private static final char[] UPPER_HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.bidmachine.core.Utils$a */
    /* loaded from: classes9.dex */
    public class RunnableC35679a implements Runnable {
        final /* synthetic */ String val$url;

        RunnableC35679a(String str) {
            this.val$url = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                java.lang.String r2 = r4.val$url     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                r0 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L51
                r0 = 1
                r1.setInstanceFollowRedirects(r0)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L51
                java.lang.String r0 = "Connection"
                java.lang.String r2 = "close"
                r1.setRequestProperty(r0, r2)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L51
                java.lang.String r0 = "GET"
                r1.setRequestMethod(r0)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L51
                r1.getResponseCode()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L51
                java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Exception -> L4c
                io.bidmachine.core.Utils.close(r0)     // Catch: java.lang.Exception -> L4c
                r1.disconnect()     // Catch: java.lang.Exception -> L4c
                goto L50
            L31:
                r0 = move-exception
                goto L3c
            L33:
                r1 = move-exception
                r3 = r1
                r1 = r0
                r0 = r3
                goto L52
            L38:
                r1 = move-exception
                r3 = r1
                r1 = r0
                r0 = r3
            L3c:
                io.bidmachine.core.Logger.m20086w(r0)     // Catch: java.lang.Throwable -> L51
                if (r1 == 0) goto L50
                java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Exception -> L4c
                io.bidmachine.core.Utils.close(r0)     // Catch: java.lang.Exception -> L4c
                r1.disconnect()     // Catch: java.lang.Exception -> L4c
                goto L50
            L4c:
                r0 = move-exception
                io.bidmachine.core.Logger.m20086w(r0)
            L50:
                return
            L51:
                r0 = move-exception
            L52:
                if (r1 == 0) goto L63
                java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Exception -> L5f
                io.bidmachine.core.Utils.close(r2)     // Catch: java.lang.Exception -> L5f
                r1.disconnect()     // Catch: java.lang.Exception -> L5f
                goto L63
            L5f:
                r1 = move-exception
                io.bidmachine.core.Logger.m20086w(r1)
            L63:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.core.Utils.RunnableC35679a.run():void");
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        BACKGROUND_HANDLER = new Handler(handlerThread.getLooper());
        CURRENT_YEAR = new LazyCachedValue<>(new LazyValue() { // from class: io.bidmachine.core.d
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return Utils.m20085a();
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ Integer m20085a() {
        return lambda$static$0();
    }

    /* renamed from: b */
    public static /* synthetic */ String m20084b() {
        return lambda$getConnectivityManager$1();
    }

    public static boolean canAddWindowToActivity(@Nullable Activity activity) {
        if (activity != null && activity.getWindow() != null && activity.getWindow().isActive() && activity.getWindow().getDecorView().getWindowToken() != null) {
            return true;
        }
        return false;
    }

    public static boolean canUseCleartextTraffic() {
        if (NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
            return true;
        }
        return false;
    }

    public static boolean canUseExternalFilesDir() {
        return isExternalMemoryAvailable();
    }

    public static void cancelBackgroundThreadTask(@NonNull Runnable runnable) {
        BACKGROUND_HANDLER.removeCallbacks(runnable);
    }

    public static void cancelUiThreadTask(@NonNull Runnable runnable) {
        UI_HANDLER.removeCallbacks(runnable);
    }

    @NonNull
    public static String capitalize(@NonNull String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @NonNull
    public static String checkIfEmpty(@Nullable String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Logger.m20086w(e);
            }
        }
    }

    @Nullable
    public static Float convertToFloatOrDefault(@Nullable Object obj, @Nullable Float f) {
        if (obj == null) {
            return f;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        return parseFloatOrDefault(obj.toString(), f);
    }

    @Nullable
    public static Integer convertToIntOrDefault(@Nullable Object obj, @Nullable Integer num) {
        if (obj == null) {
            return num;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        return parseIntOrDefault(obj.toString(), num);
    }

    public static Handler createHandlerWithMyOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper);
    }

    public static void flush(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e) {
                Logger.m20086w(e);
            }
        }
    }

    @NonNull
    public static String generateFileName(@NonNull String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    @NonNull
    public static String generateTag(@NonNull String str, @NonNull Object obj) {
        return str + " @" + Integer.toHexString(obj.hashCode());
    }

    @Nullable
    @RequiresApi(api = 23)
    public static NetworkCapabilities getActiveNetworkCapabilities(@NonNull Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th) {
            Logger.m20086w(th);
            return null;
        }
    }

    @Nullable
    public static NetworkInfo getActiveNetworkInfo(@NonNull Context context) {
        try {
            ConnectivityManager connectivityManager = getConnectivityManager(context);
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th) {
            Logger.m20086w(th);
            return null;
        }
    }

    public static String getAppName(@NonNull Context context) {
        if (appName == null) {
            appName = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return appName;
    }

    @Nullable
    public static String getAppVersion(@NonNull Context context) {
        if (appVersion == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    appVersion = str;
                }
            } catch (Exception e) {
                Logger.m20086w(e);
            }
        }
        return appVersion;
    }

    @Nullable
    public static Location getBestLocation(@NonNull Context context, @Nullable Location location, @Nullable Location location2) {
        Location location3 = (Location) oneOf(location, location2);
        Location location4 = getLocation(context);
        if (location4 != null) {
            if (location3 == null || location4.getTime() >= location3.getTime()) {
                return location4;
            }
            return location3;
        }
        return location3;
    }

    @Nullable
    public static File getCacheDir(@NonNull Context context, @NonNull String str) {
        File externalFilesDir = getExternalFilesDir(context);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + RemoteSettings.FORWARD_SLASH_STRING + str + RemoteSettings.FORWARD_SLASH_STRING);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        return null;
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static ConnectivityManager getConnectivityManager(@NonNull Context context) {
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.m20092e(new LazyValue() { // from class: io.bidmachine.core.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return Utils.m20084b();
                }
            });
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            Logger.m20086w(th);
            return null;
        }
    }

    @Nullable
    public static File getExternalFilesDir(@NonNull Context context) {
        return context.getExternalFilesDir(null);
    }

    @Nullable
    public static File getExternalFilesDirDirty(@NonNull Context context) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static Location getLocation(@NonNull Context context) {
        LocationManager locationManager;
        String bestProvider;
        Location lastKnownLocation;
        try {
            locationManager = (LocationManager) context.getSystemService("location");
        } catch (Exception e) {
            Logger.m20086w(e);
        }
        if (locationManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            bestProvider = GplLibraryWrapper.FUSED_PROVIDER;
        } else {
            bestProvider = locationManager.getBestProvider(new Criteria(), false);
        }
        if (bestProvider == null) {
            return null;
        }
        Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
        if (lastKnownLocation2 != null) {
            return lastKnownLocation2;
        }
        List<String> allProviders = locationManager.getAllProviders();
        if (allProviders != null && allProviders.size() > 1) {
            for (String str : allProviders) {
                if (str != null && !str.equals(bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                    return lastKnownLocation;
                }
            }
            return null;
        }
        return null;
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            Logger.m20086w(e);
            return null;
        }
    }

    public static float getOrDefault(float f, float f2, float f3) {
        return f == f2 ? f3 : f;
    }

    public static float getScreenDensity(@NonNull Context context) {
        return DeviceUtils.getDisplayMetrics(context).density;
    }

    @NonNull
    public static Point getScreenSize(@NonNull Context context) {
        DisplayMetrics displayMetrics = DeviceUtils.getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    @NonNull
    public static Rect getViewRectangle(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static void httpGetURL(@Nullable String str, @Nullable Executor executor) {
        if (!TextUtils.isEmpty(str) && executor != null) {
            executor.execute(new RunnableC35679a(str));
        }
    }

    public static void ifNotEmpty(@Nullable String str, @NonNull Executable<String> executable) {
        if (!TextUtils.isEmpty(str)) {
            executable.execute(str);
        }
    }

    public static <T> void ifNotNull(@Nullable T t, @NonNull Executable<T> executable) {
        if (t != null) {
            executable.execute(t);
        }
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        return invokeMethodByName(obj, obj.getClass(), str, pairArr);
    }

    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isHttpUrl(@NonNull String str) {
        if (!str.startsWith("http://") && !str.startsWith(DtbConstants.HTTPS)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isPermissionGranted(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUiThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean isUrlValid(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isViewTransparent(@NonNull View view) {
        if (view.getAlpha() == 0.0f) {
            return true;
        }
        return false;
    }

    public static boolean isYearValid(int i) {
        if (i >= 1900 && i <= CURRENT_YEAR.get().intValue()) {
            return true;
        }
        return false;
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list) {
        return join(list, ", ");
    }

    public static /* synthetic */ String lambda$getConnectivityManager$1() {
        return String.format("Manifest permission not found: %s. Check the integration.", "android.permission.ACCESS_NETWORK_STATE");
    }

    public static /* synthetic */ Integer lambda$static$0() {
        return Integer.valueOf(safeCalendarGetInstance().get(1));
    }

    public static void onBackgroundThread(@NonNull Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = BACKGROUND_HANDLER;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        if (isUiThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t, @Nullable T t2, @Nullable T t3) {
        return t != null ? t : t2 != null ? t2 : t3;
    }

    @Nullable
    public static Float parseFloatOrDefault(@Nullable String str, @Nullable Float f) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    @Nullable
    @SuppressLint({"RtlHardcoded"})
    public static Integer parseHorizontalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 1;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 5;
            default:
                return null;
        }
    }

    public static int parseIntOrDefault(@Nullable String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Nullable
    public static Integer parseVerticalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case 115029:
                if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 80;
            case 1:
                return 16;
            case 2:
                return 48;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void putAll(@Nullable Map<K, V> map, @Nullable Map<K, V> map2) {
        if (map != null && map2 != 0) {
            map.putAll(map2);
        }
    }

    @Nullable
    public static String readFile(@NonNull File file) {
        try {
            return streamToString(new FileInputStream(file));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable, java.io.Flushable] */
    @Nullable
    public static String retrieveAndSaveFrame(@NonNull Context context, @NonNull Uri uri, @NonNull String str) {
        FileOutputStream fileOutputStream;
        File file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)), 2);
        ?? r1 = 0;
        try {
            if (frameAtTime != null) {
                try {
                    file = new File(getCacheDir(context, str), generateFileName(uri.toString()));
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    flush(r1);
                    close(r1);
                    throw th;
                }
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    String absolutePath = file.getAbsolutePath();
                    flush(fileOutputStream);
                    close(fileOutputStream);
                    return absolutePath;
                } catch (Exception e2) {
                    e = e2;
                    Logger.m20086w(e);
                    flush(fileOutputStream);
                    close(fileOutputStream);
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = context;
        }
    }

    public static void runCatching(@NonNull ThrowableRunnable throwableRunnable) {
        try {
            throwableRunnable.run();
        } catch (Throwable unused) {
        }
    }

    @NonNull
    private static Calendar safeCalendarGetInstance() {
        try {
            try {
                return Calendar.getInstance();
            } catch (Throwable unused) {
                return Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
            }
        } catch (Throwable unused2) {
            return Calendar.getInstance(Locale.US);
        }
    }

    @Nullable
    public static Integer safeParseColor(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void sort(@NonNull CopyOnWriteArrayList<T> copyOnWriteArrayList, @Nullable Comparator<? super T> comparator) {
        Object[] array = copyOnWriteArrayList.toArray();
        Arrays.sort(array, comparator);
        for (int i = 0; i < array.length; i++) {
            copyOnWriteArrayList.set(i, array[i]);
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th) {
            Logger.m20086w(th);
        }
    }

    @Nullable
    public static String streamToString(@NonNull InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        String str = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str = byteArrayOutputStream.toString("UTF-8");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        flush(byteArrayOutputStream);
        close(byteArrayOutputStream);
        close(inputStream);
        return str;
    }

    @Nullable
    public static String toHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static Map<String, String> toMap(@NonNull JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                hashMap.put(next, opt.toString());
            }
        }
        return hashMap;
    }

    @Nullable
    public static String toSignatureHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i + 1;
            char[] cArr2 = UPPER_HEX_ARRAY;
            cArr[i] = cArr2[i3 >>> 4];
            i = i4 + 1;
            cArr[i4] = cArr2[i3 & 15];
            if (i2 < bArr.length - 1) {
                cArr[i] = ':';
                i++;
            }
        }
        return new String(cArr);
    }

    @VisibleForTesting
    static boolean writePermissionGranted(@NonNull Context context) {
        return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static long getOrDefault(long j, long j2, long j3) {
        return j == j2 ? j3 : j;
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @Nullable Class<?> cls, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        Class<?>[] clsArr;
        Object[] objArr;
        if (pairArr != null) {
            clsArr = new Class[pairArr.length];
            objArr = new Object[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                clsArr[i] = (Class) pairArr[i].first;
                objArr[i] = pairArr[i].second;
            }
        } else {
            clsArr = null;
            objArr = null;
        }
        for (int i2 = 10; i2 > 0 && cls != null; i2--) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            } catch (NoSuchMethodException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static boolean isEmpty(@Nullable Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence) {
        return join(list, charSequence, new Function() { // from class: io.bidmachine.core.c
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t, @Nullable T t2) {
        return (T) oneOf(t, t2, null);
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence, @NonNull Function<T, String> function) {
        String apply;
        if (isEmpty(list)) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder(list.size());
            for (T t : list) {
                if (t != null && (apply = function.apply(t)) != null) {
                    if (sb2.length() > 0) {
                        sb2.append(charSequence);
                    }
                    sb2.append(apply);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Integer parseIntOrDefault(@Nullable String str, @Nullable Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static void onBackgroundThread(@NonNull Runnable runnable, long j) {
        BACKGROUND_HANDLER.postDelayed(runnable, j);
    }

    public static void onUiThread(@NonNull Runnable runnable, long j) {
        UI_HANDLER.postDelayed(runnable, j);
    }
}
