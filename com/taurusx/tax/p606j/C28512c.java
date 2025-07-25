package com.taurusx.tax.p606j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p578b.C28207b;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.c */
/* loaded from: classes7.dex */
public class C28512c {

    /* renamed from: a */
    public static final String f73947a;

    /* renamed from: b */
    public static final String f73948b;

    /* renamed from: c */
    public static final String f73949c;

    /* renamed from: d */
    public static final String f73950d;

    /* renamed from: e */
    public static final String f73951e;

    /* renamed from: f */
    public static final String f73952f;

    /* renamed from: g */
    public static final String f73953g;

    /* renamed from: h */
    public static Context f73954h;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        stringFogImpl.m23824a(new byte[]{-69, -85, -74, -94, -79, -93}, new byte[]{-40, -60});
        f73947a = stringFogImpl.m23824a(new byte[]{50, SignedBytes.MAX_POWER_OF_TWO, 57, 29, 60, 0}, new byte[]{83, 110});
        f73948b = stringFogImpl.m23824a(new byte[]{10, 54, 52, 57, 14, 43}, new byte[]{107, 82});
        f73949c = stringFogImpl.m23824a(new byte[]{-7, 61, -57, 47, -7, 44, -12, 60}, new byte[]{-104, 89});
        f73950d = stringFogImpl.m23824a(new byte[]{-54, -39, -54, -63, -37, -16, -60, -54, -42}, new byte[]{-81, -81});
        f73951e = stringFogImpl.m23824a(new byte[]{112, -23, 112, -15, 97, -64, 99, -2, 121, -22, 112}, new byte[]{21, -97});
        f73952f = stringFogImpl.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 83, -112, 83, -126, 94, -99, 87, -106, 109, -113, 87, -99}, new byte[]{-28, 50});
        f73953g = stringFogImpl.m23824a(new byte[]{-5, 65, -21, 65, -7, 76, -26, 69, -19, Byte.MAX_VALUE, -23, 65, -13, 85, -6}, new byte[]{-97, 32});
    }

    /* renamed from: a */
    public static void m38052a(Context context) {
        String str;
        f73954h = context;
        byte[] decode = Base64.decode(C28207b.m38460a(context, f73947a), 0);
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{30, 2, 9}, new byte[]{123, 112});
        try {
            m23824a = new String(decode, stringFogImpl.m23824a(new byte[]{-106, -34, -123, -89, -5}, new byte[]{-61, -118}));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject = new JSONObject(m23824a);
            String str2 = f73948b;
            String optString = jSONObject.optString(str2, "");
            String str3 = f73949c;
            String optString2 = jSONObject.optString(str3, "");
            String str4 = f73950d;
            String optString3 = jSONObject.optString(str4, "");
            String str5 = f73951e;
            String optString4 = jSONObject.optString(str5, "");
            String str6 = f73952f;
            String optString5 = jSONObject.optString(str6, "");
            String str7 = f73953g;
            String optString6 = jSONObject.optString(str7, "");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                str = str7;
            } else {
                str = str7;
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                C28532o.m37993a().m37989a(context, stringFogImpl2.m23824a(new byte[]{-68, 101, -82, 95, -66, 110, -79, 111}, new byte[]{-41, 0}), str2, optString);
                C28532o.m37993a().m37989a(context, stringFogImpl2.m23824a(new byte[]{-33, UnsignedBytes.MAX_POWER_OF_TWO, -51, -70, -35, -117, -46, -118}, new byte[]{-76, -27}), str3, optString2);
            }
            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
                StringFogImpl stringFogImpl3 = C28162a.f73047a;
                C28532o.m37993a().m37989a(context, stringFogImpl3.m23824a(new byte[]{-78, -23, -96, -45, -80, -30, -65, -29}, new byte[]{-39, -116}), str4, optString3);
                C28532o.m37993a().m37989a(context, stringFogImpl3.m23824a(new byte[]{-15, -79, -29, -117, -13, -70, -4, -69}, new byte[]{-102, -44}), str5, optString4);
            }
            if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString6)) {
                return;
            }
            StringFogImpl stringFogImpl4 = C28162a.f73047a;
            C28532o.m37993a().m37989a(context, stringFogImpl4.m23824a(new byte[]{31, 107, 13, 81, 29, 96, 18, 97}, new byte[]{116, 14}), str6, optString5);
            C28532o.m37993a().m37989a(context, stringFogImpl4.m23824a(new byte[]{50, -24, 32, -46, 48, -29, 63, -30}, new byte[]{89, -115}), str, optString6);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m38049b() {
        return m38051a(f73954h, f73949c);
    }

    /* renamed from: c */
    public static String m38048c() {
        return m38051a(f73954h, f73950d);
    }

    /* renamed from: d */
    public static String m38047d() {
        return m38051a(f73954h, f73951e);
    }

    /* renamed from: a */
    public static String m38054a() {
        return m38051a(f73954h, f73948b);
    }

    /* renamed from: a */
    public static String m38051a(Context context, String str) {
        C28532o m37993a = C28532o.m37993a();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m37990a = m37993a.m37990a(context, stringFogImpl.m23824a(new byte[]{31, -97, 13, -91, 29, -108, 18, -107}, new byte[]{116, -6}), str);
        if (TextUtils.isEmpty(m37990a)) {
            m38052a(context);
            return C28532o.m37993a().m37990a(context, stringFogImpl.m23824a(new byte[]{109, 69, Byte.MAX_VALUE, Byte.MAX_VALUE, 111, 78, 96, 79}, new byte[]{6, 32}), str);
        }
        return m37990a;
    }

    /* renamed from: a */
    public static byte[] m38050a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (m38053a(str.charAt(i2 + 1)) | (m38053a(str.charAt(i2)) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 49, -126, 51, -104, 60, -52, 57, -103, 39, -104, 116, -114, 49, -52, 49, -102, 49, -126, 117}, new byte[]{-20, 84}));
    }

    /* renamed from: a */
    public static int m38053a(char c) {
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                if (c < '0' || c > '9') {
                    throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{120, 52, 102, 53, 53, 35, 112, 97, 125, 36, 109, 96}, new byte[]{21, 65}));
                }
                return c - '0';
            }
        }
        return (c - c2) + 10;
    }
}
