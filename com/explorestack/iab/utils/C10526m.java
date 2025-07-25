package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.vast.view.IabTextView;

/* renamed from: com.explorestack.iab.utils.m */
/* loaded from: classes3.dex */
public class C10526m extends AbstractC10527n<IabTextView> {
    public C10526m(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: l */
    protected C10507d mo79212l(@NonNull Context context, @Nullable C10507d c10507d) {
        return C10504a.f23998j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.iab.utils.AbstractC10527n
    /* renamed from: r */
    public void mo79214e(@NonNull Context context, @NonNull IabTextView iabTextView, @NonNull C10507d c10507d) {
        String str;
        super.mo79214e(context, iabTextView, c10507d);
        if (!TextUtils.isEmpty(c10507d.m79372f())) {
            str = c10507d.m79372f();
        } else {
            str = "Learn more";
        }
        iabTextView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: s */
    public IabTextView mo79213j(@NonNull Context context, @NonNull C10507d c10507d) {
        return new IabTextView(context);
    }
}
