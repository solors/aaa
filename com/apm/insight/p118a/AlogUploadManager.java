package com.apm.insight.p118a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.p119b.LooperPrinterUtils;
import com.apm.insight.runtime.NpthHandlerThread;

/* renamed from: com.apm.insight.a.a */
/* loaded from: classes2.dex */
public class AlogUploadManager implements ICrashCallback {

    /* renamed from: d */
    private static volatile AlogUploadManager f3569d;

    /* renamed from: a */
    private volatile String f3570a;

    /* renamed from: b */
    private volatile LooperPrinterUtils.InterfaceC3785a f3571b;

    /* renamed from: c */
    private volatile LooperPrinterUtils.InterfaceC3785a f3572c;

    /* renamed from: e */
    private volatile boolean f3573e = false;

    private AlogUploadManager() {
    }

    /* renamed from: a */
    public static AlogUploadManager m102143a() {
        if (f3569d == null) {
            synchronized (AlogUploadManager.class) {
                if (f3569d == null) {
                    f3569d = new AlogUploadManager();
                }
            }
        }
        return f3569d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    /* renamed from: a */
    public final void m102142a(String str, LooperPrinterUtils.InterfaceC3785a interfaceC3785a, LooperPrinterUtils.InterfaceC3785a interfaceC3785a2) {
        this.f3570a = str;
        this.f3571b = interfaceC3785a;
        this.f3572c = interfaceC3785a2;
        if (this.f3573e) {
            return;
        }
        this.f3573e = true;
        NpthHandlerThread.m101339a().m101309a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
