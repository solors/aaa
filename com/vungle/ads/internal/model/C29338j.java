package com.vungle.ads.internal.model;

import com.vungle.ads.internal.Constants;
import kotlin.Metadata;
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
import re.C39500h;
import re.PluginExceptions;
import re.PluginHelperInterfaces;
import re.SerializationConstructorMarker;

/* compiled from: ConfigPayload.kt */
@Metadata
@InterfaceC39163h
/* renamed from: com.vungle.ads.internal.model.j */
/* loaded from: classes7.dex */
public final class C29338j {
    @NotNull
    public static final C29340b Companion = new C29340b(null);
    private final boolean headerBidding;
    @NotNull
    private final String referenceId;
    @Nullable
    private final String type;
    @Nullable
    private Long wakeupTime;

    /* compiled from: ConfigPayload.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.model.j$a */
    /* loaded from: classes7.dex */
    public static final class C29339a implements PluginHelperInterfaces<C29338j> {
        @NotNull
        public static final C29339a INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;

        static {
            C29339a c29339a = new C29339a();
            INSTANCE = c29339a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", c29339a, 3);
            pluginGeneratedSerialDescriptor.m16036k("placement_ref_id", false);
            pluginGeneratedSerialDescriptor.m16036k("is_hb", true);
            pluginGeneratedSerialDescriptor.m16036k("type", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C29339a() {
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            C39484c2 c39484c2 = C39484c2.f103815a;
            return new KSerializer[]{c39484c2, C39500h.f103846a, BuiltinSerializers.m13155t(c39484c2)};
        }

        @Override // p821oe.KSerializer
        @NotNull
        public C29338j deserialize(@NotNull Decoding decoder) {
            boolean z;
            int i;
            String str;
            Object obj;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor2 = getDescriptor();
            InterfaceC37832c mo6678b = decoder.mo6678b(descriptor2);
            if (mo6678b.mo12471j()) {
                String mo12472i = mo6678b.mo12472i(descriptor2, 0);
                boolean mo12484C = mo6678b.mo12484C(descriptor2, 1);
                obj = mo6678b.mo12481H(descriptor2, 2, C39484c2.f103815a, null);
                str = mo12472i;
                z = mo12484C;
                i = 7;
            } else {
                boolean z2 = true;
                boolean z3 = false;
                String str2 = null;
                Object obj2 = null;
                int i2 = 0;
                while (z2) {
                    int mo6663v = mo6678b.mo6663v(descriptor2);
                    if (mo6663v == -1) {
                        z2 = false;
                    } else if (mo6663v == 0) {
                        str2 = mo6678b.mo12472i(descriptor2, 0);
                        i2 |= 1;
                    } else if (mo6663v == 1) {
                        z3 = mo6678b.mo12484C(descriptor2, 1);
                        i2 |= 2;
                    } else if (mo6663v != 2) {
                        throw new C39175o(mo6663v);
                    } else {
                        obj2 = mo6678b.mo12481H(descriptor2, 2, C39484c2.f103815a, obj2);
                        i2 |= 4;
                    }
                }
                z = z3;
                i = i2;
                str = str2;
                obj = obj2;
            }
            mo6678b.mo6666c(descriptor2);
            return new C29338j(i, str, z, (String) obj, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // p821oe.InterfaceC39165j
        public void serialize(@NotNull Encoding encoder, @NotNull C29338j value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor2 = getDescriptor();
            InterfaceC37834d mo6811b = encoder.mo6811b(descriptor2);
            C29338j.write$Self(value, mo6811b, descriptor2);
            mo6811b.mo6810c(descriptor2);
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.model.j$b */
    /* loaded from: classes7.dex */
    public static final class C29340b {
        private C29340b() {
        }

        public /* synthetic */ C29340b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<C29338j> serializer() {
            return C29339a.INSTANCE;
        }
    }

    public /* synthetic */ C29338j(int i, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.m12351a(i, 1, C29339a.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ C29338j copy$default(C29338j c29338j, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c29338j.referenceId;
        }
        if ((i & 2) != 0) {
            z = c29338j.headerBidding;
        }
        if ((i & 4) != 0) {
            str2 = c29338j.type;
        }
        return c29338j.copy(str, z, str2);
    }

    public static final void write$Self(@NotNull C29338j self, @NotNull InterfaceC37834d output, @NotNull SerialDescriptor serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo12449o(serialDesc, 0, self.referenceId);
        if (output.mo6802p(serialDesc, 1) || self.headerBidding) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12450n(serialDesc, 1, self.headerBidding);
        }
        if (output.mo6802p(serialDesc, 2) || self.type != null) {
            z2 = true;
        }
        if (z2) {
            output.mo6674G(serialDesc, 2, C39484c2.f103815a, self.type);
        }
    }

    @NotNull
    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final C29338j copy(@NotNull String referenceId, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        return new C29338j(referenceId, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29338j)) {
            return false;
        }
        C29338j c29338j = (C29338j) obj;
        if (Intrinsics.m17075f(this.referenceId, c29338j.referenceId) && this.headerBidding == c29338j.headerBidding && Intrinsics.m17075f(this.type, c29338j.type)) {
            return true;
        }
        return false;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    @NotNull
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.referenceId.hashCode() * 31;
        boolean z = this.headerBidding;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    public final boolean isAppOpen() {
        return Intrinsics.m17075f(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return Intrinsics.m17075f(this.type, "banner");
    }

    public final boolean isInline() {
        return Intrinsics.m17075f(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return Intrinsics.m17075f(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return Intrinsics.m17075f(this.type, "mrec");
    }

    public final boolean isNative() {
        return Intrinsics.m17075f(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return Intrinsics.m17075f(this.type, "rewarded");
    }

    public final void setWakeupTime(@Nullable Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long j) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j * 1000));
    }

    @NotNull
    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public C29338j(@NotNull String referenceId, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z;
        this.type = str;
    }

    public /* synthetic */ C29338j(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
