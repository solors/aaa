package p848qb;

import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: qb.a */
/* loaded from: classes8.dex */
public final class SvgCacheManager {
    @NotNull

    /* renamed from: a */
    private final WeakHashMap<String, PictureDrawable> f103570a = new WeakHashMap<>();

    @Nullable
    /* renamed from: a */
    public final PictureDrawable m12803a(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return this.f103570a.get(imageUrl);
    }

    /* renamed from: b */
    public final void m12802b(@NotNull String imageUrl, @NotNull PictureDrawable pictureDrawable) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
        this.f103570a.put(imageUrl, pictureDrawable);
    }
}
