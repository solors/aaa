package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.analytic.AnalyticsInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.AdNetType;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.common.SdkConfig;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32455cicc2iiccc;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32456cici2o2oo;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32463ciiioc2ioc;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32467cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio.C32561coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio.C32562coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.C32647coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.util.TrackUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22 */
/* loaded from: classes8.dex */
public class C32633cco22 {
    private static volatile C32633cco22 cicic = null;
    private static final String cii2c2 = "ResourceManager";
    private static final int ciii2coi2 = 75;
    private static final ExecutorService coiic = C32465cioc2.c2oc2i;
    private C32640coi222o222 c2oc2i;
    private String coi222o222;
    private Context coo2iico;
    private ConcurrentHashMap<String, C32636cioccoiococ> cioccoiococ = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> c2oc2o = new ConcurrentHashMap<>();
    private ConcurrentLinkedQueue<C32636cioccoiococ> cco22 = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22$c2oc2i */
    /* loaded from: classes8.dex */
    public class C32634c2oc2i extends AbstractRunnableC32566c2oc2o {
        public C32634c2oc2i() {
            super(C32633cco22.cii2c2, "PollingTask exception");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() {
            while (!C32633cco22.this.cco22.isEmpty()) {
                C32636cioccoiococ c32636cioccoiococ = (C32636cioccoiococ) C32633cco22.this.cco22.poll();
                if (c32636cioccoiococ != null) {
                    new RunnableC32635c2oc2o(C32633cco22.this, c32636cioccoiococ).run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22$c2oc2o */
    /* loaded from: classes8.dex */
    public class RunnableC32635c2oc2o implements Runnable {
        String c2oc2i;
        InterfaceC32639cioccoiococ coi222o222;
        C32636cioccoiococ coo2iico;

        public RunnableC32635c2oc2o(C32633cco22 c32633cco22, C32636cioccoiococ c32636cioccoiococ) {
            this(c32636cioccoiococ, null);
        }

        private void c2oc2i() {
            InterfaceC32639cioccoiococ interfaceC32639cioccoiococ = this.coi222o222;
            if (interfaceC32639cioccoiococ != null) {
                interfaceC32639cioccoiococ.coo2iico(System.currentTimeMillis());
            }
        }

        private void cioccoiococ() {
            InterfaceC32639cioccoiococ interfaceC32639cioccoiococ = this.coi222o222;
            if (interfaceC32639cioccoiococ != null) {
                interfaceC32639cioccoiococ.coi222o222(System.currentTimeMillis());
            }
        }

        private void coi222o222() {
            InterfaceC32639cioccoiococ interfaceC32639cioccoiococ = this.coi222o222;
            if (interfaceC32639cioccoiococ != null) {
                interfaceC32639cioccoiococ.coi222o222();
            }
        }

        private void coo2iico() {
            InterfaceC32639cioccoiococ interfaceC32639cioccoiococ = this.coi222o222;
            if (interfaceC32639cioccoiococ != null) {
                interfaceC32639cioccoiococ.coo2iico();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C32561coi222o222 c32561coi222o222;
            MLog.m25892d(C32633cco22.cii2c2, " worker start. " + this.coo2iico.coo2iico);
            long currentTimeMillis = System.currentTimeMillis();
            C32561coi222o222 c32561coi222o2222 = null;
            try {
                try {
                    String coi222o222 = C32633cco22.this.c2oc2i.coi222o222(this.coo2iico.coo2iico);
                    if (!TextUtils.isEmpty(coi222o222)) {
                        this.c2oc2i = coi222o222;
                        C32631c2oc2o.c2oc2i(this.coo2iico);
                        MLog.m25892d(C32633cco22.cii2c2, "worker end. " + this.coo2iico.coo2iico);
                        try {
                            if (!this.coo2iico.ciii2coi2) {
                                C32633cco22.this.cioccoiococ.remove(this.coo2iico.coo2iico);
                            }
                            Object remove = C32633cco22.this.c2oc2o.remove(this.coo2iico.coo2iico);
                            if (remove != null) {
                                synchronized (remove) {
                                    remove.notifyAll();
                                }
                            }
                            coi222o222((C32561coi222o222) null);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (C32562coo2iico.coo2iico(C32633cco22.this.coo2iico, this.coo2iico.coi222o222)) {
                        ConcurrentHashMap concurrentHashMap = C32633cco22.this.cioccoiococ;
                        C32636cioccoiococ c32636cioccoiococ = this.coo2iico;
                        concurrentHashMap.put(c32636cioccoiococ.coo2iico, c32636cioccoiococ);
                        MLog.m25892d(C32633cco22.cii2c2, "download url. " + this.coo2iico.coo2iico);
                        C32633cco22.this.c2oc2o.put(this.coo2iico.coo2iico, new Object());
                        cioccoiococ();
                        if (this.coo2iico.coo2iico()) {
                            Context context = C32633cco22.this.coo2iico;
                            C32636cioccoiococ c32636cioccoiococ2 = this.coo2iico;
                            c32561coi222o222 = new C32561coi222o222(context, c32636cioccoiococ2.coo2iico, c32636cioccoiococ2.c2oc2i, c32636cioccoiococ2.c2oc2o);
                            try {
                                c32561coi222o222.c2oc2i();
                                c32561coi222o2222 = c32561coi222o222;
                            } catch (Exception e2) {
                                e = e2;
                                c32561coi222o2222 = c32561coi222o222;
                                MLog.m25888e(MLog.addAdPrefix(C32633cco22.cii2c2), "Worker exception", e);
                                coo2iico(c32561coi222o2222, e.getClass().getName());
                                C32631c2oc2o.coo2iico(this.coo2iico);
                                C32633cco22.this.coo2iico(this.coo2iico, System.currentTimeMillis() - currentTimeMillis, e.getMessage(), 1);
                                MLog.m25892d(C32633cco22.cii2c2, "worker end. " + this.coo2iico.coo2iico);
                                try {
                                    if (!this.coo2iico.ciii2coi2) {
                                        C32633cco22.this.cioccoiococ.remove(this.coo2iico.coo2iico);
                                    }
                                    Object remove2 = C32633cco22.this.c2oc2o.remove(this.coo2iico.coo2iico);
                                    if (remove2 != null) {
                                        synchronized (remove2) {
                                            remove2.notifyAll();
                                        }
                                    }
                                    coi222o222(c32561coi222o2222);
                                    return;
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                MLog.m25892d(C32633cco22.cii2c2, "worker end. " + this.coo2iico.coo2iico);
                                try {
                                    if (!this.coo2iico.ciii2coi2) {
                                        C32633cco22.this.cioccoiococ.remove(this.coo2iico.coo2iico);
                                    }
                                    Object remove3 = C32633cco22.this.c2oc2o.remove(this.coo2iico.coo2iico);
                                    if (remove3 != null) {
                                        synchronized (remove3) {
                                            remove3.notifyAll();
                                        }
                                    }
                                    coi222o222(c32561coi222o222);
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                                throw th;
                            }
                        }
                        String coi222o2222 = coi222o222(this.coo2iico.coo2iico);
                        if (TextUtils.isEmpty(coi222o2222)) {
                            c2oc2i();
                            coo2iico(c32561coi222o2222);
                            this.c2oc2i = C32633cco22.this.c2oc2i.coi222o222(this.coo2iico.coo2iico);
                            coi222o222();
                            C32631c2oc2o.c2oc2i(this.coo2iico);
                            C32633cco22.this.coo2iico(this.coo2iico, System.currentTimeMillis() - currentTimeMillis, null, 0);
                        } else {
                            coo2iico();
                            coo2iico(c32561coi222o2222, coi222o2222);
                            C32631c2oc2o.coo2iico(this.coo2iico);
                            C32633cco22.this.coo2iico(this.coo2iico, System.currentTimeMillis() - currentTimeMillis, coi222o2222, 1);
                        }
                        MLog.m25892d(C32633cco22.cii2c2, "worker end. " + this.coo2iico.coo2iico);
                        try {
                            if (!this.coo2iico.ciii2coi2) {
                                C32633cco22.this.cioccoiococ.remove(this.coo2iico.coo2iico);
                            }
                            Object remove4 = C32633cco22.this.c2oc2o.remove(this.coo2iico.coo2iico);
                            if (remove4 != null) {
                                synchronized (remove4) {
                                    remove4.notifyAll();
                                }
                            }
                            coi222o222(c32561coi222o2222);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } else {
                        MLog.m25892d(C32633cco22.cii2c2, "current network can not download resource " + this.coo2iico.coo2iico);
                        C32631c2oc2o.coo2iico(this.coo2iico);
                        MLog.m25892d(C32633cco22.cii2c2, "worker end. " + this.coo2iico.coo2iico);
                        try {
                            if (!this.coo2iico.ciii2coi2) {
                                C32633cco22.this.cioccoiococ.remove(this.coo2iico.coo2iico);
                            }
                            Object remove5 = C32633cco22.this.c2oc2o.remove(this.coo2iico.coo2iico);
                            if (remove5 != null) {
                                synchronized (remove5) {
                                    remove5.notifyAll();
                                }
                            }
                            coi222o222((C32561coi222o222) null);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c32561coi222o222 = null;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }

        public RunnableC32635c2oc2o(C32636cioccoiococ c32636cioccoiococ, InterfaceC32639cioccoiococ interfaceC32639cioccoiococ) {
            this.c2oc2i = null;
            this.coo2iico = c32636cioccoiococ;
            this.coi222o222 = interfaceC32639cioccoiococ;
        }

        private void coi222o222(C32561coi222o222 c32561coi222o222) {
            if (c32561coi222o222 != null) {
                c32561coi222o222.coi222o222();
            }
        }

        private void coo2iico(C32561coi222o222 c32561coi222o222) {
            if (c32561coi222o222 != null) {
                c32561coi222o222.coo2iico();
            }
        }

        protected InputStream c2oc2i(String str) throws IOException {
            HttpURLConnection coo2iico = coo2iico(str);
            this.coo2iico.cioccoiococ = coo2iico.getContentLengthLong();
            for (int i = 0; coo2iico.getResponseCode() / 100 == 3 && i < 5; i++) {
                coo2iico = coo2iico(coo2iico.getHeaderField("Location"));
            }
            InputStream inputStream = coo2iico.getInputStream();
            if (coo2iico.getResponseCode() != 200) {
                C32455cicc2iiccc.coo2iico((Closeable) inputStream);
                Log.d(C32633cco22.cii2c2, "Image request failed with response code " + coo2iico.getResponseCode());
            }
            return inputStream;
        }

        private String coi222o222(String str) {
            Throwable th;
            InputStream inputStream;
            InputStream inputStream2;
            try {
                if (!C32562coo2iico.coo2iico(C32633cco22.this.coo2iico, this.coo2iico.coi222o222)) {
                    C32455cicc2iiccc.coo2iico((Closeable) null);
                    C32455cicc2iiccc.coo2iico((Closeable) null);
                    MLog.m25892d(C32633cco22.cii2c2, "download end.");
                    return Constants.NETWORK_IS_UNAVAILABLE;
                }
                inputStream = c2oc2i(str);
                try {
                    C32633cco22.this.c2oc2i.coo2iico(this.coo2iico.coo2iico, C32455cicc2iiccc.coo2iico(inputStream));
                    C32455cicc2iiccc.coo2iico((Closeable) inputStream);
                    C32455cicc2iiccc.coo2iico((Closeable) null);
                    MLog.m25892d(C32633cco22.cii2c2, "download end.");
                    return null;
                } catch (Exception e) {
                    inputStream2 = inputStream;
                    e = e;
                    try {
                        Log.e(MLog.addAdPrefix(C32633cco22.cii2c2), "download exception", e);
                        String message = e.getMessage();
                        C32455cicc2iiccc.coo2iico((Closeable) inputStream2);
                        C32455cicc2iiccc.coo2iico((Closeable) null);
                        MLog.m25892d(C32633cco22.cii2c2, "download end.");
                        return message;
                    } catch (Throwable th2) {
                        InputStream inputStream3 = inputStream2;
                        th = th2;
                        inputStream = inputStream3;
                        C32455cicc2iiccc.coo2iico((Closeable) inputStream);
                        C32455cicc2iiccc.coo2iico((Closeable) null);
                        MLog.m25892d(C32633cco22.cii2c2, "download end.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C32455cicc2iiccc.coo2iico((Closeable) inputStream);
                    C32455cicc2iiccc.coo2iico((Closeable) null);
                    MLog.m25892d(C32633cco22.cii2c2, "download end.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                inputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        }

        private void coo2iico(C32561coi222o222 c32561coi222o222, String str) {
            if (c32561coi222o222 != null) {
                c32561coi222o222.coo2iico(str);
            }
        }

        protected HttpURLConnection coo2iico(String str) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(20000);
            return httpURLConnection;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22$cioccoiococ */
    /* loaded from: classes8.dex */
    public static class C32636cioccoiococ {
        public final long c2oc2i;
        public final String c2oc2o;
        public String cco22;
        boolean cii2c2;
        boolean ciii2coi2;
        public long cioccoiococ = -1;
        final int coi222o222;
        public final String coo2iico;

        private C32636cioccoiococ(String str, int i, long j, String str2) {
            this.coo2iico = str;
            this.coi222o222 = i;
            this.c2oc2i = j;
            this.c2oc2o = str2;
        }

        public static C32636cioccoiococ coo2iico(String str, int i, long j, String str2) {
            return new C32636cioccoiococ(str, i, j, str2);
        }

        public C32636cioccoiococ coi222o222(boolean z) {
            this.cii2c2 = z;
            return this;
        }

        public String toString() {
            return String.format("Request[url:%s, allowedNetwork:%d, adId:%d, adPassBack:%s]", this.coo2iico, Integer.valueOf(this.coi222o222), Long.valueOf(this.c2oc2i), this.c2oc2o);
        }

        public static C32636cioccoiococ coo2iico(String str, int i, String str2) {
            return new C32636cioccoiococ(str, i, -1L, str2);
        }

        public static C32636cioccoiococ coo2iico(String str, IAdInfoEntity iAdInfoEntity) {
            String str2;
            String str3;
            long j;
            int value = AdNetType.NETWORK_WIFI.value();
            if (iAdInfoEntity != null) {
                long id2 = iAdInfoEntity.getId();
                String c2oc2i = iAdInfoEntity.c2oc2i();
                str3 = iAdInfoEntity.coo2iico();
                j = id2;
                str2 = c2oc2i;
            } else {
                str2 = null;
                str3 = null;
                j = -1;
            }
            return new C32636cioccoiococ(str, value, j, str2, str3).coi222o222(false);
        }

        private C32636cioccoiococ(String str, int i, long j, String str2, String str3) {
            this.coo2iico = str;
            this.coi222o222 = i;
            this.c2oc2i = j;
            this.c2oc2o = str2;
            this.cco22 = str3;
        }

        public static C32636cioccoiococ coo2iico(String str, int i) {
            return coo2iico(str, i, -1L, null);
        }

        public static C32636cioccoiococ coo2iico(String str, long j) {
            return new C32636cioccoiococ(str, AdNetType.NETWORK_WIFI.value(), j, null);
        }

        public boolean coo2iico() {
            return this.cii2c2;
        }

        public C32636cioccoiococ coo2iico(boolean z) {
            this.ciii2coi2 = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22$coi222o222 */
    /* loaded from: classes8.dex */
    public class RunnableC32637coi222o222 implements Runnable {
        final /* synthetic */ long c2oc2i;
        final /* synthetic */ String cioccoiococ;
        final /* synthetic */ int coi222o222;
        final /* synthetic */ C32636cioccoiococ coo2iico;

        RunnableC32637coi222o222(C32636cioccoiococ c32636cioccoiococ, int i, long j, String str) {
            this.coo2iico = c32636cioccoiococ;
            this.coi222o222 = i;
            this.c2oc2i = j;
            this.cioccoiococ = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            AnalyticsInfo analyticsInfo = new AnalyticsInfo();
            analyticsInfo.adEvent = new C32647coo2iico(13).coo2iico();
            C32636cioccoiococ c32636cioccoiococ = this.coo2iico;
            analyticsInfo.f89358ex = c32636cioccoiococ.c2oc2o;
            if (this.coi222o222 != 0) {
                analyticsInfo.url = c32636cioccoiococ.coo2iico;
            }
            analyticsInfo.materialSize = c32636cioccoiococ.cioccoiococ;
            analyticsInfo.creativeType = C32456cici2o2oo.coo2iico(0);
            analyticsInfo.load_time = this.c2oc2i;
            analyticsInfo.error_info = this.cioccoiococ;
            analyticsInfo.error_code = this.coi222o222;
            if (SdkConfig.USE_STAGING) {
                str = "systemadsolution_globalnativestaging";
            } else {
                str = "systemadsolution_globalnative";
            }
            analyticsInfo.configKey = str;
            TrackUtils.trackAction(C32633cco22.this.coo2iico, analyticsInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.cco22$coo2iico */
    /* loaded from: classes8.dex */
    public class CallableC32638coo2iico implements Callable<String> {
        final /* synthetic */ InterfaceC32639cioccoiococ coi222o222;
        final /* synthetic */ C32636cioccoiococ coo2iico;

        CallableC32638coo2iico(C32636cioccoiococ c32636cioccoiococ, InterfaceC32639cioccoiococ interfaceC32639cioccoiococ) {
            this.coo2iico = c32636cioccoiococ;
            this.coi222o222 = interfaceC32639cioccoiococ;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public String call() throws Exception {
            RunnableC32635c2oc2o runnableC32635c2oc2o = new RunnableC32635c2oc2o(this.coo2iico, this.coi222o222);
            runnableC32635c2oc2o.run();
            return runnableC32635c2oc2o.c2oc2i;
        }
    }

    private C32633cco22(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.coo2iico = applicationContext;
        String coo2iico = C32642coo2iico.coo2iico(applicationContext);
        this.coi222o222 = coo2iico;
        this.c2oc2i = new C32640coi222o222(coo2iico, 75);
    }

    public boolean coi222o222(String str) {
        return !TextUtils.isEmpty(this.c2oc2i.coi222o222(str));
    }

    public static C32633cco22 coo2iico(Context context) {
        if (cicic == null) {
            synchronized (C32633cco22.class) {
                if (cicic == null) {
                    cicic = new C32633cco22(context);
                }
            }
        }
        return cicic;
    }

    public int coo2iico() {
        return this.c2oc2i.coi222o222();
    }

    public void coo2iico(C32636cioccoiococ c32636cioccoiococ) {
        if (c32636cioccoiococ != null && !TextUtils.isEmpty(c32636cioccoiococ.coo2iico)) {
            if (this.cioccoiococ.get(c32636cioccoiococ.coo2iico) == null) {
                this.cco22.offer(c32636cioccoiococ);
                coiic.execute(new C32634c2oc2i());
                return;
            }
            return;
        }
        MLog.m25883w(cii2c2, "illegal request:" + c32636cioccoiococ);
    }

    public String coo2iico(String str) {
        if (str == null) {
            return null;
        }
        MLog.m25892d(cii2c2, "getResourceLocalPath " + str);
        return this.c2oc2i.coi222o222(str);
    }

    public boolean coo2iico(List<String> list) {
        if (C32467cioccoiococ.coi222o222(list)) {
            MLog.m25889e(cii2c2, "urls is empty");
            return false;
        }
        for (String str : list) {
            if (!coo2iico(this.coo2iico).coi222o222(str)) {
                return false;
            }
        }
        return true;
    }

    public void coo2iico(List<String> list, int i) {
        if (C32467cioccoiococ.coi222o222(list)) {
            MLog.m25889e(cii2c2, "urls is empty");
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                coo2iico(C32636cioccoiococ.coo2iico(str, i));
            }
        }
    }

    public String coo2iico(C32636cioccoiococ c32636cioccoiococ, long j) {
        return coo2iico(c32636cioccoiococ, j, null);
    }

    public String coo2iico(C32636cioccoiococ c32636cioccoiococ, long j, InterfaceC32639cioccoiococ interfaceC32639cioccoiococ) {
        if (c32636cioccoiococ != null && !TextUtils.isEmpty(c32636cioccoiococ.coo2iico)) {
            MLog.m25892d(cii2c2, "downloadResource " + c32636cioccoiococ.coo2iico);
            String coi222o222 = this.c2oc2i.coi222o222(c32636cioccoiococ.coo2iico);
            if (!TextUtils.isEmpty(coi222o222)) {
                MLog.m25892d(cii2c2, "downloadResource from cache. " + coi222o222);
                return coi222o222;
            }
            long max = Math.max(0L, Math.min(j, C32463ciiioc2ioc.cii2c2 * 10));
            Object obj = this.c2oc2o.get(c32636cioccoiococ.coo2iico);
            if (obj != null) {
                synchronized (obj) {
                    while (this.c2oc2o.get(c32636cioccoiococ.coo2iico) != null) {
                        try {
                            MLog.m25892d(cii2c2, "downloadResource wait for downloading. ");
                            obj.wait(max);
                        } catch (Exception e) {
                            MLog.m25888e(MLog.addAdPrefix(cii2c2), "downloadResource, wait exception", e);
                        }
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                FutureTask futureTask = new FutureTask(new CallableC32638coo2iico(c32636cioccoiococ, interfaceC32639cioccoiococ));
                C32465cioc2.c2oc2i.execute(futureTask);
                String str = (String) futureTask.get(max, TimeUnit.MILLISECONDS);
                MLog.m25887i(cii2c2, "downloadResource return : " + str);
                return str;
            } catch (Exception e2) {
                MLog.m25888e(MLog.addAdPrefix(cii2c2), "downloadResource exception", e2);
                coo2iico(c32636cioccoiococ, System.currentTimeMillis() - currentTimeMillis, e2.getMessage(), 1);
                MLog.m25883w(cii2c2, "download failure. ");
                return null;
            }
        }
        MLog.m25883w(cii2c2, "illegal request:" + c32636cioccoiococ);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void coo2iico(@NonNull C32636cioccoiococ c32636cioccoiococ, long j, String str, int i) {
        C32465cioc2.cioccoiococ.execute(new RunnableC32637coi222o222(c32636cioccoiococ, i, j, str));
    }
}
