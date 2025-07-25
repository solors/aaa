package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30420gw;
import com.yandex.mobile.ads.impl.C30749kv;
import com.yandex.mobile.ads.impl.C31842xu;
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
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@InterfaceC39163h
/* renamed from: com.yandex.mobile.ads.impl.hw */
/* loaded from: classes8.dex */
public final class C30508hw {
    @NotNull
    public static final C30510b Companion = new C30510b(0);
    @NotNull

    /* renamed from: h */
    private static final KSerializer<Object>[] f80215h = {null, null, null, null, new C39493f(C30749kv.C30750a.f81580a), new C39493f(C31842xu.C31843a.f87847a), new C39493f(C30420gw.C30421a.f79785a)};
    @Nullable

    /* renamed from: a */
    private final String f80216a;
    @Nullable

    /* renamed from: b */
    private final String f80217b;
    @Nullable

    /* renamed from: c */
    private final String f80218c;
    @Nullable

    /* renamed from: d */
    private final String f80219d;
    @Nullable

    /* renamed from: e */
    private final List<C30749kv> f80220e;
    @Nullable

    /* renamed from: f */
    private final List<C31842xu> f80221f;
    @NotNull

    /* renamed from: g */
    private final List<C30420gw> f80222g;

    /* renamed from: com.yandex.mobile.ads.impl.hw$a */
    /* loaded from: classes8.dex */
    public static final class C30509a implements PluginHelperInterfaces<C30508hw> {
        @NotNull

        /* renamed from: a */
        public static final C30509a f80223a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f80224b;

        static {
            C30509a c30509a = new C30509a();
            f80223a = c30509a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", c30509a, 7);
            pluginGeneratedSerialDescriptor.m16036k("page_id", true);
            pluginGeneratedSerialDescriptor.m16036k("latest_sdk_version", true);
            pluginGeneratedSerialDescriptor.m16036k("app_ads_txt_url", true);
            pluginGeneratedSerialDescriptor.m16036k("app_status", true);
            pluginGeneratedSerialDescriptor.m16036k("alerts", true);
            pluginGeneratedSerialDescriptor.m16036k("ad_units", true);
            pluginGeneratedSerialDescriptor.m16036k("mediation_networks", false);
            f80224b = pluginGeneratedSerialDescriptor;
        }

        private C30509a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = C30508hw.f80215h;
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(c39484c2), BuiltinSerializers.m13155t(kSerializerArr[4]), BuiltinSerializers.m13155t(kSerializerArr[5]), kSerializerArr[6]};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            int i;
            String str;
            String str2;
            List list;
            String str3;
            List list2;
            List list3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f80224b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = C30508hw.f80215h;
            int i2 = 3;
            String str5 = null;
            if (mo6678b.mo12471j()) {
                C39484c2 c39484c2 = C39484c2.f103815a;
                str3 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, c39484c2, null);
                list = (List) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], null);
                str2 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 3, c39484c2, null);
                list2 = (List) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], null);
                list3 = (List) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                str = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 0, c39484c2, null);
                str4 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 2, c39484c2, null);
                i = 127;
            } else {
                boolean z = true;
                int i3 = 0;
                List list4 = null;
                List list5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                List list6 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    switch (mo6663v) {
                        case -1:
                            z = false;
                            i2 = 3;
                            break;
                        case 0:
                            str5 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 0, C39484c2.f103815a, str5);
                            i3 |= 1;
                            i2 = 3;
                            break;
                        case 1:
                            str6 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, str6);
                            i3 |= 2;
                            i2 = 3;
                            break;
                        case 2:
                            str7 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 2, C39484c2.f103815a, str7);
                            i3 |= 4;
                            i2 = 3;
                            continue;
                        case 3:
                            str8 = (String) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, i2, C39484c2.f103815a, str8);
                            i3 |= 8;
                            break;
                        case 4:
                            list6 = (List) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list6);
                            i3 |= 16;
                            break;
                        case 5:
                            list5 = (List) mo6678b.mo12481H(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list5);
                            i3 |= 32;
                            break;
                        case 6:
                            list4 = (List) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list4);
                            i3 |= 64;
                            break;
                        default:
                            throw new C39175o(mo6663v);
                    }
                }
                i = i3;
                str = str5;
                str2 = str8;
                list = list4;
                str3 = str6;
                list2 = list6;
                String str9 = str7;
                list3 = list5;
                str4 = str9;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new C30508hw(i, str, str3, str4, str2, list2, list3, list);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f80224b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            C30508hw value = (C30508hw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f80224b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            C30508hw.m33456a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hw$b */
    /* loaded from: classes8.dex */
    public static final class C30510b {
        private C30510b() {
        }

        @NotNull
        public final KSerializer<C30508hw> serializer() {
            return C30509a.f80223a;
        }

        public /* synthetic */ C30510b(int i) {
            this();
        }
    }

    public /* synthetic */ C30508hw(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            PluginExceptions.m12351a(i, 64, C30509a.f80223a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f80216a = null;
        } else {
            this.f80216a = str;
        }
        if ((i & 2) == 0) {
            this.f80217b = null;
        } else {
            this.f80217b = str2;
        }
        if ((i & 4) == 0) {
            this.f80218c = null;
        } else {
            this.f80218c = str3;
        }
        if ((i & 8) == 0) {
            this.f80219d = null;
        } else {
            this.f80219d = str4;
        }
        if ((i & 16) == 0) {
            this.f80220e = null;
        } else {
            this.f80220e = list;
        }
        if ((i & 32) == 0) {
            this.f80221f = null;
        } else {
            this.f80221f = list2;
        }
        this.f80222g = list3;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m33456a(C30508hw c30508hw, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f80215h;
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 0) || c30508hw.f80216a != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 0, C39484c2.f103815a, c30508hw.f80216a);
        }
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 1) || c30508hw.f80217b != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 1, C39484c2.f103815a, c30508hw.f80217b);
        }
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 2) || c30508hw.f80218c != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 2, C39484c2.f103815a, c30508hw.f80218c);
        }
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 3) || c30508hw.f80219d != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 3, C39484c2.f103815a, c30508hw.f80219d);
        }
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 4) || c30508hw.f80220e != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], c30508hw.f80220e);
        }
        if (interfaceC37834d.mo6802p(pluginGeneratedSerialDescriptor, 5) || c30508hw.f80221f != null) {
            interfaceC37834d.mo6674G(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], c30508hw.f80221f);
        }
        interfaceC37834d.mo12462C(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], c30508hw.f80222g);
    }

    @Nullable
    /* renamed from: b */
    public final List<C31842xu> m33455b() {
        return this.f80221f;
    }

    @Nullable
    /* renamed from: c */
    public final List<C30749kv> m33454c() {
        return this.f80220e;
    }

    @Nullable
    /* renamed from: d */
    public final String m33453d() {
        return this.f80218c;
    }

    @Nullable
    /* renamed from: e */
    public final String m33452e() {
        return this.f80219d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30508hw)) {
            return false;
        }
        C30508hw c30508hw = (C30508hw) obj;
        if (Intrinsics.m17075f(this.f80216a, c30508hw.f80216a) && Intrinsics.m17075f(this.f80217b, c30508hw.f80217b) && Intrinsics.m17075f(this.f80218c, c30508hw.f80218c) && Intrinsics.m17075f(this.f80219d, c30508hw.f80219d) && Intrinsics.m17075f(this.f80220e, c30508hw.f80220e) && Intrinsics.m17075f(this.f80221f, c30508hw.f80221f) && Intrinsics.m17075f(this.f80222g, c30508hw.f80222g)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final List<C30420gw> m33451f() {
        return this.f80222g;
    }

    @Nullable
    /* renamed from: g */
    public final String m33450g() {
        return this.f80216a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f80216a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f80217b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f80218c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f80219d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<C30749kv> list = this.f80220e;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<C31842xu> list2 = this.f80221f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return this.f80222g.hashCode() + ((i6 + i) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f80216a;
        String str2 = this.f80217b;
        String str3 = this.f80218c;
        String str4 = this.f80219d;
        List<C30749kv> list = this.f80220e;
        List<C31842xu> list2 = this.f80221f;
        List<C30420gw> list3 = this.f80222g;
        return "DebugPanelRemoteData(pageId=" + str + ", latestSdkVersion=" + str2 + ", appAdsTxtUrl=" + str3 + ", appStatus=" + str4 + ", alerts=" + list + ", adUnits=" + list2 + ", mediationNetworks=" + list3 + ")";
    }
}
