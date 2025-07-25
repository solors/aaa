package com.bykv.p135vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CacheConfig;
import com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CleanListener;
import com.bykv.p135vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.p135vk.openvk.preload.geckox.utils.AppUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.preload.geckox.b */
/* loaded from: classes3.dex */
public class GeckoConfig {

    /* renamed from: q */
    private static IThreadPoolCallback f13968q;

    /* renamed from: r */
    private static ThreadPoolExecutor f13969r;

    /* renamed from: a */
    private final Context f13970a;

    /* renamed from: b */
    private final CleanListener f13971b;

    /* renamed from: c */
    private final IStatisticMonitor f13972c;

    /* renamed from: d */
    private final INetWork f13973d;

    /* renamed from: e */
    private final List<String> f13974e;

    /* renamed from: f */
    private final List<String> f13975f;

    /* renamed from: g */
    private final CacheConfig f13976g;

    /* renamed from: h */
    private final Long f13977h;

    /* renamed from: i */
    private final String f13978i;

    /* renamed from: j */
    private final String f13979j;

    /* renamed from: k */
    private final String f13980k;

    /* renamed from: l */
    private final String f13981l;

    /* renamed from: m */
    private final String f13982m;

    /* renamed from: n */
    private final File f13983n;

    /* renamed from: o */
    private final boolean f13984o;

    /* renamed from: p */
    private JSONObject f13985p;

    /* compiled from: GeckoConfig.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.b$a */
    /* loaded from: classes3.dex */
    public static class C6632a {

        /* renamed from: a */
        private INetWork f13986a;

        /* renamed from: b */
        private List<String> f13987b;

        /* renamed from: c */
        private List<String> f13988c;

        /* renamed from: d */
        private Context f13989d;

        /* renamed from: e */
        private IStatisticMonitor f13990e;

        /* renamed from: f */
        private boolean f13991f = true;

        /* renamed from: g */
        private CacheConfig f13992g;

        /* renamed from: h */
        private Long f13993h;

        /* renamed from: i */
        private String f13994i;

        /* renamed from: j */
        private String f13995j;

        /* renamed from: k */
        private String f13996k;

        /* renamed from: l */
        private File f13997l;

        public C6632a(Context context) {
            this.f13989d = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C6632a m91372a(String... strArr) {
            this.f13988c = Arrays.asList(strArr);
            return this;
        }

        /* renamed from: b */
        public final C6632a m91368b(String... strArr) {
            this.f13987b = Arrays.asList(strArr);
            return this;
        }

        /* renamed from: c */
        public final C6632a m91366c(String str) {
            this.f13996k = str;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91376a(INetWork iNetWork) {
            this.f13986a = iNetWork;
            return this;
        }

        /* renamed from: b */
        public final C6632a m91371b() {
            this.f13993h = 38L;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91375a(IStatisticMonitor iStatisticMonitor) {
            this.f13990e = iStatisticMonitor;
            return this;
        }

        /* renamed from: b */
        public final C6632a m91369b(String str) {
            this.f13995j = str;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91379a() {
            this.f13991f = false;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91378a(CacheConfig cacheConfig) {
            this.f13992g = cacheConfig;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91373a(String str) {
            this.f13994i = str;
            return this;
        }

        /* renamed from: a */
        public final C6632a m91374a(File file) {
            this.f13997l = file;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ GeckoConfig(C6632a c6632a, byte b) {
        this(c6632a);
    }

    /* renamed from: g */
    public static Executor m91389g() {
        return m91380p();
    }

    /* renamed from: h */
    public static Executor m91388h() {
        return m91380p();
    }

    /* renamed from: p */
    public static ExecutorService m91380p() {
        ExecutorService executorService;
        IThreadPoolCallback iThreadPoolCallback = f13968q;
        if (iThreadPoolCallback != null) {
            executorService = iThreadPoolCallback.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f13969r == null) {
            synchronized (GeckoConfig.class) {
                if (f13969r == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f13969r = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f13969r;
    }

    /* renamed from: a */
    public final Context m91397a() {
        return this.f13970a;
    }

    /* renamed from: b */
    public final CacheConfig m91394b() {
        return this.f13976g;
    }

    /* renamed from: c */
    public final boolean m91393c() {
        return this.f13984o;
    }

    /* renamed from: d */
    public final List<String> m91392d() {
        return this.f13975f;
    }

    /* renamed from: e */
    public final List<String> m91391e() {
        return this.f13974e;
    }

    /* renamed from: f */
    public final JSONObject m91390f() {
        return this.f13985p;
    }

    /* renamed from: i */
    public final INetWork m91387i() {
        return this.f13973d;
    }

    /* renamed from: j */
    public final String m91386j() {
        return this.f13980k;
    }

    /* renamed from: k */
    public final long m91385k() {
        return this.f13977h.longValue();
    }

    /* renamed from: l */
    public final File m91384l() {
        return this.f13983n;
    }

    /* renamed from: m */
    public final String m91383m() {
        return this.f13978i;
    }

    /* renamed from: n */
    public final IStatisticMonitor m91382n() {
        return this.f13972c;
    }

    /* renamed from: o */
    public final String m91381o() {
        return this.f13979j;
    }

    private GeckoConfig(C6632a c6632a) {
        Context context = c6632a.f13989d;
        this.f13970a = context;
        if (context != null) {
            List<String> list = c6632a.f13987b;
            this.f13974e = list;
            this.f13975f = c6632a.f13988c;
            this.f13971b = null;
            this.f13976g = c6632a.f13992g;
            Long l = c6632a.f13993h;
            this.f13977h = l;
            if (!TextUtils.isEmpty(c6632a.f13994i)) {
                this.f13978i = c6632a.f13994i;
            } else {
                this.f13978i = AppUtils.m91229a(context);
            }
            String str = c6632a.f13995j;
            this.f13979j = str;
            this.f13981l = null;
            this.f13982m = null;
            if (c6632a.f13997l != null) {
                this.f13983n = c6632a.f13997l;
            } else {
                this.f13983n = new File(context.getFilesDir(), "gecko_offline_res_x");
            }
            String str2 = c6632a.f13996k;
            this.f13980k = str2;
            if (!TextUtils.isEmpty(str2)) {
                if (list == null || list.isEmpty()) {
                    throw new IllegalArgumentException("access key empty");
                }
                if (l != null) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f13973d = c6632a.f13986a;
                        this.f13972c = c6632a.f13990e;
                        this.f13984o = c6632a.f13991f;
                        return;
                    }
                    throw new IllegalArgumentException("deviceId key empty");
                }
                throw new IllegalArgumentException("appId == null");
            }
            throw new IllegalArgumentException("host == null");
        }
        throw new IllegalArgumentException("context == null");
    }

    /* renamed from: a */
    public final void m91395a(JSONObject jSONObject) {
        this.f13985p = jSONObject;
    }

    /* renamed from: a */
    public static void m91396a(IThreadPoolCallback iThreadPoolCallback) {
        f13968q = iThreadPoolCallback;
    }
}
