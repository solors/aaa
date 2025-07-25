package re;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.j0 */
/* loaded from: classes8.dex */
public final class C39508j0<E> extends AbstractC39543t<E, Set<? extends E>, HashSet<E>> {
    @NotNull

    /* renamed from: b */
    private final SerialDescriptor f103865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39508j0(@NotNull KSerializer<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f103865b = new C39504i0(eSerializer.getDescriptor());
    }

    @Override // re.AbstractC39540s, kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103865b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: q */
    public HashSet<E> mo12301a() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: r */
    public int mo12300b(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: s */
    public void mo12299c(@NotNull HashSet<E> hashSet, int i) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.AbstractC39540s
    /* renamed from: t */
    public void mo12294n(@NotNull HashSet<E> hashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: u */
    public HashSet<E> mo12296k(@NotNull Set<? extends E> set) {
        HashSet<E> hashSet;
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set instanceof HashSet) {
            hashSet = (HashSet) set;
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            return new HashSet<>(set);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: v */
    public Set<E> mo12295l(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
