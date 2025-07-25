package com.taurusx.tax.p583c.p590f.p591d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.f.d.a */
/* loaded from: classes7.dex */
public class C28295a {

    /* renamed from: a */
    public static Boolean f73505a;

    /* renamed from: a */
    public static boolean m38280a(Context context) {
        PackageInfo packageInfo;
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            arrayList.add(stringFogImpl.m23824a(new byte[]{-13, 13, -71, 26, -8, 10, -31, 70, -10, 6, -13, 26, -8, 1, -13, 70, -17, 24, -8, 27, -14, 12, -71, 1, -7, 27, -29, 9, -5, 4, -14, 26}, new byte[]{-105, 104}));
            arrayList.add(stringFogImpl.m23824a(new byte[]{-37, -6, -43, -69, -53, -12, -51, -25, -47, -2, -106, -26, -51, -9, -53, -31, -54, -12, -52, -16}, new byte[]{-72, -107}));
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            do {
                try {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        if (context != null) {
                            PackageManager packageManager = context.getPackageManager();
                            try {
                                packageInfo = packageManager.getPackageInfo(str, 0);
                            } catch (Exception unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null && packageManager.getApplicationEnabledSetting(str) != 2) {
                                z2 = true;
                                continue;
                            }
                        }
                        z2 = false;
                        continue;
                    } else {
                        return z2;
                    }
                } catch (Exception unused2) {
                    z = z2;
                    return z;
                }
            } while (!z2);
            return z2;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: b */
    public static boolean m38279b(Context context) {
        StackTraceElement[] stackTrace;
        try {
            throw new Exception(C28162a.f73047a.m23824a(new byte[]{-4, 28, -1, 24}, new byte[]{-98, 112}));
        } catch (Exception e) {
            boolean z = false;
            int i = 0;
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                StringFogImpl stringFogImpl = C28162a.f73047a;
                if (className.equals(stringFogImpl.m23824a(new byte[]{117, -94, 123, -29, 119, -93, 114, -65, 121, -92, 114, -29, Byte.MAX_VALUE, -93, 98, -88, 100, -93, 119, -95, 56, -94, 101, -29, 76, -76, 113, -94, 98, -88, 95, -93, Byte.MAX_VALUE, -71}, new byte[]{22, -51})) && (i = i + 1) == 2) {
                    z = true;
                }
                if (stackTraceElement.getClassName().equals(stringFogImpl.m23824a(new byte[]{31, -4, 17, -67, 15, -14, 9, -31, 21, -8, 82, -32, 9, -15, 15, -25, 14, -14, 8, -10, 82, -34, 47, -73, 78}, new byte[]{124, -109})) && stackTraceElement.getMethodName().equals(stringFogImpl.m23824a(new byte[]{50, 46, 45, 47, 48, 37, 63}, new byte[]{91, SignedBytes.MAX_POWER_OF_TWO}))) {
                    z = true;
                }
                if (stackTraceElement.getClassName().equals(stringFogImpl.m23824a(new byte[]{115, 122, 57, 109, 120, 125, 97, 49, 118, 113, 115, 109, 120, 118, 115, 49, 111, 111, 120, 108, 114, 123, 57, 71, 103, 112, 100, 122, 115, 93, 101, 118, 115, 120, 114}, new byte[]{23, 31})) && stackTraceElement.getMethodName().equals(stringFogImpl.m23824a(new byte[]{-89, -24, -93, -25}, new byte[]{-54, -119}))) {
                    z = true;
                }
                if (stackTraceElement.getClassName().equals(stringFogImpl.m23824a(new byte[]{-46, -8, -104, -17, -39, -1, -64, -77, -41, -13, -46, -17, -39, -12, -46, -77, -50, -19, -39, -18, -45, -7, -104, -59, -58, -14, -59, -8, -46, -33, -60, -12, -46, -6, -45}, new byte[]{-74, -99})) && stackTraceElement.getMethodName().equals(stringFogImpl.m23824a(new byte[]{-12, 16, -14, 21, -16, 20, -44, 30, -13, 26, -7, 21, -47, 20, -24, 25, -13, 21}, new byte[]{-100, 113}))) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public static boolean m38281a() {
        boolean z = false;
        try {
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{45, -100, 112, -125, 97, -61}, new byte[]{2, -20}));
            sb2.append(Process.myPid());
            sb2.append(stringFogImpl.m23824a(new byte[]{-96, 59, -18, 38, -4}, new byte[]{-113, 86}));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sb2.toString()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                byte[] bArr = {-57, -37, -122};
                byte[] bArr2 = {-23, -88};
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (readLine.endsWith(stringFogImpl2.m23824a(bArr, bArr2)) || readLine.endsWith(stringFogImpl2.m23824a(new byte[]{115, -75, 60, -83}, new byte[]{93, -33}))) {
                    hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                }
            }
            Iterator it = hashSet.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    byte[] bArr3 = {15, 25, 1, 88, 31, 23, 25, 4, 5, 29, 66, 5, 25, 20, 31, 2, 30, 23, 24, 19};
                    byte[] bArr4 = {108, 118};
                    StringFogImpl stringFogImpl3 = C28162a.f73047a;
                    if (str.contains(stringFogImpl3.m23824a(bArr3, bArr4))) {
                        z2 = true;
                    }
                    if (str.contains(stringFogImpl3.m23824a(new byte[]{-106, 110, -95, 109, -85, 122, -116, 108, -89, 122, -87, 123, -32, 116, -81, 108}, new byte[]{-50, 30}))) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                    z = z2;
                    return z;
                }
            }
            bufferedReader.close();
            return z2;
        } catch (Exception unused2) {
        }
    }
}
