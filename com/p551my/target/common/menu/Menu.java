package com.p551my.target.common.menu;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.common.menu.Menu */
/* loaded from: classes7.dex */
public interface Menu {

    /* renamed from: com.my.target.common.menu.Menu$Listener */
    /* loaded from: classes7.dex */
    public interface Listener {
        void onActionClick(@NonNull MenuAction menuAction);
    }

    void addAction(@NonNull MenuAction menuAction);

    void dismiss();

    void present(@NonNull Context context);

    void setListener(@Nullable Listener listener);
}
