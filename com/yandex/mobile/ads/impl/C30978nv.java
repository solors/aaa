package com.yandex.mobile.ads.impl;

import com.maticoo.sdk.utils.constant.KeyConstants;
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
/* renamed from: com.yandex.mobile.ads.impl.nv */
/* loaded from: classes8.dex */
public final class C30978nv {
    @NotNull
    public static final C30980b Companion = new C30980b(0);
    @NotNull

    /* renamed from: a */
    private final String f83142a;
    @NotNull

    /* renamed from: b */
    private final String f83143b;
    @NotNull

    /* renamed from: c */
    private final String f83144c;
    @NotNull

    /* renamed from: d */
    private final String f83145d;

    /* renamed from: com.yandex.mobile.ads.impl.nv$a */
    /* loaded from: classes8.dex */
    public static final class C30979a implements PluginHelperInterfaces<C30978nv> {
        @NotNull

        /* renamed from: a */
        public static final C30979a f83146a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f83147b;

        static {
            C30979a c30979a = new C30979a();
            f83146a = c30979a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", c30979a, 4);
            pluginGeneratedSerialDescriptor.m16036k("app_id", false);
            pluginGeneratedSerialDescriptor.m16036k("app_version", false);
            pluginGeneratedSerialDescriptor.m16036k("system", false);
            pluginGeneratedSerialDescriptor.m16036k(KeyConstants.Android.KEY_API_LEVEL, false);
            f83147b = pluginGeneratedSerialDescriptor;
        }

        private C30979a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{c39484c2, c39484c2, c39484c2, c39484c2};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83147b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            if (mo6678b.mo12471j()) {
                String mo12472i = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                String mo12472i2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
                String mo12472i3 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 2);
                str = mo12472i;
                str2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 3);
                str3 = mo12472i3;
                str4 = mo12472i2;
                i = 15;
            } else {
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v != 1) {
                                if (mo6663v != 2) {
                                    if (mo6663v == 3) {
                                        str6 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 3);
                                        i2 |= 8;
                                    } else {
                                        throw new C39175o(mo6663v);
                                    }
                                } else {
                                    str7 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 2);
                                    i2 |= 4;
                                }
                            } else {
                                str8 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 1);
                                i2 |= 2;
                            }
                        } else {
                            str5 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
                i = i2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new C30978nv(i, str, str4, str3, str2);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f83147b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            C30978nv value = (C30978nv) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83147b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            C30978nv.m31277a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nv$b */
    /* loaded from: classes8.dex */
    public static final class C30980b {
        private C30980b() {
        }

        @NotNull
        public final KSerializer<C30978nv> serializer() {
            return C30979a.f83146a;
        }

        public /* synthetic */ C30980b(int i) {
            this();
        }
    }

    public /* synthetic */ C30978nv(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptions.m12351a(i, 15, C30979a.f83146a.getDescriptor());
        }
        this.f83142a = str;
        this.f83143b = str2;
        this.f83144c = str3;
        this.f83145d = str4;
    }

    @NotNull
    /* renamed from: a */
    public final String m31278a() {
        return this.f83145d;
    }

    @NotNull
    /* renamed from: b */
    public final String m31276b() {
        return this.f83142a;
    }

    @NotNull
    /* renamed from: c */
    public final String m31275c() {
        return this.f83143b;
    }

    @NotNull
    /* renamed from: d */
    public final String m31274d() {
        return this.f83144c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30978nv)) {
            return false;
        }
        C30978nv c30978nv = (C30978nv) obj;
        if (Intrinsics.m17075f(this.f83142a, c30978nv.f83142a) && Intrinsics.m17075f(this.f83143b, c30978nv.f83143b) && Intrinsics.m17075f(this.f83144c, c30978nv.f83144c) && Intrinsics.m17075f(this.f83145d, c30978nv.f83145d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f83145d.hashCode() + C31014o3.m31189a(this.f83144c, C31014o3.m31189a(this.f83143b, this.f83142a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f83142a;
        String str2 = this.f83143b;
        String str3 = this.f83144c;
        String str4 = this.f83145d;
        return "DebugPanelAppData(appId=" + str + ", appVersion=" + str2 + ", system=" + str3 + ", androidApiLevel=" + str4 + ")";
    }

    public C30978nv(@NotNull String appId, @NotNull String appVersion, @NotNull String system, @NotNull String androidApiLevel) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        this.f83142a = appId;
        this.f83143b = appVersion;
        this.f83144c = system;
        this.f83145d = androidApiLevel;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m31277a(C30978nv c30978nv, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, c30978nv.f83142a);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 1, c30978nv.f83143b);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 2, c30978nv.f83144c);
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 3, c30978nv.f83145d);
    }
}
