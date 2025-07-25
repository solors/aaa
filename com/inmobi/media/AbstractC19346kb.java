package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kb */
/* loaded from: classes6.dex */
public abstract class AbstractC19346kb {

    /* renamed from: a */
    public static final C19508w5 f48452a;

    /* renamed from: b */
    public static int f48453b;

    /* renamed from: c */
    public static Integer f48454c;

    static {
        C19508w5 c19508w5;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            c19508w5 = AbstractC19494v5.m59823a(m61068d, "imtelemetrydboverflow");
        } else {
            c19508w5 = null;
        }
        f48452a = c19508w5;
        f48453b = -1;
    }

    /* renamed from: a */
    public static int m60090a() {
        if (f48453b == -1) {
            C19508w5 c19508w5 = f48452a;
            int i = 0;
            if (c19508w5 != null) {
                Intrinsics.checkNotNullParameter("count", "key");
                i = c19508w5.f48820a.getInt("count", 0);
            }
            f48453b = i;
        }
        return f48453b;
    }
}
