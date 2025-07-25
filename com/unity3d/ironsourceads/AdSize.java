package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.C20410l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class AdSize {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f74420a;

    /* renamed from: b */
    private final int f74421b;
    @NotNull

    /* renamed from: c */
    private final String f74422c;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(320, 50, C20410l.f51629a, null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(320, 90, C20410l.f51630b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, C20410l.f51632d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, C20410l.f51635g, null);
        }
    }

    private AdSize(int i, int i2, String str) {
        this.f74420a = i;
        this.f74421b = i2;
        this.f74422c = str;
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f74421b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.f74422c;
    }

    public final int getWidth() {
        return this.f74420a;
    }

    public /* synthetic */ AdSize(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }
}
