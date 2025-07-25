package p837q;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: q.f */
/* loaded from: classes2.dex */
public final class ImageResult extends AbstractC39308j {
    @Nullable

    /* renamed from: a */
    private final Drawable f103260a;
    @NotNull

    /* renamed from: b */
    private final C39305i f103261b;
    @NotNull

    /* renamed from: c */
    private final Throwable f103262c;

    public ImageResult(@Nullable Drawable drawable, @NotNull C39305i c39305i, @NotNull Throwable th) {
        super(null);
        this.f103260a = drawable;
        this.f103261b = c39305i;
        this.f103262c = th;
    }

    @Override // p837q.AbstractC39308j
    @Nullable
    /* renamed from: a */
    public Drawable mo13017a() {
        return this.f103260a;
    }

    @Override // p837q.AbstractC39308j
    @NotNull
    /* renamed from: b */
    public C39305i mo13016b() {
        return this.f103261b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageResult) {
            ImageResult imageResult = (ImageResult) obj;
            if (Intrinsics.m17075f(mo13017a(), imageResult.mo13017a()) && Intrinsics.m17075f(mo13016b(), imageResult.mo13016b()) && Intrinsics.m17075f(this.f103262c, imageResult.f103262c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Drawable mo13017a = mo13017a();
        if (mo13017a != null) {
            i = mo13017a.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + mo13016b().hashCode()) * 31) + this.f103262c.hashCode();
    }
}
