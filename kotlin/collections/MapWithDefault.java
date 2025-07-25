package kotlin.collections;

import ae.KMarkers;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.m0 */
/* loaded from: classes7.dex */
interface MapWithDefault<K, V> extends Map<K, V>, KMarkers {
    /* renamed from: e */
    V mo17409e(K k);

    @NotNull
    /* renamed from: k */
    Map<K, V> mo17408k();
}
