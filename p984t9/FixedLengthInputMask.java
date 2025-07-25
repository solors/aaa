package p984t9;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p984t9.BaseInputMask;

@Metadata
/* renamed from: t9.c */
/* loaded from: classes8.dex */
public class FixedLengthInputMask extends BaseInputMask {
    @NotNull

    /* renamed from: e */
    private final Function1<Exception, Unit> f116526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(@NotNull BaseInputMask.C44390b initialMaskData, @NotNull Function1<? super Exception, Unit> onError) {
        super(initialMaskData);
        Intrinsics.checkNotNullParameter(initialMaskData, "initialMaskData");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f116526e = onError;
    }

    @Override // p984t9.BaseInputMask
    /* renamed from: r */
    public void mo3179r(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f116526e.invoke(exception);
    }
}
