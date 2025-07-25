package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebDialog.kt */
@Metadata
/* loaded from: classes3.dex */
public final class WebDialog {
    @NotNull
    public static final WebDialog INSTANCE = new WebDialog();

    private WebDialog() {
    }

    public static final int getWebDialogTheme() {
        return com.facebook.internal.WebDialog.Companion.getWebDialogTheme();
    }

    public static final void setWebDialogTheme(int i) {
        com.facebook.internal.WebDialog.Companion.setWebDialogTheme(i);
    }
}
