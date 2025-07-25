package com.bykv.p135vk.openvk.preload.geckox.p181f;

import com.bykv.p135vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bykv.vk.openvk.preload.geckox.f.b */
/* loaded from: classes3.dex */
public final class SelectChannelVersionLock {

    /* renamed from: a */
    private static final Map<String, Lock> f14059a = new HashMap();

    /* renamed from: b */
    private static ReentrantLock f14060b = new ReentrantLock();

    /* renamed from: c */
    private String f14061c;

    /* renamed from: d */
    private FileLock f14062d;

    private SelectChannelVersionLock(String str, FileLock fileLock) {
        this.f14061c = str;
        this.f14062d = fileLock;
    }

    /* renamed from: a */
    public static SelectChannelVersionLock m91271a(String str) throws Exception {
        f14060b.lock();
        try {
            FileLock m91236a = FileLock.m91236a(str);
            Map<String, Lock> map = f14059a;
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            lock.lock();
            return new SelectChannelVersionLock(str, m91236a);
        } catch (Exception e) {
            f14060b.unlock();
            throw e;
        }
    }

    /* renamed from: a */
    public final void m91272a() {
        try {
            this.f14062d.m91237a();
            this.f14062d.m91234b();
            Lock lock = f14059a.get(this.f14061c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f14060b.unlock();
        }
    }
}
