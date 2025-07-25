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
import pe.BuiltinSerializers;
import re.C39500h;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* renamed from: com.yandex.mobile.ads.impl.qv */
/* loaded from: classes8.dex */
public final class C31237qv {
    @NotNull
    public static final C31239b Companion = new C31239b(0);

    /* renamed from: a */
    private final boolean f84547a;
    @Nullable

    /* renamed from: b */
    private final Boolean f84548b;
    @Nullable

    /* renamed from: c */
    private final Boolean f84549c;

    /* renamed from: d */
    private final boolean f84550d;

    /* renamed from: com.yandex.mobile.ads.impl.qv$a */
    /* loaded from: classes8.dex */
    public static final class C31238a implements PluginHelperInterfaces<C31237qv> {
        @NotNull

        /* renamed from: a */
        public static final C31238a f84551a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f84552b;

        static {
            C31238a c31238a = new C31238a();
            f84551a = c31238a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", c31238a, 4);
            pluginGeneratedSerialDescriptor.m16036k("has_location_consent", false);
            pluginGeneratedSerialDescriptor.m16036k("age_restricted_user", false);
            pluginGeneratedSerialDescriptor.m16036k("has_user_consent", false);
            pluginGeneratedSerialDescriptor.m16036k("has_cmp_value", false);
            f84552b = pluginGeneratedSerialDescriptor;
        }

        private C31238a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            C39500h c39500h = C39500h.f103846a;
            return new KSerializer[]{c39500h, BuiltinSerializers.m13155t(c39500h), BuiltinSerializers.m13155t(c39500h), c39500h};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            boolean z;
            boolean z2;
            int i;
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84552b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            if (mo6678b.mo12471j()) {
                boolean mo12484C = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 0);
                C39500h c39500h = C39500h.f103846a;
                z = mo12484C;
                z2 = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 3);
                bool2 = (Boolean) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 2, c39500h, null);
                bool = (Boolean) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, c39500h, null);
                i = 15;
            } else {
                boolean z3 = true;
                boolean z4 = false;
                int i2 = 0;
                Boolean bool3 = null;
                Boolean bool4 = null;
                boolean z5 = false;
                while (z3) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v != 2) {
                                    if (mo6663v == 3) {
                                        z5 = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 3);
                                        i2 |= 8;
                                    } else {
                                        throw new C39175o(mo6663v);
                                    }
                                } else {
                                    bool4 = (Boolean) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 2, C39500h.f103846a, bool4);
                                    i2 |= 4;
                                }
                            } else {
                                bool3 = (Boolean) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39500h.f103846a, bool3);
                                i2 |= 2;
                            }
                        } else {
                            z4 = mo6678b.mo12484C(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z3 = false;
                    }
                }
                z = z4;
                z2 = z5;
                i = i2;
                bool = bool3;
                bool2 = bool4;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new C31237qv(i, z, bool, bool2, z2);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f84552b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            C31237qv value = (C31237qv) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84552b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            C31237qv.m30211a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qv$b */
    /* loaded from: classes8.dex */
    public static final class C31239b {
        private C31239b() {
        }

        @NotNull
        public final KSerializer<C31237qv> serializer() {
            return C31238a.f84551a;
        }

        public /* synthetic */ C31239b(int i) {
            this();
        }
    }

    public /* synthetic */ C31237qv(int i, boolean z, Boolean bool, Boolean bool2, boolean z2) {
        if (15 != (i & 15)) {
            PluginExceptions.m12351a(i, 15, C31238a.f84551a.getDescriptor());
        }
        this.f84547a = z;
        this.f84548b = bool;
        this.f84549c = bool2;
        this.f84550d = z2;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m30212a() {
        return this.f84548b;
    }

    /* renamed from: b */
    public final boolean m30210b() {
        return this.f84550d;
    }

    /* renamed from: c */
    public final boolean m30209c() {
        return this.f84547a;
    }

    @Nullable
    /* renamed from: d */
    public final Boolean m30208d() {
        return this.f84549c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31237qv)) {
            return false;
        }
        C31237qv c31237qv = (C31237qv) obj;
        if (this.f84547a == c31237qv.f84547a && Intrinsics.m17075f(this.f84548b, c31237qv.f84548b) && Intrinsics.m17075f(this.f84549c, c31237qv.f84549c) && this.f84550d == c31237qv.f84550d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.f84547a) * 31;
        Boolean bool = this.f84548b;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool2 = this.f84549c;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return Boolean.hashCode(this.f84550d) + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z = this.f84547a;
        Boolean bool = this.f84548b;
        Boolean bool2 = this.f84549c;
        boolean z2 = this.f84550d;
        return "DebugPanelConsentsData(hasLocationConsent=" + z + ", ageRestrictedUser=" + bool + ", hasUserConsent=" + bool2 + ", hasCmpValue=" + z2 + ")";
    }

    public C31237qv(boolean z, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z2) {
        this.f84547a = z;
        this.f84548b = bool;
        this.f84549c = bool2;
        this.f84550d = z2;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30211a(C31237qv c31237qv, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12450n(pluginGeneratedSerialDescriptor, 0, c31237qv.f84547a);
        C39500h c39500h = C39500h.f103846a;
        interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 1, c39500h, c31237qv.f84548b);
        interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 2, c39500h, c31237qv.f84549c);
        interfaceC37834d.mo12450n(pluginGeneratedSerialDescriptor, 3, c31237qv.f84550d);
    }
}
