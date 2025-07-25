package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* renamed from: com.ironsource.rk */
/* loaded from: classes6.dex */
public class C20763rk implements SegmentListener {

    /* renamed from: a */
    private SegmentListener f52775a;

    /* renamed from: b */
    private final C20765b f52776b;

    /* renamed from: c */
    protected long f52777c;

    /* renamed from: com.ironsource.rk$b */
    /* loaded from: classes6.dex */
    public class C20765b extends Thread {

        /* renamed from: a */
        private Handler f52778a;

        private C20765b() {
            C20763rk.this = r1;
        }

        /* renamed from: a */
        public Handler m55468a() {
            return this.f52778a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f52778a = new Handler();
            Looper.loop();
        }
    }

    public C20763rk() {
        C20765b c20765b = new C20765b();
        this.f52776b = c20765b;
        c20765b.start();
        this.f52777c = new Date().getTime();
    }

    /* renamed from: a */
    public static /* synthetic */ void m55472a(C20763rk c20763rk, String str) {
        c20763rk.m55469a(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m55471a((Object) this.f52775a)) {
            m55470a(new Runnable() { // from class: com.ironsource.c00
                @Override // java.lang.Runnable
                public final void run() {
                    C20763rk.m55472a(C20763rk.this, str);
                }
            });
        }
    }

    /* renamed from: a */
    public void m55473a(SegmentListener segmentListener) {
        this.f52775a = segmentListener;
    }

    /* renamed from: a */
    protected void m55470a(Runnable runnable) {
        Handler m55468a;
        C20765b c20765b = this.f52776b;
        if (c20765b == null || (m55468a = c20765b.m55468a()) == null) {
            return;
        }
        m55468a.post(runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void m55469a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f52775a.onSegmentReceived(str);
    }

    /* renamed from: a */
    protected boolean m55471a(Object obj) {
        return (obj == null || this.f52776b == null) ? false : true;
    }
}
