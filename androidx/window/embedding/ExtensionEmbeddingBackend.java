package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtensionEmbeddingBackend.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    @NotNull
    private static final String TAG = "EmbeddingBackend";
    @Nullable
    private static volatile ExtensionEmbeddingBackend globalInstance;
    @GuardedBy("globalLock")
    @VisibleForTesting
    @Nullable
    private EmbeddingInterfaceCompat embeddingExtension;
    @NotNull
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
    @NotNull
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    @NotNull
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            EmbeddingCompat embeddingCompat = null;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    embeddingCompat = new EmbeddingCompat();
                }
            } catch (Throwable th) {
                Log.d(ExtensionEmbeddingBackend.TAG, Intrinsics.m17064q("Failed to load embedding extension: ", th));
            }
            if (embeddingCompat == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    Unit unit = Unit.f99208a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            Intrinsics.m17074g(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(@Nullable Integer num) {
            if (num == null || num.intValue() < 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        @Nullable
        private List<SplitInfo> lastInfo;
        final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Nullable
        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(@NotNull List<SplitInfo> splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(@Nullable List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class SplitListenerWrapper {
        @NotNull
        private final Activity activity;
        @NotNull
        private final Consumer<List<SplitInfo>> callback;
        @NotNull
        private final Executor executor;
        @Nullable
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* renamed from: accept$lambda-1 */
        public static final void m110000accept$lambda1(SplitListenerWrapper this$0, List splitsWithActivity) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void accept(@NotNull List<SplitInfo> splitInfoList) {
            Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.m17075f(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.f
                {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.m110000accept$lambda1(ExtensionEmbeddingBackend.SplitListenerWrapper.this, arrayList);
                }
            });
        }

        @NotNull
        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @Nullable
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @NotNull
    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        if (this.embeddingExtension != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!this.splitRules.contains(rule)) {
            this.splitRules.add(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
        List<SplitInfo> m17166m;
        List<SplitInfo> m17166m2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                m17166m2 = C37563v.m17166m();
                callback.accept(m17166m2);
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() == null) {
                m17166m = C37563v.m17166m();
                splitListenerWrapper.accept(m17166m);
            } else {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                Intrinsics.m17074g(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            }
            Unit unit = Unit.f99208a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(@NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (Intrinsics.m17075f(next.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            Unit unit = Unit.f99208a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }
}
