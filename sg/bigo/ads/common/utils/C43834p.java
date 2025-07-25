package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.p621di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.p */
/* loaded from: classes10.dex */
public final class C43834p {

    /* renamed from: a */
    private static long f114674a;

    /* renamed from: b */
    private static long f114675b;

    /* renamed from: c */
    private static long f114676c;

    /* renamed from: d */
    private static long f114677d;

    /* renamed from: a */
    public static long m4849a() {
        if (System.currentTimeMillis() - f114675b > 60000) {
            f114674a = m4840e();
            f114675b = System.currentTimeMillis();
        }
        return f114674a;
    }

    /* renamed from: b */
    public static long m4845b(Context context) {
        ActivityManager.MemoryInfo m4841d = m4841d(context);
        if (m4841d == null) {
            return 0L;
        }
        return C43823f.m4900a(m4841d.totalMem, 3);
    }

    /* renamed from: c */
    public static int m4843c(Context context) {
        try {
            return (int) Math.min(15728640L, (((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() / 8) * 1024 * 1024);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    /* renamed from: d */
    private static ActivityManager.MemoryInfo m4841d(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static long m4840e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th) {
            C43782a.m5009a(0, "StorageUtils", "getExternalStorageRemainSpace" + th.getMessage());
            return 0L;
        }
    }

    /* renamed from: f */
    private static long m4839f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    /* renamed from: a */
    public static long m4847a(Context context) {
        ActivityManager.MemoryInfo m4841d = m4841d(context);
        if (m4841d == null) {
            return 0L;
        }
        return C43823f.m4900a(m4841d.availMem, 3);
    }

    /* renamed from: b */
    public static boolean m4846b() {
        return m4839f() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    /* renamed from: c */
    public static long m4844c() {
        if (System.currentTimeMillis() - f114677d > 60000) {
            try {
                f114676c = m4839f();
            } catch (Throwable th) {
                C43782a.m5009a(0, "StorageUtils", th.toString());
            }
            f114677d = System.currentTimeMillis();
        }
        return f114676c;
    }

    /* renamed from: d */
    public static File m4842d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    /* renamed from: a */
    public static <T> Set<T> m4848a(final int i) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            protected final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                if (size() > i) {
                    return true;
                }
                return false;
            }
        });
    }
}
