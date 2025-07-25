package sg.bigo.ads.common.p927o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.C43584a;
import sg.bigo.ads.common.p926n.C43727d;

/* renamed from: sg.bigo.ads.common.o.a */
/* loaded from: classes10.dex */
public final class C43737a {
    @Nullable
    /* renamed from: a */
    public static C43584a m5082a(@NonNull final Context context, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C43584a[] c43584aArr = new C43584a[1];
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C43727d.m5108a(0, new Runnable() { // from class: sg.bigo.ads.common.o.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                    String obj = invoke.getClass().getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]).toString();
                    Boolean bool = (Boolean) invoke.getClass().getDeclaredMethod(C21114v8.C21123i.f54118M, new Class[0]).invoke(invoke, new Object[0]);
                    if (obj != null && bool != null) {
                        c43584aArr[0] = new C43584a(obj, bool.booleanValue());
                    }
                } catch (Exception unused) {
                    atomicBoolean.set(false);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        if (atomicBoolean.get()) {
            return c43584aArr[0];
        }
        throw new C43739b();
    }
}
