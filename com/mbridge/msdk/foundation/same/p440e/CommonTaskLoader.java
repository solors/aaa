package com.mbridge.msdk.foundation.same.p440e;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.p440e.CommonTask;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.e.b */
/* loaded from: classes6.dex */
public final class CommonTaskLoader {

    /* renamed from: a */
    ThreadPoolExecutor f56559a;

    /* renamed from: b */
    HashMap<Long, CommonTask> f56560b;

    /* renamed from: c */
    WeakReference<Context> f56561c;

    @SuppressLint({"UseSparseArrays"})
    public CommonTaskLoader(Context context, int i) {
        if (SameOptimizedController.m51814a().m51810a("c_t_l_t_p", true)) {
            this.f56559a = CommonTaskLoaderThreadPool.m52230a();
        } else {
            if (i == 0) {
                this.f56559a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f56559a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f56559a.allowCoreThreadTimeOut(true);
        }
        this.f56560b = new HashMap<>();
        this.f56561c = new WeakReference<>(context);
    }

    /* renamed from: b */
    private synchronized void m52231b(final CommonTask commonTask, final CommonTask.InterfaceC21976a interfaceC21976a) {
        this.f56560b.put(Long.valueOf(commonTask.getId()), commonTask);
        commonTask.setOnStateChangeListener(new CommonTask.InterfaceC21976a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.p440e.CommonTask.InterfaceC21976a
            /* renamed from: a */
            public final void mo51275a(CommonTask.EnumC21977b enumC21977b) {
                if (enumC21977b == CommonTask.EnumC21977b.CANCEL) {
                    CommonTaskLoader.this.f56560b.remove(Long.valueOf(commonTask.getId()));
                } else if (enumC21977b == CommonTask.EnumC21977b.FINISH) {
                    CommonTaskLoader.this.f56560b.remove(Long.valueOf(commonTask.getId()));
                } else if (enumC21977b == CommonTask.EnumC21977b.RUNNING && CommonTaskLoader.this.f56561c.get() == null) {
                    CommonTaskLoader.this.m52234a();
                }
                CommonTask.InterfaceC21976a interfaceC21976a2 = interfaceC21976a;
                if (interfaceC21976a2 != null) {
                    interfaceC21976a2.mo51275a(enumC21977b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m52233a(CommonTask commonTask) {
        m52231b(commonTask, null);
        this.f56559a.execute(commonTask);
    }

    /* renamed from: a */
    public final synchronized void m52234a() {
        try {
            for (Map.Entry<Long, CommonTask> entry : this.f56560b.entrySet()) {
                entry.getValue().cancel();
            }
            this.f56560b.clear();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m52232a(CommonTask commonTask, CommonTask.InterfaceC21976a interfaceC21976a) {
        m52231b(commonTask, interfaceC21976a);
        this.f56559a.execute(commonTask);
    }

    @SuppressLint({"UseSparseArrays"})
    public CommonTaskLoader(Context context) {
        if (SameOptimizedController.m51814a().m51810a("c_t_l_t_p", true)) {
            this.f56559a = CommonTaskLoaderThreadPool.m52230a();
        } else {
            if (SameOptimizedController.m51814a().m51810a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f56559a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f56559a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f56559a.allowCoreThreadTimeOut(true);
        }
        this.f56560b = new HashMap<>();
        this.f56561c = new WeakReference<>(context);
    }
}
