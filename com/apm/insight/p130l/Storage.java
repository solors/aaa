package com.apm.insight.p130l;

import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.NpthBus;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.n */
/* loaded from: classes2.dex */
public final class Storage {
    /* renamed from: a */
    public static JSONObject m101614a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m101612b());
            jSONObject.put("inner_total", m101610c());
            jSONObject.put("sdcard_free", m101607f());
            jSONObject.put("sdcard_total", m101606g());
            jSONObject.put("inner_free_real", m101609d());
            jSONObject.put("inner_total_real", m101608e());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static long m101612b() {
        try {
            return m101611b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    private static long m101610c() {
        try {
            return m101613a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: d */
    private static long m101609d() {
        try {
            return m101611b(NpthBus.m102011g().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: e */
    private static long m101608e() {
        try {
            return m101613a(NpthBus.m102011g().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: f */
    private static long m101607f() {
        try {
            if (m101605h()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: g */
    private static long m101606g() {
        try {
            if (m101605h()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: h */
    private static boolean m101605h() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: b */
    private static long m101611b(File file) {
        try {
            return new StatFs(file.getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    private static long m101613a(File file) {
        try {
            return new StatFs(file.getPath()).getTotalBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
