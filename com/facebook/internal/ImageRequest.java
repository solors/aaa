package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageRequest.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ImageRequest {
    @NotNull
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String HEIGHT_PARAM = "height";
    @NotNull
    private static final String MIGRATION_PARAM = "migration_overrides";
    @NotNull
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    @NotNull
    private static final String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    @NotNull
    private static final String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;
    @Nullable
    private final Callback callback;
    @NotNull
    private final Object callerTag;
    @NotNull
    private final Context context;
    @NotNull
    private final Uri imageUri;

    /* compiled from: ImageRequest.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean allowCachedRedirects;
        @Nullable
        private Callback callback;
        @Nullable
        private Object callerTag;
        @NotNull
        private final Context context;
        @NotNull
        private final Uri imageUri;

        public Builder(@NotNull Context context, @NotNull Uri imageUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            this.context = context;
            this.imageUri = imageUri;
        }

        private final Context component1() {
            return this.context;
        }

        private final Uri component2() {
            return this.imageUri;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                context = builder.context;
            }
            if ((i & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context, uri);
        }

        @NotNull
        public final ImageRequest build() {
            Context context = this.context;
            Uri uri = this.imageUri;
            Callback callback = this.callback;
            boolean z = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new ImageRequest(context, uri, callback, z, obj, null);
        }

        @NotNull
        public final Builder copy(@NotNull Context context, @NotNull Uri imageUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            return new Builder(context, imageUri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (Intrinsics.m17075f(this.context, builder.context) && Intrinsics.m17075f(this.imageUri, builder.imageUri)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        @NotNull
        public final Builder setAllowCachedRedirects(boolean z) {
            this.allowCachedRedirects = z;
            return this;
        }

        @NotNull
        public final Builder setCallback(@Nullable Callback callback) {
            this.callback = callback;
            return this;
        }

        @NotNull
        public final Builder setCallerTag(@Nullable Object obj) {
            this.callerTag = obj;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface Callback {
        void onCompleted(@Nullable ImageResponse imageResponse);
    }

    /* compiled from: ImageRequest.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Uri getProfilePictureUri(@Nullable String str, int i, int i2) {
            return getProfilePictureUri(str, i, i2, "");
        }

        @NotNull
        public final Uri getProfilePictureUri(@Nullable String str, int i, int i2, @Nullable String str2) {
            Validate.notNullOrEmpty(str, "userId");
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if ((max == 0 && max2 == 0) ? false : true) {
                Uri.Builder buildUpon = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon();
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.US, ImageRequest.PATH, Arrays.copyOf(new Object[]{FacebookSdk.getGraphApiVersion(), str}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                Uri.Builder path = buildUpon.path(format);
                if (max2 != 0) {
                    path.appendQueryParameter("height", String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter("width", String.valueOf(max));
                }
                path.appendQueryParameter(ImageRequest.MIGRATION_PARAM, ImageRequest.MIGRATION_VALUE);
                if (!Utility.isNullOrEmpty(str2)) {
                    path.appendQueryParameter("access_token", str2);
                } else if (!Utility.isNullOrEmpty(FacebookSdk.getClientToken()) && !Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
                    path.appendQueryParameter("access_token", FacebookSdk.getApplicationId() + '|' + FacebookSdk.getClientToken());
                } else {
                    Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                }
                Uri build = path.build();
                Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }
    }

    public /* synthetic */ ImageRequest(Context context, Uri uri, Callback callback, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, callback, z, obj);
    }

    @NotNull
    public static final Uri getProfilePictureUri(@Nullable String str, int i, int i2) {
        return Companion.getProfilePictureUri(str, i, i2);
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    @Nullable
    public final Callback getCallback() {
        return this.callback;
    }

    @NotNull
    public final Object getCallerTag() {
        return this.callerTag;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }

    private ImageRequest(Context context, Uri uri, Callback callback, boolean z, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = callback;
        this.allowCachedRedirects = z;
        this.callerTag = obj;
    }

    @NotNull
    public static final Uri getProfilePictureUri(@Nullable String str, int i, int i2, @Nullable String str2) {
        return Companion.getProfilePictureUri(str, i, i2, str2);
    }
}
