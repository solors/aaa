package com.zeus.gmc.sdk.mobileads.msa.analytics.experience;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;

/* loaded from: classes8.dex */
public class PubsubUserExperienceObserver {
    private static final String atnntnannta = "PubsubUserExperienceObserver";
    private ContentObserver atntaanaa;
    private Handler atntntntanaan;

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.experience.PubsubUserExperienceObserver$atnntnannta */
    /* loaded from: classes8.dex */
    class C32807atnntnannta extends ContentObserver {
        final /* synthetic */ Context atnntnannta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32807atnntnannta(Handler handler, Context context) {
            super(handler);
            this.atnntnannta = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            PubsubUserExperienceObserver pubsubUserExperienceObserver = PubsubUserExperienceObserver.this;
            Context context = this.atnntnannta;
            pubsubUserExperienceObserver.atnntnannta(context, C32809atnntnannta.atnntnannta(context));
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.experience.PubsubUserExperienceObserver$atntntntanaan */
    /* loaded from: classes8.dex */
    private static class C32808atntntntanaan {
        private static PubsubUserExperienceObserver atnntnannta = new PubsubUserExperienceObserver(null);

        private C32808atntntntanaan() {
        }
    }

    /* synthetic */ PubsubUserExperienceObserver(C32807atnntnannta c32807atnntnannta) {
        this();
    }

    private void atntntntanaan(Context context) {
        try {
            if (this.atntaanaa != null) {
                context.getContentResolver().unregisterContentObserver(this.atntaanaa);
                this.atntntntanaan = null;
                this.atntaanaa = null;
            }
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "error: ", e);
        }
    }

    public static PubsubUserExperienceObserver getInstance() {
        return C32808atntntntanaan.atnntnannta;
    }

    public synchronized void register(Context context) {
        try {
            atntntntanaan(context);
            this.atntntntanaan = new Handler(context.getMainLooper());
            this.atntaanaa = new C32807atnntnannta(this.atntntntanaan, context);
            context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(C32809atnntnannta.atnntnannta), false, this.atntaanaa);
            atnntnannta(context);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "register error: ", e);
        }
    }

    private PubsubUserExperienceObserver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void atnntnannta(Context context, boolean z) {
        try {
            C32821atntntntanaan.atnntnannta(atnntnannta, "user_experience_status analytics ===>>>  " + z);
            if (z == DataManager.getUserExperienceFlag(context)) {
                return;
            }
            DataManager.atnntnannta(context, z);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "error: ", e);
        }
    }

    private void atnntnannta(Context context) {
        try {
            boolean atnntnannta2 = C32809atnntnannta.atnntnannta(context);
            if (atnntnannta2 == DataManager.getUserExperienceFlag(context)) {
                return;
            }
            DataManager.atnntnannta(context, atnntnannta2);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "error: ", e);
        }
    }
}
