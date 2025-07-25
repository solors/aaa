package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C24043m;
import com.moloco.sdk.internal.ortb.model.C24049o;
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
/* renamed from: com.moloco.sdk.internal.ortb.model.c */
/* loaded from: classes7.dex */
public final class C24016c {
    @NotNull
    public static final C24018b Companion = new C24018b(null);
    @Nullable

    /* renamed from: a */
    public final C24043m f62107a;
    @Nullable

    /* renamed from: b */
    public final String f62108b;
    @Nullable

    /* renamed from: c */
    public final C24049o f62109c;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.ortb.model.c$a */
    /* loaded from: classes7.dex */
    public static final class C24017a implements PluginHelperInterfaces<C24016c> {
        @NotNull

        /* renamed from: a */
        public static final C24017a f62110a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f62111b;

        static {
            C24017a c24017a = new C24017a();
            f62110a = c24017a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.BidExt", c24017a, 3);
            pluginGeneratedSerialDescriptor.m16036k("player", true);
            pluginGeneratedSerialDescriptor.m16036k("mtid", true);
            pluginGeneratedSerialDescriptor.m16036k("moloco_sdk_events", true);
            f62111b = pluginGeneratedSerialDescriptor;
        }

        @Override // p821oe.KSerializer
        @NotNull
        /* renamed from: a */
        public C24016c deserialize(@NotNull Decoding decoder) {
            Object obj;
            Object obj2;
            int i;
            Object obj3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37832c mo6678b = decoder.mo6678b(descriptor);
            Object obj4 = null;
            if (mo6678b.mo12471j()) {
                obj3 = mo6678b.mo12481H(descriptor, 0, C24043m.C24044a.f62179a, null);
                obj = mo6678b.mo12481H(descriptor, 1, C39484c2.f103815a, null);
                obj2 = mo6678b.mo12481H(descriptor, 2, C24049o.C24050a.f62197a, null);
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                Object obj5 = null;
                Object obj6 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(descriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v == 2) {
                                    obj6 = mo6678b.mo12481H(descriptor, 2, C24049o.C24050a.f62197a, obj6);
                                    i2 |= 4;
                                } else {
                                    throw new C39175o(mo6663v);
                                }
                            } else {
                                obj5 = mo6678b.mo12481H(descriptor, 1, C39484c2.f103815a, obj5);
                                i2 |= 2;
                            }
                        } else {
                            obj4 = mo6678b.mo12481H(descriptor, 0, C24043m.C24044a.f62179a, obj4);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                obj = obj5;
                obj2 = obj6;
                Object obj7 = obj4;
                i = i2;
                obj3 = obj7;
            }
            mo6678b.mo6666c(descriptor);
            return new C24016c(i, (C24043m) obj3, (String) obj, (C24049o) obj2, (SerializationConstructorMarker) null);
        }

        @Override // p821oe.InterfaceC39165j
        /* renamed from: b */
        public void serialize(@NotNull Encoding encoder, @NotNull C24016c value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC37834d mo6811b = encoder.mo6811b(descriptor);
            C24016c.m47194b(value, mo6811b, descriptor);
            mo6811b.mo6810c(descriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializers.m13155t(C24043m.C24044a.f62179a), BuiltinSerializers.m13155t(C39484c2.f103815a), BuiltinSerializers.m13155t(C24049o.C24050a.f62197a)};
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f62111b;
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.c$b */
    /* loaded from: classes7.dex */
    public static final class C24018b {
        public /* synthetic */ C24018b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<C24016c> serializer() {
            return C24017a.f62110a;
        }

        public C24018b() {
        }
    }

    public C24016c() {
        this((C24043m) null, (String) null, (C24049o) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m47194b(C24016c c24016c, InterfaceC37834d interfaceC37834d, SerialDescriptor serialDescriptor) {
        if (interfaceC37834d.mo6802p(serialDescriptor, 0) || c24016c.f62107a != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 0, C24043m.C24044a.f62179a, c24016c.f62107a);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 1) || c24016c.f62108b != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 1, C39484c2.f103815a, c24016c.f62108b);
        }
        if (interfaceC37834d.mo6802p(serialDescriptor, 2) || c24016c.f62109c != null) {
            interfaceC37834d.mo6674G(serialDescriptor, 2, C24049o.C24050a.f62197a, c24016c.f62109c);
        }
    }

    @Nullable
    /* renamed from: a */
    public final String m47195a() {
        return this.f62108b;
    }

    @Nullable
    /* renamed from: c */
    public final C24043m m47193c() {
        return this.f62107a;
    }

    @Nullable
    /* renamed from: d */
    public final C24049o m47192d() {
        return this.f62109c;
    }

    public /* synthetic */ C24016c(int i, C24043m c24043m, String str, C24049o c24049o, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f62107a = null;
        } else {
            this.f62107a = c24043m;
        }
        if ((i & 2) == 0) {
            this.f62108b = null;
        } else {
            this.f62108b = str;
        }
        if ((i & 4) == 0) {
            this.f62109c = null;
        } else {
            this.f62109c = c24049o;
        }
    }

    public C24016c(@Nullable C24043m c24043m, @Nullable String str, @Nullable C24049o c24049o) {
        this.f62107a = c24043m;
        this.f62108b = str;
        this.f62109c = c24049o;
    }

    public /* synthetic */ C24016c(C24043m c24043m, String str, C24049o c24049o, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c24043m, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : c24049o);
    }
}
