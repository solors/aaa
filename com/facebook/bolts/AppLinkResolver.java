package com.facebook.bolts;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppLinkResolver.kt */
@Metadata
/* loaded from: classes2.dex */
public interface AppLinkResolver {
    @NotNull
    Task<AppLink> getAppLinkFromUrlInBackground(@NotNull Uri uri);
}
