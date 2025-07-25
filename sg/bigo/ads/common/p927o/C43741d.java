package sg.bigo.ads.common.p927o;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.o.d */
/* loaded from: classes10.dex */
final class C43741d {

    /* renamed from: a */
    private final Context f114469a;

    /* renamed from: b */
    private final long f114470b;

    private C43741d(Context context, long j) {
        this.f114469a = context;
        this.f114470b = j;
    }

    @Nullable
    /* renamed from: a */
    private synchronized C43584a m5080a() {
        InterfaceC43743f m5076a;
        ServiceConnectionC43742e m5079a = m5079a(this.f114469a);
        if (m5079a == null) {
            throw new C43739b();
        }
        m5076a = m5079a.m5076a(this.f114470b, TimeUnit.MILLISECONDS);
        if (m5076a == null) {
            m5079a.m5077a();
            throw new C43739b();
        }
        return new C43584a(m5076a.mo5071a(), m5076a.mo5070b());
    }

    @Nullable
    /* renamed from: a */
    public static C43584a m5078a(Context context, long j) {
        try {
            return new C43741d(context, j).m5080a();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private static ServiceConnectionC43742e m5079a(Context context) {
        boolean bindService;
        ServiceConnectionC43742e m5075a = ServiceConnectionC43742e.m5075a(context);
        if (!m5075a.f114473a.isEmpty()) {
            return m5075a;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            m5075a.f114474b = true;
            bindService = context.bindService(intent, m5075a, 1);
        } catch (Exception unused) {
        } catch (Throwable th) {
            m5075a.m5077a();
            throw th;
        }
        if (bindService) {
            if (!bindService) {
                m5075a.m5077a();
            }
            return m5075a;
        }
        if (bindService) {
            return null;
        }
        m5075a.m5077a();
        return null;
    }
}
