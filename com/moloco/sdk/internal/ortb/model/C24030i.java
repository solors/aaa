package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C24033j;
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
/* renamed from: com.moloco.sdk.internal.ortb.model.i */
/* loaded from: classes7.dex */
public final class C24030i {
    @NotNull
    public static final C24032b Companion = new C24032b(null);
    @Nullable

    /* renamed from: a */
    public final String f62137a;
    @Nullable

    /* renamed from: b */
    public final String f62138b;
    @Nullable

    /* renamed from: c */
    public final String f62139c;
    @Nullable

    /* renamed from: d */
    public final String f62140d;
    @Nullable

    /* renamed from: e */
    public final String f62141e;
    @Nullable

    /* renamed from: f */
    public final String f62142f;
    @Nullable

    /* renamed from: g */
    public final String f62143g;
    @Nullable

    /* renamed from: h */
    public final C24033j f62144h;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.ortb.model.i$a */
    /* loaded from: classes7.dex */
    public static final class C24031a implements PluginHelperInterfaces<C24030i> {
        @NotNull

        /* renamed from: a */
        public static final C24031a f62145a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f62146b;

        static {
            C24031a c24031a = new C24031a();
            f62145a = c24031a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DEC", c24031a, 8);
            pluginGeneratedSerialDescriptor.m16036k("app_icon_url", true);
            pluginGeneratedSerialDescriptor.m16036k("app_name", true);
            pluginGeneratedSerialDescriptor.m16036k("imp_link", true);
            pluginGeneratedSerialDescriptor.m16036k("click_through", true);
            pluginGeneratedSerialDescriptor.m16036k("click_tracking", true);
            pluginGeneratedSerialDescriptor.m16036k("cta_text", true);
            pluginGeneratedSerialDescriptor.m16036k("skip_event", true);
            pluginGeneratedSerialDescriptor.m16036k("close", true);
            f62146b = pluginGeneratedSerialDescriptor;
        }

        @Override // p821oe.KSerializer
        @NotNull
        /* renamed from: a */
        public C24030i deserialize(@NotNull Decoding decoder) {
            Object obj;
            int i;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37832c mo6678b = decoder.mo6678b(descriptor);
            int i2 = 7;
            Object obj8 = null;
            if (mo6678b.mo12471j()) {
                C39484c2 c39484c2 = C39484c2.f103815a;
                Object mo12481H = mo6678b.mo12481H(descriptor, 0, c39484c2, null);
                obj4 = mo6678b.mo12481H(descriptor, 1, c39484c2, null);
                obj5 = mo6678b.mo12481H(descriptor, 2, c39484c2, null);
                obj6 = mo6678b.mo12481H(descriptor, 3, c39484c2, null);
                obj7 = mo6678b.mo12481H(descriptor, 4, c39484c2, null);
                Object mo12481H2 = mo6678b.mo12481H(descriptor, 5, c39484c2, null);
                obj3 = mo6678b.mo12481H(descriptor, 6, c39484c2, null);
                obj2 = mo6678b.mo12481H(descriptor, 7, C24033j.C24034a.f62148a, null);
                obj8 = mo12481H;
                obj = mo12481H2;
                i = 255;
            } else {
                boolean z = true;
                int i3 = 0;
                Object obj9 = null;
                Object obj10 = null;
                obj = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(descriptor);
                    switch (mo6663v) {
                        case -1:
                            z = false;
                            i2 = 7;
                            break;
                        case 0:
                            obj8 = mo6678b.mo12481H(descriptor, 0, C39484c2.f103815a, obj8);
                            i3 |= 1;
                            i2 = 7;
                            break;
                        case 1:
                            obj11 = mo6678b.mo12481H(descriptor, 1, C39484c2.f103815a, obj11);
                            i3 |= 2;
                            i2 = 7;
                            break;
                        case 2:
                            obj12 = mo6678b.mo12481H(descriptor, 2, C39484c2.f103815a, obj12);
                            i3 |= 4;
                            i2 = 7;
                            break;
                        case 3:
                            obj13 = mo6678b.mo12481H(descriptor, 3, C39484c2.f103815a, obj13);
                            i3 |= 8;
                            i2 = 7;
                            continue;
                        case 4:
                            obj14 = mo6678b.mo12481H(descriptor, 4, C39484c2.f103815a, obj14);
                            i3 |= 16;
                            break;
                        case 5:
                            obj = mo6678b.mo12481H(descriptor, 5, C39484c2.f103815a, obj);
                            i3 |= 32;
                            break;
                        case 6:
                            obj10 = mo6678b.mo12481H(descriptor, 6, C39484c2.f103815a, obj10);
                            i3 |= 64;
                            break;
                        case 7:
                            obj9 = mo6678b.mo12481H(descriptor, i2, C24033j.C24034a.f62148a, obj9);
                            i3 |= 128;
                            break;
                        default:
                            throw new C39175o(mo6663v);
                    }
                }
                i = i3;
                obj2 = obj9;
                obj3 = obj10;
                obj4 = obj11;
                obj5 = obj12;
                obj6 = obj13;
                obj7 = obj14;
            }
            mo6678b.mo6666c(descriptor);
            return new C24030i(i, (String) obj8, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj, (String) obj3, (C24033j) obj2, (SerializationConstructorMarker) null);
        }

        @Override // p821oe.InterfaceC39165j
        /* renamed from: b */
        public void serialize(@NotNull Encoding encoder, @NotNull C24030i value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37834d mo6811b = encoder.mo6811b(descriptor);
            C24030i.m47160b(value, mo6811b, descriptor);
            mo6811b.mo6810c(descriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(C24033j.C24034a.f62148a)};
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f62146b;
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.i$b */
    /* loaded from: classes7.dex */
    public static final class C24032b {
        public /* synthetic */ C24032b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<C24030i> serializer() {
            return C24031a.f62145a;
        }

        public C24032b() {
        }
    }

    public C24030i() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C24033j) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m47160b(C24030i c24030i, InterfaceC37834d interfaceC37834d, SerialDescriptor serialDescriptor) {
        if (interfaceC37834d.mo6802p(serialDescriptor, 0) || c24030i.f62137a != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 0, C39484c2.f103815a, c24030i.f62137a);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 1) || c24030i.f62138b != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 1, C39484c2.f103815a, c24030i.f62138b);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 2) || c24030i.f62139c != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 2, C39484c2.f103815a, c24030i.f62139c);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 3) || c24030i.f62140d != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 3, C39484c2.f103815a, c24030i.f62140d);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 4) || c24030i.f62141e != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 4, C39484c2.f103815a, c24030i.f62141e);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 5) || c24030i.f62142f != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 5, C39484c2.f103815a, c24030i.f62142f);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 6) || c24030i.f62143g != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 6, C39484c2.f103815a, c24030i.f62143g);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 7) || c24030i.f62144h != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 7, C24033j.C24034a.f62148a, c24030i.f62144h);
        }
    }

    @Nullable
    /* renamed from: a */
    public final String m47161a() {
        return this.f62137a;
    }

    @Nullable
    /* renamed from: c */
    public final String m47159c() {
        return this.f62138b;
    }

    @Nullable
    /* renamed from: d */
    public final C24033j m47158d() {
        return this.f62144h;
    }

    @Nullable
    /* renamed from: e */
    public final String m47157e() {
        return this.f62142f;
    }

    @Nullable
    /* renamed from: f */
    public final String m47156f() {
        return this.f62141e;
    }

    @Nullable
    /* renamed from: g */
    public final String m47155g() {
        return this.f62140d;
    }

    @Nullable
    /* renamed from: h */
    public final String m47154h() {
        return this.f62139c;
    }

    @Nullable
    /* renamed from: i */
    public final String m47153i() {
        return this.f62143g;
    }

    public /* synthetic */ C24030i(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C24033j c24033j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f62137a = null;
        } else {
            this.f62137a = str;
        }
        if ((i & 2) == 0) {
            this.f62138b = null;
        } else {
            this.f62138b = str2;
        }
        if ((i & 4) == 0) {
            this.f62139c = null;
        } else {
            this.f62139c = str3;
        }
        if ((i & 8) == 0) {
            this.f62140d = null;
        } else {
            this.f62140d = str4;
        }
        if ((i & 16) == 0) {
            this.f62141e = null;
        } else {
            this.f62141e = str5;
        }
        if ((i & 32) == 0) {
            this.f62142f = null;
        } else {
            this.f62142f = str6;
        }
        if ((i & 64) == 0) {
            this.f62143g = null;
        } else {
            this.f62143g = str7;
        }
        if ((i & 128) == 0) {
            this.f62144h = null;
        } else {
            this.f62144h = c24033j;
        }
    }

    public C24030i(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable C24033j c24033j) {
        this.f62137a = str;
        this.f62138b = str2;
        this.f62139c = str3;
        this.f62140d = str4;
        this.f62141e = str5;
        this.f62142f = str6;
        this.f62143g = str7;
        this.f62144h = c24033j;
    }

    public /* synthetic */ C24030i(String str, String str2, String str3, String str4, String str5, String str6, String str7, C24033j c24033j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? c24033j : null);
    }
}
