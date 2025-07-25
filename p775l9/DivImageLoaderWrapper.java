package p775l9;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p789m9.DivImageDownloadCallback;
import p789m9.DivImageLoader;
import p789m9.LoadReference;
import p848qb.SvgLoadWrapper;

@Metadata
/* renamed from: l9.b */
/* loaded from: classes8.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {
    @NotNull

    /* renamed from: a */
    private final SvgLoadWrapper f99992a;
    @NotNull

    /* renamed from: b */
    private final List<DivImageUrlModifier> f99993b;

    public DivImageLoaderWrapper(@NotNull DivImageLoader providedImageLoader) {
        List<DivImageUrlModifier> m17175e;
        Intrinsics.checkNotNullParameter(providedImageLoader, "providedImageLoader");
        this.f99992a = new SvgLoadWrapper(providedImageLoader);
        m17175e = CollectionsJVM.m17175e(new DivImageAssetUrlModifier());
        this.f99993b = m17175e;
    }

    /* renamed from: a */
    private final String m15651a(String str) {
        for (DivImageUrlModifier divImageUrlModifier : this.f99993b) {
            str = divImageUrlModifier.mo15650a(str);
        }
        return str;
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f99992a.loadImage(m15651a(imageUrl), callback);
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f99992a.loadImageBytes(m15651a(imageUrl), callback);
    }
}
