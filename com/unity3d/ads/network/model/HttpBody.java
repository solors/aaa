package com.unity3d.ads.network.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpBody.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpBody {

    /* compiled from: HttpBody.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class ByteArrayBody implements HttpBody {
        @NotNull
        private final byte[] content;

        public ByteArrayBody(@NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class EmptyBody implements HttpBody {
        @NotNull
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* compiled from: HttpBody.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class StringBody implements HttpBody {
        @NotNull
        private final String content;

        public StringBody(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }
}
