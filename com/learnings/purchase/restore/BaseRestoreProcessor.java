package com.learnings.purchase.restore;

import android.os.Handler;
import android.os.Looper;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseInitParameter;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.listener.PurchaseRestoredListener;
import com.learnings.purchase.restore.p404db.RestorePurchaseDao;
import com.learnings.purchase.restore.p404db.RestorePurchaseDataBase;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;

/* loaded from: classes6.dex */
public abstract class BaseRestoreProcessor implements IRestoreProcessor {
    private static final String TAG = "Purchase_BaseRestoreProcessor";
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private PurchaseRestoredListener mPurchaseRestoredListener;
    private RestorePurchaseDao mRestorePurchaseDao;

    public /* synthetic */ void lambda$notifyPurchaseRestored$0(PurchaseData purchaseData) {
        this.mPurchaseRestoredListener.onPurchaseRestored(purchaseData);
    }

    public void deletePurchase(RestorePurchaseEntity restorePurchaseEntity) {
        this.mRestorePurchaseDao.delete(restorePurchaseEntity);
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void init(PurchaseInitParameter purchaseInitParameter) {
        RestorePurchaseDataBase.init(purchaseInitParameter.getContext());
        this.mRestorePurchaseDao = RestorePurchaseDataBase.getDataBase().getDao();
        this.mPurchaseRestoredListener = purchaseInitParameter.getPurchaseRestoredListener();
    }

    public void notifyPurchaseRestored(final PurchaseData purchaseData) {
        if (this.mPurchaseRestoredListener != null) {
            PurchaseLogUtil.log(TAG, "restorePurchase success：" + purchaseData);
            this.mHandler.post(new Runnable() { // from class: com.learnings.purchase.restore.a
                {
                    BaseRestoreProcessor.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseRestoreProcessor.this.lambda$notifyPurchaseRestored$0(purchaseData);
                }
            });
        }
    }

    public RestorePurchaseEntity queryPurchase(String str) {
        return this.mRestorePurchaseDao.queryPurchase(str);
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void savePurchase(PurchaseData purchaseData, String str) {
        try {
            PurchaseLogUtil.log(TAG, "saveRestorePurchase type: " + str);
            RestorePurchaseEntity restorePurchaseEntity = new RestorePurchaseEntity();
            restorePurchaseEntity.setToken(purchaseData.getToken());
            restorePurchaseEntity.setType(str);
            this.mRestorePurchaseDao.save(restorePurchaseEntity);
            PurchaseLogUtil.log(TAG, "saveRestorePurchase successful");
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "saveRestorePurchase failed: " + th.getMessage());
        }
    }
}
