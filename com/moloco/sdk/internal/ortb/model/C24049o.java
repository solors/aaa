package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
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
import re.PluginHelperInterfaces;
import re.SerializationConstructorMarker;

@InterfaceC39163h
/* renamed from: com.moloco.sdk.internal.ortb.model.o */
/* loaded from: classes7.dex */
public final class C24049o {
    @NotNull
    public static final C24051b Companion = new C24051b(null);
    @Nullable

    /* renamed from: a */
    public final String f62187a;
    @Nullable

    /* renamed from: b */
    public final String f62188b;
    @Nullable

    /* renamed from: c */
    public final String f62189c;
    @Nullable

    /* renamed from: d */
    public final String f62190d;
    @Nullable

    /* renamed from: e */
    public final String f62191e;
    @Nullable

    /* renamed from: f */
    public final String f62192f;
    @Nullable

    /* renamed from: g */
    public final String f62193g;
    @Nullable

    /* renamed from: h */
    public final String f62194h;
    @Nullable

    /* renamed from: i */
    public final String f62195i;
    @Nullable

    /* renamed from: j */
    public final String f62196j;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.ortb.model.o$a */
    /* loaded from: classes7.dex */
    public static final class C24050a implements PluginHelperInterfaces<C24049o> {
        @NotNull

        /* renamed from: a */
        public static final C24050a f62197a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f62198b;

        static {
            C24050a c24050a = new C24050a();
            f62197a = c24050a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SdkEvents", c24050a, 10);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_load_start", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_load_failed", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_load_success", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_show_failed", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_show_success", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_clicked", true);
            pluginGeneratedSerialDescriptor.m16036k("on_ad_hidden", true);
            pluginGeneratedSerialDescriptor.m16036k("on_user_rewarded", true);
            pluginGeneratedSerialDescriptor.m16036k("on_rewarded_video_started", true);
            pluginGeneratedSerialDescriptor.m16036k("on_rewarded_video_completed", true);
            f62198b = pluginGeneratedSerialDescriptor;
        }

        @Override // p821oe.KSerializer
        @NotNull
        /* renamed from: a */
        public C24049o deserialize(@NotNull Decoding decoder) {
            Object obj;
            Object obj2;
            Object obj3;
            int i;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37832c mo6678b = decoder.mo6678b(descriptor);
            int i2 = 9;
            Object obj11 = null;
            if (mo6678b.mo12471j()) {
                C39484c2 c39484c2 = C39484c2.f103815a;
                obj9 = mo6678b.mo12481H(descriptor, 0, c39484c2, null);
                Object mo12481H = mo6678b.mo12481H(descriptor, 1, c39484c2, null);
                obj10 = mo6678b.mo12481H(descriptor, 2, c39484c2, null);
                obj8 = mo6678b.mo12481H(descriptor, 3, c39484c2, null);
                Object mo12481H2 = mo6678b.mo12481H(descriptor, 4, c39484c2, null);
                obj7 = mo6678b.mo12481H(descriptor, 5, c39484c2, null);
                obj6 = mo6678b.mo12481H(descriptor, 6, c39484c2, null);
                Object mo12481H3 = mo6678b.mo12481H(descriptor, 7, c39484c2, null);
                obj5 = mo6678b.mo12481H(descriptor, 8, c39484c2, null);
                obj4 = mo6678b.mo12481H(descriptor, 9, c39484c2, null);
                obj3 = mo12481H;
                obj2 = mo12481H2;
                obj = mo12481H3;
                i = 1023;
            } else {
                boolean z = true;
                int i3 = 0;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                obj = null;
                Object obj15 = null;
                obj2 = null;
                Object obj16 = null;
                obj3 = null;
                Object obj17 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(descriptor);
                    switch (mo6663v) {
                        case -1:
                            z = false;
                            i2 = 9;
                            break;
                        case 0:
                            obj11 = mo6678b.mo12481H(descriptor, 0, C39484c2.f103815a, obj11);
                            i3 |= 1;
                            i2 = 9;
                            break;
                        case 1:
                            obj3 = mo6678b.mo12481H(descriptor, 1, C39484c2.f103815a, obj3);
                            i3 |= 2;
                            i2 = 9;
                            break;
                        case 2:
                            obj17 = mo6678b.mo12481H(descriptor, 2, C39484c2.f103815a, obj17);
                            i3 |= 4;
                            i2 = 9;
                            break;
                        case 3:
                            obj16 = mo6678b.mo12481H(descriptor, 3, C39484c2.f103815a, obj16);
                            i3 |= 8;
                            i2 = 9;
                            break;
                        case 4:
                            obj2 = mo6678b.mo12481H(descriptor, 4, C39484c2.f103815a, obj2);
                            i3 |= 16;
                            i2 = 9;
                            break;
                        case 5:
                            obj15 = mo6678b.mo12481H(descriptor, 5, C39484c2.f103815a, obj15);
                            i3 |= 32;
                            i2 = 9;
                            break;
                        case 6:
                            obj14 = mo6678b.mo12481H(descriptor, 6, C39484c2.f103815a, obj14);
                            i3 |= 64;
                            i2 = 9;
                            break;
                        case 7:
                            obj = mo6678b.mo12481H(descriptor, 7, C39484c2.f103815a, obj);
                            i3 |= 128;
                            i2 = 9;
                            continue;
                        case 8:
                            obj13 = mo6678b.mo12481H(descriptor, 8, C39484c2.f103815a, obj13);
                            i3 |= 256;
                            break;
                        case 9:
                            obj12 = mo6678b.mo12481H(descriptor, i2, C39484c2.f103815a, obj12);
                            i3 |= 512;
                            break;
                        default:
                            throw new C39175o(mo6663v);
                    }
                }
                i = i3;
                obj4 = obj12;
                obj5 = obj13;
                obj6 = obj14;
                obj7 = obj15;
                obj8 = obj16;
                obj9 = obj11;
                obj10 = obj17;
            }
            mo6678b.mo6666c(descriptor);
            return new C24049o(i, (String) obj9, (String) obj3, (String) obj10, (String) obj8, (String) obj2, (String) obj7, (String) obj6, (String) obj, (String) obj5, (String) obj4, (SerializationConstructorMarker) null);
        }

        @Override // p821oe.InterfaceC39165j
        /* renamed from: b */
        public void serialize(@NotNull Encoding encoder, @NotNull C24049o value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37834d mo6811b = encoder.mo6811b(descriptor);
            C24049o.m47109b(value, mo6811b, descriptor);
            mo6811b.mo6810c(descriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2)};
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f62198b;
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.o$b */
    /* loaded from: classes7.dex */
    public static final class C24051b {
        public /* synthetic */ C24051b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<C24049o> serializer() {
            return C24050a.f62197a;
        }

        public C24051b() {
        }
    }

    public C24049o() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m47109b(C24049o c24049o, InterfaceC37834d interfaceC37834d, SerialDescriptor serialDescriptor) {
        if (interfaceC37834d.mo6802p(serialDescriptor, 0) || c24049o.f62187a != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 0, C39484c2.f103815a, c24049o.f62187a);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 1) || c24049o.f62188b != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 1, C39484c2.f103815a, c24049o.f62188b);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 2) || c24049o.f62189c != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 2, C39484c2.f103815a, c24049o.f62189c);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 3) || c24049o.f62190d != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 3, C39484c2.f103815a, c24049o.f62190d);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 4) || c24049o.f62191e != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 4, C39484c2.f103815a, c24049o.f62191e);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 5) || c24049o.f62192f != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 5, C39484c2.f103815a, c24049o.f62192f);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 6) || c24049o.f62193g != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 6, C39484c2.f103815a, c24049o.f62193g);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 7) || c24049o.f62194h != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 7, C39484c2.f103815a, c24049o.f62194h);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 8) || c24049o.f62195i != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 8, C39484c2.f103815a, c24049o.f62195i);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 9) || c24049o.f62196j != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 9, C39484c2.f103815a, c24049o.f62196j);
        }
    }

    @Nullable
    /* renamed from: a */
    public final String m47110a() {
        return this.f62192f;
    }

    @Nullable
    /* renamed from: c */
    public final String m47108c() {
        return this.f62193g;
    }

    @Nullable
    /* renamed from: d */
    public final String m47107d() {
        return this.f62188b;
    }

    @Nullable
    /* renamed from: e */
    public final String m47106e() {
        return this.f62187a;
    }

    @Nullable
    /* renamed from: f */
    public final String m47105f() {
        return this.f62189c;
    }

    @Nullable
    /* renamed from: g */
    public final String m47104g() {
        return this.f62190d;
    }

    @Nullable
    /* renamed from: h */
    public final String m47103h() {
        return this.f62191e;
    }

    @Nullable
    /* renamed from: i */
    public final String m47102i() {
        return this.f62196j;
    }

    @Nullable
    /* renamed from: j */
    public final String m47101j() {
        return this.f62195i;
    }

    @Nullable
    /* renamed from: k */
    public final String m47100k() {
        return this.f62194h;
    }

    public /* synthetic */ C24049o(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f62187a = null;
        } else {
            this.f62187a = str;
        }
        if ((i & 2) == 0) {
            this.f62188b = null;
        } else {
            this.f62188b = str2;
        }
        if ((i & 4) == 0) {
            this.f62189c = null;
        } else {
            this.f62189c = str3;
        }
        if ((i & 8) == 0) {
            this.f62190d = null;
        } else {
            this.f62190d = str4;
        }
        if ((i & 16) == 0) {
            this.f62191e = null;
        } else {
            this.f62191e = str5;
        }
        if ((i & 32) == 0) {
            this.f62192f = null;
        } else {
            this.f62192f = str6;
        }
        if ((i & 64) == 0) {
            this.f62193g = null;
        } else {
            this.f62193g = str7;
        }
        if ((i & 128) == 0) {
            this.f62194h = null;
        } else {
            this.f62194h = str8;
        }
        if ((i & 256) == 0) {
            this.f62195i = null;
        } else {
            this.f62195i = str9;
        }
        if ((i & 512) == 0) {
            this.f62196j = null;
        } else {
            this.f62196j = str10;
        }
    }

    public C24049o(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.f62187a = str;
        this.f62188b = str2;
        this.f62189c = str3;
        this.f62190d = str4;
        this.f62191e = str5;
        this.f62192f = str6;
        this.f62193g = str7;
        this.f62194h = str8;
        this.f62195i = str9;
        this.f62196j = str10;
    }

    public /* synthetic */ C24049o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
