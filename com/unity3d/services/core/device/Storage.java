package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import ge.C33361p0;
import ge.InterfaceC33421z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: Storage.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Storage extends JsonStorage {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final InterfaceC33421z<List<Function1<StorageEventInfo, Unit>>> onStorageEventCallbacks;
    @NotNull
    private final String _targetFileName;
    @NotNull
    private final StorageManager.StorageType type;

    /* compiled from: Storage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            List m17568K0;
            Intrinsics.checkNotNullParameter(callback, "callback");
            InterfaceC33421z interfaceC33421z = Storage.onStorageEventCallbacks;
            do {
                value = interfaceC33421z.getValue();
                m17568K0 = _Collections.m17568K0((List) value, callback);
            } while (!interfaceC33421z.mo23981a(value, m17568K0));
        }

        public final void removeStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            List m17571H0;
            Intrinsics.checkNotNullParameter(callback, "callback");
            InterfaceC33421z interfaceC33421z = Storage.onStorageEventCallbacks;
            do {
                value = interfaceC33421z.getValue();
                m17571H0 = _Collections.m17571H0((List) value, callback);
            } while (!interfaceC33421z.mo23981a(value, m17571H0));
        }
    }

    static {
        List m17166m;
        m17166m = C37563v.m17166m();
        onStorageEventCallbacks = C33361p0.m24033a(m17166m);
    }

    public Storage(@NotNull String _targetFileName, @NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public final synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public final synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z = true;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (Exception e) {
                DeviceLog.debug("Failed to read storage JSON file:", e);
                z = false;
                return z;
            }
        } catch (FileNotFoundException e2) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e2);
            z = false;
            return z;
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, Charsets.UTF_8)));
        return z;
    }

    public final synchronized void sendEvent(@Nullable StorageEvent storageEvent, @Nullable Object obj) {
        List<Function1<StorageEventInfo, Unit>> value = onStorageEventCallbacks.getValue();
        if (!value.isEmpty()) {
            Intrinsics.m17074g(storageEvent);
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(storageEventInfo);
            }
            return;
        }
        boolean z = false;
        if (WebViewApp.getCurrentApp() != null) {
            z = WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj);
        }
        if (!z) {
            DeviceLog.debug("Couldn't send storage event to WebApp");
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public final synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() != null) {
            return Utilities.writeFile(file, getData().toString());
        }
        return false;
    }
}
