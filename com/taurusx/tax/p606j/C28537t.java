package com.taurusx.tax.p606j;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p616z.C28564d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.UUID;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.t */
/* loaded from: classes7.dex */
public class C28537t {

    /* renamed from: a */
    public static final String f73991a;

    /* renamed from: b */
    public static final String f73992b;

    /* renamed from: c */
    public static final String f73993c;

    /* renamed from: d */
    public static final String f73994d;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73993c = stringFogImpl.m23824a(new byte[]{11, -120, 10, -101, 10, -102, 7, -74, 10, UnsignedBytes.MAX_POWER_OF_TWO, 27}, new byte[]{Byte.MAX_VALUE, -23});
        f73994d = stringFogImpl.m23824a(new byte[]{-102, 98, -117}, new byte[]{-17, 11});
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageState());
        String str = File.separator;
        sb2.append(str);
        sb2.append(stringFogImpl.m23824a(new byte[]{-98, -8, -112, -71, -119, -10, -120, -27, -120, -28, -123, -71, -119, -10, -123}, new byte[]{-3, -105}));
        String sb3 = sb2.toString();
        f73991a = sb3;
        f73992b = sb3 + str + stringFogImpl.m23824a(new byte[]{115, 11, 98, 76, 98, 3, 114, 3}, new byte[]{6, 98});
    }

    /* renamed from: a */
    public static String m37985a(Context context) {
        String packageName = context.getPackageName();
        String m38026b = C28518e.m38026b(context);
        String m37922a = C28564d.m37922a(context);
        if (!TextUtils.isEmpty(m38026b)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{-10, 77, -9, 94, -9, 95, -6}, new byte[]{-126, 44});
            LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{18, 68, 27, 68, 7, SignedBytes.MAX_POWER_OF_TWO, 1, 68, 85, 84, 6, 68, 7, 1, 28, 69, 85, 86, 28, 85, 29, 1, 20, 79, 17, 83, 26, 72, 17, 1, 28, 69, 85, 27, 85}, new byte[]{117, 33}) + m38026b);
        } else if (!TextUtils.isEmpty(m37922a)) {
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            String m23824a2 = stringFogImpl2.m23824a(new byte[]{-57, 59, -58, 40, -58, 41, -53}, new byte[]{-77, 90});
            LogUtil.m37901iv(m23824a2, stringFogImpl2.m23824a(new byte[]{-97, 26, -106, 26, -118, 30, -116, 26, -40, 10, -117, 26, -118, 95, -111, 27, -40, 8, -111, 11, -112, 95, -97, 30, -111, 27, -40, 69, -40}, new byte[]{-8, Byte.MAX_VALUE}) + m37922a);
            m38026b = m37922a;
        } else {
            m38026b = "";
        }
        if (TextUtils.isEmpty(m38026b)) {
            return UUID.randomUUID().toString();
        }
        return UUID.nameUUIDFromBytes((m38026b + packageName).getBytes()).toString();
    }

    /* renamed from: b */
    public static String m37984b(Context context) {
        String m37990a = C28532o.m37993a().m37990a(context, f73993c, f73994d);
        if (TextUtils.isEmpty(m37990a)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (context.checkCallingPermission(stringFogImpl.m23824a(new byte[]{88, -103, 93, -123, 86, -98, 93, -39, 73, -110, 75, -102, 80, -124, 74, -98, 86, -103, 23, -91, 124, -74, 125, -88, 124, -81, 109, -78, 107, -71, 120, -69, 102, -92, 109, -72, 107, -74, 126, -78}, new byte[]{57, -9})) == 0) {
                File file = new File(f73992b);
                if (file.exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        String m38000a = C28527k.m38000a(fileInputStream, Charset.forName(stringFogImpl.m23824a(new byte[]{-101, -20, -120, -75, -42}, new byte[]{-18, -104})));
                        fileInputStream.close();
                        m37990a = m38000a;
                    } catch (Error | Exception e) {
                        StringFogImpl stringFogImpl2 = C28162a.f73047a;
                        String m23824a = stringFogImpl2.m23824a(new byte[]{67, 74, 66, 89, 66, 88, 79}, new byte[]{55, 43});
                        LogUtil.m37901iv(m23824a, stringFogImpl2.m23824a(new byte[]{58, -95, 41, -28, 40, -83, 57, -28, 56, -74, 47, -85, 47, -28, 103, -28}, new byte[]{93, -60}) + e);
                        m37990a = m37985a(context);
                    }
                } else {
                    File file2 = new File(f73991a);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    String m37985a = m37985a(context);
                    try {
                        if (context.checkCallingPermission(stringFogImpl.m23824a(new byte[]{29, 109, 24, 113, 19, 106, 24, 45, 12, 102, 14, 110, 21, 112, 15, 106, 19, 109, 82, 84, 46, 74, 40, 70, 35, 70, 36, 87, 57, 81, 50, 66, 48, 92, 47, 87, 51, 81, 61, 68, 57}, new byte[]{124, 3})) == 0) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(m37985a.getBytes());
                            fileOutputStream.close();
                        }
                    } catch (Error | Exception e2) {
                        StringFogImpl stringFogImpl3 = C28162a.f73047a;
                        String m23824a2 = stringFogImpl3.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -109, -127, UnsignedBytes.MAX_POWER_OF_TWO, -127, -127, -116}, new byte[]{-12, -14});
                        LogUtil.m37901iv(m23824a2, stringFogImpl3.m23824a(new byte[]{-45, -61, -64, -122, -63, -49, -48, -122, -47, -44, -58, -55, -58, -122, -114, -122}, new byte[]{-76, -90}) + e2);
                    }
                    m37990a = m37985a;
                }
            } else {
                m37990a = m37985a(context);
            }
            C28532o.m37993a().m37989a(context, f73993c, f73994d, m37990a);
        }
        if (TextUtils.isEmpty(m37990a)) {
            return C28162a.f73047a.m23824a(new byte[]{90, 25, 68, 25, SignedBytes.MAX_POWER_OF_TWO, 0, 65}, new byte[]{15, 87});
        }
        return m37990a;
    }
}
