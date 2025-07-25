package io.bidmachine.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface ContentMetadata {
    public static final String KEY_CONTENT_LENGTH = "exo_len";
    public static final String KEY_CUSTOM_PREFIX = "custom_";
    public static final String KEY_REDIRECTED_URI = "exo_redir";

    static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get("exo_len", -1L);
    }

    @Nullable
    static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    boolean contains(String str);

    long get(String str, long j);

    @Nullable
    String get(String str, @Nullable String str2);

    @Nullable
    byte[] get(String str, @Nullable byte[] bArr);
}
