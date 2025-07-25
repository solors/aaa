package p689h;

import io.bidmachine.media3.common.MimeTypes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: ExifUtils.kt */
@Metadata
/* renamed from: h.n */
/* loaded from: classes2.dex */
public final class C33443n {
    @NotNull

    /* renamed from: a */
    private static final Set<String> f91268a;

    /* compiled from: ExifUtils.kt */
    @Metadata
    /* renamed from: h.n$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C33444a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<String> m17119j;
        m17119j = C37572z0.m17119j("image/jpeg", "image/webp", MimeTypes.IMAGE_HEIC, "image/heif");
        f91268a = m17119j;
    }

    /* renamed from: a */
    public static final boolean m23933a(@NotNull ExifUtils exifUtils) {
        if (exifUtils.m23939a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m23932b(@NotNull ExifUtils exifUtils) {
        if (exifUtils.m23939a() != 90 && exifUtils.m23939a() != 270) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m23931c(@NotNull ExifOrientationPolicy exifOrientationPolicy, @Nullable String str) {
        int i = C33444a.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f91268a.contains(str)) {
            return false;
        }
        return true;
    }
}
