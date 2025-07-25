package sg.bigo.ads.core.p962d.p963a;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.p914g.p917c.C43679c;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.d.a.f */
/* loaded from: classes10.dex */
public final class C44175f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.d.a.f$a */
    /* loaded from: classes10.dex */
    public static class C44176a {

        /* renamed from: a */
        public static C44175f f115962a = new C44175f((byte) 0);
    }

    private C44175f() {
    }

    /* synthetic */ C44175f(byte b) {
        this();
    }

    /* renamed from: a */
    public static List<C44173e> m3749a(long j, @NonNull C43579q c43579q) {
        C43679c.m5224b(System.currentTimeMillis() - 86400000);
        Cursor m5229a = C43679c.m5229a(j);
        ArrayList arrayList = new ArrayList();
        if (m5229a == null) {
            return arrayList;
        }
        while (m5229a.moveToNext()) {
            C44173e c44173e = new C44173e(c43579q, m5229a);
            arrayList.add(c44173e);
            C43782a.m5010a(0, 3, "TrackerManager", "getList:" + c44173e.toString());
        }
        m5229a.close();
        return arrayList;
    }

    /* renamed from: b */
    public static void m3747b(C44173e c44173e) {
        if (c44173e.m3754g()) {
            m3746c(c44173e);
        } else {
            C43679c.m5223b(c44173e);
        }
    }

    /* renamed from: c */
    private static void m3746c(C44173e c44173e) {
        C43679c.m5228a(String.valueOf(c44173e.f114327a));
    }

    /* renamed from: a */
    public static void m3748a(C44173e c44173e) {
        if (C43679c.m5222c(c44173e)) {
            C43679c.m5223b(c44173e);
        } else {
            c44173e.f114327a = C43679c.m5226a(c44173e);
        }
    }
}
