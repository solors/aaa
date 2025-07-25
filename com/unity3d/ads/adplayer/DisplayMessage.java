package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisplayMessage.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class DisplayMessage {
    @NotNull
    private final String opportunityId;

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DisplayError extends DisplayMessage {
        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(@NotNull String opportunityId, @NotNull String reason) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DisplayReady extends DisplayMessage {
        @Nullable
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(@NotNull String opportunityId, @Nullable Map<String, ? extends Object> map) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        @Nullable
        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map);
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(@NotNull String opportunityId, boolean z) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(@NotNull String opportunityId, int i) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(@NotNull String opportunityId, boolean z) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        @NotNull
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(@NotNull String opportunityId, @NotNull WebView webView) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @NotNull
        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
