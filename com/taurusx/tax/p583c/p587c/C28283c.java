package com.taurusx.tax.p583c.p587c;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p583c.p590f.C28292a;
import com.taurusx.tax.p583c.p590f.p592e.C28303a;
import com.taurusx.tax.p606j.p607a0.C28468b;
import com.taurusx.tax.p606j.p607a0.C28469c;
import com.taurusx.tax.p606j.p616z.C28561a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.c.c */
/* loaded from: classes7.dex */
public class C28283c implements InterfaceC28281a {
    /* renamed from: a */
    public String m38326a(Context context) {
        if (TextUtils.isEmpty(C28292a.f73491c)) {
            ContentResolver contentResolver = context.getContentResolver();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            C28292a.f73491c = Settings.System.getString(contentResolver, stringFogImpl.m23824a(new byte[]{106, -58, 111, -38, 100, -63, 111, -9, 98, -52}, new byte[]{11, -88}));
            String str = C28292a.f73489a;
            Log.d(str, stringFogImpl.m23824a(new byte[]{-67, -8, -104, -28, -109, -1, -104, -74, -107, -14, -36, -1, -113, -74}, new byte[]{-4, -106}) + C28292a.f73491c);
        }
        return C28292a.f73491c;
    }

    /* renamed from: b */
    public String m38325b(Context context) {
        C28561a m38260a = C28303a.m38260a(context);
        if (m38260a != null && !TextUtils.isEmpty(m38260a.f74048a)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-62, -104, -61, -117, -61, -118, -50}, new byte[]{-74, -7}), stringFogImpl.m23824a(new byte[]{65, 18, 94, 27, 85, 94, SignedBytes.MAX_POWER_OF_TWO, 27, 83, 94, 96, 63, 110, 58, 7, 24, 85, 17, 74, 94, 68, 31, 68, 22, 66}, new byte[]{39, 126}));
            return m38260a.f74048a;
        }
        return "";
    }

    /* renamed from: c */
    public boolean m38324c(Context context) {
        C28561a m38260a = C28303a.m38260a(context);
        if (m38260a != null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{59, -57, 58, -44, 58, -43, 55}, new byte[]{79, -90}), stringFogImpl.m23824a(new byte[]{50, 26, 45, 19, 38, 86, 51, 19, 32, 86, 19, 55, 29, 50, 116, 26, 61, 27, 61, 2, 116, 16, 38, 25, 57, 86, 55, 23, 55, 30, 49}, new byte[]{84, 118}));
            return m38260a.f74049b;
        }
        return false;
    }

    /* renamed from: d */
    public String m38323d(Context context) {
        C28469c m38074a = C28468b.m38074a(context);
        if (m38074a != null && !TextUtils.isEmpty(m38074a.f73903a)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{66, 20, 67, 7, 67, 6, 78}, new byte[]{54, 117}), stringFogImpl.m23824a(new byte[]{48, 11, 47, 2, 36, 71, 49, 2, 34, 71, 25, 38, 31, 35, 118, 1, 36, 8, 59, 71, 53, 6, 53, 15, 51}, new byte[]{86, 103}));
            return m38074a.f73903a;
        }
        return "";
    }

    /* renamed from: e */
    public boolean m38322e(Context context) {
        C28469c m38074a = C28468b.m38074a(context);
        if (m38074a != null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{10, -1, 11, -20, 11, -19, 6}, new byte[]{126, -98}), stringFogImpl.m23824a(new byte[]{89, 85, 70, 92, 77, 25, 88, 92, 75, 25, 112, 120, 118, 125, 31, 85, 86, 84, 86, 77, 31, 95, 77, 86, 82, 25, 92, 88, 92, 81, 90}, new byte[]{63, 57}));
            return m38074a.f73904b;
        }
        return false;
    }
}
