package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheResult.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class CacheResult {

    /* compiled from: CacheResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Failure extends CacheResult {
        @NotNull
        private final CacheError error;
        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull CacheError error, @NotNull CacheSource source) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            return failure.copy(cacheError, cacheSource);
        }

        @NotNull
        public final CacheError component1() {
            return this.error;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @NotNull
        public final Failure copy(@NotNull CacheError error, @NotNull CacheSource source) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Failure(error, source);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            if (this.error == failure.error && this.source == failure.source) {
                return true;
            }
            return false;
        }

        @NotNull
        public final CacheError getError() {
            return this.error;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i & 2) != 0 ? CacheSource.LOCAL : cacheSource);
        }
    }

    /* compiled from: CacheResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Success extends CacheResult {
        @NotNull
        private final CachedFile cachedFile;
        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CachedFile cachedFile, @NotNull CacheSource source) {
            super(null);
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        @NotNull
        public final CachedFile component1() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @NotNull
        public final Success copy(@NotNull CachedFile cachedFile, @NotNull CacheSource source) {
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Success(cachedFile, source);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            if (Intrinsics.m17075f(this.cachedFile, success.cachedFile) && this.source == success.source) {
                return true;
            }
            return false;
        }

        @NotNull
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
