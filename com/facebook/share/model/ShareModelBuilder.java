package com.facebook.share.model;

import com.facebook.share.ShareBuilder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareModelBuilder.kt */
@Metadata
/* loaded from: classes4.dex */
public interface ShareModelBuilder<M extends ShareModel, B extends ShareModelBuilder<M, B>> extends ShareBuilder<M, B> {
    @NotNull
    B readFrom(@Nullable M m);
}
