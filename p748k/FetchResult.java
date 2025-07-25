package p748k;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p689h.DataSource;

@Metadata
/* renamed from: k.g */
/* loaded from: classes2.dex */
public final class FetchResult extends AbstractC37365h {
    @NotNull

    /* renamed from: a */
    private final Drawable f98629a;

    /* renamed from: b */
    private final boolean f98630b;
    @NotNull

    /* renamed from: c */
    private final DataSource f98631c;

    public FetchResult(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        super(null);
        this.f98629a = drawable;
        this.f98630b = z;
        this.f98631c = dataSource;
    }

    @NotNull
    /* renamed from: a */
    public final DataSource m18303a() {
        return this.f98631c;
    }

    @NotNull
    /* renamed from: b */
    public final Drawable m18302b() {
        return this.f98629a;
    }

    /* renamed from: c */
    public final boolean m18301c() {
        return this.f98630b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FetchResult) {
            FetchResult fetchResult = (FetchResult) obj;
            if (Intrinsics.m17075f(this.f98629a, fetchResult.f98629a) && this.f98630b == fetchResult.f98630b && this.f98631c == fetchResult.f98631c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f98629a.hashCode() * 31) + Boolean.hashCode(this.f98630b)) * 31) + this.f98631c.hashCode();
    }
}
