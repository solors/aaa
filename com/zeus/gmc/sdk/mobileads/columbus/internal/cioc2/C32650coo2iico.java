package com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2;

import android.os.Handler;
import android.os.Looper;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.concurrent.ExecutorService;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico */
/* loaded from: classes8.dex */
public class C32650coo2iico<T> {
    private static final String cioccoiococ = "AsyncViewTask";
    private InterfaceC32652cioccoiococ<T> c2oc2i;
    private InterfaceC32653coi222o222<T> coi222o222;
    private Handler coo2iico = new Handler(Looper.getMainLooper());

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    private static class C32651c2oc2i {
        private static final ExecutorService coo2iico = C32465cioc2.cioccoiococ;

        private C32651c2oc2i() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$cioccoiococ */
    /* loaded from: classes8.dex */
    public interface InterfaceC32652cioccoiococ<T> {
        T coo2iico();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public interface InterfaceC32653coi222o222<T> {
        void coo2iico();

        void coo2iico(T t);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class RunnableC32654coo2iico implements Runnable {

        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$coo2iico$coi222o222 */
        /* loaded from: classes8.dex */
        class RunnableC32655coi222o222 implements Runnable {
            RunnableC32655coi222o222() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C32650coo2iico.this.coi222o222 != null) {
                    C32650coo2iico.this.coi222o222.coo2iico();
                }
            }
        }

        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coo2iico$coo2iico$coo2iico */
        /* loaded from: classes8.dex */
        class RunnableC32656coo2iico implements Runnable {
            final /* synthetic */ Object coo2iico;

            RunnableC32656coo2iico(Object obj) {
                this.coo2iico = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (C32650coo2iico.this.coi222o222 != null) {
                    C32650coo2iico.this.coi222o222.coo2iico(this.coo2iico);
                }
            }
        }

        RunnableC32654coo2iico() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object coo2iico = C32650coo2iico.this.c2oc2i.coo2iico();
                if (coo2iico != null) {
                    C32650coo2iico.this.coo2iico.post(new RunnableC32656coo2iico(coo2iico));
                    return;
                }
            } catch (Exception e) {
                MLog.m25888e(C32650coo2iico.cioccoiococ, "execute exception", e);
            }
            C32650coo2iico.this.coo2iico.post(new RunnableC32655coi222o222());
        }
    }

    public C32650coo2iico(InterfaceC32652cioccoiococ<T> interfaceC32652cioccoiococ) {
        this.c2oc2i = interfaceC32652cioccoiococ;
    }

    public void coo2iico() {
        if (this.c2oc2i == null) {
            return;
        }
        C32651c2oc2i.coo2iico.execute(new RunnableC32654coo2iico());
    }

    public C32650coo2iico<T> coo2iico(InterfaceC32653coi222o222<T> interfaceC32653coi222o222) {
        this.coi222o222 = interfaceC32653coi222o222;
        return this;
    }
}
