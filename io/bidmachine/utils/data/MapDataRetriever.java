package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class MapDataRetriever<K> implements DataRetriever<K> {
    @NonNull
    private final DataConverter dataConverter;
    @NonNull
    private final Map<K, Object> params;

    public MapDataRetriever() {
        this(new ConcurrentHashMap(), new SmartDataConverter());
    }

    public void clear() {
        getParams().clear();
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public boolean contains(@NonNull K k) {
        return getParams().containsKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ boolean getBoolean(@NonNull Object obj) {
        return super.getBoolean(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Boolean getBooleanOrNull(@NonNull Object obj) {
        return super.getBooleanOrNull(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ double getDouble(@NonNull Object obj) {
        return super.getDouble(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Double getDoubleOrNull(@NonNull Object obj) {
        return super.getDoubleOrNull(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ float getFloat(@NonNull Object obj) {
        return super.getFloat(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Float getFloatOrNull(@NonNull Object obj) {
        return super.getFloatOrNull(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ int getInteger(@NonNull Object obj) {
        return super.getInteger(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Integer getIntegerOrNull(@NonNull Object obj) {
        return super.getIntegerOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public List<Object> getListOrNull(@NonNull K k) {
        return this.dataConverter.toListOrNull(getObjectOrNull(k, null));
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Map<Object, Object> getMapOrNull(@NonNull K k) {
        return this.dataConverter.toMapOrNull(getObjectOrNull(k, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getObjectOrNull(@NonNull Object obj) {
        return super.getObjectOrNull(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNull(@NonNull Object obj) throws Exception {
        return super.getOrNull(obj);
    }

    @NonNull
    public Map<K, Object> getParams() {
        return this.params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ String getStringOrNull(@NonNull Object obj) {
        return super.getStringOrNull(obj);
    }

    public void put(@NonNull K k, @NonNull Object obj) {
        getParams().put(k, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setParams(@Nullable Map<K, Object> map) {
        clear();
        if (map != 0) {
            getParams().putAll(map);
        }
    }

    public MapDataRetriever(@NonNull Map<K, Object> map, @NonNull DataConverter dataConverter) {
        this.params = map;
        this.dataConverter = dataConverter;
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public boolean getBoolean(@NonNull K k, boolean z) {
        return this.dataConverter.toBoolean(getObjectOrNull(k, Boolean.valueOf(z)), z);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Boolean getBooleanOrNull(@NonNull K k, @Nullable Boolean bool) {
        return this.dataConverter.toBooleanOrNull(getObjectOrNull(k, bool), bool);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public double getDouble(@NonNull K k, double d) {
        return this.dataConverter.toDouble(getObjectOrNull(k, Double.valueOf(d)), d);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Double getDoubleOrNull(@NonNull K k, @Nullable Double d) {
        return this.dataConverter.toDoubleOrNull(getObjectOrNull(k, d), d);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public float getFloat(@NonNull K k, float f) {
        return this.dataConverter.toFloat(getObjectOrNull(k, Float.valueOf(f)), f);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Float getFloatOrNull(@NonNull K k, @Nullable Float f) {
        return this.dataConverter.toFloatOrNull(getObjectOrNull(k, f), f);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public int getInteger(@NonNull K k, int i) {
        return this.dataConverter.toInteger(getObjectOrNull(k, Integer.valueOf(i)), i);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Integer getIntegerOrNull(@NonNull K k, @Nullable Integer num) {
        return this.dataConverter.toIntegerOrNull(getObjectOrNull(k, num), num);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Object getObjectOrNull(@NonNull K k, @Nullable Object obj) {
        return contains(k) ? getParams().get(k) : obj;
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public <T> T getOrNull(@NonNull K k, @Nullable T t) throws Exception {
        return (T) this.dataConverter.toOrNull(getObjectOrNull(k, t), t);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public String getStringOrNull(@NonNull K k, @Nullable String str) {
        return this.dataConverter.toStringOrNull(getObjectOrNull(k, str), str);
    }
}
