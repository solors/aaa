package re;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: re.a */
/* loaded from: classes8.dex */
public abstract class CollectionSerializers<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ CollectionSerializers(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m12520i(CollectionSerializers collectionSerializers, InterfaceC37832c interfaceC37832c, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            collectionSerializers.mo12339h(interfaceC37832c, i, obj, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    /* renamed from: j */
    private final int m12519j(InterfaceC37832c interfaceC37832c, Builder builder) {
        int mo12468u = interfaceC37832c.mo12468u(getDescriptor());
        mo12299c(builder, mo12468u);
        return mo12468u;
    }

    /* renamed from: a */
    protected abstract Builder mo12301a();

    /* renamed from: b */
    protected abstract int mo12300b(Builder builder);

    /* renamed from: c */
    protected abstract void mo12299c(Builder builder, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: d */
    public abstract Iterator<Element> mo12298d(Collection collection);

    @Override // p821oe.KSerializer
    public Collection deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m12521f(decoder, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo12297e(Collection collection);

    /* renamed from: f */
    public final Collection m12521f(@NotNull Decoding decoder, @Nullable Collection collection) {
        Builder mo12301a;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (mo12301a = mo12296k(collection)) == null) {
            mo12301a = mo12301a();
        }
        int mo12300b = mo12300b(mo12301a);
        InterfaceC37832c mo6678b = decoder.mo6678b(getDescriptor());
        if (!mo6678b.mo12471j()) {
            while (true) {
                int mo6663v = mo6678b.mo6663v(getDescriptor());
                if (mo6663v == -1) {
                    break;
                }
                m12520i(this, mo6678b, mo12300b + mo6663v, mo12301a, false, 8, null);
            }
        } else {
            mo12340g(mo6678b, mo12301a, mo12300b, m12519j(mo6678b, mo12301a));
        }
        mo6678b.mo6666c(getDescriptor());
        return mo12295l(mo12301a);
    }

    /* renamed from: g */
    protected abstract void mo12340g(@NotNull InterfaceC37832c interfaceC37832c, Builder builder, int i, int i2);

    /* renamed from: h */
    protected abstract void mo12339h(@NotNull InterfaceC37832c interfaceC37832c, int i, Builder builder, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Builder mo12296k(Collection collection);

    /* renamed from: l */
    protected abstract Collection mo12295l(Builder builder);

    private CollectionSerializers() {
    }
}
