package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mz1;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class nz1 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ mz1 f83201b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nz1(mz1 mz1Var) {
        this.f83201b = mz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz1 m31730b;
        long j;
        while (true) {
            mz1 mz1Var = this.f83201b;
            synchronized (mz1Var) {
                m31730b = mz1Var.m31730b();
            }
            if (m31730b == null) {
                return;
            }
            lz1 m33083d = m31730b.m33083d();
            Intrinsics.m17074g(m33083d);
            mz1 mz1Var2 = this.f83201b;
            mz1 mz1Var3 = mz1.f82495h;
            boolean isLoggable = mz1.C30893b.m31725a().isLoggable(Level.FINE);
            if (isLoggable) {
                j = m33083d.m32174h().m31727d().mo31724a();
                jz1.m32693b(m31730b, m33083d, "starting");
            } else {
                j = -1;
            }
            try {
                mz1Var2.m31729b(m31730b);
                Unit unit = Unit.f99208a;
                if (isLoggable) {
                    String m32695a = jz1.m32695a(m33083d.m32174h().m31727d().mo31724a() - j);
                    jz1.m32693b(m31730b, m33083d, "finished run in " + m32695a);
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    String m32695a2 = jz1.m32695a(m33083d.m32174h().m31727d().mo31724a() - j);
                    jz1.m32693b(m31730b, m33083d, "failed a run in " + m32695a2);
                }
                throw th;
            }
        }
    }
}
