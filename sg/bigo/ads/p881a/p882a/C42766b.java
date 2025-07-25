package sg.bigo.ads.p881a.p882a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.a.a.b */
/* loaded from: classes10.dex */
public final class C42766b {

    /* renamed from: a */
    private static String f111956a;

    /* renamed from: b */
    private static C42767a f111957b;

    /* renamed from: sg.bigo.ads.a.a.b$a */
    /* loaded from: classes10.dex */
    public static class C42767a {

        /* renamed from: a */
        public final boolean f111958a;
        @Nullable

        /* renamed from: b */
        public final String f111959b;
        @Nullable

        /* renamed from: c */
        public final String f111960c;
        @Nullable

        /* renamed from: d */
        public final String f111961d;
        @Nullable

        /* renamed from: e */
        public final String f111962e;

        public C42767a(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f111958a = z;
            this.f111962e = str;
            this.f111961d = str2;
            this.f111960c = str3;
            this.f111959b = str4;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C42767a m6624a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        PackageInfo packageInfo;
        String str5;
        String str6;
        String valueOf;
        int indexOf;
        C42767a c42767a = f111957b;
        if (c42767a != null) {
            return c42767a;
        }
        boolean z = false;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String str7 = null;
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
        if (packageInfo != null && "com.android.chrome".equals(packageInfo.packageName)) {
            f111956a = "com.android.chrome";
            String str8 = packageInfo.versionName;
            try {
                if (!TextUtils.isEmpty(str8) && (indexOf = str8.indexOf(".")) >= 0) {
                    str5 = str8.substring(0, indexOf);
                } else {
                    str5 = null;
                }
            } catch (PackageManager.NameNotFoundException | Exception e3) {
                e = e3;
                str7 = str8;
                str2 = e.toString();
                str3 = str2;
                str4 = str7;
                C42767a c42767a2 = new C42767a(z, f111956a, str4, str, str3);
                f111957b = c42767a2;
                return c42767a2;
            }
            if (TextUtils.isEmpty(str5)) {
                str6 = "Invalid chrome version: ";
                valueOf = String.valueOf(str8);
            } else if (Integer.parseInt(str5) >= 45) {
                z = true;
                str4 = str8;
                str3 = str7;
                C42767a c42767a22 = new C42767a(z, f111956a, str4, str, str3);
                f111957b = c42767a22;
                return c42767a22;
            } else {
                str6 = "Chrome version is low: ";
                valueOf = String.valueOf(str8);
            }
            str7 = str6.concat(valueOf);
            str4 = str8;
            str3 = str7;
            C42767a c42767a222 = new C42767a(z, f111956a, str4, str, str3);
            f111957b = c42767a222;
            return c42767a222;
        }
        str2 = "No chrome pkg";
        str3 = str2;
        str4 = str7;
        C42767a c42767a2222 = new C42767a(z, f111956a, str4, str, str3);
        f111957b = c42767a2222;
        return c42767a2222;
    }
}
