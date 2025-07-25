package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    private final String f95913a;

    /* renamed from: b */
    private final String f95914b;

    /* renamed from: c */
    private final ArrayList f95915c;

    /* renamed from: d */
    private final String f95916d;

    /* renamed from: e */
    private final String f95917e;

    /* renamed from: f */
    private final Map f95918f;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private String f95919a;

        /* renamed from: b */
        private String f95920b;

        /* renamed from: c */
        private List f95921c;

        /* renamed from: d */
        private String f95922d;

        /* renamed from: e */
        private String f95923e;

        /* renamed from: f */
        private Map f95924f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f95919a, this.f95920b, (List) WrapUtils.getOrDefault(this.f95921c, new ArrayList()), this.f95922d, this.f95923e, (Map) WrapUtils.getOrDefault(this.f95924f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f95919a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f95920b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f95922d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f95924f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f95921c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f95923e = str;
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this(str, str2, list, str3, str4, map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.f95913a;
    }

    @Nullable
    public String getMessage() {
        return this.f95914b;
    }

    @Nullable
    public String getPlatform() {
        return this.f95916d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f95918f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f95915c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f95917e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f95913a = str;
        this.f95914b = str2;
        this.f95915c = new ArrayList(list);
        this.f95916d = str3;
        this.f95917e = str4;
        this.f95918f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
