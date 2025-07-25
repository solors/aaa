package p848qb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p789m9.DivImageDownloadCallback;
import p789m9.DivImageLoader;
import p789m9.LoadReference;

@Metadata
/* renamed from: qb.g */
/* loaded from: classes8.dex */
public final class SvgLoadWrapper implements DivImageLoader {
    @NotNull

    /* renamed from: a */
    private final DivImageLoader f103590a;
    @Nullable

    /* renamed from: b */
    private final SvgDivImageLoader f103591b;

    public SvgLoadWrapper(@NotNull DivImageLoader providedImageLoader) {
        SvgDivImageLoader svgDivImageLoader;
        Intrinsics.checkNotNullParameter(providedImageLoader, "providedImageLoader");
        this.f103590a = providedImageLoader;
        if (!providedImageLoader.hasSvgSupport().booleanValue()) {
            svgDivImageLoader = new SvgDivImageLoader();
        } else {
            svgDivImageLoader = null;
        }
        this.f103591b = svgDivImageLoader;
    }

    /* renamed from: a */
    private final DivImageLoader m12791a(String str) {
        if (this.f103591b != null && m12790b(str)) {
            return this.f103591b;
        }
        return this.f103590a;
    }

    /* renamed from: b */
    private final boolean m12790b(String str) {
        int m16568d0;
        boolean m16616x;
        m16568d0 = C37690r.m16568d0(str, '?', 0, false, 6, null);
        if (m16568d0 == -1) {
            m16568d0 = str.length();
        }
        String substring = str.substring(0, m16568d0);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        m16616x = StringsJVM.m16616x(substring, ".svg", false, 2, null);
        return m16616x;
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadReference loadImage = m12791a(imageUrl).loadImage(imageUrl, callback);
        Intrinsics.checkNotNullExpressionValue(loadImage, "getProperLoader(imageUrl…Image(imageUrl, callback)");
        return loadImage;
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadReference loadImageBytes = m12791a(imageUrl).loadImageBytes(imageUrl, callback);
        Intrinsics.checkNotNullExpressionValue(loadImageBytes, "getProperLoader(imageUrl…Bytes(imageUrl, callback)");
        return loadImageBytes;
    }
}
