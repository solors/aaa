package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class StackTraceItem {

    /* renamed from: a */
    private final String f95925a;

    /* renamed from: b */
    private final String f95926b;

    /* renamed from: c */
    private final Integer f95927c;

    /* renamed from: d */
    private final Integer f95928d;

    /* renamed from: e */
    private final String f95929e;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private String f95930a;

        /* renamed from: b */
        private String f95931b;

        /* renamed from: c */
        private Integer f95932c;

        /* renamed from: d */
        private Integer f95933d;

        /* renamed from: e */
        private String f95934e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f95930a, this.f95931b, this.f95932c, this.f95933d, this.f95934e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f95930a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f95933d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f95931b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f95932c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f95934e = str;
            return this;
        }
    }

    /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i) {
        this(str, str2, num, num2, str3);
    }

    @Nullable
    public String getClassName() {
        return this.f95925a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f95928d;
    }

    @Nullable
    public String getFileName() {
        return this.f95926b;
    }

    @Nullable
    public Integer getLine() {
        return this.f95927c;
    }

    @Nullable
    public String getMethodName() {
        return this.f95929e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f95925a = str;
        this.f95926b = str2;
        this.f95927c = num;
        this.f95928d = num2;
        this.f95929e = str3;
    }
}
