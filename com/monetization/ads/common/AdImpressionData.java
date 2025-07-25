package com.monetization.ads.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
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
import re.C39484c2;
import re.PluginExceptions;
import re.PluginHelperInterfaces;

@Metadata
@InterfaceC39163h
/* loaded from: classes7.dex */
public final class AdImpressionData implements Parcelable {
    @NotNull

    /* renamed from: b */
    private final String f66077b;
    @NotNull
    public static final C25458b Companion = new C25458b(0);
    @NotNull
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new C25459c();

    /* renamed from: com.monetization.ads.common.AdImpressionData$a */
    /* loaded from: classes7.dex */
    public static final class C25457a implements PluginHelperInterfaces<AdImpressionData> {
        @NotNull

        /* renamed from: a */
        public static final C25457a f66078a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f66079b;

        static {
            C25457a c25457a = new C25457a();
            f66078a = c25457a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.common.AdImpressionData", c25457a, 1);
            pluginGeneratedSerialDescriptor.m16036k(Constants.MessagePayloadKeys.RAW_DATA, false);
            f66079b = pluginGeneratedSerialDescriptor;
        }

        private C25457a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C39484c2.f103815a};
        }

        @Override // p821oe.KSerializer
        public final Object deserialize(Decoding decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f66079b;
            InterfaceC37832c mo6678b = decoder.mo6678b(pluginGeneratedSerialDescriptor);
            int i = 1;
            if (mo6678b.mo12471j()) {
                str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
            } else {
                str = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int mo6663v = mo6678b.mo6663v(pluginGeneratedSerialDescriptor);
                    if (mo6663v != -1) {
                        if (mo6663v == 0) {
                            str = mo6678b.mo12472i(pluginGeneratedSerialDescriptor, 0);
                            i2 = 1;
                        } else {
                            throw new C39175o(mo6663v);
                        }
                    } else {
                        z = false;
                    }
                }
                i = i2;
            }
            mo6678b.mo6666c(pluginGeneratedSerialDescriptor);
            return new AdImpressionData(i, str);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f66079b;
        }

        @Override // p821oe.InterfaceC39165j
        public final void serialize(Encoding encoder, Object obj) {
            AdImpressionData value = (AdImpressionData) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f66079b;
            InterfaceC37834d mo6811b = encoder.mo6811b(pluginGeneratedSerialDescriptor);
            AdImpressionData.m44527a(value, mo6811b, pluginGeneratedSerialDescriptor);
            mo6811b.mo6810c(pluginGeneratedSerialDescriptor);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* renamed from: com.monetization.ads.common.AdImpressionData$b */
    /* loaded from: classes7.dex */
    public static final class C25458b {
        public /* synthetic */ C25458b(int i) {
            this();
        }

        @NotNull
        public final KSerializer<AdImpressionData> serializer() {
            return C25457a.f66078a;
        }

        private C25458b() {
        }
    }

    /* renamed from: com.monetization.ads.common.AdImpressionData$c */
    /* loaded from: classes7.dex */
    public static final class C25459c implements Parcelable.Creator<AdImpressionData> {
        @Override // android.os.Parcelable.Creator
        public final AdImpressionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdImpressionData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData[] newArray(int i) {
            return new AdImpressionData[i];
        }
    }

    public /* synthetic */ AdImpressionData(int i, String str) {
        if (1 != (i & 1)) {
            PluginExceptions.m12351a(i, 1, C25457a.f66078a.getDescriptor());
        }
        this.f66077b = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m44527a(AdImpressionData adImpressionData, InterfaceC37834d interfaceC37834d, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        interfaceC37834d.mo12449o(pluginGeneratedSerialDescriptor, 0, adImpressionData.f66077b);
    }

    @NotNull
    /* renamed from: c */
    public final String m44526c() {
        return this.f66077b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AdImpressionData) && Intrinsics.m17075f(this.f66077b, ((AdImpressionData) obj).f66077b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66077b.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.f66077b;
        return "AdImpressionData(rawData=" + str + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66077b);
    }

    public AdImpressionData(@NotNull String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f66077b = rawData;
    }
}
