package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6374IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6388WR;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6377IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6378bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.AbstractC6410bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6400IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6401bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p144bX.C6447bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6507IL;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.eqN */
/* loaded from: classes3.dex */
public class C6412eqN {

    /* renamed from: zx */
    private static volatile C6412eqN f13366zx;

    /* renamed from: IL */
    private final SparseArray<Map<String, C6374IL>> f13367IL;

    /* renamed from: Kg */
    private volatile C6400IL f13368Kg;

    /* renamed from: PX */
    private volatile C6393bX f13369PX;

    /* renamed from: Ta */
    private volatile String f13370Ta;

    /* renamed from: VB */
    private volatile C6393bX f13371VB;

    /* renamed from: WR */
    private final HashSet<C6420bg> f13372WR;

    /* renamed from: bX */
    private final C6419IL<Runnable> f13373bX;

    /* renamed from: bg */
    private volatile int f13374bg = 163840;

    /* renamed from: eo */
    private final C6374IL.InterfaceC6375IL f13375eo;
    private final ExecutorService eqN;

    /* renamed from: iR */
    private volatile C6401bX f13376iR;
    private volatile C6378bX ldr;
    private volatile boolean yDt;

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.eqN$IL */
    /* loaded from: classes3.dex */
    public static final class C6419IL<T> extends LinkedBlockingDeque<T> {

        /* renamed from: bg */
        private ThreadPoolExecutor f13384bg;

        private C6419IL() {
        }

        /* renamed from: bg */
        public void m92014bg(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f13384bg == null) {
                    if (threadPoolExecutor != null) {
                        this.f13384bg = threadPoolExecutor;
                    } else {
                        throw new NullPointerException("executor argument can't be null!");
                    }
                } else {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t) {
            synchronized (this) {
                int poolSize = this.f13384bg.getPoolSize();
                int activeCount = this.f13384bg.getActiveCount();
                int maximumPoolSize = this.f13384bg.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    if (C6438zx.f13435bX) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
                return offerFirst(t);
            }
        }
    }

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.eqN$bg */
    /* loaded from: classes3.dex */
    public static final class C6420bg {

        /* renamed from: IL */
        final boolean f13385IL;

        /* renamed from: bX */
        final int f13386bX;

        /* renamed from: bg */
        final boolean f13387bg;
        final String eqN;
        final String[] ldr;

        /* renamed from: zx */
        final Map<String, String> f13388zx;

        C6420bg(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.f13387bg = z;
            this.f13385IL = z2;
            this.f13386bX = i;
            this.eqN = str;
            this.f13388zx = map;
            this.ldr = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6420bg.class != obj.getClass()) {
                return false;
            }
            C6420bg c6420bg = (C6420bg) obj;
            if (this.f13387bg != c6420bg.f13387bg || this.f13385IL != c6420bg.f13385IL || this.f13386bX != c6420bg.f13386bX) {
                return false;
            }
            return this.eqN.equals(c6420bg.eqN);
        }

        public int hashCode() {
            return ((((((this.f13387bg ? 1 : 0) * 31) + (this.f13385IL ? 1 : 0)) * 31) + this.f13386bX) * 31) + this.eqN.hashCode();
        }
    }

    private C6412eqN() {
        SparseArray<Map<String, C6374IL>> sparseArray = new SparseArray<>(2);
        this.f13367IL = sparseArray;
        this.f13372WR = new HashSet<>();
        this.f13375eo = new C6374IL.InterfaceC6375IL() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.1
            {
                C6412eqN.this = this;
            }

            @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6374IL.InterfaceC6375IL
            /* renamed from: bg */
            public void mo92003bg(C6374IL c6374il) {
                int ldr = c6374il.ldr();
                synchronized (C6412eqN.this.f13367IL) {
                    Map map = (Map) C6412eqN.this.f13367IL.get(ldr);
                    if (map != null) {
                        map.remove(c6374il.f13334Kg);
                    }
                }
                if (C6438zx.f13435bX) {
                    Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + c6374il.f13334Kg);
                }
            }
        };
        C6419IL<Runnable> c6419il = new C6419IL<>();
        this.f13373bX = c6419il;
        ExecutorService m92021bg = m92021bg(c6419il);
        this.eqN = m92021bg;
        c6419il.m92014bg((ThreadPoolExecutor) m92021bg);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    /* renamed from: bX */
    public static C6412eqN m92026bX() {
        if (f13366zx == null) {
            synchronized (C6412eqN.class) {
                if (f13366zx == null) {
                    f13366zx = new C6412eqN();
                }
            }
        }
        return f13366zx;
    }

    public void eqN() {
        C6447bg.m91924bg(new AbstractRunnableC7227Kg("cancelAll") { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.3
            {
                C6412eqN.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList<C6374IL> arrayList = new ArrayList();
                synchronized (C6412eqN.this.f13367IL) {
                    int size = C6412eqN.this.f13367IL.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C6412eqN.this.f13367IL.get(C6412eqN.this.f13367IL.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C6412eqN.this.f13373bX.clear();
                }
                for (C6374IL c6374il : arrayList) {
                    c6374il.mo92009bg();
                    if (C6438zx.f13435bX) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + c6374il + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* renamed from: IL */
    public C6393bX m92028IL() {
        return this.f13369PX;
    }

    /* renamed from: bg */
    public void m92022bg(C6401bX c6401bX) {
        this.f13376iR = c6401bX;
    }

    /* renamed from: bg */
    public void m92023bg(C6378bX c6378bX) {
        this.ldr = c6378bX;
    }

    /* renamed from: bg */
    public void m92024bg(int i) {
        if (i > 0) {
            this.f13374bg = i;
        }
        if (C6438zx.f13435bX) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: bg */
    public C6393bX m92025bg() {
        return this.f13371VB;
    }

    /* renamed from: bg */
    public void m92018bg(boolean z, String str) {
        C6374IL remove;
        this.f13370Ta = str;
        this.yDt = z;
        if (C6438zx.f13435bX) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.f13372WR) {
                if (!this.f13372WR.isEmpty()) {
                    hashSet2 = new HashSet(this.f13372WR);
                    this.f13372WR.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    C6420bg c6420bg = (C6420bg) it.next();
                    m92017bg(c6420bg.f13387bg, c6420bg.f13385IL, c6420bg.f13386bX, c6420bg.eqN, c6420bg.f13388zx, c6420bg.ldr);
                    if (C6438zx.f13435bX) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + c6420bg.eqN);
                    }
                }
                return;
            }
            return;
        }
        int i = C6438zx.f13432Kg;
        if (i != 3 && i != 2) {
            if (i == 1) {
                synchronized (this.f13367IL) {
                    Map<String, C6374IL> map = this.f13367IL.get(C6377IL.m92089bg(z));
                    remove = map != null ? map.remove(str) : null;
                }
                if (remove != null) {
                    remove.mo92009bg();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.f13367IL) {
            int size = this.f13367IL.size();
            for (int i2 = 0; i2 < size; i2++) {
                SparseArray<Map<String, C6374IL>> sparseArray = this.f13367IL;
                Map<String, C6374IL> map2 = sparseArray.get(sparseArray.keyAt(i2));
                if (map2 != null) {
                    Collection<C6374IL> values = map2.values();
                    if (values != null && !values.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(values);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C6374IL c6374il = (C6374IL) it2.next();
            c6374il.mo92009bg();
            if (C6438zx.f13435bX) {
                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + c6374il.f13342iR);
            }
        }
        if (i == 3) {
            synchronized (this.f13372WR) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    C6420bg c6420bg2 = (C6420bg) ((C6374IL) it3.next()).yDt;
                    if (c6420bg2 != null) {
                        this.f13372WR.add(c6420bg2);
                    }
                }
            }
        }
    }

    /* renamed from: bg */
    public void m92016bg(boolean z, boolean z2, int i, String str, String... strArr) {
        m92017bg(z, z2, i, str, null, strArr);
    }

    /* renamed from: bg */
    public void m92017bg(boolean z, boolean z2, int i, String str, Map<String, String> map, String... strArr) {
        SparseArray<Map<String, C6374IL>> sparseArray;
        ArrayList arrayList;
        boolean z3 = C6438zx.f13435bX;
        if (z3) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        AbstractC6410bg abstractC6410bg = z ? this.f13368Kg : this.f13376iR;
        C6378bX c6378bX = this.ldr;
        if (abstractC6410bg == null || c6378bX == null) {
            if (z3) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
            }
        } else if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            int i2 = i <= 0 ? this.f13374bg : i;
            String m91683bg = z2 ? str : C6507IL.m91683bg(str);
            File eqN = abstractC6410bg.eqN(m91683bg);
            if (eqN != null && eqN.length() >= i2) {
                if (z3) {
                    Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + eqN.length() + ", need preload size: " + i2);
                }
            } else if (C6428ldr.m91986bg().m91985bg(C6377IL.m92089bg(z), m91683bg)) {
                if (z3) {
                    Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(String.valueOf(str)));
                }
            } else {
                SparseArray<Map<String, C6374IL>> sparseArray2 = this.f13367IL;
                synchronized (sparseArray2) {
                    try {
                        Map<String, C6374IL> map2 = this.f13367IL.get(z ? 1 : 0);
                        if (!map2.containsKey(m91683bg)) {
                            int i3 = i2;
                            sparseArray = sparseArray2;
                            try {
                                C6420bg c6420bg = new C6420bg(z, z2, i2, str, map, strArr);
                                String str2 = this.f13370Ta;
                                if (str2 != null) {
                                    int i4 = C6438zx.f13432Kg;
                                    if (i4 == 3) {
                                        synchronized (this.f13372WR) {
                                            this.f13372WR.add(c6420bg);
                                        }
                                        if (z3) {
                                            Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                                        }
                                        return;
                                    } else if (i4 == 2) {
                                        if (z3) {
                                            Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(String.valueOf(str)));
                                        }
                                        return;
                                    } else if (i4 == 1 && this.yDt == z && str2.equals(m91683bg)) {
                                        if (z3) {
                                            Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                                        }
                                        return;
                                    }
                                }
                                List<C6388WR.C6389IL> m91916bg = C6447bg.m91916bg(C6447bg.m91915bg(map));
                                if (m91916bg != null) {
                                    arrayList = new ArrayList(m91916bg.size());
                                    int size = m91916bg.size();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        C6388WR.C6389IL c6389il = m91916bg.get(i5);
                                        if (c6389il != null) {
                                            arrayList.add(new C6388WR.C6389IL(c6389il.f13323bg, c6389il.f13322IL));
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                C6374IL m92078bg = new C6374IL.C6376bg().m92072bg(abstractC6410bg).m92075bg(c6378bX).m92070bg(str).m92079IL(m91683bg).m92074bg(new C6385PX(C6447bg.m91914bg(strArr))).m92069bg((List<C6388WR.C6389IL>) arrayList).m92077bg(i3).m92076bg(this.f13375eo).m92071bg(c6420bg).m92078bg();
                                map2.put(m91683bg, m92078bg);
                                this.eqN.execute(m92078bg);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sparseArray = sparseArray2;
                    }
                }
            }
        }
    }

    /* renamed from: bg */
    public void m92019bg(String str) {
        m92015bg(false, false, str);
    }

    /* renamed from: bg */
    public void m92015bg(final boolean z, final boolean z2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6447bg.m91924bg(new AbstractRunnableC7227Kg("cancel b b S") { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.2
            {
                C6412eqN.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6374IL c6374il;
                String m91683bg;
                synchronized (C6412eqN.this.f13367IL) {
                    Map map = (Map) C6412eqN.this.f13367IL.get(C6377IL.m92089bg(z));
                    if (map != null) {
                        if (z2) {
                            m91683bg = str;
                        } else {
                            m91683bg = C6507IL.m91683bg(str);
                        }
                        c6374il = (C6374IL) map.remove(m91683bg);
                    } else {
                        c6374il = null;
                    }
                }
                if (c6374il != null) {
                    c6374il.mo92009bg();
                }
            }
        });
    }

    /* renamed from: bg */
    private static ExecutorService m92021bg(final C6419IL<Runnable> c6419il) {
        int i;
        int m91931bg = C6447bg.m91931bg();
        if (m91931bg <= 0) {
            m91931bg = 1;
        } else if (m91931bg > 4) {
            i = 4;
            return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, c6419il, new ThreadFactory() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4.1
                        {
                            ThreadFactoryC64164.this = this;
                        }

                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (C6438zx.f13435bX) {
                        Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        c6419il.offerFirst(runnable);
                        if (C6438zx.f13435bX) {
                            Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        i = m91931bg;
        return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, c6419il, new ThreadFactory() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4.1
                    {
                        ThreadFactoryC64164.this = this;
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (C6438zx.f13435bX) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    c6419il.offerFirst(runnable);
                    if (C6438zx.f13435bX) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
