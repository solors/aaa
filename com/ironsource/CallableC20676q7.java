package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.q7 */
/* loaded from: classes6.dex */
public class CallableC20676q7 implements Callable<C21065u7> {

    /* renamed from: a */
    private final int f52511a;

    /* renamed from: b */
    private final String f52512b;

    /* renamed from: c */
    private final AdData f52513c;

    /* renamed from: d */
    private final InterfaceC20792s7 f52514d;

    /* renamed from: e */
    private final InterfaceC20746r7 f52515e;

    /* renamed from: f */
    private final NetworkSettings f52516f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.q7$a */
    /* loaded from: classes6.dex */
    public class C20677a implements BiddingDataCallback {

        /* renamed from: a */
        final /* synthetic */ C21008ta f52517a;

        /* renamed from: b */
        final /* synthetic */ BlockingQueue f52518b;

        C20677a(C21008ta c21008ta, BlockingQueue blockingQueue) {
            this.f52517a = c21008ta;
            this.f52518b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.f52518b.add(new C21065u7(CallableC20676q7.this.m55665d(), CallableC20676q7.this.m55666c(), null, C21008ta.m54805a(this.f52517a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.f52518b.add(new C21065u7(CallableC20676q7.this.m55665d(), CallableC20676q7.this.m55666c(), map, C21008ta.m54805a(this.f52517a), null));
        }
    }

    public CallableC20676q7(int i, String str, AdData adData, InterfaceC20792s7 interfaceC20792s7, InterfaceC20746r7 interfaceC20746r7, NetworkSettings networkSettings) {
        this.f52511a = i;
        this.f52512b = str;
        this.f52513c = adData;
        this.f52514d = interfaceC20792s7;
        this.f52515e = interfaceC20746r7;
        this.f52516f = networkSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (r2 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
        r2.mo55544a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        if (r2 == null) goto L4;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ironsource.C21065u7 call() throws java.lang.Exception {
        /*
            r4 = this;
            com.ironsource.ta r0 = new com.ironsource.ta
            r0.<init>()
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.m55666c()
            r2.append(r3)
            java.lang.String r3 = " fetching bidding data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.verbose(r2)
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r2 = 1
            r1.<init>(r2)
            com.ironsource.q7$a r2 = new com.ironsource.q7$a
            r2.<init>(r0, r1)
            com.ironsource.s7 r0 = r4.m55667b()     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            com.ironsource.mediationsdk.adunit.adapter.utility.AdData r3 = r4.f52513c     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            r0.mo55384a(r3, r2)     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            goto L84
        L34:
            r0 = move-exception
            com.ironsource.i9 r2 = com.ironsource.C20086i9.m57997d()
            r2.m58003a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.r7 r2 = r4.f52515e
            if (r2 == 0) goto L84
            goto L81
        L5b:
            r0 = move-exception
            com.ironsource.i9 r2 = com.ironsource.C20086i9.m57997d()
            r2.m58003a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.r7 r2 = r4.f52515e
            if (r2 == 0) goto L84
        L81:
            r2.mo55544a(r0)
        L84:
            com.ironsource.r7 r0 = r4.f52515e
            if (r0 == 0) goto L8d
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r4.f52516f
            r0.mo55545a(r2)
        L8d:
            java.lang.Object r0 = r1.take()
            com.ironsource.u7 r0 = (com.ironsource.C21065u7) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC20676q7.call():com.ironsource.u7");
    }

    /* renamed from: b */
    public InterfaceC20792s7 m55667b() {
        return this.f52514d;
    }

    /* renamed from: c */
    public String m55666c() {
        return this.f52512b;
    }

    /* renamed from: d */
    public int m55665d() {
        return this.f52511a;
    }
}
