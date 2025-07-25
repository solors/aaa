package com.smaato.sdk.core.util.notifier;

import androidx.annotation.NonNull;

/* renamed from: com.smaato.sdk.core.util.notifier.e */
/* loaded from: classes7.dex */
class UniqueValueChangeSender<T> extends StandardChangeSender<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UniqueValueChangeSender(@NonNull T t) {
        super(t);
    }

    @Override // com.smaato.sdk.core.util.notifier.StandardChangeSender, com.smaato.sdk.core.util.notifier.ChangeSender
    public void newValue(@NonNull T t) {
        if (!t.equals(getValue())) {
            super.newValue(t);
        }
    }
}
