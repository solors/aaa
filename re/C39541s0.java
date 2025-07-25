package re;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.s0 */
/* loaded from: classes8.dex */
public final class C39541s0<K, V> extends AbstractC39478a1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    @NotNull

    /* renamed from: c */
    private final SerialDescriptor f103908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39541s0(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f103908c = new C39538r0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // re.AbstractC39478a1, kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103908c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: q */
    public LinkedHashMap<K, V> mo12301a() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: r */
    public int mo12300b(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: s */
    public void mo12299c(@NotNull LinkedHashMap<K, V> linkedHashMap, int i) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: t */
    public Iterator<Map.Entry<K, V>> mo12298d(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (Iterator<Map.Entry<K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: u */
    public int mo12297e(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: v */
    public LinkedHashMap<K, V> mo12296k(@NotNull Map<K, ? extends V> map) {
        LinkedHashMap<K, V> linkedHashMap;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap<>(map);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: w */
    public Map<K, V> mo12295l(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
