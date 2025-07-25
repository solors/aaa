package re;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.s */
/* loaded from: classes8.dex */
public abstract class AbstractC39540s<Element, Collection, Builder> extends CollectionSerializers<Element, Collection, Builder> {
    @NotNull

    /* renamed from: a */
    private final KSerializer<Element> f103907a;

    public /* synthetic */ AbstractC39540s(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // re.CollectionSerializers
    /* renamed from: g */
    protected final void mo12340g(@NotNull InterfaceC37832c decoder, Builder builder, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo12339h(decoder, i + i3, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // re.CollectionSerializers
    /* renamed from: h */
    protected void mo12339h(@NotNull InterfaceC37832c decoder, int i, Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        mo12294n(builder, i, InterfaceC37832c.C37833a.m16039c(decoder, getDescriptor(), i, this.f103907a, null, 8, null));
    }

    /* renamed from: n */
    protected abstract void mo12294n(Builder builder, int i, Element element);

    @Override // p821oe.InterfaceC39165j
    public void serialize(@NotNull Encoding encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int mo12297e = mo12297e(collection);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC37834d mo12445y = encoder.mo12445y(descriptor, mo12297e);
        Iterator<Element> mo12298d = mo12298d(collection);
        for (int i = 0; i < mo12297e; i++) {
            mo12445y.mo12462C(getDescriptor(), i, this.f103907a, mo12298d.next());
        }
        mo12445y.mo6810c(descriptor);
    }

    private AbstractC39540s(KSerializer<Element> kSerializer) {
        super(null);
        this.f103907a = kSerializer;
    }
}
