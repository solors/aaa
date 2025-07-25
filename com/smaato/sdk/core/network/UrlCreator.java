package com.smaato.sdk.core.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.util.Map;

/* loaded from: classes7.dex */
public final class UrlCreator {
    @NonNull
    private Uri applyParameters(@NonNull Uri uri, @NonNull Map<String, String> map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build();
    }

    @NonNull
    public String createUrl(@NonNull String str, @NonNull Map<String, String> map) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(map);
        return applyParameters(Uri.parse(str), map).toString();
    }

    @Nullable
    public String extractHostname(@NonNull String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for UrlCreator::extractHostname");
        return Uri.parse(str).getHost();
    }

    @Nullable
    public String extractScheme(@NonNull String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for UrlCreator::extractScheme");
        return Uri.parse(str).getScheme();
    }

    public boolean isInsecureScheme(@Nullable String str) {
        return "http".equalsIgnoreCase(str);
    }

    public boolean isSecureScheme(@Nullable String str) {
        return "https".equalsIgnoreCase(str);
    }

    public boolean isSupportedForNetworking(@NonNull String str) {
        String extractScheme = extractScheme(str);
        if (!isSecureScheme(extractScheme) && !isInsecureScheme(extractScheme)) {
            return false;
        }
        return true;
    }
}
