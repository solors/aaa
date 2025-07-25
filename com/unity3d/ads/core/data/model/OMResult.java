package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OMResult.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class OMResult {

    /* compiled from: OMResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Failure extends OMResult {
        @NotNull
        private final String reason;
        @Nullable
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.reason;
        }

        @Nullable
        public final String component2() {
            return this.reasonDebug;
        }

        @NotNull
        public final Failure copy(@NotNull String reason, @Nullable String str) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(reason, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            if (Intrinsics.m17075f(this.reason, failure.reason) && Intrinsics.m17075f(this.reasonDebug, failure.reasonDebug)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String reason, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }
    }

    /* compiled from: OMResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Success extends OMResult {
        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
