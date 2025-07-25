package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import com.google.gson.annotations.SerializedName;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tournament.kt */
@Metadata
/* loaded from: classes3.dex */
public final class Tournament implements ShareModel {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("tournament_end_time")
    @Nullable
    public String endTime;
    @SerializedName("id")
    @NotNull
    public final String identifier;
    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD)
    @Nullable
    public final String payload;
    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_TITLE)
    @Nullable
    public final String title;

    /* compiled from: Tournament.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Builder implements ShareModelBuilder<Tournament, Builder> {
        @Nullable
        private String endTime;
        @Nullable
        private ZonedDateTime expiration;
        @NotNull
        private String identifier;
        @Nullable
        private String payload;
        @Nullable
        private String title;

        public Builder(@NotNull String identifier, @Nullable ZonedDateTime zonedDateTime, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
            this.expiration = zonedDateTime;
            this.title = str;
            this.payload = str2;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.identifier;
            }
            if ((i & 2) != 0) {
                zonedDateTime = builder.expiration;
            }
            if ((i & 4) != 0) {
                str2 = builder.title;
            }
            if ((i & 8) != 0) {
                str3 = builder.payload;
            }
            return builder.copy(str, zonedDateTime, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.identifier;
        }

        @Nullable
        public final ZonedDateTime component2() {
            return this.expiration;
        }

        @Nullable
        public final String component3() {
            return this.title;
        }

        @Nullable
        public final String component4() {
            return this.payload;
        }

        @NotNull
        public final Builder copy(@NotNull String identifier, @Nullable ZonedDateTime zonedDateTime, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new Builder(identifier, zonedDateTime, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (Intrinsics.m17075f(this.identifier, builder.identifier) && Intrinsics.m17075f(this.expiration, builder.expiration) && Intrinsics.m17075f(this.title, builder.title) && Intrinsics.m17075f(this.payload, builder.payload)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Builder expiration(@Nullable ZonedDateTime zonedDateTime) {
            DateTimeFormatter dateTimeFormatter;
            String format;
            setExpiration(zonedDateTime);
            if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
                dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
                format = zonedDateTime.format(dateTimeFormatter);
                setEndTime(format);
            }
            return this;
        }

        @Nullable
        public final String getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.identifier.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.expiration;
            int i = 0;
            if (zonedDateTime != null) {
                hashCode = zonedDateTime.hashCode();
            } else {
                hashCode = 0;
            }
            int i2 = (hashCode3 + hashCode) * 31;
            String str = this.title;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.payload;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i3 + i;
        }

        @NotNull
        public final Builder identifier(@NotNull String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            setIdentifier(identifier);
            return this;
        }

        @NotNull
        public final Builder payload(@Nullable String str) {
            setPayload(str);
            return this;
        }

        public final void setEndTime(@Nullable String str) {
            this.endTime = str;
        }

        public final void setExpiration(@Nullable ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
        }

        public final void setIdentifier(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.identifier = str;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public final Builder title(@Nullable String str) {
            setTitle(str);
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(identifier=" + this.identifier + ", expiration=" + this.expiration + ", title=" + ((Object) this.title) + ", payload=" + ((Object) this.payload) + ')';
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public Tournament build() {
            return new Tournament(this.identifier, this.endTime, this.title, this.payload);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable Tournament tournament) {
            Builder payload = tournament == null ? null : identifier(tournament.identifier).expiration(tournament.getExpiration()).title(tournament.title).payload(tournament.payload);
            return payload == null ? this : payload;
        }

        public /* synthetic */ Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : zonedDateTime, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    /* compiled from: Tournament.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<Tournament> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Tournament(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament[] newArray(int i) {
            return new Tournament[i];
        }
    }

    public Tournament(@NotNull String identifier, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.endTime = str;
        this.title = str2;
        this.payload = str3;
        setExpiration(str == null ? null : DateFormatter.INSTANCE.format$facebook_gamingservices_release(str));
    }

    private final void setExpiration(ZonedDateTime zonedDateTime) {
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
            dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            format = zonedDateTime.format(dateTimeFormatter);
            this.endTime = format;
            setExpiration(zonedDateTime);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final ZonedDateTime getExpiration() {
        String str = this.endTime;
        if (str == null) {
            return null;
        }
        return DateFormatter.INSTANCE.format$facebook_gamingservices_release(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.identifier);
        out.writeString(this.endTime);
        out.writeString(this.title);
        out.writeString(this.payload);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tournament(@NotNull Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
