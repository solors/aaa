package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.C4801lz;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.util.m */
/* loaded from: classes4.dex */
public abstract class AbstractC15459m {

    /* renamed from: a */
    public static Application f30607a;

    /* renamed from: a */
    public static void m76493a() {
    }

    /* renamed from: b */
    public static int m76482b(int i) {
        try {
            return (int) ((i / m76483b()) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static Drawable m76479c(int i) {
        return IAConfigManager.f27060O.f27098v.m77924a().getDrawable(i);
    }

    /* renamed from: d */
    public static int m76478d() {
        int i;
        String str;
        Application application = f30607a;
        if (application != null && application.getResources() != null && application.getResources().getConfiguration() != null) {
            i = application.getResources().getConfiguration().orientation;
        } else {
            i = 1;
        }
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.m76530a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        if (i == 1) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        IAlog.m76529a("The device orientation: %s", str);
        return i;
    }

    /* renamed from: e */
    public static int m76477e() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f30607a != null && (windowManager = (WindowManager) IAConfigManager.f27060O.f27098v.m77924a().getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        } else {
            i = -1;
        }
        if (i == -1) {
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                }
            } catch (Throwable unused) {
            }
            if (i == -1) {
                return DtbConstants.DEFAULT_PLAYER_HEIGHT;
            }
            return i;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m76476f() {
        /*
            r0 = -1
            android.app.Application r1 = com.fyber.inneractive.sdk.util.AbstractC15459m.f30607a     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f27060O     // Catch: java.lang.Throwable -> L28
            com.fyber.inneractive.sdk.config.i r1 = r1.f27098v     // Catch: java.lang.Throwable -> L28
            android.content.Context r1 = r1.m77924a()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L28
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r1.getSize(r2)     // Catch: java.lang.Throwable -> L28
            int r1 = r2.x     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 != r0) goto L3b
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L37
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            int r1 = r2.widthPixels     // Catch: java.lang.Throwable -> L37
        L37:
            if (r1 != r0) goto L3b
            r1 = 320(0x140, float:4.48E-43)
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.AbstractC15459m.m76476f():int");
    }

    /* renamed from: i */
    public static String m76473i() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.f27060O;
            if (iAConfigManager.f27101y.f30619c.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.m76529a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.f27101y.m76457a();
    }

    /* renamed from: a */
    public static boolean m76485a(String str) {
        try {
            return f30607a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m76481b(String str) {
        String str2 = (String) AbstractC15457l.f30606a.get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.m76529a("Assets cache: reading file: %s", str);
            try {
                InputStream open = f30607a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.m76529a("Assets cache: success - %s", str);
            } catch (IOException e) {
                IAlog.m76529a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.m76525e(AbstractC15471s.m76460a(e), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                AbstractC15457l.f30606a.put(str, str2);
            }
        } else {
            IAlog.m76529a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }

    /* renamed from: c */
    public static int m76480c() {
        return ((WindowManager) IAConfigManager.f27060O.f27098v.m77924a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: a */
    public static int m76491a(int i) {
        return (int) ((m76483b() * i) + 0.5f);
    }

    /* renamed from: a */
    public static void m76486a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static int m76492a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.f27060O.f27098v.m77924a().getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: a */
    public static String m76484a(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4801lz.m97621a(",", arrayList);
        }
        return TextUtils.join(",", arrayList);
    }

    /* renamed from: a */
    public static void m76489a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput("session_details.json", 0);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
                try {
                    IAlog.m76529a("writeFileWithContext failed writing %s", "session_details.json");
                } finally {
                    AbstractC15471s.m76464a(fileOutputStream);
                }
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
    }

    /* renamed from: a */
    public static String m76490a(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb2.append("0");
                        }
                        sb2.append(hexString);
                    }
                    return sb2.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: b */
    public static float m76483b() {
        return IAConfigManager.f27060O.f27098v.m77924a().getResources().getConfiguration().densityDpi / 160.0f;
    }

    /* renamed from: g */
    public static void m76475g() {
    }

    /* renamed from: h */
    public static void m76474h() {
    }

    /* renamed from: a */
    public static void m76487a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i == 17) {
                layoutParams2.addRule(13);
            } else {
                int i2 = i & 7;
                if (i2 == 1) {
                    layoutParams2.addRule(14);
                } else if (i2 == 3) {
                    layoutParams2.addRule(9);
                } else if (i2 == 5) {
                    layoutParams2.addRule(11);
                }
                int i3 = i & 112;
                if (i3 == 16) {
                    layoutParams2.addRule(15);
                } else if (i3 == 48) {
                    layoutParams2.addRule(10);
                } else if (i3 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static Context m76488a(View view) {
        if (view != null) {
            return view.getContext();
        }
        return f30607a;
    }
}
