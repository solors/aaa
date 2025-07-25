package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.data.model.AdData */
/* loaded from: classes7.dex */
public final class AdContext {
    @NotNull
    private final String data;

    private /* synthetic */ AdContext(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdContext m110239boximpl(String str) {
        return new AdContext(str);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m110240constructorimpl(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m110241equalsimpl(String str, Object obj) {
        if (!(obj instanceof AdContext) || !Intrinsics.m17075f(str, ((AdContext) obj).m110245unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m110242equalsimpl0(String str, String str2) {
        return Intrinsics.m17075f(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m110243hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m110244toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m110241equalsimpl(this.data, obj);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m110243hashCodeimpl(this.data);
    }

    public String toString() {
        return m110244toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m110245unboximpl() {
        return this.data;
    }
}
