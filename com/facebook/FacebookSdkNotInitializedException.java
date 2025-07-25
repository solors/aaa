package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FacebookSdkNotInitializedException.kt */
@Metadata
/* loaded from: classes3.dex */
public final class FacebookSdkNotInitializedException extends FacebookException {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookSdkNotInitializedException.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookSdkNotInitializedException() {
    }

    public FacebookSdkNotInitializedException(@Nullable String str) {
        super(str);
    }

    public FacebookSdkNotInitializedException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookSdkNotInitializedException(@Nullable Throwable th) {
        super(th);
    }
}
