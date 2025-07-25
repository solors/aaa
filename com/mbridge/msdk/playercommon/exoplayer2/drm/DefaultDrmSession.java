package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C22533C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(18)
/* loaded from: classes6.dex */
public class DefaultDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    private static final int MAX_LICENSE_DURATION_TO_RENEW = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    final MediaDrmCallback callback;
    private Object currentKeyRequest;
    private Object currentProvisionRequest;
    private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
    private final int initialDrmRequestRetryCount;
    private DrmSession.DrmSessionException lastException;
    private T mediaCrypto;
    private final ExoMediaDrm<T> mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private int openCount;
    private final HashMap<String, String> optionalKeyRequestParameters;
    private DefaultDrmSession<T>.PostRequestHandler postRequestHandler;
    final DefaultDrmSession<T>.PostResponseHandler postResponseHandler;
    private final ProvisioningManager<T> provisioningManager;
    private HandlerThread requestHandlerThread;
    private final DrmInitData.SchemeData schemeData;
    private byte[] sessionId;
    private int state;
    final UUID uuid;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes6.dex */
    public class PostRequestHandler extends Handler {
        public PostRequestHandler(Looper looper) {
            super(looper);
        }

        private long getRetryDelayMillis(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        private boolean maybeRetryRequest(Message message) {
            boolean z;
            int i;
            if (message.arg1 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (i = message.arg2 + 1) > DefaultDrmSession.this.initialDrmRequestRetryCount) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i;
            sendMessageDelayed(obtain, getRetryDelayMillis(i));
            return true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        Pair pair = (Pair) obj;
                        DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                        e = defaultDrmSession.callback.executeKeyRequest(defaultDrmSession.uuid, (ExoMediaDrm.KeyRequest) pair.first, (String) pair.second);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    e = defaultDrmSession2.callback.executeProvisionRequest(defaultDrmSession2.uuid, (ExoMediaDrm.ProvisionRequest) obj);
                }
            } catch (Exception e) {
                e = e;
                if (maybeRetryRequest(message)) {
                    return;
                }
            }
            DefaultDrmSession.this.postResponseHandler.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }

        void post(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes6.dex */
    private class PostResponseHandler extends Handler {
        public PostResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.onProvisionResponse(obj, obj2);
            } else if (i == 1) {
                DefaultDrmSession.this.onKeyResponse(obj, obj2);
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface ProvisioningManager<T extends ExoMediaCrypto> {
        void onProvisionCompleted();

        void onProvisionError(Exception exc);

        void provisionRequired(DefaultDrmSession<T> defaultDrmSession);
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm<T> exoMediaDrm, ProvisioningManager<T> provisioningManager, @Nullable DrmInitData.SchemeData schemeData, int i, @Nullable byte[] bArr, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, DefaultDrmSessionEventListener.EventDispatcher eventDispatcher, int i2) {
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
        this.schemeData = bArr != null ? null : schemeData;
        this.optionalKeyRequestParameters = hashMap;
        this.callback = mediaDrmCallback;
        this.initialDrmRequestRetryCount = i2;
        this.eventDispatcher = eventDispatcher;
        this.state = 2;
        this.postResponseHandler = new PostResponseHandler(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.requestHandlerThread = handlerThread;
        handlerThread.start();
        this.postRequestHandler = new PostRequestHandler(this.requestHandlerThread.getLooper());
    }

    private void doLicense(boolean z) {
        int i = this.mode;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3 && restoreKeys()) {
                    postKeyRequest(3, z);
                }
            } else if (this.offlineLicenseKeySetId == null) {
                postKeyRequest(2, z);
            } else if (restoreKeys()) {
                postKeyRequest(2, z);
            }
        } else if (this.offlineLicenseKeySetId == null) {
            postKeyRequest(1, z);
        } else if (this.state == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode == 0 && licenseDurationRemainingSec <= 60) {
                Log.d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
                postKeyRequest(2, z);
            } else if (licenseDurationRemainingSec <= 0) {
                onError(new KeysExpiredException());
            } else {
                this.state = 4;
                this.eventDispatcher.drmKeysRestored();
            }
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (!C22533C.WIDEVINE_UUID.equals(this.uuid)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(this);
        return Math.min(((Long) licenseDurationRemainingSec.first).longValue(), ((Long) licenseDurationRemainingSec.second).longValue());
    }

    private boolean isOpen() {
        int i = this.state;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    private void onError(Exception exc) {
        this.lastException = new DrmSession.DrmSessionException(exc);
        this.eventDispatcher.drmSessionManagerError(exc);
        if (this.state != 4) {
            this.state = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(Object obj, Object obj2) {
        if (obj == this.currentKeyRequest && isOpen()) {
            this.currentKeyRequest = null;
            if (obj2 instanceof Exception) {
                onKeysError((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.mode == 3) {
                    this.mediaDrm.provideKeyResponse(this.offlineLicenseKeySetId, bArr);
                    this.eventDispatcher.drmKeysRemoved();
                    return;
                }
                byte[] provideKeyResponse = this.mediaDrm.provideKeyResponse(this.sessionId, bArr);
                int i = this.mode;
                if ((i == 2 || (i == 0 && this.offlineLicenseKeySetId != null)) && provideKeyResponse != null && provideKeyResponse.length != 0) {
                    this.offlineLicenseKeySetId = provideKeyResponse;
                }
                this.state = 4;
                this.eventDispatcher.drmKeysLoaded();
            } catch (Exception e) {
                onKeysError(e);
            }
        }
    }

    private void onKeysError(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(exc);
        }
    }

    private void onKeysExpired() {
        if (this.state == 4) {
            this.state = 3;
            onError(new KeysExpiredException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(Object obj, Object obj2) {
        if (obj == this.currentProvisionRequest) {
            if (this.state == 2 || isOpen()) {
                this.currentProvisionRequest = null;
                if (obj2 instanceof Exception) {
                    this.provisioningManager.onProvisionError((Exception) obj2);
                    return;
                }
                try {
                    this.mediaDrm.provideProvisionResponse((byte[]) obj2);
                    this.provisioningManager.onProvisionCompleted();
                } catch (Exception e) {
                    this.provisioningManager.onProvisionError(e);
                }
            }
        }
    }

    private boolean openInternal(boolean z) {
        if (isOpen()) {
            return true;
        }
        try {
            byte[] openSession = this.mediaDrm.openSession();
            this.sessionId = openSession;
            this.mediaCrypto = this.mediaDrm.createMediaCrypto(openSession);
            this.state = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e);
            return false;
        } catch (Exception e2) {
            onError(e2);
            return false;
        }
    }

    private void postKeyRequest(int i, boolean z) {
        byte[] bArr;
        String str;
        byte[] bArr2;
        String str2;
        if (i == 3) {
            bArr = this.offlineLicenseKeySetId;
        } else {
            bArr = this.sessionId;
        }
        byte[] bArr3 = bArr;
        DrmInitData.SchemeData schemeData = this.schemeData;
        if (schemeData != null) {
            byte[] bArr4 = schemeData.data;
            String str3 = schemeData.mimeType;
            str = schemeData.licenseServerUrl;
            str2 = str3;
            bArr2 = bArr4;
        } else {
            str = null;
            bArr2 = null;
            str2 = null;
        }
        try {
            Pair create = Pair.create(this.mediaDrm.getKeyRequest(bArr3, bArr2, str2, i, this.optionalKeyRequestParameters), str);
            this.currentKeyRequest = create;
            this.postRequestHandler.post(1, create, z);
        } catch (Exception e) {
            onKeysError(e);
        }
    }

    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error trying to restore Widevine keys.", e);
            onError(e);
            return false;
        }
    }

    public void acquire() {
        int i = this.openCount + 1;
        this.openCount = i;
        if (i == 1 && this.state != 1 && openInternal(true)) {
            doLicense(true);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final T getMediaCrypto() {
        return this.mediaCrypto;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        return this.offlineLicenseKeySetId;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.state;
    }

    public boolean hasInitData(byte[] bArr) {
        byte[] bArr2;
        DrmInitData.SchemeData schemeData = this.schemeData;
        if (schemeData != null) {
            bArr2 = schemeData.data;
        } else {
            bArr2 = null;
        }
        return Arrays.equals(bArr2, bArr);
    }

    public boolean hasSessionId(byte[] bArr) {
        return Arrays.equals(this.sessionId, bArr);
    }

    public void onMediaDrmEvent(int i) {
        if (!isOpen()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    onKeysExpired();
                    return;
                }
                return;
            }
            doLicense(false);
            return;
        }
        this.state = 3;
        this.provisioningManager.provisionRequired(this);
    }

    public void onProvisionCompleted() {
        if (openInternal(false)) {
            doLicense(true);
        }
    }

    public void onProvisionError(Exception exc) {
        onError(exc);
    }

    public void provision() {
        ExoMediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        this.currentProvisionRequest = provisionRequest;
        this.postRequestHandler.post(0, provisionRequest, true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    public boolean release() {
        int i = this.openCount - 1;
        this.openCount = i;
        if (i != 0) {
            return false;
        }
        this.state = 0;
        this.postResponseHandler.removeCallbacksAndMessages(null);
        this.postRequestHandler.removeCallbacksAndMessages(null);
        this.postRequestHandler = null;
        this.requestHandlerThread.quit();
        this.requestHandlerThread = null;
        this.mediaCrypto = null;
        this.lastException = null;
        this.currentKeyRequest = null;
        this.currentProvisionRequest = null;
        byte[] bArr = this.sessionId;
        if (bArr != null) {
            this.mediaDrm.closeSession(bArr);
            this.sessionId = null;
        }
        return true;
    }
}
