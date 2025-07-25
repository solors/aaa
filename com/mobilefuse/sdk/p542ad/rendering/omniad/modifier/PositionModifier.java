package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* compiled from: PositionModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier */
/* loaded from: classes7.dex */
public interface PositionModifier {

    /* compiled from: PositionModifier.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changePosition$default(PositionModifier positionModifier, int i, int i2, Functions functions, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    functions = PositionModifier$changePosition$1.INSTANCE;
                }
                positionModifier.changePosition(i, i2, functions);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changePosition");
        }
    }

    void cancel();

    void changePosition(int i, int i2, @NotNull Functions<Unit> functions);

    @NotNull
    OmniAdContainer getOmniAdContainer();
}
