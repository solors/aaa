package sg.bigo.ads.common.p924l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.l.b */
/* loaded from: classes10.dex */
public final class C43714b {
    @NonNull
    @WorkerThread
    /* renamed from: a */
    public static C43584a m5146a(@NonNull Context context) {
        long millis = TimeUnit.SECONDS.toMillis(15L);
        C43584a m5147a = C43713a.m5147a(context);
        if (m5147a == null) {
            try {
                m5147a = C43715c.m5145a(context, millis);
            } catch (Exception unused) {
            }
        }
        if (m5147a == null) {
            return new C43584a("", true);
        }
        return m5147a;
    }
}
