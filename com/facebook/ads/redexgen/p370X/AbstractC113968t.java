package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8t */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC113968t {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, 29, 12, 17, 13, 22, 11, 13, -10, 13, 28, 31, 23, 26, 19, -18, 23, 26, -23, 22, 12, 26, 23, 17, 12, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, SignedBytes.MAX_POWER_OF_TWO, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, 63, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, 63, 54, 48, 25, 37, 37, 33, -33, 18, 24, 22, 31, 37, 31, 29, 15, 28, 9, 11, 17, 15, 24, 30, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, 38, 35, 58, 45, 41, 59};
    }

    static {
        A08();
        A00 = A00(80, 7, 107);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C113257j c113257j) {
        return WebSettings.getDefaultUserAgent(c113257j);
    }

    public static String A02(final C113257j c113257j) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8s
            @Override // java.util.concurrent.Callable
            /* renamed from: A00 */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = AbstractC113968t.A04;
                String browserUserAgent = (String) atomicReference.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(c113257j.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8r
                    {
                        CallableC113958s.this = this;
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        AbstractC12296Ny.A02(AbstractC113568E.A2j);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = AbstractC113968t.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            ExecutorC12171Lx.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c113257j, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C113257j c113257j, C113668O c113668o) {
        String A07 = c113668o.A07();
        if (TextUtils.isEmpty(A07) && !A03.getAndSet(true)) {
            InterfaceC113558D A072 = c113257j.A07();
            int i = AbstractC113568E.A1Z;
            String bundle = A00(73, 7, 122);
            C113578F c113578f = new C113578F(bundle);
            String bundle2 = A00(116, 7, 87);
            A072.AA0(bundle2, i, c113578f);
        }
        return A07;
    }

    public static String A04(C113257j c113257j, boolean z) {
        if (c113257j == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 59));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long A012 = AbstractC11978Il.A01(c113257j);
        String A002 = A00(143, 23, 1);
        String A003 = A00(133, 10, 52);
        String A004 = A00(88, 28, 96);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c113257j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c113257j), 0);
            String string = sharedPreferences.getString(A003, null);
            long j = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < A012) {
                A04.set(string);
                String[] strArr = A02;
                String str2 = strArr[6];
                String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        String str3 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str3 = A01(c113257j);
                A04.set(str3);
            } catch (Throwable t) {
                A09(c113257j, t);
            }
        }
        if (str3 == null) {
            str3 = A02(c113257j);
        }
        if (str3 == null) {
            return A00;
        }
        if (A012 > 0) {
            SharedPreferences sharedPreferences2 = c113257j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c113257j), 0);
            sharedPreferences2.edit().putString(A003, A04.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str3;
    }

    public static String A05(C113668O c113668o, C113257j c113257j) {
        if (AbstractC11978Il.A04(c113257j)) {
            return A00(63, 5, 5) + A03(c113257j, c113668o) + A00(39, 6, 61) + c113668o.A06() + A00(45, 6, 61) + c113668o.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static String A06(C113668O c113668o, C113257j c113257j, boolean z) {
        return A04(c113257j, z) + A00(0, 38, 50) + c113257j.A04().A8f() + A00(57, 6, 26) + C113668O.A04 + A00(38, 1, 85) + A05(c113668o, c113257j) + A00(68, 5, 13) + c113257j.A04().A8g() + A00(51, 6, 8) + Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A09(C113257j c113257j, Throwable th) {
        c113257j.A07().AA0(A00(166, 8, 78), AbstractC113568E.A2i, new C113578F(th));
    }
}
