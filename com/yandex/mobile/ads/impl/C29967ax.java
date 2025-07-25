package com.yandex.mobile.ads.impl;

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
import re.C39484c2;
import re.C39555x;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* renamed from: com.yandex.mobile.ads.impl.ax */
/* loaded from: classes8.dex */
public final class C29967ax {
    @NotNull
    public static final C29969b Companion = new C29969b(0);
    @NotNull

    /* renamed from: a */
    private final String f76937a;

    /* renamed from: b */
    private final double f76938b;

    /* renamed from: com.yandex.mobile.ads.impl.ax$a */
    /* loaded from: classes8.dex */
    public static final class C29968a implements PluginHelperInterfaces<C29967ax> {
        @NotNull

        /* renamed from: a */
        public static final C29968a f76939a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f76940b;

        static {
            C29968a c29968a = new C29968a();
            f76939a = c29968a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", c29968a, 2);
            pluginGeneratedSerialDescriptor.m16036k("network_ad_unit_id", false);
            pluginGeneratedSerialDescriptor.m16036k("min_cpm", false);
            f76940b = pluginGeneratedSerialDescriptor;
        }

        private C29968a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C39484c2.f103815a, C39555x.f103927a};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            String str;
            double d;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76940b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            if (mo6678b.mo12471j()) {
                str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                d = mo6678b.mo12482F(pluginGeneratedSerialDescriptor, 1);
                i = 3;
            } else {
                str = null;
                double d2 = 0.0d;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v == 1) {
                                d2 = mo6678b.mo12482F(pluginGeneratedSerialDescriptor, 1);
                                i2 |= 2;
                            } else {
                                throw new C39175o(mo6663v);
                            }
                        } else {
                            str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                d = d2;
                i = i2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new C29967ax(i, str, d);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f76940b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            C29967ax value = (C29967ax) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76940b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            C29967ax.m35749a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ax$b */
    /* loaded from: classes8.dex */
    public static final class C29969b {
        private C29969b() {
        }

        @NotNull
        public final KSerializer<C29967ax> serializer() {
            return C29968a.f76939a;
        }

        public /* synthetic */ C29969b(int i) {
            this();
        }
    }

    public /* synthetic */ C29967ax(int i, String str, double d) {
        if (3 != (i & 3)) {
            PluginExceptions.m12351a(i, 3, C29968a.f76939a.getDescriptor());
        }
        this.f76937a = str;
        this.f76938b = d;
    }

    /* renamed from: a */
    public final double m35750a() {
        return this.f76938b;
    }

    @NotNull
    /* renamed from: b */
    public final String m35748b() {
        return this.f76937a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29967ax)) {
            return false;
        }
        C29967ax c29967ax = (C29967ax) obj;
        if (Intrinsics.m17075f(this.f76937a, c29967ax.f76937a) && Double.compare(this.f76938b, c29967ax.f76938b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f76938b) + (this.f76937a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f76937a;
        double d = this.f76938b;
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + str + ", minCpm=" + d + ")";
    }

    /* renamed from: a */
    public static final /* synthetic */ void m35749a(C29967ax c29967ax, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, c29967ax.f76937a);
        interfaceC37834d.mo12461F(pluginGeneratedSerialDescriptor, 1, c29967ax.f76938b);
    }
}
