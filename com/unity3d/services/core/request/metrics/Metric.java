package com.unity3d.services.core.request.metrics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Metric.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Metric {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String METRIC_NAME = "n";
    @NotNull
    private static final String METRIC_TAGS = "t";
    @NotNull
    private static final String METRIC_VALUE = "v";
    @Nullable
    private final String name;
    @NotNull
    private final Map<String, String> tags;
    @Nullable
    private final Object value;

    /* compiled from: Metric.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Metric(@Nullable String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = metric.name;
        }
        if ((i & 2) != 0) {
            obj = metric.value;
        }
        if ((i & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final Object component2() {
        return this.value;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.tags;
    }

    @NotNull
    public final Metric copy(@Nullable String str, @Nullable Object obj, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        if (Intrinsics.m17075f(this.name, metric.name) && Intrinsics.m17075f(this.value, metric.value) && Intrinsics.m17075f(this.tags, metric.tags)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, String> getTags() {
        return this.tags;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return ((i2 + i) * 31) + this.tags.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        Map m17294d;
        Map<String, Object> m17295c;
        m17294d = MapsJVM.m17294d();
        String str = this.name;
        if (str != null) {
            m17294d.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            m17294d.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            m17294d.put("t", this.tags);
        }
        m17295c = MapsJVM.m17295c(m17294d);
        return m17295c;
    }

    @NotNull
    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public Metric(@Nullable String str, @Nullable Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(@Nullable String str, @Nullable Object obj, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? C37559r0.m17284j() : map);
    }
}
