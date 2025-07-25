package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C19897f5;
import com.moloco.sdk.internal.ortb.model.C24016c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import kotlinx.serialization.encoding.InterfaceC37834d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.C39175o;
import p821oe.InterfaceC39163h;
import pe.BuiltinSerializers;
import re.C39484c2;
import re.C39491e0;
import re.PluginExceptions;
import re.PluginHelperInterfaces;
import re.SerializationConstructorMarker;

@InterfaceC39163h
/* renamed from: com.moloco.sdk.internal.ortb.model.b */
/* loaded from: classes7.dex */
public final class C24013b {
    @NotNull
    public static final C24015b Companion = new C24015b(null);
    @NotNull

    /* renamed from: a */
    public final String f62101a;

    /* renamed from: b */
    public final float f62102b;
    @Nullable

    /* renamed from: c */
    public final String f62103c;
    @NotNull

    /* renamed from: d */
    public final C24016c f62104d;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.ortb.model.b$a */
    /* loaded from: classes7.dex */
    public static final class C24014a implements PluginHelperInterfaces<C24013b> {
        @NotNull

        /* renamed from: a */
        public static final C24014a f62105a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f62106b;

        static {
            C24014a c24014a = new C24014a();
            f62105a = c24014a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Bid", c24014a, 4);
            pluginGeneratedSerialDescriptor.m16036k("adm", false);
            pluginGeneratedSerialDescriptor.m16036k("price", false);
            pluginGeneratedSerialDescriptor.m16036k(C19897f5.f50022x, true);
            pluginGeneratedSerialDescriptor.m16036k("ext", false);
            f62106b = pluginGeneratedSerialDescriptor;
        }

        @Override // p821oe.KSerializer
        @NotNull
        /* renamed from: a */
        public C24013b deserialize(@NotNull Decoding decoder) {
            float f;
            int i;
            String str;
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37832c mo6678b = decoder.mo6678b(descriptor);
            if (mo6678b.mo12471j()) {
                String mo12472i = mo6678b.mo12472i(descriptor, 0);
                float mo12467y = mo6678b.mo12467y(descriptor, 1);
                obj = mo6678b.mo12481H(descriptor, 2, C39484c2.f103815a, null);
                obj2 = mo6678b.mo6843B(descriptor, 3, C24016c.C24017a.f62110a, null);
                str = mo12472i;
                f = mo12467y;
                i = 15;
            } else {
                float f2 = 0.0f;
                boolean z = true;
                String str2 = null;
                Object obj3 = null;
                Object obj4 = null;
                int i2 = 0;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(descriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v != 2) {
                                    if (mo6663v == 3) {
                                        obj4 = mo6678b.mo6843B(descriptor, 3, C24016c.C24017a.f62110a, obj4);
                                        i2 |= 8;
                                    } else {
                                        throw new C39175o(mo6663v);
                                    }
                                } else {
                                    obj3 = mo6678b.mo12481H(descriptor, 2, C39484c2.f103815a, obj3);
                                    i2 |= 4;
                                }
                            } else {
                                f2 = mo6678b.mo12467y(descriptor, 1);
                                i2 |= 2;
                            }
                        } else {
                            str2 = mo6678b.mo12472i(descriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                f = f2;
                i = i2;
                str = str2;
                obj = obj3;
                obj2 = obj4;
            }
            mo6678b.mo6666c(descriptor);
            return new C24013b(i, str, f, (String) obj, (C24016c) obj2, null);
        }

        @Override // p821oe.InterfaceC39165j
        /* renamed from: b */
        public void serialize(@NotNull Encoding encoder, @NotNull C24013b value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37834d mo6811b = encoder.mo6811b(descriptor);
            C24013b.m47201b(value, mo6811b, descriptor);
            mo6811b.mo6810c(descriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{c39484c2, C39491e0.f103827a, BuiltinSerializers.m13155t(c39484c2), C24016c.C24017a.f62110a};
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f62106b;
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.b$b */
    /* loaded from: classes7.dex */
    public static final class C24015b {
        public /* synthetic */ C24015b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<C24013b> serializer() {
            return C24014a.f62105a;
        }

        public C24015b() {
        }
    }

    public /* synthetic */ C24013b(int i, String str, float f, String str2, C24016c c24016c, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptions.m12351a(i, 11, C24014a.f62105a.getDescriptor());
        }
        this.f62101a = str;
        this.f62102b = f;
        if ((i & 4) == 0) {
            this.f62103c = null;
        } else {
            this.f62103c = str2;
        }
        this.f62104d = c24016c;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m47201b(C24013b c24013b, InterfaceC37834d interfaceC37834d, SerialDescriptor serialDescriptor) {
        interfaceC37834d.mo12449o(serialDescriptor, 0, c24013b.f62101a);
        interfaceC37834d.mo12463B(serialDescriptor, 1, c24013b.f62102b);
        if (interfaceC37834d.mo6802p(serialDescriptor, 2) || c24013b.f62103c != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 2, C39484c2.f103815a, c24013b.f62103c);
        }
        interfaceC37834d.mo12462C(serialDescriptor, 3, C24016c.C24017a.f62110a, c24013b.f62104d);
    }

    @NotNull
    /* renamed from: a */
    public final String m47202a() {
        return this.f62101a;
    }

    @Nullable
    /* renamed from: c */
    public final String m47200c() {
        return this.f62103c;
    }

    @NotNull
    /* renamed from: d */
    public final C24016c m47199d() {
        return this.f62104d;
    }

    /* renamed from: e */
    public final float m47198e() {
        return this.f62102b;
    }

    public C24013b(@NotNull String adm, float f, @Nullable String str, @NotNull C24016c ext) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.f62101a = adm;
        this.f62102b = f;
        this.f62103c = str;
        this.f62104d = ext;
    }
}
