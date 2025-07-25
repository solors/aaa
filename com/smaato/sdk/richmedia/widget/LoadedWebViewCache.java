package com.smaato.sdk.richmedia.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class LoadedWebViewCache {
    @NonNull
    private final Map<String, Item> cache = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public static final class Item {
        @NonNull
        private final WeakReference<Object> weakAdObject;
        @NonNull
        private final RichMediaWebView webView;

        private Item(@NonNull RichMediaWebView richMediaWebView, @NonNull WeakReference<Object> weakReference) {
            this.webView = (RichMediaWebView) Objects.requireNonNull(richMediaWebView);
            this.weakAdObject = (WeakReference) Objects.requireNonNull(weakReference);
        }

        @NonNull
        public static Item create(@NonNull RichMediaWebView richMediaWebView, @NonNull Object obj) {
            return new Item(richMediaWebView, new WeakReference(obj));
        }
    }

    private void trim() {
        Iterator<Map.Entry<String, Item>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().weakAdObject.get() == null) {
                it.remove();
            }
        }
    }

    @Nullable
    public RichMediaWebView pop(@NonNull String str) {
        Item remove = this.cache.remove(str);
        if (remove != null) {
            return remove.webView;
        }
        return null;
    }

    public void save(@NonNull String str, @NonNull Item item) {
        trim();
        this.cache.put(str, item);
    }
}
