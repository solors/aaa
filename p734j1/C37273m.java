package p734j1;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j1.m */
/* loaded from: classes3.dex */
public class C37273m {

    /* renamed from: a */
    private static final Map<C37250e, Boolean> f98434a = new WeakHashMap();

    @Nullable
    /* renamed from: a */
    public static synchronized C37250e m18597a(@Nullable String str) {
        synchronized (C37273m.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (Map.Entry<C37250e, Boolean> entry : f98434a.entrySet()) {
                C37250e key = entry.getKey();
                if (key.m18670H().equals(str)) {
                    return key;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized void m18596b(@Nullable C37250e c37250e) {
        synchronized (C37273m.class) {
            if (c37250e == null) {
                return;
            }
            f98434a.put(c37250e, Boolean.TRUE);
        }
    }
}
