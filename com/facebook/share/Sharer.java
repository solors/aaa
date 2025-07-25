package com.facebook.share;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sharer.kt */
@Metadata
/* loaded from: classes4.dex */
public interface Sharer {

    /* compiled from: Sharer.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Result {
        @Nullable
        private final String postId;

        public Result(@Nullable String str) {
            this.postId = str;
        }

        @Nullable
        public final String getPostId() {
            return this.postId;
        }
    }

    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z);
}
