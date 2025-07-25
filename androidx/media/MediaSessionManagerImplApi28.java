package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManager;
import androidx.media.MediaSessionManagerImplBase;

@RequiresApi(28)
/* loaded from: classes.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }

    @RequiresApi(28)
    /* loaded from: classes.dex */
    static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo mObject;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(String str, int i, int i2) {
            super(str, i, i2);
            this.mObject = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName;
            packageName = remoteUserInfo.getPackageName();
            return packageName;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo r4) {
            /*
                r3 = this;
                java.lang.String r0 = androidx.media.C2095j.m104678a(r4)
                int r1 = androidx.media.C2096k.m104677a(r4)
                int r2 = androidx.media.C2097l.m104676a(r4)
                r3.<init>(r0, r1, r2)
                r3.mObject = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.<init>(android.media.session.MediaSessionManager$RemoteUserInfo):void");
        }
    }
}
