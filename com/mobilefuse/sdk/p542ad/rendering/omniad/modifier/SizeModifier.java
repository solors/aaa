package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* compiled from: SizeModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier */
/* loaded from: classes7.dex */
public interface SizeModifier {

    /* compiled from: SizeModifier.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeSize$default(SizeModifier sizeModifier, int i, int i2, Functions functions, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    functions = SizeModifier$changeSize$1.INSTANCE;
                }
                sizeModifier.changeSize(i, i2, functions);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeSize");
        }
    }

    void changeSize(int i, int i2, @NotNull Functions<Unit> functions);

    @NotNull
    OmniAdContainer getOmniAdContainer();
}
