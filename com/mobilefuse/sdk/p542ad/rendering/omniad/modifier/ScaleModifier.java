package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScaleModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier */
/* loaded from: classes7.dex */
public interface ScaleModifier {

    /* compiled from: ScaleModifier.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeScale$default(ScaleModifier scaleModifier, float f, Functions functions, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    functions = ScaleModifier$changeScale$1.INSTANCE;
                }
                scaleModifier.changeScale(f, functions);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeScale");
        }
    }

    void changeScale(float f, @NotNull Functions<Unit> functions);

    @NotNull
    OmniAdContainer getOmniAdContainer();
}
