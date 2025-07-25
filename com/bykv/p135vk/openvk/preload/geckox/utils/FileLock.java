package com.bykv.p135vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.FileLock */
/* loaded from: classes3.dex */
public class FileLock {

    /* renamed from: a */
    private static final Map<String, Integer> f14122a = new HashMap();

    /* renamed from: b */
    private final int f14123b;

    /* renamed from: c */
    private final String f14124c;

    static {
        System.loadLibrary("file_lock");
    }

    private FileLock(String str, int i) {
        this.f14124c = str;
        this.f14123b = i;
    }

    /* renamed from: a */
    public static FileLock m91236a(String str) {
        try {
            int m91231d = m91231d(str);
            nLockFile(m91231d);
            return new FileLock(str, m91231d);
        } catch (Exception e) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: b */
    public static FileLock m91233b(String str) {
        try {
            int m91231d = m91231d(str);
            if (nTryLock(m91231d)) {
                return new FileLock(str, m91231d);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: c */
    public static FileLock m91232c(String str) throws Exception {
        try {
            int m91231d = m91231d(str);
            if (!nTryLock(m91231d)) {
                new FileLock(str, m91231d).m91234b();
                return null;
            }
            return new FileLock(str, m91231d);
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: d */
    private static int m91231d(String str) throws Exception {
        Integer num;
        Map<String, Integer> map = f14122a;
        synchronized (map) {
            num = map.get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                map.put(str, num);
            }
        }
        return num.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    /* renamed from: a */
    public static FileLock m91235a(String str, int i) {
        try {
            int m91231d = m91231d(str);
            nLockFileSegment(m91231d, i);
            return new FileLock(str, m91231d);
        } catch (Exception e) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void m91234b() {
        Integer remove;
        Map<String, Integer> map = f14122a;
        synchronized (map) {
            remove = map.remove(this.f14124c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.f14124c + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void m91237a() {
        try {
            nUnlockFile(this.f14123b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f14124c);
        }
    }
}
