package androidx.work;

import androidx.work.Data;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayCreatingInputMerger.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends InputMerger {
    private final Object concatenateArrayAndNonArray(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newArray, 0, length);
        Array.set(newArray, length, obj2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object concatenateArrays(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        Intrinsics.m17074g(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newArray, 0, length);
        System.arraycopy(obj2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object createArrayFor(Object obj, Class<?> cls) {
        Object newArray = Array.newInstance(cls, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    @Override // androidx.work.InputMerger
    @NotNull
    public Data merge(@NotNull List<Data> inputs) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Data.Builder builder = new Data.Builder();
        HashMap hashMap = new HashMap();
        for (Data data : inputs) {
            Map<String, Object> keyValueMap = data.getKeyValueMap();
            Intrinsics.checkNotNullExpressionValue(keyValueMap, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = createArrayFor(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.m17075f(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = concatenateArrays(obj, value);
                    } else if (Intrinsics.m17075f(cls2.getComponentType(), cls)) {
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        builder.putAll(hashMap);
        Data build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "output.build()");
        return build;
    }
}
