package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensions;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetCachedAsset.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GetCachedAsset {
    @NotNull
    private final CacheRepository cacheRepository;
    @NotNull
    private final Context context;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.cacheRepository = cacheRepository;
        this.context = context;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String m16599N0;
        m16599N0 = C37690r.m16599N0(String.valueOf(uri.getPath()), RemoteSettings.FORWARD_SLASH_STRING, null, 2, null);
        try {
            InputStream open = this.context.getAssets().open(m16599N0);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensions.guessMimeType(m16599N0), null, open);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        String m16591R0;
        String m16575Z0;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        m16591R0 = C37690r.m16591R0(uri2, RemoteSettings.FORWARD_SLASH_STRING, null, 2, null);
        m16575Z0 = C37690r.m16575Z0(m16591R0, ".", null, 2, null);
        CacheResult retrieveFile = this.cacheRepository.retrieveFile(m16575Z0);
        if (!(retrieveFile instanceof CacheResult.Success)) {
            return null;
        }
        CacheResult.Success success = (CacheResult.Success) retrieveFile;
        File file = success.getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        return new WebResourceResponse(StringExtensions.guessMimeType(file.getAbsolutePath() + '.' + success.getCachedFile().getExtension()), null, fileInputStream);
    }

    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return null;
    }
}
