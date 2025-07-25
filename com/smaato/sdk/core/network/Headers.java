package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class Headers implements Iterable<Map.Entry<String, List<String>>> {

    /* loaded from: classes7.dex */
    public static class Builder {
        private final Map<String, List<String>> headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);

        Builder(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    this.headers.put(entry.getKey(), entry.getValue());
                }
            }
        }

        @NonNull
        public Headers build() {
            return new AutoValue_Headers(Collections.unmodifiableMap(this.headers));
        }

        @NonNull
        public Builder put(@NonNull String str, @NonNull String str2) {
            List<String> list = this.headers.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.headers.put(str, list);
            }
            list.add(str2);
            return this;
        }

        @NonNull
        Builder remove(@NonNull String str) {
            this.headers.remove(str);
            return this;
        }

        @NonNull
        Builder removeAll() {
            this.headers.clear();
            return this;
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder(Collections.emptyMap());
    }

    @NonNull
    public static Headers empty() {
        return new AutoValue_Headers(Collections.emptyMap());
    }

    @NonNull
    /* renamed from: of */
    public static Headers m39436of(@NonNull Map<String, List<String>> map) {
        return new Builder(map).build();
    }

    @NonNull
    public Builder buildUpon() {
        return new Builder(headers());
    }

    @NonNull
    public abstract Map<String, List<String>> headers();

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<String, List<String>>> iterator() {
        return headers().entrySet().iterator();
    }

    @NonNull
    public Set<String> names() {
        return headers().keySet();
    }

    public int size() {
        return headers().size();
    }

    @NonNull
    public List<String> values(@NonNull String str) {
        List<String> list = headers().get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }
}
