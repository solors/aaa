package se;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.c0 */
/* loaded from: classes8.dex */
public final class createMapForCache {
    @NotNull
    /* renamed from: a */
    public static final <K, V> Map<K, V> m6889a(int i) {
        return new ConcurrentHashMap(i);
    }
}
