package com.learnings.purchase.event;

import android.os.Bundle;
import android.text.TextUtils;
import com.learnings.purchase.PurchaseInitParameter;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.event.p403db.EventDao;
import com.learnings.purchase.event.p403db.EventDataBase;
import com.learnings.purchase.event.p403db.EventEntity;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p1020w3.C44574a;

/* loaded from: classes6.dex */
public class EventManager {
    private static final String EVENT_NAME = "iap_purchase";
    private static final String TAG = "Purchase_EventManager";
    private EventDao mEventDao;
    private EventUploader mEventUploader;
    private String mLearningsId;

    /* loaded from: classes6.dex */
    public static class Holder {
        private static final EventManager singleton = new EventManager();

        private Holder() {
        }
    }

    public static EventManager get() {
        return Holder.singleton;
    }

    public /* synthetic */ void lambda$init$0(PurchaseInitParameter purchaseInitParameter) {
        this.mEventUploader = new EventUploader(purchaseInitParameter);
        EventDataBase.init(purchaseInitParameter.getContext());
        this.mEventDao = EventDataBase.getDataBase().getDao();
    }

    public /* synthetic */ void lambda$sendEvent$1(BaseEventBuilder baseEventBuilder) {
        sendAnalyzeEvent(baseEventBuilder);
        sendRemoteEvent(baseEventBuilder);
    }

    public /* synthetic */ void lambda$setLearningsId$2(String str) {
        PurchaseLogUtil.log(TAG, "setLearningsId: " + str);
        this.mLearningsId = str;
        sendAllEvent();
    }

    public /* synthetic */ void lambda$setLearningsId$3(final String str) {
        EventWorker.get().run(new Runnable() { // from class: com.learnings.purchase.event.c
            {
                EventManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EventManager.this.lambda$setLearningsId$2(str);
            }
        });
    }

    private void sendAllEvent() {
        try {
            PurchaseLogUtil.log(TAG, "sendAllEvent");
            List<EventEntity> queryUnUploadData = this.mEventDao.queryUnUploadData();
            if (queryUnUploadData != null && !queryUnUploadData.isEmpty()) {
                PurchaseLogUtil.log(TAG, "sendAllEvent size: " + queryUnUploadData.size());
                JSONArray jSONArray = new JSONArray();
                for (EventEntity eventEntity : queryUnUploadData) {
                    JSONObject jSONObject = new JSONObject(eventEntity.getEventJson());
                    jSONObject.put("learnings_id", this.mLearningsId);
                    jSONArray.put(jSONObject);
                }
                if (this.mEventUploader.upload(jSONArray.toString())) {
                    this.mEventDao.delete(queryUnUploadData);
                    PurchaseLogUtil.log(TAG, "sendAllEvent success, delete db");
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "sendAllEvent failed: " + th.getMessage());
        }
    }

    private void sendAnalyzeEvent(BaseEventBuilder baseEventBuilder) {
        try {
            Bundle generateEventBundle = baseEventBuilder.generateEventBundle();
            PurchaseLogUtil.log(TAG, "AnalyzeEvent: " + generateEventBundle.toString());
            new C44574a.C44575a(EVENT_NAME).m2365b(generateEventBundle).m2366a().mo2359k();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void sendRemoteEvent(BaseEventBuilder baseEventBuilder) {
        try {
            PurchaseLogUtil.log(TAG, "sendEvent save to db");
            this.mEventDao.save(baseEventBuilder.build());
            if (TextUtils.isEmpty(this.mLearningsId)) {
                PurchaseLogUtil.log(TAG, "sendEvent failed, learningsId is empty");
            } else {
                sendAllEvent();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "sendEvent failed: " + th.getMessage());
        }
    }

    public void init(final PurchaseInitParameter purchaseInitParameter) {
        EventWorker.get().run(new Runnable() { // from class: com.learnings.purchase.event.b
            {
                EventManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EventManager.this.lambda$init$0(purchaseInitParameter);
            }
        });
        BaseEventBuilder.setProductionId(purchaseInitParameter.getProductionId());
        RelyTaskManager.get().markTaskCanDeal(RelyTaskManager.TASK_PURCHASE_EVENT_INIT_FINISH);
    }

    public void sendEvent(final BaseEventBuilder baseEventBuilder) {
        EventWorker.get().run(new Runnable() { // from class: com.learnings.purchase.event.d
            {
                EventManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EventManager.this.lambda$sendEvent$1(baseEventBuilder);
            }
        });
    }

    public void setLearningsId(final String str) {
        if (TextUtils.isEmpty(str)) {
            PurchaseLogUtil.log(TAG, "setLearningsId is null or empty");
        } else {
            RelyTaskManager.get().dealTask(RelyTaskManager.TASK_PURCHASE_EVENT_INIT_FINISH, new Runnable() { // from class: com.learnings.purchase.event.a
                {
                    EventManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EventManager.this.lambda$setLearningsId$3(str);
                }
            });
        }
    }

    private EventManager() {
    }
}
