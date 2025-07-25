package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C20086i9;
import com.ironsource.C21130ve;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.sdk.controller.t */
/* loaded from: classes6.dex */
public class C20897t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.t$a */
    /* loaded from: classes6.dex */
    public class RunnableC20898a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioManager f53194a;

        RunnableC20898a(AudioManager audioManager) {
            this.f53194a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20897t.m55195a(this.f53194a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.t$b */
    /* loaded from: classes6.dex */
    public class RunnableC20899b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioManager f53195a;

        RunnableC20899b(AudioManager audioManager) {
            this.f53195a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20897t.m55191d(this.f53195a);
        }
    }

    C20897t() {
    }

    /* renamed from: a */
    public static void m55196a(Activity activity) {
        C21130ve.f54189a.m54474b(new RunnableC20898a((AudioManager) activity.getSystemService("audio")));
    }

    /* renamed from: b */
    public static void m55194b(Activity activity) {
        C21130ve.f54189a.m54474b(new RunnableC20899b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m55191d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static void m55195a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
