package com.taurusx.tax.vast;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class VastTracker implements Serializable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("content")
    @Expose
    @NotNull

    /* renamed from: a */
    public final String f74364a;
    @SerializedName(Constants.MessagePayloadKeys.MESSAGE_TYPE)
    @Expose
    @NotNull

    /* renamed from: b */
    public final MessageType f74365b;
    @SerializedName("is_repeatable")
    @Expose

    /* renamed from: c */
    public final boolean f74366c;

    /* renamed from: d */
    public boolean f74367d;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        public final String f74368a;
        @NotNull

        /* renamed from: b */
        public MessageType f74369b;

        /* renamed from: c */
        public boolean f74370c;

        public Builder(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f74368a = content;
            this.f74369b = MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.f74368a;
            }
            return builder.copy(str);
        }

        @NotNull
        public final VastTracker build() {
            return new VastTracker(this.f74368a, this.f74369b, this.f74370c);
        }

        @NotNull
        public final Builder copy(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Builder) && Intrinsics.m17075f(this.f74368a, ((Builder) obj).f74368a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f74368a.hashCode();
        }

        @NotNull
        public final Builder isRepeatable(boolean z) {
            this.f74370c = z;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f74369b = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.f74368a + ')';
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public enum MessageType {
        TRACKING_URL,
        QUARTILE_EVENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MessageType[] valuesCustom() {
            MessageType[] valuesCustom = values();
            return (MessageType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public VastTracker(@NotNull String content, @NotNull MessageType messageType, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f74364a = content;
        this.f74365b = messageType;
        this.f74366c = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastTracker)) {
            return false;
        }
        VastTracker vastTracker = (VastTracker) obj;
        if (Intrinsics.m17075f(this.f74364a, vastTracker.f74364a) && this.f74365b == vastTracker.f74365b && this.f74366c == vastTracker.f74366c && this.f74367d == vastTracker.f74367d) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getContent() {
        return this.f74364a;
    }

    @NotNull
    public final MessageType getMessageType() {
        return this.f74365b;
    }

    public int hashCode() {
        return (((((this.f74364a.hashCode() * 31) + this.f74365b.hashCode()) * 31) + Boolean.hashCode(this.f74366c)) * 31) + Boolean.hashCode(this.f74367d);
    }

    public final boolean isRepeatable() {
        return this.f74366c;
    }

    public final boolean isTracked() {
        return this.f74367d;
    }

    public final void setTracked() {
        this.f74367d = true;
    }

    @NotNull
    public String toString() {
        return "VastTracker(content='" + this.f74364a + "', messageType=" + this.f74365b + ", isRepeatable=" + this.f74366c + ", isTracked=" + this.f74367d + ')';
    }
}
