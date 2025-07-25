package sg.bigo.ads.common.p927o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.o.c */
/* loaded from: classes10.dex */
public final class C43740c {

    /* renamed from: a */
    private static boolean f114468a = true;

    @NonNull
    @WorkerThread
    /* renamed from: a */
    public static C43584a m5081a(@NonNull Context context) {
        C43584a c43584a;
        boolean z;
        if (!f114468a) {
            return new C43584a("", true);
        }
        long millis = TimeUnit.SECONDS.toMillis(15L);
        try {
            c43584a = C43741d.m5078a(context, millis);
            z = true;
        } catch (C43739b unused) {
            c43584a = null;
            z = false;
        }
        if (c43584a != null) {
            return c43584a;
        }
        try {
            c43584a = C43737a.m5082a(context, millis);
        } catch (C43739b unused2) {
            if (!z) {
                f114468a = false;
            }
        }
        if (c43584a != null) {
            return c43584a;
        }
        return new C43584a("", true);
    }
}
