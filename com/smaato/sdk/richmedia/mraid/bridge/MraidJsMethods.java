package com.smaato.sdk.richmedia.mraid.bridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p574fi.BiConsumer;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MraidJsMethods {
    public static final String ADD_EVENT_LISTENER = "addEventListener";
    public static final String CLOSE = "close";
    public static final String EXPAND = "expand";
    public static final String OPEN = "open";
    public static final String PLAY_VIDEO = "playVideo";
    public static final String RESIZE = "resize";
    public static final String UNLOAD = "unload";
    public static final String USE_CUSTOM_CLOSE = "useCustomClose";
    @Nullable
    private BiConsumer<String, String> adViolationCallback;
    @Nullable
    private Consumer<String> addEventListenerCallback;
    @Nullable
    private Consumer<Whatever> closeCallback;
    @Nullable
    private Consumer<String> expandCallback;
    @Nullable
    private Consumer<String> openCallback;
    @Nullable
    private Consumer<String> playVideoCallback;
    @Nullable
    private Consumer<Whatever> resizeCallback;
    @Nullable
    private Consumer<Whatever> unloadCallback;
    @Nullable
    private Consumer<Boolean> useCustomCloseCallback;
    private final MraidCommandHandler addEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.g
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39101j(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler openEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.h
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39110a(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler expandEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.i
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39106e(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler playVideoEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.j
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39099l(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler unloadEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.k
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39100k(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler resizeEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.l
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39109b(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler closeEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.m
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39102i(MraidJsMethods.this, map, z);
        }
    };
    @NonNull
    private final MraidCommandHandler useCustomCLoseEventListenerHandler = new MraidCommandHandler() { // from class: com.smaato.sdk.richmedia.mraid.bridge.n
        @Override // com.smaato.sdk.richmedia.mraid.bridge.MraidCommandHandler
        public final void handle(Map map, boolean z) {
            MraidJsMethods.m39107d(MraidJsMethods.this, map, z);
        }
    };

    public MraidJsMethods(@NonNull MraidJsBridge mraidJsBridge) {
        subscribeOnEvents((MraidJsBridge) Objects.requireNonNull(mraidJsBridge));
    }

    /* renamed from: a */
    public static /* synthetic */ void m39110a(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$2(map, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39109b(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$10(map, z);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39108c(String str, BiConsumer biConsumer) {
        biConsumer.accept("AUTO_PLAY", str);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39107d(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$12(map, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39106e(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$4(map, z);
    }

    /* renamed from: f */
    public static /* synthetic */ void m39105f(String str, BiConsumer biConsumer) {
        biConsumer.accept("AUTO_OPEN", str);
    }

    /* renamed from: g */
    public static /* synthetic */ void m39104g(String str, BiConsumer biConsumer) {
        biConsumer.accept("AUTO_EXPAND", str);
    }

    /* renamed from: h */
    public static /* synthetic */ void m39103h(BiConsumer biConsumer) {
        biConsumer.accept("UNLOAD", null);
    }

    /* renamed from: i */
    public static /* synthetic */ void m39102i(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$11(map, z);
    }

    /* renamed from: j */
    public static /* synthetic */ void m39101j(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$0(map, z);
    }

    /* renamed from: k */
    public static /* synthetic */ void m39100k(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$8(map, z);
    }

    /* renamed from: l */
    public static /* synthetic */ void m39099l(MraidJsMethods mraidJsMethods, Map map, boolean z) {
        mraidJsMethods.lambda$new$6(map, z);
    }

    public /* synthetic */ void lambda$new$0(Map map, boolean z) {
        Consumer<String> consumer = this.addEventListenerCallback;
        if (consumer != null) {
            consumer.accept((String) map.get("event"));
        }
    }

    public /* synthetic */ void lambda$new$10(Map map, boolean z) {
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.c
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    MraidJsMethods.m39098m((BiConsumer) obj);
                }
            });
            return;
        }
        Consumer<Whatever> consumer = this.resizeCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$new$11(Map map, boolean z) {
        Consumer<Whatever> consumer = this.closeCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$new$12(Map map, boolean z) {
        boolean z2;
        if (this.useCustomCloseCallback != null) {
            String str = (String) map.get("shouldUseCustomClose");
            if (str != null && str.toLowerCase().equals("true")) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.useCustomCloseCallback.accept(Boolean.valueOf(z2));
        }
    }

    public /* synthetic */ void lambda$new$2(Map map, boolean z) {
        final String str = (String) map.get("url");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.f
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    MraidJsMethods.m39105f(str, (BiConsumer) obj);
                }
            });
            return;
        }
        Consumer<String> consumer = this.openCallback;
        if (consumer != null) {
            consumer.accept(str);
        }
    }

    public /* synthetic */ void lambda$new$4(Map map, boolean z) {
        final String str = (String) map.get("url");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.e
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    MraidJsMethods.m39104g(str, (BiConsumer) obj);
                }
            });
            return;
        }
        Consumer<String> consumer = this.expandCallback;
        if (consumer != null) {
            consumer.accept(str);
        }
    }

    public /* synthetic */ void lambda$new$6(Map map, boolean z) {
        final String str = (String) map.get("uri");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    MraidJsMethods.m39108c(str, (BiConsumer) obj);
                }
            });
            return;
        }
        Consumer<String> consumer = this.playVideoCallback;
        if (consumer != null) {
            consumer.accept((String) map.get("uri"));
        }
    }

    public /* synthetic */ void lambda$new$8(Map map, boolean z) {
        Consumer<Whatever> consumer = this.unloadCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
        Objects.onNotNull(this.adViolationCallback, new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.d
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MraidJsMethods.m39103h((BiConsumer) obj);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ void m39098m(BiConsumer biConsumer) {
        biConsumer.accept("AUTO_RESIZE", "");
    }

    private void subscribeOnEvents(@NonNull MraidJsBridge mraidJsBridge) {
        mraidJsBridge.addCommandHandler(ADD_EVENT_LISTENER, this.addEventListenerHandler);
        mraidJsBridge.addCommandHandler("open", this.openEventListenerHandler);
        mraidJsBridge.addCommandHandler("playVideo", this.playVideoEventListenerHandler);
        mraidJsBridge.addCommandHandler("expand", this.expandEventListenerHandler);
        mraidJsBridge.addCommandHandler("unload", this.unloadEventListenerHandler);
        mraidJsBridge.addCommandHandler("resize", this.resizeEventListenerHandler);
        mraidJsBridge.addCommandHandler("close", this.closeEventListenerHandler);
        mraidJsBridge.addCommandHandler("useCustomClose", this.useCustomCLoseEventListenerHandler);
    }

    public void setAdViolationCallback(@Nullable BiConsumer<String, String> biConsumer) {
        this.adViolationCallback = biConsumer;
    }

    public void setAddEventListenerCallback(@Nullable Consumer<String> consumer) {
        this.addEventListenerCallback = consumer;
    }

    public void setCloseCallback(@Nullable Consumer<Whatever> consumer) {
        this.closeCallback = consumer;
    }

    public void setExpandCallback(@Nullable Consumer<String> consumer) {
        this.expandCallback = consumer;
    }

    public void setOpenCallback(@Nullable Consumer<String> consumer) {
        this.openCallback = consumer;
    }

    public void setPlayVideoCallback(@Nullable Consumer<String> consumer) {
        this.playVideoCallback = consumer;
    }

    public void setResizeCallback(@Nullable Consumer<Whatever> consumer) {
        this.resizeCallback = consumer;
    }

    public void setUnloadCallback(@Nullable Consumer<Whatever> consumer) {
        this.unloadCallback = consumer;
    }

    public void setUseCustomCloseCallback(@Nullable Consumer<Boolean> consumer) {
        this.useCustomCloseCallback = consumer;
    }
}
