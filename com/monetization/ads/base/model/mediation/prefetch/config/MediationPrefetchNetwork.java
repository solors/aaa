package com.monetization.ads.base.model.mediation.prefetch.config;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
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
import re.C39541s0;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@Metadata
@InterfaceC39163h
/* loaded from: classes7.dex */
public final class MediationPrefetchNetwork implements Parcelable {
    @NotNull

    /* renamed from: d */
    private static final KSerializer<Object>[] f66056d;
    @NotNull

    /* renamed from: b */
    private final String f66057b;
    @NotNull

    /* renamed from: c */
    private final Map<String, String> f66058c;
    @NotNull
    public static final C25447b Companion = new C25447b(0);
    @NotNull
    public static final Parcelable.Creator<MediationPrefetchNetwork> CREATOR = new C25448c();

    /* renamed from: com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork$a */
    /* loaded from: classes7.dex */
    public static final class C25446a implements PluginHelperInterfaces<MediationPrefetchNetwork> {
        @NotNull

        /* renamed from: a */
        public static final C25446a f66059a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f66060b;

        static {
            C25446a c25446a = new C25446a();
            f66059a = c25446a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", c25446a, 2);
            pluginGeneratedSerialDescriptor.m16036k("adapter", false);
            pluginGeneratedSerialDescriptor.m16036k("network_data", false);
            f66060b = pluginGeneratedSerialDescriptor;
        }

        private C25446a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C39484c2.f103815a, MediationPrefetchNetwork.f66056d[1]};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            int i;
            String str;
            Map map;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f66060b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = MediationPrefetchNetwork.f66056d;
            String str2 = null;
            if (mo6678b.mo12471j()) {
                str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                map = (Map) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                Map map2 = null;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v != 0) {
                            if (mo6663v == 1) {
                                map2 = (Map) mo6678b.mo6843B(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], map2);
                                i2 |= 2;
                            } else {
                                throw new C39175o(mo6663v);
                            }
                        } else {
                            str2 = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                i = i2;
                str = str2;
                map = map2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new MediationPrefetchNetwork(i, str, map);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f66060b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            MediationPrefetchNetwork value = (MediationPrefetchNetwork) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f66060b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            MediationPrefetchNetwork.m44547a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork$b */
    /* loaded from: classes7.dex */
    public static final class C25447b {
        public /* synthetic */ C25447b(int i) {
            this();
        }

        @NotNull
        public final KSerializer<MediationPrefetchNetwork> serializer() {
            return C25446a.f66059a;
        }

        private C25447b() {
        }
    }

    /* renamed from: com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork$c */
    /* loaded from: classes7.dex */
    public static final class C25448c implements Parcelable.Creator<MediationPrefetchNetwork> {
        @Override // android.os.Parcelable.Creator
        public final MediationPrefetchNetwork createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MediationPrefetchNetwork(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationPrefetchNetwork[] newArray(int i) {
            return new MediationPrefetchNetwork[i];
        }
    }

    static {
        C39484c2 c39484c2 = C39484c2.f103815a;
        f66056d = new KSerializer[]{null, new C39541s0(c39484c2, BuiltinSerializers.m13155t(c39484c2))};
    }

    public /* synthetic */ MediationPrefetchNetwork(int i, String str, Map map) {
        if (3 != (i & 3)) {
            PluginExceptions.m12351a(i, 3, C25446a.f66059a.getDescriptor());
        }
        this.f66057b = str;
        this.f66058c = map;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m44547a(MediationPrefetchNetwork mediationPrefetchNetwork, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f66056d;
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, mediationPrefetchNetwork.f66057b);
        interfaceC37834d.mo12462C(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], mediationPrefetchNetwork.f66058c);
    }

    @NotNull
    /* renamed from: d */
    public final String m44545d() {
        return this.f66057b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* renamed from: e */
    public final Map<String, String> m44544e() {
        return this.f66058c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediationPrefetchNetwork)) {
            return false;
        }
        MediationPrefetchNetwork mediationPrefetchNetwork = (MediationPrefetchNetwork) obj;
        if (Intrinsics.m17075f(this.f66057b, mediationPrefetchNetwork.f66057b) && Intrinsics.m17075f(this.f66058c, mediationPrefetchNetwork.f66058c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66058c.hashCode() + (this.f66057b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f66057b;
        Map<String, String> map = this.f66058c;
        return "MediationPrefetchNetwork(adapter=" + str + ", networkData=" + map + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66057b);
        Map<String, String> map = this.f66058c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public MediationPrefetchNetwork(@NotNull String adapter, @NotNull LinkedHashMap networkData) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.f66057b = adapter;
        this.f66058c = networkData;
    }
}
