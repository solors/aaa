package com.inmobi.unification.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.C19214b5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Retention(RetentionPolicy.RUNTIME)
@Metadata
/* loaded from: classes6.dex */
public @interface InitializationStatus {
    @NotNull
    public static final C19214b5 Companion = C19214b5.f48100a;
    @NotNull
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    @NotNull
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    @NotNull
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    @NotNull
    public static final String SUCCESS = "Success";
    @NotNull
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
