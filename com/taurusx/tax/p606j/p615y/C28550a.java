package com.taurusx.tax.p606j.p615y;

import android.content.Context;
import android.os.StatFs;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.p606j.p615y.C28553c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.y.a */
/* loaded from: classes7.dex */
public class C28550a {

    /* renamed from: a */
    public static final String f74001a = C28162a.f73047a.m23824a(new byte[]{-113, -116, -114, -97, -114, -98, -125, -64, -104, -116, -104, -123, -98}, new byte[]{-5, -19});

    /* renamed from: b */
    public static C28553c f74002b;

    /* renamed from: a */
    public static boolean m37959a(Context context) {
        File file;
        long j;
        StringFogImpl stringFogImpl;
        if (f74002b == null) {
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                file = null;
            } else {
                file = new File(cacheDir.getPath() + File.separator + f74001a);
            }
            if (file == null) {
                return false;
            }
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
            } catch (IllegalArgumentException unused) {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                LogUtil.m37900v(stringFogImpl2.m23824a(new byte[]{77, 112, 76, 99, 76, 98, 65}, new byte[]{57, 17}), stringFogImpl2.m23824a(new byte[]{31, 11, 43, 7, 38, 0, 106, 17, 37, 69, 41, 4, 38, 6, 63, 9, 43, 17, 47, 69, 120, SignedBytes.MAX_POWER_OF_TWO, 106, 10, 44, 69, 43, 19, 43, 12, 38, 4, 40, 9, 47, 69, 46, 12, 57, 14, 106, 22, 58, 4, 41, 0, 102, 69, 46, 0, 44, 4, 63, 9, 62, 12, 36, 2, 106, 17, 37, 69, 39, 12, 36, 12, 39, 16, 39}, new byte[]{74, 101}));
                j = 31457280;
            }
            try {
                f74002b = C28553c.m37950a(file, 1, 1, Math.max(Math.min(j, 104857600L), 31457280L));
            } catch (IOException e) {
                LogUtil.m37900v(C28162a.f73047a.m23824a(new byte[]{-38, -102, -37, -119, -37, -120, -42}, new byte[]{-82, -5}), stringFogImpl.m23824a(new byte[]{-72, -16, -116, -4, -127, -5, -51, -22, -126, -66, -114, -20, -120, -1, -103, -5, -51, -38, -124, -19, -122, -46, -97, -21, -82, -1, -114, -10, -120}, new byte[]{-19, -98}) + e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m37958a(String str, InputStream inputStream) {
        C28553c c28553c = f74002b;
        if (c28553c == null) {
            return false;
        }
        C28553c.C28555b c28555b = null;
        try {
            C28553c.C28555b m37948a = c28553c.m37948a(C28549x.m37965a(str));
            if (m37948a == null) {
                return false;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m37948a.m37936a(0));
            C28549x.m37966a(inputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            C28553c c28553c2 = f74002b;
            synchronized (c28553c2) {
                c28553c2.m37955a();
                c28553c2.m37938f();
                c28553c2.f74022e.flush();
            }
            if (m37948a.f74035c) {
                C28553c.m37953a(C28553c.this, m37948a, false);
                C28553c.this.m37941d(m37948a.f74033a.f74038a);
            } else {
                C28553c.m37953a(C28553c.this, m37948a, true);
            }
            return true;
        } catch (Exception e) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{90, 66, 91, 81, 91, 80, 86}, new byte[]{46, 35});
            LogUtil.m37900v(m23824a, stringFogImpl.m23824a(new byte[]{30, 124, 42, 112, 39, 119, 107, 102, 36, 50, 59, 103, 63, 50, 63, 125, 107, 86, 34, 97, 32, 94, 57, 103, 8, 115, 40, 122, 46}, new byte[]{75, 18}) + e);
            if (0 != 0) {
                try {
                    c28555b.m37937a();
                } catch (IOException unused) {
                }
            }
            return false;
        }
    }
}
