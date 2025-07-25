package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import com.bykv.p135vk.openvk.preload.p163b.RealInterceptorChain;
import com.bykv.p135vk.openvk.preload.p163b.p164a.ParallelException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: com.bykv.vk.openvk.preload.b.g */
/* loaded from: classes3.dex */
public class ParallelInterceptor<T> extends Interceptor<List<T>, T> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* synthetic */ Object mo91295a(final Chain chain, Object obj) throws Throwable {
        List list = (List) obj;
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (final Object obj2 : list) {
            GeckoConfig.m91380p().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.b.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            copyOnWriteArrayList.add(chain.mo91449a((Chain) obj2));
                        } catch (RealInterceptorChain.C6622a e) {
                            Throwable cause = e.getCause();
                            copyOnWriteArrayList2.add(cause);
                            ParallelInterceptor.this.m91464d(cause);
                        } catch (Throwable th) {
                            copyOnWriteArrayList2.add(th);
                            ParallelInterceptor.this.m91464d(th);
                        }
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new ParallelException(copyOnWriteArrayList2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        if (objArr != null) {
            if (objArr.length == 1) {
                if (!(objArr[0] instanceof Executor)) {
                    throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
                }
                return;
            }
            throw new IllegalArgumentException("ParallelInterceptor only need one param");
        }
    }
}
