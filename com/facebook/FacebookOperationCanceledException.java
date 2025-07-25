package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FacebookOperationCanceledException.kt */
@Metadata
/* loaded from: classes3.dex */
public final class FacebookOperationCanceledException extends FacebookException {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookOperationCanceledException.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(@Nullable String str) {
        super(str);
    }

    public FacebookOperationCanceledException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookOperationCanceledException(@Nullable Throwable th) {
        super(th);
    }
}
