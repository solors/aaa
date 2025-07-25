package com.inmobi.sdk;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.inmobi.media.C18982Ja;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata
/* loaded from: classes6.dex */
public interface SdkInitializationListener {
    @NotNull
    public static final C18982Ja Companion = C18982Ja.f47386a;
    @NotNull
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    @NotNull
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    @NotNull
    public static final String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";
    @NotNull
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    @NotNull
    public static final String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";
    @NotNull
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    @UiThread
    void onInitializationComplete(@Nullable Error error);
}
