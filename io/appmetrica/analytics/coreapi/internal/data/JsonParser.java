package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes9.dex */
public interface JsonParser<T> extends Parser<JSONObject, T> {

    @Metadata
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        @Nullable
        public static <T> T parseOrNull(@NotNull JsonParser<? extends T> jsonParser, @NotNull JSONObject jSONObject) {
            return (T) Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}
