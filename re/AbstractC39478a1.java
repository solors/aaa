package re;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39392e;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.a1 */
/* loaded from: classes8.dex */
public abstract class AbstractC39478a1<Key, Value, Collection, Builder extends Map<Key, Value>> extends CollectionSerializers<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    @NotNull

    /* renamed from: a */
    private final KSerializer<Key> f103803a;
    @NotNull

    /* renamed from: b */
    private final KSerializer<Value> f103804b;

    public /* synthetic */ AbstractC39478a1(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @NotNull
    /* renamed from: m */
    public final KSerializer<Key> m12516m() {
        return this.f103803a;
    }

    @NotNull
    /* renamed from: n */
    public final KSerializer<Value> m12515n() {
        return this.f103804b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: o */
    public final void mo12340g(@NotNull InterfaceC37832c decoder, @NotNull Builder builder, int i, int i2) {
        boolean z;
        PrimitiveRanges m16900v;
        C37629d m16901u;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16900v = _Ranges.m16900v(0, i2 * 2);
            m16901u = _Ranges.m16901u(m16900v, 2);
            int m16953c = m16901u.m16953c();
            int m16952d = m16901u.m16952d();
            int m16951f = m16901u.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return;
            }
            while (true) {
                mo12339h(decoder, i + m16953c, builder, false);
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: p */
    public final void mo12339h(@NotNull InterfaceC37832c decoder, int i, @NotNull Builder builder, boolean z) {
        int i2;
        Object m16039c;
        Object m17283k;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object m16039c2 = InterfaceC37832c.C37833a.m16039c(decoder, getDescriptor(), i, this.f103803a, null, 8, null);
        boolean z2 = true;
        if (z) {
            i2 = decoder.mo6663v(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (builder.containsKey(m16039c2) && !(this.f103804b.getDescriptor().getKind() instanceof AbstractC39392e)) {
            SerialDescriptor descriptor = getDescriptor();
            KSerializer<Value> kSerializer = this.f103804b;
            m17283k = C37559r0.m17283k(builder, m16039c2);
            m16039c = decoder.mo6843B(descriptor, i3, kSerializer, m17283k);
        } else {
            m16039c = InterfaceC37832c.C37833a.m16039c(decoder, getDescriptor(), i3, this.f103804b, null, 8, null);
        }
        builder.put(m16039c2, m16039c);
    }

    @Override // p821oe.InterfaceC39165j
    public void serialize(@NotNull Encoding encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int mo12297e = mo12297e(collection);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC37834d mo12445y = encoder.mo12445y(descriptor, mo12297e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> mo12298d = mo12298d(collection);
        int i = 0;
        while (mo12298d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = mo12298d.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            mo12445y.mo12462C(getDescriptor(), i, m12516m(), key);
            mo12445y.mo12462C(getDescriptor(), i2, m12515n(), value);
            i = i2 + 1;
        }
        mo12445y.mo6810c(descriptor);
    }

    private AbstractC39478a1(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f103803a = kSerializer;
        this.f103804b = kSerializer2;
    }
}
