package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class NativeCrash {

    /* renamed from: a */
    private final NativeCrashSource f95803a;

    /* renamed from: b */
    private final String f95804b;

    /* renamed from: c */
    private final String f95805c;

    /* renamed from: d */
    private final String f95806d;

    /* renamed from: e */
    private final long f95807e;

    /* renamed from: f */
    private final String f95808f;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Builder {

        /* renamed from: a */
        private final NativeCrashSource f95809a;

        /* renamed from: b */
        private final String f95810b;

        /* renamed from: c */
        private final String f95811c;

        /* renamed from: d */
        private final String f95812d;

        /* renamed from: e */
        private final long f95813e;

        /* renamed from: f */
        private final String f95814f;

        public Builder(@NotNull NativeCrashSource nativeCrashSource, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
            this.f95809a = nativeCrashSource;
            this.f95810b = str;
            this.f95811c = str2;
            this.f95812d = str3;
            this.f95813e = j;
            this.f95814f = str4;
        }

        @NotNull
        public final NativeCrash build() {
            return new NativeCrash(this.f95809a, this.f95810b, this.f95811c, this.f95812d, this.f95813e, this.f95814f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCrashSource, str, str2, str3, j, str4);
    }

    public final long getCreationTime() {
        return this.f95807e;
    }

    @NotNull
    public final String getDumpFile() {
        return this.f95806d;
    }

    @NotNull
    public final String getHandlerVersion() {
        return this.f95804b;
    }

    @NotNull
    public final String getMetadata() {
        return this.f95808f;
    }

    @NotNull
    public final NativeCrashSource getSource() {
        return this.f95803a;
    }

    @NotNull
    public final String getUuid() {
        return this.f95805c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4) {
        this.f95803a = nativeCrashSource;
        this.f95804b = str;
        this.f95805c = str2;
        this.f95806d = str3;
        this.f95807e = j;
        this.f95808f = str4;
    }
}
