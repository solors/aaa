package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessTokenAppIdPair.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class AccessTokenAppIdPair implements Serializable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    @Nullable
    private final String accessTokenString;
    @NotNull
    private final String applicationId;

    /* compiled from: AccessTokenAppIdPair.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class SerializationProxyV1 implements Serializable {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = -2488473066578201069L;
        @Nullable
        private final String accessTokenString;
        @NotNull
        private final String appId;

        /* compiled from: AccessTokenAppIdPair.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SerializationProxyV1(@Nullable String str, @NotNull String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.accessTokenString = str;
            this.appId = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(@Nullable String str, @NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.accessTokenString = Utility.isNullOrEmpty(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        Utility utility = Utility.INSTANCE;
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (!Utility.areObjectsEqual(accessTokenAppIdPair.accessTokenString, this.accessTokenString) || !Utility.areObjectsEqual(accessTokenAppIdPair.applicationId, this.applicationId)) {
            return false;
        }
        return true;
    }

    @Nullable
    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.accessTokenString;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ this.applicationId.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(@NotNull AccessToken accessToken) {
        this(accessToken.getToken(), FacebookSdk.getApplicationId());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
