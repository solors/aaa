package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HeaderUtils {
    @Nullable
    public String extractHeaderMultiValue(@NonNull Map<String, List<String>> map, @NonNull String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        List<String> list = map.get(str);
        if (list != null) {
            return Joiner.join("", list);
        }
        return null;
    }

    @Nullable
    public String extractHeaderSingleValue(@NonNull Map<String, List<String>> map, @NonNull String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        List<String> list = map.get(str);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Nullable
    public List<String> extractHeaderValueList(@NonNull Map<String, List<String>> map, @NonNull String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        return map.get(str);
    }

    public boolean isChunkedTransferEncoding(@NonNull Map<String, List<String>> map) {
        List<String> list;
        Objects.requireNonNull(map);
        for (String str : map.keySet()) {
            if (HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) && (list = map.get(str)) != null) {
                for (String str2 : list) {
                    if ("chunked".equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
