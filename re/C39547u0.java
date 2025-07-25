package re;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.u0 */
/* loaded from: classes8.dex */
public final class C39547u0<E> extends AbstractC39543t<E, Set<? extends E>, LinkedHashSet<E>> {
    @NotNull

    /* renamed from: b */
    private final SerialDescriptor f103913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39547u0(@NotNull KSerializer<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f103913b = new C39544t0(eSerializer.getDescriptor());
    }

    @Override // re.AbstractC39540s, kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103913b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: q */
    public LinkedHashSet<E> mo12301a() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: r */
    public int mo12300b(@NotNull LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: s */
    public void mo12299c(@NotNull LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.AbstractC39540s
    /* renamed from: t */
    public void mo12294n(@NotNull LinkedHashSet<E> linkedHashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: u */
    public LinkedHashSet<E> mo12296k(@NotNull Set<? extends E> set) {
        LinkedHashSet<E> linkedHashSet;
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet<>(set);
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: v */
    public Set<E> mo12295l(@NotNull LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
