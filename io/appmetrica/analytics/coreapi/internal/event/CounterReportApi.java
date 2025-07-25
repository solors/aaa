package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    @NotNull
    Map<String, byte[]> getExtras();

    @Nullable
    String getName();

    int getType();

    @Nullable
    String getValue();

    @Nullable
    byte[] getValueBytes();

    void setBytesTruncated(int i);

    void setCustomType(int i);

    void setExtras(@NotNull Map<String, byte[]> map);

    void setName(@Nullable String str);

    void setType(int i);

    void setValue(@Nullable String str);

    void setValueBytes(@Nullable byte[] bArr);
}
