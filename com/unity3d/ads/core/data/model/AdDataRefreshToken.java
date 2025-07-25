package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdContext.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdDataRefreshToken {
    @NotNull
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m110246boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m110247constructorimpl(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m110248equalsimpl(String str, Object obj) {
        if (!(obj instanceof AdDataRefreshToken) || !Intrinsics.m17075f(str, ((AdDataRefreshToken) obj).m110252unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m110249equalsimpl0(String str, String str2) {
        return Intrinsics.m17075f(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m110250hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m110251toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m110248equalsimpl(this.data, obj);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m110250hashCodeimpl(this.data);
    }

    public String toString() {
        return m110251toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m110252unboximpl() {
        return this.data;
    }
}
