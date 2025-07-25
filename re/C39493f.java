package re;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.f */
/* loaded from: classes8.dex */
public final class C39493f<E> extends AbstractC39543t<E, List<? extends E>, ArrayList<E>> {
    @NotNull

    /* renamed from: b */
    private final SerialDescriptor f103832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39493f(@NotNull KSerializer<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f103832b = new C39490e(element.getDescriptor());
    }

    @Override // re.AbstractC39540s, kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103832b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: q */
    public ArrayList<E> mo12301a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: r */
    public int mo12300b(@NotNull ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: s */
    public void mo12299c(@NotNull ArrayList<E> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.AbstractC39540s
    /* renamed from: t */
    public void mo12294n(@NotNull ArrayList<E> arrayList, int i, E e) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: u */
    public ArrayList<E> mo12296k(@NotNull List<? extends E> list) {
        ArrayList<E> arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList<>(list);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: v */
    public List<E> mo12295l(@NotNull ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
