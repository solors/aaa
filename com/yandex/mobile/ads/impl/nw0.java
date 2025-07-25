package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
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
import re.C39493f;
import re.C39500h;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* loaded from: classes8.dex */
public final class nw0 {
    @NotNull
    public static final C30983b Companion = new C30983b(0);
    @NotNull

    /* renamed from: d */
    private static final KSerializer<Object>[] f83156d = {null, null, new C39493f(C30984c.C30985a.f83165a)};
    @NotNull

    /* renamed from: a */
    private final String f83157a;
    @Nullable

    /* renamed from: b */
    private final String f83158b;
    @NotNull

    /* renamed from: c */
    private final List<C30984c> f83159c;

    /* renamed from: com.yandex.mobile.ads.impl.nw0$a */
    /* loaded from: classes8.dex */
    public static final class C30982a implements PluginHelperInterfaces<nw0> {
        @NotNull

        /* renamed from: a */
        public static final C30982a f83160a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f83161b;

        static {
            C30982a c30982a = new C30982a();
            f83160a = c30982a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", c30982a, 3);
            pluginGeneratedSerialDescriptor.m16036k("name", false);
            pluginGeneratedSerialDescriptor.m16036k("version", false);
            pluginGeneratedSerialDescriptor.m16036k("adapters", false);
            f83161b = pluginGeneratedSerialDescriptor;
        }

        private C30982a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = nw0.f83156d;
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{c39484c2, BuiltinSerializers.m13155t(c39484c2), kSerializerArr[2]};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            int i;
            String str;
            String str2;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83161b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = nw0.f83156d;
            String str3 = null;
            if (mo6678b.mo12471j()) {
                str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                str2 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, null);
                list = (List) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], null);
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                String str4 = null;
                List list2 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v == 2) {
                                    list2 = (List) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                                    i2 |= 4;
                                } else {
                                    throw new C39175o(mo6663v);
                                }
                            } else {
                                str4 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, str4);
                                i2 |= 2;
                            }
                        } else {
                            str3 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                i = i2;
                str = str3;
                str2 = str4;
                list = list2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new nw0(i, str, str2, list);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f83161b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            nw0 value = (nw0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83161b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            nw0.m31263a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nw0$b */
    /* loaded from: classes8.dex */
    public static final class C30983b {
        private C30983b() {
        }

        @NotNull
        public final KSerializer<nw0> serializer() {
            return C30982a.f83160a;
        }

        public /* synthetic */ C30983b(int i) {
            this();
        }
    }

    @InterfaceC39163h
    /* renamed from: com.yandex.mobile.ads.impl.nw0$c */
    /* loaded from: classes8.dex */
    public static final class C30984c {
        @NotNull
        public static final C30986b Companion = new C30986b(0);
        @NotNull

        /* renamed from: a */
        private final String f83162a;
        @Nullable

        /* renamed from: b */
        private final String f83163b;

        /* renamed from: c */
        private final boolean f83164c;

        /* renamed from: com.yandex.mobile.ads.impl.nw0$c$a */
        /* loaded from: classes8.dex */
        public static final class C30985a implements PluginHelperInterfaces<C30984c> {
            @NotNull

            /* renamed from: a */
            public static final C30985a f83165a;

            /* renamed from: b */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f83166b;

            static {
                C30985a c30985a = new C30985a();
                f83165a = c30985a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", c30985a, 3);
                pluginGeneratedSerialDescriptor.m16036k("format", false);
                pluginGeneratedSerialDescriptor.m16036k("version", false);
                pluginGeneratedSerialDescriptor.m16036k("isIntegrated", false);
                f83166b = pluginGeneratedSerialDescriptor;
            }

            private C30985a() {
            }

            @Override // re.PluginHelperInterfaces
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                C39484c2 c39484c2 = C39484c2.f103815a;
                return new KSerializer[]{c39484c2, BuiltinSerializers.m13155t(c39484c2), C39500h.f103846a};
            }

            @Override // p821oe.KSerializer
            public final Object deserialize(Decoding decoder) {
                boolean z;
                int i;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83166b;
                InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
                if (mo6678b.mo12471j()) {
                    str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                    str2 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, null);
                    z = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 2);
                    i = 7;
                } else {
                    boolean z2 = true;
                    boolean z3 = false;
                    String str3 = null;
                    String str4 = null;
                    int i2 = 0;
                    while (z2) {
                        int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                        if (mo6663v != -1) {
                            if (mo6663v != 0) {
                                if (mo6663v != 1) {
                                    if (mo6663v == 2) {
                                        z3 = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 2);
                                        i2 |= 4;
                                    } else {
                                        throw new C39175o(mo6663v);
                                    }
                                } else {
                                    str4 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, str4);
                                    i2 |= 2;
                                }
                            } else {
                                str3 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                                i2 |= 1;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                    z = z3;
                    i = i2;
                    str = str3;
                    str2 = str4;
                }
                mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
                return new C30984c(i, str, str2, z);
            }

            @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f83166b;
            }

            @Override // p821oe.InterfaceC39165j
            public final void serialize(Encoding encoder, Object obj) {
                C30984c value = (C30984c) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83166b;
                InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
                C30984c.m31258a(value, mo6811b, pluginGeneratedSerialDescriptor);
                mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
            }

            @Override // re.PluginHelperInterfaces
            @NotNull
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.C39494a.m12438a(this);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.nw0$c$b */
        /* loaded from: classes8.dex */
        public static final class C30986b {
            private C30986b() {
            }

            @NotNull
            public final KSerializer<C30984c> serializer() {
                return C30985a.f83165a;
            }

            public /* synthetic */ C30986b(int i) {
                this();
            }
        }

        public /* synthetic */ C30984c(int i, String str, String str2, boolean z) {
            if (7 != (i & 7)) {
                PluginExceptions.m12351a(i, 7, C30985a.f83165a.getDescriptor());
            }
            this.f83162a = str;
            this.f83163b = str2;
            this.f83164c = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m31259a() {
            return this.f83162a;
        }

        @Nullable
        /* renamed from: b */
        public final String m31257b() {
            return this.f83163b;
        }

        /* renamed from: c */
        public final boolean m31256c() {
            return this.f83164c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30984c)) {
                return false;
            }
            C30984c c30984c = (C30984c) obj;
            if (Intrinsics.m17075f(this.f83162a, c30984c.f83162a) && Intrinsics.m17075f(this.f83163b, c30984c.f83163b) && this.f83164c == c30984c.f83164c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f83162a.hashCode() * 31;
            String str = this.f83163b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.f83164c) + ((hashCode2 + hashCode) * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f83162a;
            String str2 = this.f83163b;
            boolean z = this.f83164c;
            return "MediationAdapterData(format=" + str + ", version=" + str2 + ", isIntegrated=" + z + ")";
        }

        public C30984c(@NotNull String format, @Nullable String str, boolean z) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f83162a = format;
            this.f83163b = str;
            this.f83164c = z;
        }

        /* renamed from: a */
        public static final /* synthetic */ void m31258a(C30984c c30984c, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, c30984c.f83162a);
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, c30984c.f83163b);
            interfaceC37834d.mo12450n(pluginGeneratedSerialDescriptor, 2, c30984c.f83164c);
        }
    }

    public /* synthetic */ nw0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            PluginExceptions.m12351a(i, 7, C30982a.f83160a.getDescriptor());
        }
        this.f83157a = str;
        this.f83158b = str2;
        this.f83159c = list;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m31263a(nw0 nw0Var, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f83156d;
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, nw0Var.f83157a);
        interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, nw0Var.f83158b);
        interfaceC37834d.mo12462C(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], nw0Var.f83159c);
    }

    @NotNull
    /* renamed from: b */
    public final List<C30984c> m31262b() {
        return this.f83159c;
    }

    @NotNull
    /* renamed from: c */
    public final String m31261c() {
        return this.f83157a;
    }

    @Nullable
    /* renamed from: d */
    public final String m31260d() {
        return this.f83158b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        if (Intrinsics.m17075f(this.f83157a, nw0Var.f83157a) && Intrinsics.m17075f(this.f83158b, nw0Var.f83158b) && Intrinsics.m17075f(this.f83159c, nw0Var.f83159c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f83157a.hashCode() * 31;
        String str = this.f83158b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f83159c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f83157a;
        String str2 = this.f83158b;
        List<C30984c> list = this.f83159c;
        return "MediationNetworkData(name=" + str + ", version=" + str2 + ", adapters=" + list + ")";
    }

    public nw0(@NotNull String name, @Nullable String str, @NotNull ArrayList adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f83157a = name;
        this.f83158b = str;
        this.f83159c = adapters;
    }
}
