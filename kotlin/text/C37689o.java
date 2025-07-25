package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversionsJVM.kt */
@Metadata
/* renamed from: kotlin.text.o */
/* loaded from: classes7.dex */
public class C37689o extends StringBuilder {
    @Nullable
    /* renamed from: j */
    public static Double m16643j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (!StringNumberConversionsJVM.f99486b.m16766e(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: k */
    public static Float m16642k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (!StringNumberConversionsJVM.f99486b.m16766e(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
