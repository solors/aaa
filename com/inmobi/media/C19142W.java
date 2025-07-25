package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C19142W;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.W */
/* loaded from: classes6.dex */
public final class C19142W {

    /* renamed from: a */
    public final AdConfig.AdQualityConfig f47872a;

    /* renamed from: b */
    public final InterfaceC18850A4 f47873b;

    /* renamed from: c */
    public final AtomicBoolean f47874c;

    /* renamed from: d */
    public final AtomicBoolean f47875d;

    /* renamed from: e */
    public final AtomicBoolean f47876e;

    /* renamed from: f */
    public final CopyOnWriteArrayList f47877f;

    /* renamed from: g */
    public AdQualityControl f47878g;

    /* renamed from: h */
    public AdQualityResult f47879h;

    /* renamed from: i */
    public String f47880i;

    /* renamed from: j */
    public JSONObject f47881j;

    /* renamed from: k */
    public final AtomicBoolean f47882k;

    public C19142W(AdConfig.AdQualityConfig adQualityConfig, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f47872a = adQualityConfig;
        this.f47873b = interfaceC18850A4;
        this.f47874c = new AtomicBoolean(false);
        this.f47875d = new AtomicBoolean(false);
        this.f47876e = new AtomicBoolean(false);
        this.f47877f = new CopyOnWriteArrayList();
        this.f47880i = "";
        this.f47881j = new JSONObject();
        this.f47882k = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void m60620a(AdQualityResult adQualityResult, boolean z) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            m60616a("beacon is empty");
            return;
        }
        C19526x9 process = new C19526x9(adQualityResult);
        C19103T c19103t = new C19103T(this, z);
        Intrinsics.checkNotNullParameter(process, "process");
        ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
        C19052P.m60826a(0L, new C19236d(process, c19103t));
    }

    /* renamed from: a */
    public final void m60621a(final View view, final long j, final boolean z, final C19023M9 c19023m9) {
        m60616a("isCapture started - " + this.f47882k.get() + ", isReporting - " + z);
        if (this.f47882k.get() && !z) {
            m60617a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            view.post(new Runnable() { // from class: o3.k2
                {
                    C19142W.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19142W.m60618a(C19142W.this, view, j, z, c19023m9);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m60618a(C19142W this$0, View adView, long j, boolean z, C19023M9 c19023m9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter("AdQualityManager", "tag");
        Intrinsics.checkNotNullParameter("starting capture - draw", "message");
        Log.i("AdQualityManager", "starting capture - draw");
        this$0.getClass();
        Intrinsics.checkNotNullParameter(adView, "adView");
        C18898Da process = new C18898Da(adView, this$0.f47872a);
        if (!z) {
            this$0.f47877f.add(process);
        }
        C19129V c19129v = new C19129V(this$0, process, z, c19023m9);
        Intrinsics.checkNotNullParameter(process, "process");
        ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
        C19052P.m60826a(j, new C19236d(process, c19129v));
        this$0.f47882k.set(!z);
    }

    /* renamed from: a */
    public final void m60622a(final Activity activity, final long j, final boolean z, final C19023M9 c19023m9) {
        m60616a("isCapture started - " + this.f47882k.get() + ", isReporting - " + z);
        if (this.f47882k.get() && !z) {
            m60617a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: o3.j2
                {
                    C19142W.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19142W.m60619a(C19142W.this, activity, j, z, c19023m9);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m60619a(C19142W this$0, Activity activity, long j, boolean z, C19023M9 c19023m9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.m60616a("activity is visible");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        Intrinsics.checkNotNullParameter(window, "window");
        C19372m9 process = new C19372m9(window, this$0.f47872a);
        if (!z) {
            this$0.f47877f.add(process);
        }
        C19129V c19129v = new C19129V(this$0, process, z, c19023m9);
        Intrinsics.checkNotNullParameter(process, "process");
        ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
        C19052P.m60826a(j, new C19236d(process, c19129v));
        this$0.f47882k.set(!z);
    }

    /* renamed from: a */
    public final void m60615a(String str, byte[] bArr, boolean z) {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            C19101Sa process = new C19101Sa(m61068d.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z) {
                this.f47877f.add(process);
            }
            C19116U c19116u = new C19116U(this, z, process, str);
            Intrinsics.checkNotNullParameter(process, "process");
            ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
            C19052P.m60826a(0L, new C19236d(process, c19116u));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60614a(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = "AdQualityManager"
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r2 = "checking for trigger"
            java.lang.String r3 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            android.util.Log.i(r0, r2)
            com.inmobi.adquality.models.AdQualityControl r2 = r12.f47878g
            if (r2 == 0) goto Le2
            java.lang.String r7 = r2.getBeacon()
            if (r7 == 0) goto Le2
            java.util.concurrent.CopyOnWriteArrayList r2 = r12.f47877f
            boolean r2 = r2.isEmpty()
            r11 = 1
            if (r2 == 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f47875d
            boolean r2 = r2.get()
            if (r2 == 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f47876e
            boolean r2 = r2.get()
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f47876e
            r13.set(r11)
            java.lang.String r13 = "session end - queuing result"
            r12.m60616a(r13)
            com.inmobi.adquality.models.AdQualityResult r13 = r12.f47879h
            if (r13 != 0) goto L4f
            com.inmobi.adquality.models.AdQualityResult r13 = new com.inmobi.adquality.models.AdQualityResult
            java.lang.String r5 = "null"
            r6 = 0
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L4f:
            r12.m60620a(r13, r11)
            return
        L53:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f47875d
            boolean r2 = r2.get()
            if (r2 == 0) goto La8
            if (r13 != 0) goto La8
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f47876e
            boolean r13 = r13.get()
            if (r13 != 0) goto La8
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f47876e
            r13.set(r11)
            java.lang.String r13 = "session stop - queuing result"
            r12.m60616a(r13)
            java.util.concurrent.ScheduledExecutorService r13 = com.inmobi.media.C19052P.f47602a
            if (r13 == 0) goto L93
            r13.shutdown()
            r13.shutdownNow()     // Catch: java.lang.InterruptedException -> L7a
            goto L93
        L7a:
            r13.shutdownNow()     // Catch: java.lang.Exception -> L7e
            goto L8c
        L7e:
            r13 = move-exception
            java.lang.String r0 = "AdQualityComponent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "shutdown fail"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            android.util.Log.e(r0, r1, r13)
        L8c:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L93:
            com.inmobi.adquality.models.AdQualityResult r13 = r12.f47879h
            if (r13 != 0) goto La4
            com.inmobi.adquality.models.AdQualityResult r13 = new com.inmobi.adquality.models.AdQualityResult
            java.lang.String r5 = "null"
            r6 = 0
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
        La4:
            r12.m60620a(r13, r11)
            return
        La8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "list size - "
            r13.<init>(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r12.f47877f
            int r2 = r2.size()
            r13.append(r2)
            java.lang.String r2 = " session end triggered - "
            r13.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f47875d
            boolean r2 = r2.get()
            r13.append(r2)
            java.lang.String r2 = " queue triggered - "
            r13.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f47876e
            r13.append(r2)
            java.lang.String r2 = " waiting"
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            android.util.Log.i(r0, r13)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19142W.m60614a(boolean):void");
    }

    /* renamed from: a */
    public final void m60616a(String str) {
        InterfaceC18850A4 interfaceC18850A4 = this.f47873b;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61259a("AdQualityManager", str);
        }
    }

    /* renamed from: a */
    public final void m60617a(Exception exc, String str) {
        Unit unit;
        if (exc != null) {
            InterfaceC18850A4 interfaceC18850A4 = this.f47873b;
            if (interfaceC18850A4 != null) {
                ((C18864B4) interfaceC18850A4).m61258a("AdQualityManager", str, exc);
                unit = Unit.f99208a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f47873b;
        if (interfaceC18850A42 != null) {
            ((C18864B4) interfaceC18850A42).m61255b("AdQualityManager", "Error with null exception : " + str);
            Unit unit2 = Unit.f99208a;
        }
    }
}
