package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface DataRetriever<K> {
    boolean contains(@NonNull K k);

    default boolean getBoolean(@NonNull K k) {
        return getBoolean(k, false);
    }

    boolean getBoolean(@NonNull K k, boolean z);

    @Nullable
    default Boolean getBooleanOrNull(@NonNull K k) {
        return getBooleanOrNull(k, Boolean.FALSE);
    }

    @Nullable
    Boolean getBooleanOrNull(@NonNull K k, @Nullable Boolean bool);

    default double getDouble(@NonNull K k) {
        return getDouble(k, 0.0d);
    }

    double getDouble(@NonNull K k, double d);

    @Nullable
    default Double getDoubleOrNull(@NonNull K k) {
        return getDoubleOrNull(k, null);
    }

    @Nullable
    Double getDoubleOrNull(@NonNull K k, @Nullable Double d);

    default float getFloat(@NonNull K k) {
        return getFloat(k, 0.0f);
    }

    float getFloat(@NonNull K k, float f);

    @Nullable
    default Float getFloatOrNull(@NonNull K k) {
        return getFloatOrNull(k, null);
    }

    @Nullable
    Float getFloatOrNull(@NonNull K k, @Nullable Float f);

    default int getInteger(@NonNull K k) {
        return getInteger(k, 0);
    }

    int getInteger(@NonNull K k, int i);

    @Nullable
    default Integer getIntegerOrNull(@NonNull K k) {
        return getIntegerOrNull(k, null);
    }

    @Nullable
    Integer getIntegerOrNull(@NonNull K k, @Nullable Integer num);

    @Nullable
    List<Object> getListOrNull(@NonNull K k);

    @Nullable
    Map<Object, Object> getMapOrNull(@NonNull K k);

    @Nullable
    default Object getObjectOrNull(@NonNull K k) {
        return getObjectOrNull(k, null);
    }

    @Nullable
    Object getObjectOrNull(@NonNull K k, @Nullable Object obj);

    @Nullable
    default <T> T getOrNull(@NonNull K k) throws Exception {
        return (T) getOrNull(k, null);
    }

    @Nullable
    <T> T getOrNull(@NonNull K k, @Nullable T t) throws Exception;

    @Nullable
    default String getStringOrNull(@NonNull K k) {
        return getStringOrNull(k, null);
    }

    @Nullable
    String getStringOrNull(@NonNull K k, @Nullable String str);
}
