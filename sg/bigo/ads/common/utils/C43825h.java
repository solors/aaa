package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sg.bigo.ads.common.utils.h */
/* loaded from: classes10.dex */
public final class C43825h<V> {

    /* renamed from: a */
    private final HashMap<String, V> f114661a = new HashMap<>();

    @Nullable
    /* renamed from: a */
    public final V m4884a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f114661a.get(str.toLowerCase());
    }

    @Nullable
    /* renamed from: b */
    public final V m4882b(@Nullable String str) {
        return this.f114661a.remove(str.toLowerCase());
    }

    /* renamed from: a */
    public final void m4883a(@NonNull Map<? extends String, ? extends V> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            String key = entry.getKey();
            V value = entry.getValue();
            if (key != null && value != null) {
                this.f114661a.put(key.toLowerCase(), value);
            }
        }
    }
}
