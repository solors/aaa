package com.inmobi.media;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.la */
/* loaded from: classes6.dex */
public final class C19359la {
    @NotNull
    public static final C19345ka Companion = new C19345ka();
    @NotNull
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = "la";
    private boolean allowOffscreen;
    @Nullable
    private String customClosePosition;
    private int height;
    private int offsetX;
    private int offsetY;
    private int width;

    public C19359la(@Nullable String str, boolean z) {
        this.customClosePosition = str;
        this.allowOffscreen = z;
    }

    /* renamed from: a */
    public final boolean m60053a() {
        return this.allowOffscreen;
    }

    /* renamed from: b */
    public final String m60050b() {
        return this.customClosePosition;
    }

    /* renamed from: c */
    public final int m60049c() {
        return this.height;
    }

    /* renamed from: d */
    public final int m60048d() {
        return this.offsetX;
    }

    /* renamed from: e */
    public final int m60047e() {
        return this.offsetY;
    }

    /* renamed from: f */
    public final int m60046f() {
        return this.width;
    }

    /* renamed from: a */
    public final void m60051a(boolean z) {
        this.allowOffscreen = z;
    }

    /* renamed from: a */
    public final void m60052a(String str) {
        this.customClosePosition = str;
    }
}
