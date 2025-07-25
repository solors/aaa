package com.facebook;

import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.CallbackManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FacebookDialog.kt */
@Metadata
/* loaded from: classes3.dex */
public interface FacebookDialog<CONTENT, RESULT> {
    boolean canShow(CONTENT content);

    @NotNull
    ActivityResultContract<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(@Nullable CallbackManager callbackManager);

    void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> facebookCallback);

    void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> facebookCallback, int i);

    void show(CONTENT content);
}
