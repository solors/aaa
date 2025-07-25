package p001a0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: a0.g */
/* loaded from: classes2.dex */
public class LottieCompositionCache {

    /* renamed from: b */
    private static final LottieCompositionCache f32b = new LottieCompositionCache();

    /* renamed from: a */
    private final LruCache<String, LottieComposition> f33a = new LruCache<>(20);

    @VisibleForTesting
    LottieCompositionCache() {
    }

    /* renamed from: b */
    public static LottieCompositionCache m105883b() {
        return f32b;
    }

    @Nullable
    /* renamed from: a */
    public LottieComposition m105884a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f33a.get(str);
    }

    /* renamed from: c */
    public void m105882c(@Nullable String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.f33a.put(str, lottieComposition);
    }
}
