package sg.bigo.ads.controller.p949e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.bigo.ads.controller.e.g */
/* loaded from: classes10.dex */
public final class C44035g {

    /* renamed from: b */
    private static final C44035g f115521b = new C44035g();

    /* renamed from: a */
    final Map<String, C44036a> f115522a = new ConcurrentHashMap();

    /* renamed from: c */
    private boolean f115523c = false;

    /* renamed from: sg.bigo.ads.controller.e.g$a */
    /* loaded from: classes10.dex */
    public class C44036a {

        /* renamed from: a */
        final AtomicInteger f115524a = new AtomicInteger(0);

        /* renamed from: b */
        final AtomicInteger f115525b = new AtomicInteger(0);

        /* renamed from: c */
        final AtomicInteger f115526c = new AtomicInteger(0);

        public C44036a() {
        }
    }

    @NonNull
    /* renamed from: a */
    public final C44036a m4110a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        C44036a c44036a = this.f115522a.get(str);
        if (c44036a == null) {
            C44036a c44036a2 = new C44036a();
            this.f115522a.put(str, c44036a2);
            return c44036a2;
        }
        return c44036a;
    }

    /* renamed from: a */
    public static C44035g m4111a() {
        return f115521b;
    }

    /* renamed from: a */
    public final void m4108a(boolean z) {
        this.f115523c = z;
        if (z) {
            for (Map.Entry<String, C44036a> entry : this.f115522a.entrySet()) {
                C44036a value = entry.getValue();
                if (value != null) {
                    value.f115526c.set(0);
                }
            }
        }
    }
}
