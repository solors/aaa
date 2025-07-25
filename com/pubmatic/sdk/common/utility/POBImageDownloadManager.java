package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBImageRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class POBImageDownloadManager {
    @NonNull

    /* renamed from: a */
    private final Context f70288a;
    @NonNull

    /* renamed from: b */
    private final Map<POBNetworkHandler, POBImageRequest> f70289b = Collections.synchronizedMap(new HashMap());
    @NonNull

    /* renamed from: c */
    private final Map<String, Bitmap> f70290c = Collections.synchronizedMap(new HashMap());
    @Nullable

    /* renamed from: d */
    private POBImageDownloadListener f70291d;

    /* loaded from: classes7.dex */
    public interface POBImageDownloadListener {
        void onComplete(@NonNull Map<String, Bitmap> map);
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBImageDownloadManager$a */
    /* loaded from: classes7.dex */
    class C26728a implements POBNetworkHandler.POBImageNetworkListener<String> {

        /* renamed from: a */
        final /* synthetic */ POBImageRequest f70292a;

        C26728a(POBImageRequest pOBImageRequest) {
            this.f70292a = pOBImageRequest;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onFailure(POBError pOBError) {
            POBLog.error("POBImageDownloadManager", "Unable to download image for url - %s", pOBError);
            POBImageDownloadManager.this.f70290c.put(this.f70292a.getUrl(), null);
            POBImageDownloadManager.this.m40553a();
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onSuccess(Bitmap bitmap) {
            POBImageDownloadManager.this.f70290c.put(this.f70292a.getUrl(), bitmap);
            POBImageDownloadManager.this.m40553a();
        }
    }

    public POBImageDownloadManager(@NonNull Context context, @NonNull Set<String> set) {
        this.f70288a = context;
        for (String str : set) {
            m40551a(str);
        }
    }

    public void cancel() {
        for (Map.Entry<POBNetworkHandler, POBImageRequest> entry : this.f70289b.entrySet()) {
            entry.getKey().cancelRequest("POBImageDownloadManager");
        }
    }

    public boolean isEmpty() {
        return this.f70289b.isEmpty();
    }

    public void setListener(@NonNull POBImageDownloadListener pOBImageDownloadListener) {
        this.f70291d = pOBImageDownloadListener;
    }

    public void start() {
        if (this.f70289b.isEmpty() && this.f70291d != null) {
            m40553a();
            return;
        }
        for (Map.Entry<POBNetworkHandler, POBImageRequest> entry : this.f70289b.entrySet()) {
            POBImageRequest value = entry.getValue();
            if (value != null) {
                entry.getKey().sendImageRequest(value, new C26728a(value));
            }
        }
    }

    /* renamed from: a */
    private void m40551a(@NonNull String str) {
        POBImageRequest pOBImageRequest = new POBImageRequest();
        pOBImageRequest.setRequestTag("POBImageDownloadManager");
        pOBImageRequest.setUrl(str);
        pOBImageRequest.setTimeout(5000);
        this.f70289b.put(new POBNetworkHandler(this.f70288a), pOBImageRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40553a() {
        POBImageDownloadListener pOBImageDownloadListener;
        if (this.f70289b.size() != this.f70290c.size() || (pOBImageDownloadListener = this.f70291d) == null) {
            return;
        }
        pOBImageDownloadListener.onComplete(this.f70290c);
    }
}
