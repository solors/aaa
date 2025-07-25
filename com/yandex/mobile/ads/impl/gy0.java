package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.jy0;
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
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* loaded from: classes8.dex */
public final class gy0 {
    @NotNull
    public static final C30427b Companion = new C30427b(0);
    @NotNull

    /* renamed from: a */
    private final iy0 f79804a;
    @Nullable

    /* renamed from: b */
    private final jy0 f79805b;

    /* renamed from: com.yandex.mobile.ads.impl.gy0$a */
    /* loaded from: classes8.dex */
    public static final class C30426a implements PluginHelperInterfaces<gy0> {
        @NotNull

        /* renamed from: a */
        public static final C30426a f79806a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f79807b;

        static {
            C30426a c30426a = new C30426a();
            f79806a = c30426a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", c30426a, 2);
            pluginGeneratedSerialDescriptor.m16036k("request", false);
            pluginGeneratedSerialDescriptor.m16036k("response", false);
            f79807b = pluginGeneratedSerialDescriptor;
        }

        private C30426a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{iy0.C30589a.f80686a, BuiltinSerializers.m13155t(jy0.C30683a.f81218a)};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            int i;
            iy0 iy0Var;
            jy0 jy0Var;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79807b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            iy0 iy0Var2 = null;
            if (mo6678b.mo12471j()) {
                iy0Var = (iy0) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 0, iy0.C30589a.f80686a, null);
                jy0Var = (jy0) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, jy0.C30683a.f81218a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                jy0 jy0Var2 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v == 1) {
                                jy0Var2 = (jy0) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, jy0.C30683a.f81218a, jy0Var2);
                                i2 |= 2;
                            } else {
                                throw new C39175o(mo6663v);
                            }
                        } else {
                            iy0Var2 = (iy0) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 0, iy0.C30589a.f80686a, iy0Var2);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                i = i2;
                iy0Var = iy0Var2;
                jy0Var = jy0Var2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new gy0(i, iy0Var, jy0Var);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f79807b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            gy0 value = (gy0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79807b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            gy0.m33756a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gy0$b */
    /* loaded from: classes8.dex */
    public static final class C30427b {
        private C30427b() {
        }

        @NotNull
        public final KSerializer<gy0> serializer() {
            return C30426a.f79806a;
        }

        public /* synthetic */ C30427b(int i) {
            this();
        }
    }

    public /* synthetic */ gy0(int i, iy0 iy0Var, jy0 jy0Var) {
        if (3 != (i & 3)) {
            PluginExceptions.m12351a(i, 3, C30426a.f79806a.getDescriptor());
        }
        this.f79804a = iy0Var;
        this.f79805b = jy0Var;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m33756a(gy0 gy0Var, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12462C(pluginGeneratedSerialDescriptor, 0, iy0.C30589a.f80686a, gy0Var.f79804a);
        interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 1, jy0.C30683a.f81218a, gy0Var.f79805b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy0)) {
            return false;
        }
        gy0 gy0Var = (gy0) obj;
        if (Intrinsics.m17075f(this.f79804a, gy0Var.f79804a) && Intrinsics.m17075f(this.f79805b, gy0Var.f79805b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f79804a.hashCode() * 31;
        jy0 jy0Var = this.f79805b;
        if (jy0Var == null) {
            hashCode = 0;
        } else {
            hashCode = jy0Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        iy0 iy0Var = this.f79804a;
        jy0 jy0Var = this.f79805b;
        return "MobileAdsNetworkLog(request=" + iy0Var + ", response=" + jy0Var + ")";
    }

    public gy0(@NotNull iy0 request, @Nullable jy0 jy0Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f79804a = request;
        this.f79805b = jy0Var;
    }
}
