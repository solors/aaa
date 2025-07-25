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
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* renamed from: com.yandex.mobile.ads.impl.bx */
/* loaded from: classes8.dex */
public final class C30053bx {
    @NotNull
    public static final C30055b Companion = new C30055b(0);
    @NotNull

    /* renamed from: a */
    private final String f77423a;
    @NotNull

    /* renamed from: b */
    private final String f77424b;

    /* renamed from: com.yandex.mobile.ads.impl.bx$a */
    /* loaded from: classes8.dex */
    public static final class C30054a implements PluginHelperInterfaces<C30053bx> {
        @NotNull

        /* renamed from: a */
        public static final C30054a f77425a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f77426b;

        static {
            C30054a c30054a = new C30054a();
            f77425a = c30054a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCurrency", c30054a, 2);
            pluginGeneratedSerialDescriptor.m16036k("name", false);
            pluginGeneratedSerialDescriptor.m16036k("symbol", false);
            f77426b = pluginGeneratedSerialDescriptor;
        }

        private C30054a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{c39484c2, c39484c2};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            String str;
            String str2;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77426b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            if (mo6678b.mo12471j()) {
                str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                str2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
                i = 3;
            } else {
                str = null;
                String str3 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v == 1) {
                                str3 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
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
                str2 = str3;
                i = i2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new C30053bx(i, str, str2);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f77426b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            C30053bx value = (C30053bx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77426b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            C30053bx.m35425a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bx$b */
    /* loaded from: classes8.dex */
    public static final class C30055b {
        private C30055b() {
        }

        @NotNull
        public final KSerializer<C30053bx> serializer() {
            return C30054a.f77425a;
        }

        public /* synthetic */ C30055b(int i) {
            this();
        }
    }

    public /* synthetic */ C30053bx(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptions.m12351a(i, 3, C30054a.f77425a.getDescriptor());
        }
        this.f77423a = str;
        this.f77424b = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m35425a(C30053bx c30053bx, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, c30053bx.f77423a);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 1, c30053bx.f77424b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30053bx)) {
            return false;
        }
        C30053bx c30053bx = (C30053bx) obj;
        if (Intrinsics.m17075f(this.f77423a, c30053bx.f77423a) && Intrinsics.m17075f(this.f77424b, c30053bx.f77424b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77424b.hashCode() + (this.f77423a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f77423a;
        String str2 = this.f77424b;
        return "DebugPanelWaterfallCurrency(name=" + str + ", symbol=" + str2 + ")";
    }
}
