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
import re.C39556x0;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* loaded from: classes8.dex */
public final class oy0 {
    @NotNull
    public static final C31076b Companion = new C31076b(0);

    /* renamed from: a */
    private final long f83655a;
    @NotNull

    /* renamed from: b */
    private final String f83656b;
    @NotNull

    /* renamed from: c */
    private final String f83657c;
    @NotNull

    /* renamed from: d */
    private final String f83658d;

    /* renamed from: com.yandex.mobile.ads.impl.oy0$a */
    /* loaded from: classes8.dex */
    public static final class C31075a implements PluginHelperInterfaces<oy0> {
        @NotNull

        /* renamed from: a */
        public static final C31075a f83659a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f83660b;

        static {
            C31075a c31075a = new C31075a();
            f83659a = c31075a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", c31075a, 4);
            pluginGeneratedSerialDescriptor.m16036k("timestamp", false);
            pluginGeneratedSerialDescriptor.m16036k("type", false);
            pluginGeneratedSerialDescriptor.m16036k("tag", false);
            pluginGeneratedSerialDescriptor.m16036k("text", false);
            f83660b = pluginGeneratedSerialDescriptor;
        }

        private C31075a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{C39556x0.f103929a, c39484c2, c39484c2, c39484c2};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            String str;
            String str2;
            String str3;
            int i;
            long j;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83660b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            if (mo6678b.mo12471j()) {
                long mo12474e = mo6678b.mo12474e(pluginGeneratedSerialDescriptor, 0);
                String mo12472i = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
                String mo12472i2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 2);
                str = mo12472i;
                str2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 3);
                str3 = mo12472i2;
                i = 15;
                j = mo12474e;
            } else {
                String str4 = null;
                boolean z = true;
                int i2 = 0;
                long j2 = 0;
                String str5 = null;
                String str6 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v != 2) {
                                    if (mo6663v == 3) {
                                        str5 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 3);
                                        i2 |= 8;
                                    } else {
                                        throw new C39175o(mo6663v);
                                    }
                                } else {
                                    str6 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 2);
                                    i2 |= 4;
                                }
                            } else {
                                str4 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
                                i2 |= 2;
                            }
                        } else {
                            j2 = mo6678b.mo12474e(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                str = str4;
                str2 = str5;
                str3 = str6;
                i = i2;
                j = j2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new oy0(i, j, str, str3, str2);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f83660b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            oy0 value = (oy0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83660b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            oy0.m30863a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oy0$b */
    /* loaded from: classes8.dex */
    public static final class C31076b {
        private C31076b() {
        }

        @NotNull
        public final KSerializer<oy0> serializer() {
            return C31075a.f83659a;
        }

        public /* synthetic */ C31076b(int i) {
            this();
        }
    }

    public /* synthetic */ oy0(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptions.m12351a(i, 15, C31075a.f83659a.getDescriptor());
        }
        this.f83655a = j;
        this.f83656b = str;
        this.f83657c = str2;
        this.f83658d = str3;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30863a(oy0 oy0Var, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12447t(pluginGeneratedSerialDescriptor, 0, oy0Var.f83655a);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 1, oy0Var.f83656b);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 2, oy0Var.f83657c);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 3, oy0Var.f83658d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy0)) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        if (this.f83655a == oy0Var.f83655a && Intrinsics.m17075f(this.f83656b, oy0Var.f83656b) && Intrinsics.m17075f(this.f83657c, oy0Var.f83657c) && Intrinsics.m17075f(this.f83658d, oy0Var.f83658d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f83658d.hashCode() + C31014o3.m31189a(this.f83657c, C31014o3.m31189a(this.f83656b, Long.hashCode(this.f83655a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        long j = this.f83655a;
        String str = this.f83656b;
        String str2 = this.f83657c;
        String str3 = this.f83658d;
        return "MobileAdsSdkLog(timestamp=" + j + ", type=" + str + ", tag=" + str2 + ", text=" + str3 + ")";
    }

    public oy0(long j, @NotNull String type, @NotNull String tag, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f83655a = j;
        this.f83656b = type;
        this.f83657c = tag;
        this.f83658d = text;
    }
}
