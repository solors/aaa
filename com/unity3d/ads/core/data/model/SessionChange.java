package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionChange.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class SessionChange {

    /* compiled from: SessionChange.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class PrivacyFsmChange extends SessionChange {
        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final PrivacyFsmChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new PrivacyFsmChange(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PrivacyFsmChange) && Intrinsics.m17075f(this.value, ((PrivacyFsmChange) obj).value)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* compiled from: SessionChange.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class UserConsentChange extends SessionChange {
        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final UserConsentChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new UserConsentChange(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof UserConsentChange) && Intrinsics.m17075f(this.value, ((UserConsentChange) obj).value)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
