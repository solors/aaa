package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlayAdError {
    @NotNull
    public static final C28696a Companion = new C28696a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_IS_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;
    @Nullable

    /* renamed from: a */
    private final IronSourceError f74477a;
    @Nullable

    /* renamed from: b */
    private final String f74478b;

    @Metadata
    /* renamed from: com.unity3d.mediation.LevelPlayAdError$a */
    /* loaded from: classes7.dex */
    public static final class C28696a {
        private C28696a() {
        }

        public /* synthetic */ C28696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LevelPlayAdError(@Nullable IronSourceError ironSourceError, @Nullable String str) {
        this.f74477a = ironSourceError;
        this.f74478b = str;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f74478b;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f74477a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @NotNull
    public final String getErrorMessage() {
        String str;
        IronSourceError ironSourceError = this.f74477a;
        if (ironSourceError != null) {
            str = ironSourceError.getErrorMessage();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adUnitId: ");
        sb2.append(this.f74478b);
        sb2.append(' ');
        IronSourceError ironSourceError = this.f74477a;
        if (ironSourceError != null) {
            str = ironSourceError.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@NotNull String adUnitId, int i, @NotNull String errorMessage) {
        this(new IronSourceError(i, errorMessage), adUnitId);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
