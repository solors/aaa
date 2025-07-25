package com.smaato.sdk.core.p568ad;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.smaato.sdk.core.ad.KeyValuePairs */
/* loaded from: classes7.dex */
public final class KeyValuePairs implements Cloneable {
    private static final String LOG_TAG = "KeyValuePairs";
    @NonNull
    private final Map<String, Set<String>> keyValuePairsMap = Collections.synchronizedMap(new LinkedHashMap(7));

    private boolean isKeyAndValueValid(@Nullable String str, @Nullable String... strArr) {
        if (TextUtils.isEmpty(str)) {
            Log.e(LOG_TAG, "key can not be null or empty.");
            return false;
        } else if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (TextUtils.isEmpty(str2)) {
                    Log.e(LOG_TAG, "value can not be null or empty.");
                    return false;
                }
            }
            return true;
        } else {
            Log.e(LOG_TAG, "values can not be null or empty.");
            return false;
        }
    }

    private void setNewValues(@NonNull String str, @NonNull String... strArr) {
        Objects.requireNonNull(strArr);
        int i = 7;
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        if (strArr.length > 7) {
            String[] strArr2 = new String[strArr.length - 7];
            System.arraycopy(strArr, 7, strArr2, 0, strArr.length - 7);
            Log.e(LOG_TAG, String.format("Amount of adding values (%s) exceeds maximal capacity (%s);\nSkipped values: %s", Integer.valueOf(strArr.length), 7, Joiner.join(", ", strArr2)));
        } else {
            i = strArr.length;
        }
        linkedHashSet.addAll(Arrays.asList(strArr).subList(0, i));
        this.keyValuePairsMap.put(str, Collections.synchronizedSet(linkedHashSet));
    }

    public void addTargetingValue(@NonNull String str, @NonNull String str2) {
        if (!isKeyAndValueValid(str, str2)) {
            return;
        }
        Set<String> set = this.keyValuePairsMap.get(str);
        if (set == null) {
            setNewValues(str, str2);
        } else if (set.size() >= 7) {
            Log.e(LOG_TAG, String.format("%s values limit has been reached.", str));
        } else if (!set.add(str2)) {
            Log.e(LOG_TAG, String.format("%s value is already presents for the %s key.", str2, str));
        }
    }

    @NonNull
    public Map<String, Set<String>> getAllKeyValuePairs() {
        Set<Map.Entry<String, Set<String>>> entrySet = this.keyValuePairsMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(entrySet.size());
        for (Map.Entry<String, Set<String>> entry : entrySet) {
            linkedHashMap.put(entry.getKey(), new LinkedHashSet(entry.getValue()));
        }
        return linkedHashMap;
    }

    public void removeAllKeyValuePairs() {
        this.keyValuePairsMap.clear();
    }

    public void removeKeyValuePair(@NonNull String str) {
        this.keyValuePairsMap.remove(str);
    }

    public void setTargetingValue(@NonNull String str, @NonNull String str2) {
        if (!isKeyAndValueValid(str, str2)) {
            return;
        }
        setNewValues(str, str2);
    }

    public void setTargetingValues(@NonNull String str, @NonNull String... strArr) {
        if (!isKeyAndValueValid(str, strArr)) {
            return;
        }
        setNewValues(str, strArr);
    }

    @NonNull
    /* renamed from: clone */
    public KeyValuePairs m110238clone() {
        KeyValuePairs keyValuePairs = new KeyValuePairs();
        synchronized (this.keyValuePairsMap) {
            for (Map.Entry<String, Set<String>> entry : this.keyValuePairsMap.entrySet()) {
                Set<String> value = entry.getValue();
                keyValuePairs.setNewValues(entry.getKey(), (String[]) value.toArray(new String[value.size()]));
            }
        }
        return keyValuePairs;
    }
}
