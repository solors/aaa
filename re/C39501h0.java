package re;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.h0 */
/* loaded from: classes8.dex */
public final class C39501h0<K, V> extends AbstractC39478a1<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    @NotNull

    /* renamed from: c */
    private final SerialDescriptor f103848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39501h0(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f103848c = new C39498g0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // re.AbstractC39478a1, kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103848c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: q */
    public HashMap<K, V> mo12301a() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: r */
    public int mo12300b(@NotNull HashMap<K, V> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: s */
    public void mo12299c(@NotNull HashMap<K, V> hashMap, int i) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
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
    public HashMap<K, V> mo12296k(@NotNull Map<K, ? extends V> map) {
        HashMap<K, V> hashMap;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof HashMap) {
            hashMap = (HashMap) map;
        } else {
            hashMap = null;
        }
        if (hashMap == null) {
            return new HashMap<>(map);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: w */
    public Map<K, V> mo12295l(@NotNull HashMap<K, V> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap;
    }
}
