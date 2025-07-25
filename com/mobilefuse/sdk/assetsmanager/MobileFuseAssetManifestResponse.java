package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: MobileFuseAssetManifestResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseAssetManifestResponse {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Map<String, String> paths;

    /* compiled from: MobileFuseAssetManifestResponse.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, String> jsonToMap(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (keys.hasNext()) {
                String key = keys.next();
                String value = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                linkedHashMap.put(key, value);
            }
            return linkedHashMap;
        }

        @NotNull
        public final Either<BaseError, MobileFuseAssetManifestResponse> mapperFromJson(@NotNull String jsonText) {
            Either errorResult;
            Object value;
            Intrinsics.checkNotNullParameter(jsonText, "jsonText");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                errorResult = new SuccessResult(new SuccessResult(new MobileFuseAssetManifestResponse(MobileFuseAssetManifestResponse.Companion.jsonToMap(new JSONObject(jsonText)))));
            } catch (Throwable th) {
                if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                }
                errorResult = new ErrorResult(th);
            }
            if (errorResult instanceof ErrorResult) {
                value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
            } else if (errorResult instanceof SuccessResult) {
                value = ((SuccessResult) errorResult).getValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return (Either) value;
        }
    }

    public MobileFuseAssetManifestResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileFuseAssetManifestResponse copy$default(MobileFuseAssetManifestResponse mobileFuseAssetManifestResponse, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mobileFuseAssetManifestResponse.paths;
        }
        return mobileFuseAssetManifestResponse.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.paths;
    }

    @NotNull
    public final MobileFuseAssetManifestResponse copy(@NotNull Map<String, String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        return new MobileFuseAssetManifestResponse(paths);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof MobileFuseAssetManifestResponse) || !Intrinsics.m17075f(this.paths, ((MobileFuseAssetManifestResponse) obj).paths)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final Map<String, String> getPaths() {
        return this.paths;
    }

    public int hashCode() {
        Map<String, String> map = this.paths;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "MobileFuseAssetManifestResponse(paths=" + this.paths + ")";
    }

    public MobileFuseAssetManifestResponse(@NotNull Map<String, String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
    }

    public /* synthetic */ MobileFuseAssetManifestResponse(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C37559r0.m17284j() : map);
    }
}
