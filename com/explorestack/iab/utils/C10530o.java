package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.explorestack.iab.utils.o */
/* loaded from: classes3.dex */
public class C10530o extends AbstractC10527n<CircularProgressBar> {
    public C10530o(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: l */
    protected C10507d mo79212l(@NonNull Context context, @Nullable C10507d c10507d) {
        return C10504a.f24004p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: r */
    public CircularProgressBar mo79213j(@NonNull Context context, @NonNull C10507d c10507d) {
        return new CircularProgressBar(context);
    }
}
