package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeviceFontFamilyNameFont.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyName */
/* loaded from: classes.dex */
public final class DeviceFontFamilyName {
    @NotNull
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m109428boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m109429constructorimpl(@NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return name;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109430equalsimpl(String str, Object obj) {
        if (!(obj instanceof DeviceFontFamilyName) || !Intrinsics.m17075f(str, ((DeviceFontFamilyName) obj).m109434unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109431equalsimpl0(String str, String str2) {
        return Intrinsics.m17075f(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109432hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109433toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m109430equalsimpl(this.name, obj);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m109432hashCodeimpl(this.name);
    }

    public String toString() {
        return m109433toStringimpl(this.name);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m109434unboximpl() {
        return this.name;
    }
}
