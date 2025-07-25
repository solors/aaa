package com.bykv.p135vk.openvk.preload.geckox.p181f;

import android.os.Process;
import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.geckox.utils.FileLock;
import com.bykv.p135vk.openvk.preload.geckox.utils.IOSerialExecutor;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bykv.vk.openvk.preload.geckox.f.c */
/* loaded from: classes3.dex */
public final class UsingLock {

    /* renamed from: a */
    private static final Map<String, Pair<FileLock, AtomicLong>> f14063a = new HashMap();

    /* renamed from: a */
    public static void m91270a(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f14063a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                Pair<FileLock, AtomicLong> pair2 = new Pair<>(FileLock.m91235a(str, Process.myPid()), new AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    /* renamed from: b */
    public static void m91269b(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f14063a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null) {
                int i = (((AtomicLong) pair.second).decrementAndGet() > 0L ? 1 : (((AtomicLong) pair.second).decrementAndGet() == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i == 0) {
                        ((FileLock) pair.first).m91237a();
                        map.remove(str);
                    }
                } else {
                    throw new RuntimeException("using.lock count illegal");
                }
            } else {
                throw new RuntimeException("using.lock illegal state");
            }
        }
    }

    /* renamed from: c */
    public static void m91268c(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f14063a;
        synchronized (map) {
            FileLock m91233b = FileLock.m91233b(str);
            if (m91233b == null) {
                return;
            }
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                m91233b.m91237a();
                FileLock.m91235a(str, Process.myPid());
                return;
            }
            File parentFile = new File(str).getParentFile();
            final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                m91233b.m91237a();
                m91233b.m91234b();
                IOSerialExecutor.m91218a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.f.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6661b.m91224a(file);
                    }
                });
            }
        }
    }
}
