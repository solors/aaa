package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class CustomKeysAndValues {

    /* renamed from: a */
    final Map<String, String> f42249a;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        private Map<String, String> f42250a = new HashMap();

        @NonNull
        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z) {
            this.f42250a.put(str, Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d) {
            this.f42250a.put(str, Double.toString(d));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f) {
            this.f42250a.put(str, Float.toString(f));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i) {
            this.f42250a.put(str, Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j) {
            this.f42250a.put(str, Long.toString(j));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @NonNull String str2) {
            this.f42250a.put(str, str2);
            return this;
        }
    }

    CustomKeysAndValues(@NonNull Builder builder) {
        this.f42249a = builder.f42250a;
    }
}
