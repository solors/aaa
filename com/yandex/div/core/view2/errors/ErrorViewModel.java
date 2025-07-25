package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45189e;

@Metadata
/* renamed from: com.yandex.div.core.view2.errors.j */
/* loaded from: classes8.dex */
public final class ErrorViewModel {

    /* renamed from: a */
    private final boolean f75730a;

    /* renamed from: b */
    private final int f75731b;

    /* renamed from: c */
    private final int f75732c;
    @NotNull

    /* renamed from: d */
    private final String f75733d;
    @NotNull

    /* renamed from: e */
    private final String f75734e;

    public ErrorViewModel() {
        this(false, 0, 0, null, null, 31, null);
    }

    /* renamed from: b */
    public static /* synthetic */ ErrorViewModel m36898b(ErrorViewModel errorViewModel, boolean z, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = errorViewModel.f75730a;
        }
        if ((i3 & 2) != 0) {
            i = errorViewModel.f75731b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = errorViewModel.f75732c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = errorViewModel.f75733d;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = errorViewModel.f75734e;
        }
        return errorViewModel.m36899a(z, i4, i5, str3, str2);
    }

    @NotNull
    /* renamed from: a */
    public final ErrorViewModel m36899a(boolean z, int i, int i2, @NotNull String errorDetails, @NotNull String warningDetails) {
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        Intrinsics.checkNotNullParameter(warningDetails, "warningDetails");
        return new ErrorViewModel(z, i, i2, errorDetails, warningDetails);
    }

    /* renamed from: c */
    public final int m36897c() {
        int i = this.f75732c;
        if (i > 0 && this.f75731b > 0) {
            return C45189e.warning_error_counter_background;
        }
        if (i > 0) {
            return C45189e.warning_counter_background;
        }
        return C45189e.error_counter_background;
    }

    @NotNull
    /* renamed from: d */
    public final String m36896d() {
        int i = this.f75731b;
        if (i > 0 && this.f75732c > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f75731b);
            sb2.append('/');
            sb2.append(this.f75732c);
            return sb2.toString();
        }
        int i2 = this.f75732c;
        if (i2 > 0) {
            return String.valueOf(i2);
        }
        if (i > 0) {
            return String.valueOf(i);
        }
        return "";
    }

    @NotNull
    /* renamed from: e */
    public final String m36895e() {
        if (this.f75731b > 0 && this.f75732c > 0) {
            return this.f75733d + "\n\n" + this.f75734e;
        } else if (this.f75732c > 0) {
            return this.f75734e;
        } else {
            return this.f75733d;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        if (this.f75730a == errorViewModel.f75730a && this.f75731b == errorViewModel.f75731b && this.f75732c == errorViewModel.f75732c && Intrinsics.m17075f(this.f75733d, errorViewModel.f75733d) && Intrinsics.m17075f(this.f75734e, errorViewModel.f75734e)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m36894f() {
        return this.f75730a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.f75730a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + Integer.hashCode(this.f75731b)) * 31) + Integer.hashCode(this.f75732c)) * 31) + this.f75733d.hashCode()) * 31) + this.f75734e.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorViewModel(showDetails=" + this.f75730a + ", errorCount=" + this.f75731b + ", warningCount=" + this.f75732c + ", errorDetails=" + this.f75733d + ", warningDetails=" + this.f75734e + ')';
    }

    public ErrorViewModel(boolean z, int i, int i2, @NotNull String errorDetails, @NotNull String warningDetails) {
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        Intrinsics.checkNotNullParameter(warningDetails, "warningDetails");
        this.f75730a = z;
        this.f75731b = i;
        this.f75732c = i2;
        this.f75733d = errorDetails;
        this.f75734e = warningDetails;
    }

    public /* synthetic */ ErrorViewModel(boolean z, int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }
}
