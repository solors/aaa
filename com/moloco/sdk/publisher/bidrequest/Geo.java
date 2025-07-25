package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39163h;
import re.C39484c2;
import re.C39491e0;
import re.PluginExceptions;
import re.SerializationConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata
@InterfaceC39163h
/* loaded from: classes7.dex */
public final class Geo {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final String city;
    @Nullable
    private final String country;
    @Nullable
    private final Float latitude;
    @Nullable
    private final Float longitude;
    @Nullable
    private final String region;
    @Nullable
    private final String zipCode;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Geo> serializer() {
            return Geo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Geo(int i, String str, String str2, String str3, String str4, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptions.m12351a(i, 63, Geo$$serializer.INSTANCE.getDescriptor());
        }
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f;
        this.longitude = f2;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, String str, String str2, String str3, String str4, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geo.city;
        }
        if ((i & 2) != 0) {
            str2 = geo.country;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = geo.region;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = geo.zipCode;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            f = geo.latitude;
        }
        Float f3 = f;
        if ((i & 32) != 0) {
            f2 = geo.longitude;
        }
        return geo.copy(str, str5, str6, str7, f3, f2);
    }

    public static final /* synthetic */ void write$Self(Geo geo, InterfaceC37834d interfaceC37834d, SerialDescriptor serialDescriptor) {
        C39484c2 c39484c2 = C39484c2.f103815a;
        interfaceC37834d.mo6674G(serialDescriptor, 0, c39484c2, geo.city);
        interfaceC37834d.mo6674G(serialDescriptor, 1, c39484c2, geo.country);
        interfaceC37834d.mo6674G(serialDescriptor, 2, c39484c2, geo.region);
        interfaceC37834d.mo6674G(serialDescriptor, 3, c39484c2, geo.zipCode);
        C39491e0 c39491e0 = C39491e0.f103827a;
        interfaceC37834d.mo6674G(serialDescriptor, 4, c39491e0, geo.latitude);
        interfaceC37834d.mo6674G(serialDescriptor, 5, c39491e0, geo.longitude);
    }

    @Nullable
    public final String component1() {
        return this.city;
    }

    @Nullable
    public final String component2() {
        return this.country;
    }

    @Nullable
    public final String component3() {
        return this.region;
    }

    @Nullable
    public final String component4() {
        return this.zipCode;
    }

    @Nullable
    public final Float component5() {
        return this.latitude;
    }

    @Nullable
    public final Float component6() {
        return this.longitude;
    }

    @NotNull
    public final Geo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Float f, @Nullable Float f2) {
        return new Geo(str, str2, str3, str4, f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) obj;
        if (Intrinsics.m17075f(this.city, geo.city) && Intrinsics.m17075f(this.country, geo.country) && Intrinsics.m17075f(this.region, geo.region) && Intrinsics.m17075f(this.zipCode, geo.zipCode) && Intrinsics.m17075f(this.latitude, geo.latitude) && Intrinsics.m17075f(this.longitude, geo.longitude)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.city;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.country;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.region;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.zipCode;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Float f = this.latitude;
        if (f == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Float f2 = this.longitude;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return i6 + i;
    }

    @NotNull
    public String toString() {
        return "Geo(city=" + this.city + ", country=" + this.country + ", region=" + this.region + ", zipCode=" + this.zipCode + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public Geo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Float f, @Nullable Float f2) {
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f;
        this.longitude = f2;
    }
}
