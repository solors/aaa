package sg.bigo.ads.common.utils;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: sg.bigo.ads.common.utils.c */
/* loaded from: classes10.dex */
public final class C43818c {
    @Nullable
    /* renamed from: a */
    public static Activity m4933a(@NonNull View view) {
        for (int i = 0; i < 10000 && view != null; i++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static synchronized int m4932b(Context context) {
        int i;
        synchronized (C43818c.class) {
            try {
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Exception unused) {
                return 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static long m4930c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    /* renamed from: d */
    public static long m4929d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    @Nullable
    /* renamed from: e */
    public static PackageInfo m4928e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m4927f(Context context, String str) {
        String str2;
        InstallSourceInfo installSourceInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(str);
                str2 = installSourceInfo.getInstallingPackageName();
            } else {
                str2 = context.getPackageManager().getInstallerPackageName(str);
            }
        } catch (Exception unused) {
            str2 = "";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: g */
    public static boolean m4926g(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(TextFieldImplKt.LabelId, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m4936a() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (AssertionError unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static int m4931b(Context context, String str) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256) != null ? 1 : -1;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized String m4935a(Context context) {
        synchronized (C43818c.class) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (TextUtils.isEmpty(packageInfo.versionName)) {
                    return "";
                }
                return packageInfo.versionName;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* renamed from: a */
    public static boolean m4934a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
