package com.bykv.p135vk.openvk.preload.geckox.p181f;

import com.bykv.p135vk.openvk.preload.geckox.utils.AppUtils;
import com.bykv.p135vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bykv.vk.openvk.preload.geckox.f.a */
/* loaded from: classes3.dex */
public final class ChannelUpdateLock {

    /* renamed from: a */
    private static final Map<String, Lock> f14056a = new HashMap();

    /* renamed from: b */
    private FileLock f14057b;

    /* renamed from: c */
    private String f14058c;

    private ChannelUpdateLock(String str, FileLock fileLock) {
        this.f14058c = str;
        this.f14057b = fileLock;
    }

    /* renamed from: a */
    public static ChannelUpdateLock m91273a(String str) throws Exception {
        Map<String, Lock> map = f14056a;
        synchronized (map) {
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            if (lock.tryLock()) {
                try {
                    FileLock m91232c = FileLock.m91232c(str);
                    if (m91232c == null) {
                        lock.unlock();
                        return null;
                    }
                    return new ChannelUpdateLock(str, m91232c);
                } catch (Exception e) {
                    lock.lock();
                    AppUtils.m91228a(new RuntimeException(e));
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m91274a() {
        Map<String, Lock> map = f14056a;
        synchronized (map) {
            this.f14057b.m91237a();
            this.f14057b.m91234b();
            map.get(this.f14058c).unlock();
        }
    }
}
