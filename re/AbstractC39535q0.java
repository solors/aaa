package re;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;
import p821oe.C39164i;

/* compiled from: Tuples.kt */
@Metadata
/* renamed from: re.q0 */
/* loaded from: classes8.dex */
public abstract class AbstractC39535q0<K, V, R> implements KSerializer<R> {
    @NotNull

    /* renamed from: a */
    private final KSerializer<K> f103904a;
    @NotNull

    /* renamed from: b */
    private final KSerializer<V> f103905b;

    public /* synthetic */ AbstractC39535q0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    /* renamed from: a */
    protected abstract K mo12277a(R r);

    @NotNull
    /* renamed from: b */
    protected final KSerializer<K> m12344b() {
        return this.f103904a;
    }

    /* renamed from: c */
    protected abstract V mo12276c(R r);

    @NotNull
    /* renamed from: d */
    protected final KSerializer<V> m12343d() {
        return this.f103905b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p821oe.KSerializer
    public R deserialize(@NotNull Decoding decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        R r;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC37832c mo6678b = decoder.mo6678b(descriptor);
        if (!mo6678b.mo12471j()) {
            obj = C39499g2.f103845a;
            obj2 = C39499g2.f103845a;
            Object obj5 = obj;
            Object obj6 = obj2;
            while (true) {
                int mo6663v = mo6678b.mo6663v(getDescriptor());
                if (mo6663v == -1) {
                    obj3 = C39499g2.f103845a;
                    if (obj5 != obj3) {
                        obj4 = C39499g2.f103845a;
                        if (obj6 != obj4) {
                            r = (R) mo12275e(obj5, obj6);
                        } else {
                            throw new C39164i("Element 'value' is missing");
                        }
                    } else {
                        throw new C39164i("Element 'key' is missing");
                    }
                } else if (mo6663v != 0) {
                    if (mo6663v == 1) {
                        obj6 = InterfaceC37832c.C37833a.m16039c(mo6678b, getDescriptor(), 1, m12343d(), null, 8, null);
                    } else {
                        throw new C39164i("Invalid index: " + mo6663v);
                    }
                } else {
                    obj5 = InterfaceC37832c.C37833a.m16039c(mo6678b, getDescriptor(), 0, m12344b(), null, 8, null);
                }
            }
        } else {
            r = (R) mo12275e(InterfaceC37832c.C37833a.m16039c(mo6678b, getDescriptor(), 0, m12344b(), null, 8, null), InterfaceC37832c.C37833a.m16039c(mo6678b, getDescriptor(), 1, m12343d(), null, 8, null));
        }
        mo6678b.mo6666c(descriptor);
        return r;
    }

    /* renamed from: e */
    protected abstract R mo12275e(K k, V v);

    @Override // p821oe.InterfaceC39165j
    public void serialize(@NotNull Encoding encoder, R r) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        InterfaceC37834d mo6811b = encoder.mo6811b(getDescriptor());
        mo6811b.mo12462C(getDescriptor(), 0, this.f103904a, mo12277a(r));
        mo6811b.mo12462C(getDescriptor(), 1, this.f103905b, mo12276c(r));
        mo6811b.mo6810c(getDescriptor());
    }

    private AbstractC39535q0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f103904a = kSerializer;
        this.f103905b = kSerializer2;
    }
}
