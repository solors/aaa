package com.facebook.bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppLink.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AppLink {
    @NotNull
    private final Uri sourceUrl;
    @NotNull
    private final List<Target> targets;
    @NotNull
    private final Uri webUrl;

    /* compiled from: AppLink.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Target {
        @NotNull
        private final String appName;
        @NotNull
        private final String className;
        @NotNull
        private final String packageName;
        @NotNull
        private final Uri url;

        public Target(@NotNull String packageName, @NotNull String className, @NotNull Uri url, @NotNull String appName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.packageName = packageName;
            this.className = className;
            this.url = url;
            this.appName = appName;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        @NotNull
        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(@NotNull Uri sourceUrl, @Nullable List<Target> list, @NotNull Uri webUrl) {
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        this.sourceUrl = sourceUrl;
        this.webUrl = webUrl;
        this.targets = list == null ? C37563v.m17166m() : list;
    }

    @NotNull
    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    @NotNull
    public final List<Target> getTargets() {
        List<Target> unmodifiableList = Collections.unmodifiableList(this.targets);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(field)");
        return unmodifiableList;
    }

    @NotNull
    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
