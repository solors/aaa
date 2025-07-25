package com.explorestack.iab.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.amazon.device.ads.DtbConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Random;
import java.util.concurrent.Executors;

/* renamed from: com.explorestack.iab.utils.g */
/* loaded from: classes3.dex */
public class C10512g {

    /* renamed from: a */
    private static final Handler f24040a = new Handler(Looper.getMainLooper());

    /* renamed from: com.explorestack.iab.utils.g$a */
    /* loaded from: classes3.dex */
    class RunnableC10513a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f24041b;

        RunnableC10513a(String str) {
            this.f24041b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "Utils"
                r1 = 2
                r2 = 0
                r3 = 1
                r4 = 0
                java.lang.String r5 = "Connection to URL: %s"
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.lang.String r7 = r10.f24041b     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                r6[r2] = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                com.explorestack.iab.utils.C10523j.m79241a(r0, r5, r6)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.lang.String r6 = r10.f24041b     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.net.HttpURLConnection.setFollowRedirects(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                r4 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r4)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                java.lang.String r4 = "Connection"
                java.lang.String r6 = "close"
                r5.setRequestProperty(r4, r6)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                java.lang.String r4 = "GET"
                r5.setRequestMethod(r4)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                int r4 = r5.getResponseCode()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                java.lang.String r6 = "Response code: %d, for URL: %s"
                java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                r7[r2] = r4     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                java.lang.String r4 = r10.f24041b     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                r7[r3] = r4     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
                com.explorestack.iab.utils.C10523j.m79241a(r0, r6, r7)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L6f
            L47:
                r5.disconnect()     // Catch: java.lang.Exception -> L6e
                goto L6e
            L4b:
                r4 = move-exception
                goto L53
            L4d:
                r0 = move-exception
                goto L71
            L4f:
                r5 = move-exception
                r9 = r5
                r5 = r4
                r4 = r9
            L53:
                java.lang.String r6 = "%s: %s: %s"
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L6f
                java.lang.String r8 = r10.f24041b     // Catch: java.lang.Throwable -> L6f
                r7[r2] = r8     // Catch: java.lang.Throwable -> L6f
                java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L6f
                r7[r3] = r2     // Catch: java.lang.Throwable -> L6f
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L6f
                r7[r1] = r2     // Catch: java.lang.Throwable -> L6f
                com.explorestack.iab.utils.C10523j.m79239c(r0, r6, r7)     // Catch: java.lang.Throwable -> L6f
                if (r5 == 0) goto L6e
                goto L47
            L6e:
                return
            L6f:
                r0 = move-exception
                r4 = r5
            L71:
                if (r4 == 0) goto L76
                r4.disconnect()     // Catch: java.lang.Exception -> L76
            L76:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.C10512g.RunnableC10513a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.utils.g$b */
    /* loaded from: classes3.dex */
    public class View$OnApplyWindowInsetsListenerC10514b implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ int f24042a;

        View$OnApplyWindowInsetsListenerC10514b(int i) {
            this.f24042a = i;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsets onApplyWindowInsets(@NonNull View view, @NonNull WindowInsets windowInsets) {
            Insets insets;
            int i;
            int i2;
            int i3;
            int i4;
            insets = windowInsets.getInsets(this.f24042a);
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            view.setPadding(i, i2, i3, i4);
            return windowInsets;
        }
    }

    /* renamed from: A */
    public static boolean m79332A(View view) {
        if (view.getAlpha() == 0.0f) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: B */
    public static Float m79331B(@Nullable Float f, @Nullable Float f2) {
        if (f == null) {
            return f2;
        }
        if (f2 == null) {
            return f;
        }
        return Float.valueOf(Math.max(f.floatValue(), f2.floatValue()));
    }

    @Nullable
    /* renamed from: C */
    public static Float m79330C(@Nullable Float f, @Nullable Float f2) {
        if (f == null) {
            return f2;
        }
        if (f2 == null) {
            return f;
        }
        return Float.valueOf(Math.min(f.floatValue(), f2.floatValue()));
    }

    @NonNull
    /* renamed from: D */
    public static MotionEvent m79329D(int i, int i2, int i3) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i, i2, i3, 0);
    }

    /* renamed from: E */
    public static void m79328E(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f24040a.post(runnable);
        }
    }

    /* renamed from: F */
    public static void m79327F(Runnable runnable, long j) {
        f24040a.postDelayed(runnable, j);
    }

    /* renamed from: G */
    public static void m79326G(@NonNull Context context, @Nullable String str, @Nullable Runnable runnable) {
        new C10539u().m79187h(context, str, runnable);
    }

    /* renamed from: H */
    public static int m79325H(int i, int i2) {
        if (i > i2) {
            return 2;
        }
        return 1;
    }

    /* renamed from: I */
    public static String m79324I(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "UNKNOWN";
                }
                return "LANDSCAPE";
            }
            return "PORTRAIT";
        }
        return "UNDEFINED";
    }

    /* renamed from: J */
    public static int m79323J(float f, float f2) {
        return (int) (m79315b(f, f2) + 0.5f);
    }

    /* renamed from: K */
    public static void m79322K(Runnable runnable) {
        f24040a.post(runnable);
    }

    /* renamed from: L */
    public static void m79321L(@Nullable View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: M */
    public static void m79320M(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(0, 0, 0);
            activity.overrideActivityTransition(1, 0, 0);
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    /* renamed from: N */
    public static void m79319N(@Nullable Window window, int i) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    @NonNull
    /* renamed from: O */
    public static String m79318O(@NonNull Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    @NonNull
    /* renamed from: P */
    public static String m79317P(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    /* renamed from: a */
    private static double m79316a(@NonNull Random random, float f, float f2) {
        double d;
        double sqrt = Math.sqrt(Math.log(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d)) * (-2.0d)) * Math.sin(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d) * 6.283185307179586d);
        double d2 = f2;
        if (d2 >= 0.4d && d2 <= 0.6d) {
            d = (sqrt * f) + d2;
        } else if (d2 < 0.4d) {
            d = d2 + (f / (sqrt * sqrt));
        } else {
            d = d2 - (f / (sqrt * sqrt));
        }
        return Math.min(1.0d, Math.max(0.0d, d));
    }

    /* renamed from: b */
    private static float m79315b(float f, float f2) {
        return f / f2;
    }

    /* renamed from: c */
    private static float m79314c(int i) {
        if (i != 1) {
            if (i != 3) {
                if (i != 17) {
                    return 1.0f;
                }
                return 0.5f;
            }
            return 0.0f;
        }
        return 0.5f;
    }

    /* renamed from: d */
    private static void m79313d(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: e */
    private static void m79312e(@NonNull Window window, boolean z) {
        int i;
        WindowInsetsController windowInsetsController;
        int statusBars;
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z) {
                    statusBars = WindowInsets.Type.statusBars();
                    windowInsetsController.hide(statusBars);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            window.setFlags(1024, 1024);
            i = 4;
        } else {
            i = 0;
        }
        if (i > 0) {
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    /* renamed from: f */
    public static void m79311f(@NonNull Activity activity) {
        m79310g(activity, true);
    }

    /* renamed from: g */
    public static void m79310g(@NonNull Activity activity, boolean z) {
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            m79312e(window, z);
        }
        m79313d(activity);
    }

    /* renamed from: h */
    public static void m79309h(@NonNull Activity activity) {
        View findViewById;
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            if (window != null) {
                findViewById = window.getDecorView();
            } else {
                findViewById = activity.findViewById(16908290);
            }
            m79308i(findViewById);
        }
    }

    @RequiresApi(api = 30)
    /* renamed from: i */
    public static void m79308i(@NonNull View view) {
        int systemBars;
        int displayCutout;
        systemBars = WindowInsets.Type.systemBars();
        displayCutout = WindowInsets.Type.displayCutout();
        m79307j(view, systemBars | displayCutout);
    }

    @RequiresApi(api = 30)
    /* renamed from: j */
    public static void m79307j(@NonNull View view, int i) {
        view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC10514b(i));
        view.requestApplyInsets();
    }

    /* renamed from: k */
    private static float m79306k(int i) {
        if (i != 16 && i != 17) {
            if (i != 80) {
                return 0.0f;
            }
            return 1.0f;
        }
        return 0.5f;
    }

    /* renamed from: l */
    public static void m79305l(Runnable runnable) {
        f24040a.removeCallbacks(runnable);
    }

    /* renamed from: m */
    public static void m79304m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C10523j.m79240b("Utils", th);
            }
        }
    }

    /* renamed from: n */
    public static Float m79303n(@NonNull String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    /* renamed from: o */
    public static int m79302o(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: p */
    public static void m79301p(@NonNull Activity activity) {
        activity.finish();
        m79320M(activity);
    }

    /* renamed from: q */
    public static void m79300q(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th) {
                C10523j.m79240b("Utils", th);
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: r */
    public static int m79299r() {
        return View.generateViewId();
    }

    @NonNull
    /* renamed from: s */
    public static Point m79298s(int i, int i2, int i3, int i4) {
        Random random = new Random();
        return new Point((int) (i * m79316a(random, 0.1f, m79314c(i3))), (int) (i2 * m79316a(random, 0.1f, m79306k(i4))));
    }

    @NonNull
    /* renamed from: t */
    public static Point m79297t(int i, int i2) {
        return new Point(Math.round(i * 0.5f), Math.round(i2 * 0.7f));
    }

    /* renamed from: u */
    public static int m79296u(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            if (rotation == 2 || rotation == 3) {
                return 9;
            }
            return 1;
        } else if (i != 2) {
            return 9;
        } else {
            if (rotation != 2 && rotation != 3) {
                return 0;
            }
            return 8;
        }
    }

    /* renamed from: v */
    public static void m79295v(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Executors.newSingleThreadExecutor().execute(new RunnableC10513a(str));
                return;
            } catch (Exception e) {
                C10523j.m79240b("Utils", e);
                return;
            }
        }
        C10523j.m79241a("Utils", "url is null or empty", new Object[0]);
    }

    /* renamed from: w */
    public static boolean m79294w(@Nullable String str) {
        if (str != null && (str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS))) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m79293x(Context context) {
        int m79296u = m79296u(context);
        if (m79296u != 0 && m79296u != 8 && m79296u != 6 && m79296u != 11) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y */
    public static boolean m79292y(Context context) {
        NetworkInfo activeNetworkInfo;
        C10523j.m79241a("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            C10523j.m79241a("Utils", "Connected to Internet", new Object[0]);
            return true;
        }
        C10523j.m79241a("Utils", "No Internet connection", new Object[0]);
        return false;
    }

    /* renamed from: z */
    public static boolean m79291z(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        if (Math.sqrt((d * d) + (d2 * d2)) >= 6.6d) {
            return true;
        }
        return false;
    }
}
